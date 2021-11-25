import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

class MultiThread extends JPanel implements ActionListener{
    private JProgressBar progressBar1, progressBar2;
    private JButton startButton;
    //생성자
    public MultiThread() {
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        progressBar1 = new JProgressBar(0, 1000);
        progressBar2 = new JProgressBar(0, 1000);

        progressBar1.setValue(0); //프로그래스바 value 설정
        progressBar1.setStringPainted(true); //문자열을 보이게 함
        progressBar2.setValue(0);
        progressBar2.setStringPainted(true);

        JPanel panel = new JPanel();
        panel.add(startButton);
        panel.add(progressBar1);
        panel.add(progressBar2);
        add(panel);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        startButton.setEnabled(false);
        ProgressBarClass p1 = new ProgressBarClass(progressBar1, startButton);
        ProgressBarClass p2 = new ProgressBarClass(progressBar2, startButton);
        p1.start();
        p2.start();
    }
}

class ProgressBarClass extends Thread{
    private JProgressBar jpb;
    private JButton jb;
    public ProgressBarClass(JProgressBar jpb, JButton jb) {
        this.jpb = jpb;
        this.jb = jb;
    }
    @Override
    public void run() {
        int current = 0;
        while(current <= 1000) {
            current += Math.random() * 10;
            try {
                sleep(100);
            } catch (InterruptedException e) {
            }
            jpb.setValue(current);

        }
        jb.setEnabled(true);
    }
}


public class MultiThreadTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MultiThreadTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MultiThread pbd = new MultiThread();
        frame.add(pbd);
        frame.pack();
        frame.setVisible(true);
    }

}
