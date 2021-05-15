package searchMovie;

import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

    
public class MovieSearch {
    public static void main(String[] args) {
    String driver="com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost/kiosk";     
   
     Connection conn = null;
     Statement state = null;   
     System.out.println("search movie");
     Scanner sc = new Scanner(System.in);    
     String titleInput =sc.nextLine();
    
     try {
         Class.forName(driver);          
         conn = DriverManager.getConnection(url, "root", "");
          System.out.println("[ MySQL Conneciton]\n");
          state = conn.createStatement();
          
          String sql;
          sql = "SELECT Title FROM `movielist`  ";
          ResultSet rs= state.executeQuery(sql);        
                 
          if(rs.next()) {           
              System.out.println(titleInput);
           //   title=rs.getString('Title');
              
//                if (rs.getString(0).equals(titleInput)) {   
//                     System.out.println(titleInput+" is not ");
//                } 
//                    else{
//                    System.out.println(titleInput+" is available");
//             }
               rs.close();
               state.close();
               conn.close();
          }
     }  catch (Exception ex) { 
            Logger.getLogger(MovieSearch.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
         try {
             if (state !=null){
             state.close(); }             
         if(conn!=null){
             conn.close();
         } 
         }catch (Exception ex) { 
            ex.printStackTrace();        
     }
       
     }
     System.out.println("MySQL Close");
    }         
    }
