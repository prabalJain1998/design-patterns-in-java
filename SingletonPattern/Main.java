class Main {
    public static void main(String[] args) {
        EagerInitialization.getInstance().print();
        DoubleLock.getInstance().print();
        LazyInitialization.getInstance().print();
        SynchronizedLazyInitialization.getInstance().print();
    }
}