import javastudy.ChatRoom;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginGUI extends JFrame implements ActionListener{
    private String serverIP;
    private int serverPort;

    JTextField loginTextField;//id 텍스트필드
    JTextField pwTextField;//pw 텍스트필드
    JButton loginButton; //로그인 버튼
    JButton signUpButton; //회원가입 버튼
    Statement stmt;

    public LoginGUI(Statement stmt, String serverIP, int serverPort) {
        this.stmt = stmt;
        this.serverIP = serverIP;
        this.serverPort = serverPort;

        setTitle("로그인");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int)(screenSize.width / 2.5), (int)(screenSize.height / 2.5), 400, 200);
        /**************************************************/
        //WindowPanel
        JPanel mainWindowPanel = new JPanel();
        mainWindowPanel.setLayout(new GridLayout(0,1));
        add(mainWindowPanel);
        /**************************************************/
        //LOGIN
        JPanel loginWindowPanel = new JPanel();
        mainWindowPanel.add(loginWindowPanel);
        //로그인과 패스워드 라벨과 필드
        JLabel loginLabel = new JLabel("ID:");
        loginTextField = new JTextField(10);
        loginWindowPanel.add(loginLabel);
        loginWindowPanel.add(loginTextField);
        //PW패널
        JPanel passwordWindowPanel = new JPanel();
        mainWindowPanel.add(passwordWindowPanel);
        JLabel pwLabel = new JLabel("PW:");
        pwTextField = new JTextField(10);
        passwordWindowPanel.add(pwLabel);
        passwordWindowPanel.add(pwTextField);
        /**************************************************/
        //버튼패널
        JPanel loginButtonPanel = new JPanel();
        mainWindowPanel.add(loginButtonPanel);
        //로그인과 회원가입 버튼
        loginButton = new JButton("로그인");
        loginButton.setSize(400, 500);
        loginButton.addActionListener(this);

        signUpButton = new JButton("회원가입");
        signUpButton.setSize(400, 20);
        signUpButton.addActionListener(this);

        loginButtonPanel.add(loginButton);
        loginButtonPanel.add(signUpButton);
        /**************************************************/
        setVisible(true);
    }

    protected String SelectQuery(String id, String pw) {
        String query = "Select user_id, user_pw, user_nick from users where user_id = '" + id + "'"
                + "and user_pw = '" + pw + "'";
        try {
            ResultSet resultQuery = stmt.executeQuery(query);
            if(resultQuery.next()) {
                String nickName = resultQuery.getString("user_nick");
                System.out.println(nickName);
                return nickName;
            }
            else {
                System.out.println("id와 패스워드가 틀림!!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //버튼클릭 시
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        //로그인 버튼 클릭 시
        if (button == loginButton) {
            System.out.println("로그인을 시도합니다.");
            String nickName = SelectQuery(loginTextField.getText(), pwTextField.getText());

            if(nickName != null) {
                System.out.println("서버에 연결 시도 중...");
                try {
                    Socket socket = new Socket(serverIP, serverPort);
                    //이 밑으로 왔다는 것은 접속이 성공했다는 뜻
                    System.out.println("Server 접속 성공!");
                    //로그인하고 채팅방을 띄움
                    ChatRoom chatRoom = new ChatRoom(nickName, socket);
                    Thread newThread = new Thread(chatRoom);
                    newThread.start();

                } catch (Exception ex) {
                    System.out.println("서버가 열려있지 않음!!");
                }
            }
        }
        //회원가입 버튼 클릭 시
        else if(button == signUpButton){
            System.out.println("회원가입을 시도합니다.");
        }
    }
}