import java.time.LocalDate;

public class Child extends Person {

    private boolean orphan;

    public Child(LocalDate birthdate, String name, boolean orphan) {
        super(birthdate, name);
        this.orphan = orphan;
    }

    public boolean isOrphan() {
        return orphan;
    }

    public void setOrphan(boolean orphan) {
        this.orphan = orphan;
    }
}
