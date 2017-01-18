package Main;

public abstract class Age {

    private final double FIRST_CHILD;
    private final double OTHER;

    public Age(double firstChild, double other){
        FIRST_CHILD = firstChild;
        OTHER = other;
    }

    public double getFIRST_CHILD() {
        return FIRST_CHILD;
    }

    public double getOTHER() {
        return OTHER;
    }
}
