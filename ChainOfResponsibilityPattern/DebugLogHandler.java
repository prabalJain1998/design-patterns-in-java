public class DebugLogHandler extends LogHandler {

    DebugLogHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }


    void log(int logLevel, String message) {
        if(logLevel == debug) {
            System.out.println("DEBUG :"+" "+message);
        } else {
            super.log(logLevel, message);
        }
    }
    
}
