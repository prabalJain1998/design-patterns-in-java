import java.util.ArrayList;

public class SchoolStudent extends StudentBuilder {

    SchoolStudent() {
        this.subjects = new ArrayList<>();
    }

    @Override
    public StudentBuilder setSubjects() {
        this.subjects.add("Maths");
        this.subjects.add("Physics");
        this.subjects.add("Chemistry");
        return this;
    }
}
