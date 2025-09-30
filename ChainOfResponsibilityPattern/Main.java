class Main {
    public static void main(String args[]) {
        LogHandler logger = new DebugLogHandler(new ErrorLogHandler(new InfoLogHandler(null)));

        logger.log(1, "Hello Debug Logging");
        logger.log(3, "Hello Error Logging");
    }
}