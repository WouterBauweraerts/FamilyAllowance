package Main;

import java.time.LocalDate;

public class Child extends Person {

    private Parent parent;
    private ChildOrder childOrder;
    private boolean orphan;

    public Child(LocalDate birthdate, String name, boolean orphan, Parent parent) {
        super(birthdate, name);
        this.orphan = orphan;
        this.parent = parent;
    }

    public boolean isOrphan() {
        return orphan;
    }

    public void setOrphan(boolean orphan) {
        this.orphan = orphan;
    }

    public Status getParentWorkStatus() {
        return parent.getWorkStatus();
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public ChildOrder getChildOrder() {
        return childOrder;
    }

    public void setChildOrder(ChildOrder childOrder) {
        this.childOrder = childOrder;
    }


}
