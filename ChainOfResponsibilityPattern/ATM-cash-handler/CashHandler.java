public abstract class CashHandler {
    CashHandler nextCashHandler;

    public CashHandler(CashHandler nextCashHandler) {
        this.nextCashHandler = nextCashHandler;
    }

    public void process(int amount) {
        if(this.nextCashHandler != null) {
            nextCashHandler.process(amount);
        }
    }
}