import java.sql.*;

public class ConnectionTest {
    public static void main(String[] args) {
        Connection con;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Config c = new Config();
            con = DriverManager.getConnection(
                    c.getUrl(),
                    c.getUsername(),
                    c.getPassword()
            );
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            while(rs.next()){
                System.out.println("title:" + rs.getString(3) + " | description: " + rs.getString(4));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}