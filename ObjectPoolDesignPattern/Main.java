class Main {
    public static void main(String[] args) {
        ResourcePoolManager instance = ResourcePoolManager.getInstance();

        DBConnection con1 = instance.getConnection();
        DBConnection con2 = instance.getConnection();
        DBConnection con3 = instance.getConnection();
        DBConnection con4 = instance.getConnection();
        DBConnection con5 = instance.getConnection();
        DBConnection con6 = instance.getConnection();
        DBConnection con7 = instance.getConnection();
        DBConnection con8 = instance.getConnection();
        instance.releaseConnection(con5);
        System.out.println("After Released connection");
        DBConnection con9 = instance.getConnection();
    }
}