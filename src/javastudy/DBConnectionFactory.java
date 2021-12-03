import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionFactory {
    private File file;
    private String driver;
    private String url;
    private String user;
    private String password;
    private Connection connection;
    private Statement stmt;

    public DBConnectionFactory() {
        file = new File("DB.txt");
        loadData();
    }

    private void loadData() {
        try {
            BufferedReader fin = new BufferedReader(new FileReader(file));
            driver = fin.readLine();
            url = fin.readLine();
            user = fin.readLine();
            password = fin.readLine();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected Connection getConnection() {
        try {
            Class.forName(driver);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return connection;
    }

    public static void main(String[] args) {
        Connection connection = new DBConnectionFactory().getConnection();
        System.out.println("connection = " + connection);

        try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}