
package searchMovie;

import java.sql.DriverManager;
import java.sql.*;
import java.awt.Component;
import javax.swing.JOptionPane;

public class MovieDB {
    public static void main(String[] args) {
        Connection conn = null;

      try{     
           Class.forName("com.mysql.jdbc.Driver");
           String url = "jdbc:mysql://localhost/kiosk";
           conn = DriverManager.getConnection(url, "root", "");
            System.out.println("DB connection complete");
            System.out.println("success");
      }  catch(ClassNotFoundException e){
            System.out.println("fail");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}