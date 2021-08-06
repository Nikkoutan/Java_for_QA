package OOPcalculator;

import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class OOPCalculator {
    private double x1;
    private double x2;
    private String symbol;

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public OOPCalculator (double x1, double x2, String symbol){
        this.x1 = x1;
        this.x2 = x2;
        this.symbol = symbol;
    }

    public double calculate(){
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
                result = x1 / x2;
                break;
            }
            result = Math.rint(result*10000) / 10000;
            return(result);
    }
}
