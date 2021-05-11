
package Return;

import dvd_kiosk.View;
import dvd_kiosk.emailCon;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Date_test {
    public static void main(String[] args) throws IOException, ParseException  {     
//        try{
//            File file= new File("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\orderDB.txt");
//            FileReader fr = new FileReader(file);		
//            BufferedReader br = new BufferedReader(fr);
//            String line = "";   
//                       
//            while ((line = br.readLine())!=null)  {
//                if(line.contains("Return Date"))                   
//                   System.out.println(line);
////                 String returnDate = line;
////                  System.out.println(returnDate);            
//                }
//        }      catch (FileNotFoundException ex) {
//            Logger.getLogger(Date_test.class.getName()).log(Level.SEVERE, null, ex);
//        }    
//             
                     
                Calendar today=Calendar.getInstance();
                today.setTime(new Date());
                
                
                File file= new File("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\orderDB.txt");
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                 
                String line = "";
                while ((line = br.readLine())!=null)  {
                    if(line.contains("Return Date")) {
                    SimpleDateFormat s = new SimpleDateFormat("dd MM yyyy");                   
//                      Date s = new SimpleDateFormat("dd MM yyyy");
                      System.out.println(returnDate);
                              
                    
                        
                        
//               System.out.println(date);       
//               Calendar overDueDay = Calendar.getInstance();
//               overDueDay.setTime(date);

                    }
//        }      catch (FileNotFoundException ex) {
//            Logger.getLogger(Date_test.class.getName()).log(Level.SEVERE, null, ex);
                }
                
//                String returnDay = "";            
//                Date date = new SimpleDateFormat("EEE, d MMM yyyy").parse(returnDay);
//                Calendar overDueDay = Calendar.getInstance();
//                overDueDay.setTime(date);
//                
//                long diffSec= (today.getTimeInMillis() - overDueDay.getTimeInMillis()) /1000;
//                long diffDays = diffSec / (24*60*60);                  
//                int diffDay = Math.toIntExact(diffDays);
//                
//               if  (diffDay> 0) {
//                int lateFee=0;
//                lateFee = (int) (diffDay*1.00);
//               JOptionPane.showMessageDialog(null, "Your have a latefee "+ lateFee);     
//                } else {
//                    JOptionPane.showMessageDialog(null," return successful ");
//                }
   }
}

    

        
    
        
//        try {
//            File file= new File("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\orderDB.txt");
//
//            Scanner sc = new Scanner(file);
//            while (sc.hasNextLine())
//                     System.out.println(sc.nextLine());
//              }   catch (IOException ex) {
//            Logger.getLogger(Date_test.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

    
          
//         Date date = new Date (); 
//         SimpleDateFormat s = new SimpleDateFormat("EEE, d MMM yyyy");
//         String today = s.format(date);
//         System.out.println(today);
//    }
//}

//   Calendar today=Calendar.getInstance();
//                today.setTime(new Date());
//                
//                String returnDay = "Mon, 13 May 2021";
//                 //  emailCon.returnTf.getText();            
//                Date date = new SimpleDateFormat("EEE, d MMM yyyy").parse(returnDay);
//                Calendar dayReturn = Calendar.getInstance();
//                dayReturn.setTime(date);                      
//                
//                long diffSec= (dayReturn.getTimeInMillis() - today.getTimeInMillis()) /1000;
//                long diffDays = diffSec / (24*60*60);                  
//                int diffDay = Math.toIntExact(diffDays);
//                 System.out.println(diffSec);
//                System.out.println(diffDay);
//                
//               if  (diffDay> 0) {
//                int lateFee=0;
//                lateFee = (int) (diffDay*1.00);
//                System.out.println("€" + lateFee);
//               //JOptionPane.showMessageDialog(null, "Your have a latefee "+ lateFee);     
//                } else {
//                 System.out.println(" return successful ");
//                  //  JOptionPane.showMessageDialog(null," return successful ");                    
//                } 
//         }     

    
        
            




    