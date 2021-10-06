package testlist;

public class Card {
    private String pattern;
    private String number;

    public Card (String pattern,String number){
        this.pattern = pattern;
        this.number = number;
    }

    @Override
    public String toString(){
        return String.format("%s - %s", this.pattern,this.number);
    }

}
