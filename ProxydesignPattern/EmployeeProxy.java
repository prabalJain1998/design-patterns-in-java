public class EmployeeProxy implements EmpoyeeInterface {

    Employee emp;

    EmployeeProxy() {
        this.emp = new Employee();
    }

    @Override
    public void create(String role, Employee obj) throws Exception {
        if(role == "ADMIN") {
            emp.create(role, obj);
        } else {
            System.out.println("Cannot create as ACCESS DENIED");
        }
    }

    @Override
    public void delete(String role, int empId) throws Exception {
        if(role == "ADMIN") {
            emp.delete(role, empId);
        } else {
            System.out.println("Cannot create as ACCESS DENIED");
        }
    }

    @Override
    public void get(String role, int empId) throws Exception {
        if(role == "ADMIN") {
            emp.get(role, empId);
        } else {
            System.out.println("Cannot get as ACCESS DENIED");
        }
    }
}
