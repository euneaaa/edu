package javastudy;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ChatRoom extends JFrame implements ActionListener, Runnable{
    final int myPort = 5000; //내 포트
    final int otherPort = 6000; // 남의 포트
    final String myIP = "127.0.0.1";
    String nickName = null;
    Socket socket = null;  //접속한 Client와 통신하기 위한 Socket

    JPanel chatPanel; //채팅 패널
    JPanel peopleListPanel; //참가자 패널

    JTextArea textArea;
    JTextField textField;

    JTextArea peopleListArea;

    DataOutputStream dos = null;
    DataInputStream dis = null;

    public ChatRoom(String nickName, Socket socket) {
        super("Messenger");
        this.socket = socket;
        this.nickName = nickName;
        try {
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(nickName);
        } catch (Exception e) {
            System.out.println("Error");
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        peopleListArea = new JTextArea(20, 10);

        textArea = new JTextArea(20, 20);
        textField = new JTextField(30);
        JScrollPane scrollPane = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        add(scrollPane, BorderLayout.CENTER);
        //add(peopleListArea, BorderLayout.EAST);
        add(textField, BorderLayout.PAGE_END);

        textField.addActionListener(this);
        textArea.setEditable(false);
        //peopleListArea.setEditable(false);
        pack();
        setVisible(true);
    }

    //채팅 쳤을 경우
    @Override
    public void actionPerformed(ActionEvent e){
        String s = textField.getText(); //텍스트 받아옴
        try {
            dos.writeUTF(s + "\n");
        } catch (Exception e2) {
            // TODO: handle exception
        }
        //setCaretPosition : 마지막 커서 위치를 이동
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }


    //서버에서 누군가 채팅쳤거나 무슨 일이 일어났을 경우
    @Override
    synchronized public void run() {
        while(true) {
            try {
                String message = dis.readUTF();
                System.out.println(message);
                textArea.append(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        try {
            //ChatRoom m = new ChatRoom();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}