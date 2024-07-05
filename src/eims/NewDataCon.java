
package eims;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class NewDataCon {
    public  Connection myConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eims?useSSL=false","root","panha123");
            //JOptionPane.showMessageDialog(null, "Connected");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, "Not Connected");
            return null;
        }
    }
}
