package blackJack;

public class CardTest4 {
    public static void main(String[] args) {
        Rule rule =new Rule();
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());
        dealer.moreCard(cd);

        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        rule.getWinner(dealer, gamer);
    }
}
