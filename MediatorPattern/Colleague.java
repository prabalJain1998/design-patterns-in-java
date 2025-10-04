public class Colleague extends Bidder {

    Colleague(String name, AuctionMediator ac) {
        super(name, ac);
    }

    @Override
    void notify(int newHighestBid, Bidder bidder) {
         System.out.println(name + " notified: New highest bid is $" + newHighestBid + " by " + bidder.getName());
    }

    @Override
    void placeBid(int amount) {
        ac.placeBid(this, amount);
    }

    
}
