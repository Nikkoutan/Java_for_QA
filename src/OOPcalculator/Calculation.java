package OOPcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        System.out.println("Это простой калькулятор. Поддерживаемые операции: +, -, *, / \nДопустимы дробные числа, дробная часть отделена запятой.");
        Scanner sc = new Scanner(System.in);

        try {
            /** блок ввода данных */
            System.out.println("Введите первое число:");
            double x1 = sc.nextDouble();

            String symbol;
            do {
                System.out.println("Введите символ операции: +, -, * или /:");
                symbol = sc.next();
                if (!symbol.matches("[-+*/]")) System.out.println("Неверный символ операции.");
            } while (!symbol.matches("[-+*/]"));

            System.out.println("Введите второе число:");
            double x2 = sc.nextDouble();
            try {
                OOPCalculator calc = new OOPCalculator(x1, x2, symbol);
                System.out.println(calc.calculate());
            } catch (DivisionByZeroException e) {
                e.printMessage();
            }
        } catch (InputMismatchException iEx) {//если пользователь ввёл число некорректно, выводим ошибку
            System.out.println("Неверный формат ввода числа!");
        }
    }
}
