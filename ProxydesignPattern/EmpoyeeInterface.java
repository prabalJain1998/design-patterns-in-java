public interface EmpoyeeInterface {
    public void create(String role, Employee obj) throws Exception;
    public void delete(String role, int empId) throws Exception;
    public void get(String role, int empId) throws Exception;
}
