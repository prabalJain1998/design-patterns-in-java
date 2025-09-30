public class InfoLogHandler extends LogHandler {

    InfoLogHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }


    void log(int logLevel, String message) {
        if(logLevel == info) {
            System.out.println("INFO :"+" "+message);
        } else {
            super.log(logLevel, message);
        }
    }
    
}
