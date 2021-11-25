class  Threads extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <10; i++){
            System.out.println("스레드"+i);
            Thread.yield();
        }
    }
}

class  Runnables implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i <10; i++){
            System.out.println("러너블");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Threads();
        Thread t2 = new Thread(new Runnables());
        t1.start();
        t2.start();
    }
}
