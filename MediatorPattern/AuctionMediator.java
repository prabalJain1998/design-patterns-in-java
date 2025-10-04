import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
    List<Bidder> bidderList;
    int highestBid;
    Bidder highestBidder;

    AuctionMediator() {
        this.bidderList = new ArrayList<>();
        this.highestBid = 0;
        this.highestBidder = null;
    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
       if (amount > highestBid) {
            highestBid = amount;
            highestBidder = bidder;
            notifyBidders(bidder);
        } else {
            System.out.println(bidder.getName() + " tried bidding $" + amount + " but it's lower than the current highest $" + highestBid);
        }
    }

    private void notifyBidders(Bidder newHighest) {
        for (Bidder b : bidderList) {
            if (b != newHighest) {
                b.notify(highestBid, b);
            }
        }
    }

    @Override
    public void addBidder(Bidder bidder) {
        bidderList.add(bidder);
    }

}
