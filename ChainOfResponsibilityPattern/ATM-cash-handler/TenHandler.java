public class TenHandler extends CashHandler {
    private int availableNotes;

    TenHandler(int availableNotes, CashHandler nextCashHandler) {
        super(nextCashHandler);
        this.availableNotes = availableNotes;
    }

    public void process(int amount) {
        int numNotes = Math.min(amount / 10, availableNotes);
        int remainder = amount - (numNotes * 10);

        if (numNotes > 0) {
            System.out.println("Dispensing " + numNotes + " 10 notes.");
        }

        if (remainder > 0 && nextCashHandler != null) {
            nextCashHandler.process(remainder);
        } else if(remainder != 0) {
            System.out.println("Insufficient cash for " + remainder + ". Cannot complete transaction.");
        }
    }
}
