class Ticketing{
    int tiketNum = 1;
    synchronized void ticketing(){
        if(tiketNum>0){
            System.out.println(Thread.currentThread().getName()+"가 티켓팅 성공");
            tiketNum--;
        }else {
            System.out.println(Thread.currentThread().getName()+"가 티켓팅 실패");
        }
        System.out.println(Thread.currentThread().getName()+"가 시도 후 티켓 수"+tiketNum);
    }
}

class Run implements Runnable{
    Ticketing ticket = new Ticketing();
    @Override
    public void run(){
        ticket.ticketing();
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        Run r1 = new Run();
        Thread t1 = new Thread(r1, "A");
        Thread t2 = new Thread(r1, "B");
        Thread t3 = new Thread(r1, "C");
        t1.start();
        t2.start();
        t3.start();
    }
}
