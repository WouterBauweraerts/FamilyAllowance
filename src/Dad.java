import java.time.LocalDate;

public class Dad extends Person{

    private Status workStatus;


    public Dad(LocalDate birthdate, String name, Status workStatus) {
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
