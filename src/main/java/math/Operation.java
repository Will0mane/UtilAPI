package math;

public class Operation {

    private final double p;
    private final OperationType t;
    private final double n;

    public Operation(double previous, OperationType type, double next){
        p = previous;
        t = type;
        n = next;
    }

    public double getNext() {
        return n;
    }

    public double getPrevious() {
        return p;
    }

    public OperationType getType() {
        return t;
    }
}
