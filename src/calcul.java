import java.util.Scanner;
import java.util.InputMismatchException;

public class calcul {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Доступны 2 программы на выбор. Введите 1, чтобы воспользоваться калькулятором. Введите 2, чтобы найти самое длинное слово в массиве.");
            String vybor = sc.next();
            switch (vybor){
                case "1":
                    {//приветствие калькулятора
                System.out.println("Это простой калькулятор. Поддерживаемые операции: +, -, *, / \nДопустимы дробные числа, дробная часть отделена запятой.");

                try {/** блок ввода данных */
                    System.out.println("Введите первое число:");
                    double x1 = sc.nextDouble();

                    String symbol = "+";
                    do {
                        System.out.println("Введите символ операции: +, -, * или /:");
                        symbol = sc.next();
                        if (!symbol.matches("[-+*/]")) System.out.println("Неверный символ операции.");
                    } while (!symbol.matches("[-+*/]"));

                    System.out.println("Введите второе число:");
                    double x2 = sc.nextDouble();

                    /**блок вычисления */
                    double result = 0;
                    switch (symbol) {
                        case "+":
                            result = x1 + x2;
                            break;
                        case "-":
                            result = x1 - x2;
                            break;
                        case "*":
                            result = x1 * x2;
                            break;
                        case "/":
                            if (x2 != 0) {
                                result = x1 / x2;
                            } else System.out.println("Попытка деления на 0. Ай-яй-яй!");
                            break;
                    }
                    /**вывод результата*/
                    if (x2 != 0) System.out.printf("%.4f", result);
                } catch (InputMismatchException iEx) {//если пользователь ввёл число некорректно, выводим ошибку
                    System.out.println("Неверный формат ввода числа!");
                }
                break;
            }
                case "2":
                {//приветствие поиска максимума
                    System.out.println("Программа для поиска самого длинного слова. Введите количество слов:");
                    try {
                        /**блок ввода слов*/
                        int wordCount = sc.nextInt();
                        String words[] = new String[wordCount];
                        System.out.println("Введите слова через пробел и нажмите Enter. Будут обработаны только первые "+wordCount+".");
                        for (int i = 0; i<wordCount; i++ ){
                            words[i] = sc.next();
                        }

                        /**блок поиска максимальной длины*/
                        int maxLen = 0;
                        for (String word : words){
                            if (word.length()>= maxLen){
                                maxLen = word.length();
                            }
                        }

                        /**блок вывода слов максимальной длины*/
                        System.out.print("Самое длинное слово или слова: ");
                        for (String word : words){
                            if (word.length()== maxLen){
                                System.out.print(word + " ");;
                            }
                        }
                    }catch (InputMismatchException iEx) {//если пользователь ввёл число некорректно, выводим ошибку
                        System.out.println("Неверный формат ввода!");
                    }
                break;
                }
                default:
                    System.out.println("Некорректный ввод!");
        }

   }
}
