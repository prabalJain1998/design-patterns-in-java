public abstract class Bidder {
    String name;
    AuctionMediator ac;

    Bidder(String name, AuctionMediator ac) {
        this.name = name;
        this.ac = ac;
        this.ac.addBidder(this);
    }

    abstract void notify(int newHighestBid, Bidder bidder);
    abstract void placeBid(int amount);

    String getName() {
        return name;
    }
}
