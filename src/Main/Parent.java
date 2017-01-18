package Main;

import java.time.LocalDate;

public class Parent extends Person{

    private Status workStatus;


    public Parent(LocalDate birthdate, String name, Status workStatus) {
        super(birthdate, name);
        this.workStatus = workStatus;
    }

    public Status getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(Status workStatus) {
        this.workStatus = workStatus;
    }
}
