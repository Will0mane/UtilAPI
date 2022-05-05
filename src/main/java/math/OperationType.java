package math;

public enum OperationType {

    SUM("Sum"),
    SUBTRACT("Subtract"),
    DIVIDE("Divide"),
    MULTIPLY("Multiply"),
    POWER("Power"),
    SQUARE_ROOT("Square Root"),
    CUBIC_ROOT("Cubic Root");

    private final String n;

    OperationType(String name){
        n = name;
    }

    public String getName() {
        return n;
    }
}
