package OOPcalcul;

import OOPcalcul.operations.*;

import java.util.Scanner;

public class OOPcalcul {

    public static void main(String[] args) {
        System.out.println("Это простой калькулятор. Поддерживаемые операции: +, -, *, / \nДопустимы дробные числа, дробная часть отделена запятой.");
        String answer = "1";//пока эта переменная хранит 1, калькулятор будет запускаться сначала

        do {
            //класс inputData осуществляет ввод данных от пользователя
            inputData input = new inputData();
            input.inputData();

            //в этом блоке создаются экземпляры классов арифметических операций и выводится результат
            switch (input.getSymbol()) {
                case "+": {
                    operation op = new addition();
                    System.out.printf("%.4f", op.getResult());
                    break;
                }
                case "-": {
                    operation op = new substraction();
                    System.out.printf("%.4f", op.getResult());
                    break;
                }
                case "*": {
                    operation op = new multiplication();
                    System.out.printf("%.4f", op.getResult());
                    break;
                }
                case "/": {
                    operation op = new division();
                    System.out.printf("%.4f", op.getResult());
                    break;
                }
            }

            //вызов калькулятора обёрнут в цикл с постусловием, чтобы пользователь мог провести все нужные вычисления за один вызов программы
            System.out.println("\nВведите 1, чтобы продолжить, или любой другой символ для выхода.");
            Scanner sc = new Scanner(System.in);
            answer = sc.next();
        }
        while (answer.equals("1"));
    }
}
