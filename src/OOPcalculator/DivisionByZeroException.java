package OOPcalculator;

import java.lang.reflect.Executable;

public class DivisionByZeroException extends Exception {
    public void printMessage(){
        System.out.println("Деление на ноль запрещено!");
    }
}
