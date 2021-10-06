package blackJack;

import java.util.LinkedList;
import java.util.List;


public class Gamer {
    //배열 X

    protected List<Card> myCards;

    public Gamer(){
        init();
    }

    private void init() {
        myCards =new LinkedList();
    }

    //카드받기
    public void receiveCard(Card c){
        myCards.add(c);
    }

    public List<Card> openCards(){
        return myCards;
    }

    public void showAllCards(){
        for(Card c : myCards){
            System.out.println(c);
        }
    }
}
