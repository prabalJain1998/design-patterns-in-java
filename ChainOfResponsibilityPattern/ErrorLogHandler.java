public class ErrorLogHandler extends LogHandler {

    ErrorLogHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }


    void log(int logLevel, String message) {
        if(logLevel == error) {
            System.out.println("ERROR :"+" "+message);
        } else {
            super.log(logLevel, message);
        }
    }
    
}
