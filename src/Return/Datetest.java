
package Return;

import dvd_kiosk.View;
import dvd_kiosk.emailCon;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Datetest {
    public static void main(String[] args) throws ParseException {     
          
         Date date = new Date (); 
         SimpleDateFormat s = new SimpleDateFormat("EEE, d MMM yyyy");
         String today = s.format(date);
         System.out.println(today);
    }
}

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
//     }        

    
