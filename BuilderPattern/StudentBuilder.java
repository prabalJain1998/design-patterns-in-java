import java.util.List;

public abstract class StudentBuilder {
    int rollNo;
    String fName;
    String lastName;
    String motherName;
    String fatherName;
    List<String> subjects;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }


    public StudentBuilder setFirstName(String fName) {
        this.fName = fName;
        return this;
    }


    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }


    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }


    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
