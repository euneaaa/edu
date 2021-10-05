package ch07;

public class TelevisionTest {
    public static void main(String[] args) {
        Television tv= new Television();
        tv.volumeState();
        tv.volumeUp();
        for(int i=0; i<40;i++){
            tv.volumeUp();
        }
        tv.volumeState();
        for(int i=0;i<30; i++) {
            tv.volumeDown();
        }
        tv.volumeState();
    }
}
