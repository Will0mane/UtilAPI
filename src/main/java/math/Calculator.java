package math;

import org.jetbrains.annotations.NotNull;

public class Calculator {

    public Calculator(){

    }

    public int subtract(@NotNull int... numbers){
        int neu = 0;
        for(int i : numbers){
            neu -= i;
        }
        return neu;
    }

    public int multiply(@NotNull int... numbers){
        int neu = 0;
        for(int i : numbers){
            neu *= i;
        }
        return neu;
    }

    public int divide(@NotNull int... numbers){
        int neu = 0;
        for(int i : numbers){
            neu /= i;
        }
        return neu;
    }

    public double power(@NotNull double number, double power){
        return Math.pow(number, power);
    }

    public double squareRoot(double number){
        return Math.sqrt(number);
    }

    public double cubicRoot(double number){
        return Math.cbrt(number);
    }

    public int add(@NotNull int... numbers){
        int neu = 0;
        for(int i : numbers){
            neu += i;
        }
        return neu;
    }

}
