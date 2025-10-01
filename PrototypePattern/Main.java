class Main {
    public static void main(String[] args) {
        Student one = new Student(100, "Akash");
        Student cloned = (Student)one.clone();
        System.out.println("Name is "+cloned.Name);
        System.out.println("roll number is "+cloned.rollNo);
    }
}