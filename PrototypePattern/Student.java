public class Student implements Prototype {
    int rollNo;
    String Name;

    Student(int rollNo, String Name) {
        this.rollNo = rollNo;
        this.Name = Name;
    }

    public Prototype clone() {
        return new Student(this.rollNo, this.Name);
    }
    
}
