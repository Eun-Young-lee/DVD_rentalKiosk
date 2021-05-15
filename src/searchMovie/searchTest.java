package searchMovie;

import java.sql.*;
import java.util.Scanner;


public class searchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               
        Connection conn = null;

      try{     
           Class.forName("com.mysql.jdbc.Driver");
           String url = "jdbc:mysql://localhost/kiosk";
           conn = DriverManager.getConnection(url, "root", "");
           System.out.println("DB connection complete");
          Statement state = conn.createStatement();      
          System.out.println("Title: ");
          String titleInput = sc.next();
          
          String sql= "SELECT * FROM movielist WHERE Title= " + titleInput ;
          ResultSet rs= state.executeQuery(sql); 
                          
          if(rs.next())
              System.out.println("available");
          else
              System.out.println("not in stock");      
             
      
        } catch (Exception e){
           System.out.println("ERROR: " + e.getMessage());
        }
    }
}
            
            
            


