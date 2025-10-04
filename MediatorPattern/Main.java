public class Main {
    public static void main(String[] args) {
        AuctionMediator ac = new AuctionMediator();
        Bidder prabal = new Colleague("prabal", ac);
        Bidder amit = new Colleague("amit", ac);
        Bidder palash = new Colleague("palash", ac);

        ac.placeBid(palash, 100);
        ac.placeBid(prabal, 102);
        ac.placeBid(amit, 99);
        ac.placeBid(palash, 345);

        System.out.println("Final BID "+ac.highestBid);
    }
}
