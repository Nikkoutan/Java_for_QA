package OOPcalcul;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputData {
    private static double X;
    private static double Y;
    private static String symbol;

    public static double getX() {
        return X;
    }

    public static double getY() {
        return Y;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    void inputData() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите первое число:");
            this.setX(sc.nextDouble());

            do {
                System.out.println("Введите символ операции: +, -, * или /:");
                this.setSymbol(sc.next());
                if (!this.getSymbol().matches("[-+*/]")) System.out.println("Неверный символ операции.");
            } while (!this.getSymbol().matches("[-+*/]"));

            System.out.println("Введите второе число:");
            this.setY(sc.nextDouble());

        } catch (InputMismatchException iEx) {//если пользователь ввёл число некорректно, выводим ошибку
            System.out.println("Неверный формат ввода числа!");
        }
    }
}
