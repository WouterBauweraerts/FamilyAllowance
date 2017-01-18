package Main;

import java.util.ArrayList;
import java.util.List;

public class Family {

    List<Person> familyMembers;

    public Family(List<Person> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public Family() {
        familyMembers = new ArrayList<>();
    }

    public void addFamilyMember(Person memberToAdd) {
        familyMembers.add(memberToAdd);
        updateFamilyChildOrder();
    }

    private void updateFamilyChildOrder() {
        
    }


}
