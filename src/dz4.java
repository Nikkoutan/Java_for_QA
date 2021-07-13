public class dz4 {
    public static void main(String[] args) {

        //задаём массив, наполняем его случайными числами от -10 до 10
        int[] myArr = new int[20];
        for (int i = 0; i<20; i++){
            myArr[i] = (int)(Math.random()*21 - 10.5);
        }

        //переменные для хранения макс. и мин. значений и их индексов
        int minVal = 10;
        int minI = -1;
        int maxVal = -10;
        int maxI = -1;

        //поиск максимума среди отрицательных чисел, вывод исходного массива
        for (int i = 0; i<20; i++){
            System.out.print(myArr[i]+" ");
            if (myArr[i] > maxVal && myArr[i] < 0) {
                maxVal = myArr[i];
                maxI = i;
            }
        }
        System.out.println(" ");

        //поиск минимума среди положительных чисел
        for (int i = 0; i<20; i++) {
            if (myArr[i] < minVal && myArr[i] > 0) {
                minVal = myArr[i];
                minI = i;
            }
        }

        //меняем местами найденные макс. и мин.
        int c;
        if (minI != -1 && maxI != -1){
            c = myArr[minI];
            myArr[minI] = myArr[maxI];
            myArr[maxI] = c;
        }
        else System.out.println("Все числа в массиве по одну сторону от нуля");

        //вывод итогового массива
        for (int i = 0; i<20; i++){
            System.out.print(myArr[i]+" ");}
    }
}
