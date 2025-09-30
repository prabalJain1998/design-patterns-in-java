public abstract class LogHandler {
    public static int debug = 1;
    public static int info = 2;
    public static int error = 3;

    LogHandler nextLogHandler;

    LogHandler(LogHandler nextLogHandler) {
        this.nextLogHandler = nextLogHandler;
    }

    void log (int logLevel, String message) {
        if(nextLogHandler != null) {
            nextLogHandler.log(logLevel, message);
        }
    }
}
