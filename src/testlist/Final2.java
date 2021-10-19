package testlist;

public class Final2 {
    private String pattern;
    private String number;

    public Final2(String pattern,String number){
        this.pattern = pattern;
        this.number = number;
    }

    @Override
    public String toString(){
        return String.format("%s -%s",this.pattern,this.number);
    }
}
