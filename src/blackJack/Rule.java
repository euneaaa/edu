package blackJack;

import java.util.List;

public class Rule {
    public int getScore(List<Card> cards) {
        int sumPoint = 0;
        for(int i=0; i< cards.size(); i++) {
            Card c = cards.get(i);
            sumPoint += c.getPoint();
        }
        return sumPoint;
    }

    public void getWinner(Dealer dealer, Gamer gamer){
        int dealerScore = getScore(dealer.openCards());
        int gamerScore = getScore(gamer.openCards());

        //경우의 수 3(비긴경우(점수같음, 둘다 21점 넘김), 딜러승, 게이머승)

        if((dealerScore>21&&gamerScore>21)||(dealerScore==gamerScore)){
            System.out.println("비겼습니다.");
        }else if(dealerScore>21||(gamerScore<=21&&dealerScore<gamerScore)){
            System.out.println("게이머의 승리입니다.");
        }else
            System.out.println("딜러의 승리입니다.");
    }
}
