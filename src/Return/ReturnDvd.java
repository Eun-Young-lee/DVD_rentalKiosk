/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Return;

import dvd_kiosk.View;
import dvd_kiosk.emailCon;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static dvd_kiosk.emailCon.returnTf;

public class ReturnDvd extends javax.swing.JFrame {

    public ReturnDvd() {
        initComponents();    
    }
     
    
    @SuppressWarnings("unchecked")         
       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        wholePane = new javax.swing.JPanel();
        logola = new javax.swing.JLabel();
        mainPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        confirmBtn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wholePane.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        logola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logola.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\logo_s.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please scan the electroninc tag on DVD");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\dvdCode.jpg")); // NOI18N

        confirmBtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        confirmBtn.setText("COMFIRM");
        confirmBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(confirmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout wholePaneLayout = new javax.swing.GroupLayout(wholePane);
        wholePane.setLayout(wholePaneLayout);
        wholePaneLayout.setHorizontalGroup(
            wholePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wholePaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(wholePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logola, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(233, 233, 233))
        );
        wholePaneLayout.setVerticalGroup(
            wholePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wholePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logola, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wholePane, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wholePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
     File file= new File("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\orderDB.txt");
     Scanner sc = new Scanner(System.in);
     String dvdCode = sc.nextLine();
     
     int pass = 0;       
        
            try {
            FileReader filereader = new FileReader(file);		
            BufferedReader buffReader = new BufferedReader(filereader);
            String line = "";      
            
                while ((line = buffReader.readLine())!=null)  {
                    System.out.println(line.indexOf(dvdCode));
                    int dvdNum = line.indexOf(dvdCode);
                    if(dvdNum !=-1) {
                        JOptionPane.showMessageDialog(null,"Sorry try gain","Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                }  catch(IOException e) {
         e.printStackTrace();
        }                 
                  
        if (pass == 0) { 
                 
            try {                 
                Calendar today=Calendar.getInstance();
                today.setTime(new Date());
                
                String returnDay = emailCon.returnTf.getText();            
                Date date = new SimpleDateFormat("EEE, d MMM yyyy").parse(returnDay);
                Calendar overDueDay = Calendar.getInstance();
                overDueDay.setTime(date);              
                
                long diffSec= (today.getTimeInMillis() - overDueDay.getTimeInMillis()) /1000;
                long diffDays = diffSec / (24*60*60);                  
                int diffDay = Math.toIntExact(diffDays);
                
               if  (diffDay> 0) {
                int lateFee=0;
                lateFee = (int) (diffDay*1.00);
               JOptionPane.showMessageDialog(null, "Your have a latefee "+ lateFee);     
                } else {
                    JOptionPane.showMessageDialog(null," return successful ");
                }   
            } catch (ParseException ex) {
               Logger.getLogger(ReturnDvd.class.getName()).log(Level.SEVERE, null, ex);
         }     
     }        

    }//GEN-LAST:event_confirmBtnActionPerformed
             

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnDvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnDvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnDvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnDvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnDvd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logola;
    private javax.swing.JPanel mainPane;
    private javax.swing.JPanel wholePane;
    // End of variables declaration//GEN-END:variables
}