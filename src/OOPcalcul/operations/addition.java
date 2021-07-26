package OOPcalcul.operations;

import OOPcalcul.inputData;

public class addition implements operation {
    public double getResult(){

        final double v = inputData.getX() + inputData.getY();
        return v;

    }
}
