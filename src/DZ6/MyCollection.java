package DZ6;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MyCollection {
    public static void main(String[] args) {
        //задаём путь к файлу
        String filename = "/Users/pc/Documents/words.txt";
        Path path = Paths.get(filename);
        Scanner sc = null;

        //читаем из файла
        try {
            sc = new Scanner(path);
        } catch (IOException e) {//обрабатываем возможную ошибку
            System.out.println("Файл не может быть прочитан");
            e.printStackTrace();
        }
        //парсим разделённые пробелом слова в список
        List<String> wordList = new LinkedList<>();
        while (sc.hasNext()) {
            wordList.add(sc.next());
        }

        if (wordList.isEmpty()) System.out.println("Файл пуст!");
        else {

            //сортируем по алфавиту
            Collections.sort(wordList);

            //в отсортированном виде одинаковые слова идут друг за другом. Считаем количество повторений, сохраняем в виде ключ(слово) - значение(кол-во)
            int count = 1;
            Map<String, Integer> wordStat = new HashMap<>();
            for (int i = 0; i < wordList.size() -1; i++) {
               if (wordList.get(i).equals(wordList.get(i + 1))) {
                   count++;
               }
               else {
                        wordStat.put(wordList.get(i), count);
                        count = 1;
               }
            }
            if (wordList.get(wordList.size() -1).equals(wordList.get(wordList.size() -2))){
                wordStat.put(wordList.get(wordList.size() -1), count);
            }
            else {
                wordStat.put(wordList.get(wordList.size() -1), 1);
            }

            //выводим в консоль
            for (String i : wordStat.keySet()) {
                System.out.println(i + " - " + wordStat.get(i) + " шт.");
            }

            //находим максимальное значение, выводим все слова с этим значением
            int maxValue = Collections.max(wordStat.values());
            System.out.print("Чаще всего встречается:\n");
            for (String i : wordStat.keySet()) {
                if (wordStat.get(i) == maxValue) System.out.println(i + " - " + wordStat.get(i) + " шт.");
            }

        }
    }
}
