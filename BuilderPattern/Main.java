class Main {
    public static void main(String[] args) {
        StudentBuilder engineeringStudentBuilder = new EngineeringStudentBuilder();
        engineeringStudentBuilder.setRollNo(100).setFirstName("PRAB").setLastName("XYZ").setFatherName("ABC").setMotherName("DEF").setSubjects();
        System.out.println(engineeringStudentBuilder.build().toString());

        StudentBuilder schoolStudentBuilder = new SchoolStudent();
        schoolStudentBuilder.setRollNo(100).setFirstName("PRAB").setLastName("XYZ").setFatherName("ABC").setMotherName("DEF").setSubjects();
        System.out.println(schoolStudentBuilder.build().toString());

    }
}