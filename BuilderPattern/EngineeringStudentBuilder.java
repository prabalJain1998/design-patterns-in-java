import java.util.ArrayList;

public class EngineeringStudentBuilder extends StudentBuilder {

    EngineeringStudentBuilder() {
        this.subjects = new ArrayList<>();
    }

    @Override
    public StudentBuilder setSubjects() {
        this.subjects.add("Applied Maths");
        this.subjects.add("Applied Maths 2");
        this.subjects.add("Applied Maths 3");
        return this;
    }
    
}
