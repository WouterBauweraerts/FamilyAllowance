package Main;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {

    private LocalDate birthdate;
    private String name;

    public Person(LocalDate birthdate, String name) {
        this.birthdate = birthdate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        Period age = Period.between(birthdate, LocalDate.now());
        return age.getYears();
    }
}
