public interface Mediator {
    void placeBid(Bidder bidder, int amount);
    void addBidder(Bidder bidder);
}
