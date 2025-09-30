public class TwentyHandler extends CashHandler {
    private int availableNotes;

    TwentyHandler(int availableNotes, CashHandler nextCashHandler) {
        super(nextCashHandler);
        this.availableNotes = availableNotes;
    }

    public void process(int amount) {
        int numNotes = Math.min(amount / 20, availableNotes);
        int remainder = amount - (numNotes * 20);

        if (numNotes > 0) {
            System.out.println("Dispensing " + numNotes + " 20 notes.");
        }

        if (remainder > 0 && nextCashHandler != null) {
            nextCashHandler.process(remainder);
        } else {
            System.out.println("Insufficient cash for " + remainder + ". Cannot complete transaction.");
        }
    }
}
