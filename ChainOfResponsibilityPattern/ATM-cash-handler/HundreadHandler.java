public class HundreadHandler extends CashHandler {
    private int availableNotes;

    HundreadHandler(int availableNotes, CashHandler nextCashHandler) {
        super(nextCashHandler);
        this.availableNotes = availableNotes;
    }

    public void process(int amount) {
        int numNotes = Math.min(amount / 100, availableNotes);
        int remainder = amount - (numNotes * 100);

        if (numNotes > 0) {
            System.out.println("Dispensing " + numNotes + " 100 notes.");
        }

        if (remainder > 0 && nextCashHandler != null) {
            nextCashHandler.process(remainder);
        } else {
            System.out.println("Insufficient cash for " + remainder + ". Cannot complete transaction.");
        }
    }
}
