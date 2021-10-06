package blackJack;

import java.util.Scanner;

public class Game {
    public void play(){
        Scanner scan = new Scanner(System.in);
        CardDeck cd = new CardDeck();
        Dealer dealer =new Dealer();
        Gamer gamer =new Gamer();
        Rule rule =new Rule();

        for(int i=0; i<2; i++){
            dealer.receiveCard(cd.getCard());
            gamer.receiveCard(cd.getCard());
        }
        dealer.moreCard(cd);
        while (true){
            System.out.println("---나의 카드 리스트---");
            gamer.showAllCards();
            System.out.print("카드를 더 뽑으시겠습니까? (y/n)\n");
            String yn = scan.next();
            if("n".equals(yn)){
            break;}
            gamer.receiveCard(cd.getCard());
        }
        System.out.println("---딜러 카드 리스트---");
        dealer.showAllCards();
        rule.getWinner(dealer,gamer);
    }
}
