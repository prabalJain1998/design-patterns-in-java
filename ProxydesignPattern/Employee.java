public class Employee implements EmpoyeeInterface {

    @Override
    public void create(String role, Employee obj) throws Exception {
        System.out.println("Created a new row!");
    }

    @Override
    public void delete(String role, int empId) throws Exception {
        System.out.println("Deleted a new row! for ID "+empId);
    }

    @Override
    public void get(String role, int empId) throws Exception {
        System.out.println("Get a new row! for ID "+empId);
    }

}
