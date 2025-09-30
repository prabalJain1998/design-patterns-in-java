class Main {
    public static void main(String args[]) {
        Employee obj = new Employee();
        EmployeeProxy proxy = new EmployeeProxy();
        try {
            proxy.create("ADMIN", obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}