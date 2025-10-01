import java.util.List;

public class Student {
    int rollNo;
    String fName;
    String lastName;
    String motherName;
    String fatherName;
    List<String> subjects;

    Student(StudentBuilder builder) {
        this.rollNo = builder.rollNo;
        this.fName = builder.fName;
        this.lastName = builder.lastName;
        this.motherName = builder.motherName;
        this.fatherName = builder.fatherName;
        this.subjects = builder.subjects;
    }

    public String toString(){
        return ""+ " roll number: " + this.rollNo +
                " name: " + this.fName +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);
    }
}
