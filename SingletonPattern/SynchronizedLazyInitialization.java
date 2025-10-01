public class SynchronizedLazyInitialization {
    private static SynchronizedLazyInitialization instance;
    private SynchronizedLazyInitialization() {

    }

    synchronized public static SynchronizedLazyInitialization getInstance() {
        if(instance == null) {
            instance = new SynchronizedLazyInitialization();
        }
        
        return instance;
    }   

    void print() {
        System.out.println("Synchronized Initialization");
    }
}
