package Main;

public abstract class Status {

    private boolean disabled;
    private boolean unemployed;

    public Status(boolean disabled, boolean unemployed) {
        this.disabled = disabled;
        this.unemployed = unemployed;
    }


}
