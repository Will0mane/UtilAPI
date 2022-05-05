package math;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private final List<Operation> oH;

    public Calculator(){
        oH = new ArrayList<>();
    }

    public List<Operation> getOperationHistory() {
        return oH;
    }

    public double subtract(@NotNull double previous, double next){
        double neu = previous;
        neu -= next;
        getOperationHistory().add(new Operation(previous, OperationType.SUBTRACT, neu));
        return neu;
    }

    public double multiply(@NotNull double base, double... numbers){
        double neu = base;
        for(double i : numbers){
            neu *= i;
        }
        getOperationHistory().add(new Operation(base, OperationType.MULTIPLY, neu));
        return neu;
    }

    public double divide(@NotNull double base, double... numbers){
        int neu = 1;
        for(double i : numbers){
            neu /= i;
        }
        getOperationHistory().add(new Operation(base, OperationType.MULTIPLY, neu));
        return neu;
    }

    public double power(@NotNull double number, double power){
        double pow = Math.pow(number, power);;
        getOperationHistory().add(new Operation(number, OperationType.POWER, pow));
        return pow;
    }

    public double squareRoot(double number){
        double sqrt = Math.sqrt(number);
        getOperationHistory().add(new Operation(number, OperationType.SQUARE_ROOT, sqrt));
        return sqrt;
    }

    public double cubicRoot(double number){
        double cbrt = Math.cbrt(number);
        getOperationHistory().add(new Operation(number, OperationType.CUBIC_ROOT, cbrt));
        return cbrt;
    }

    public double add(@NotNull double base, double... numbers){
        double neu = base;
        for(double i : numbers){
            neu += i;
        }
        getOperationHistory().add(new Operation(base, OperationType.SUM, neu));
        return neu;
    }

}
