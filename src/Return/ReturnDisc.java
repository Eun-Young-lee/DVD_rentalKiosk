
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
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static dvd_kiosk.emailCon.returnTf;


public class ReturnDisc extends javax.swing.JFrame {


    public ReturnDisc() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logolab = new javax.swing.JLabel();
        mainPane = new javax.swing.JPanel();
        codeLab = new javax.swing.JLabel();
        confirmBtn = new javax.swing.JButton();
        scanLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logolab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logolab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_s.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logolab, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logolab, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        codeLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codeLab.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\dvdCode.jpg")); // NOI18N

        confirmBtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        confirmBtn.setText("CONFIRM");
        confirmBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        scanLab.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        scanLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scanLab.setText("Please scan the electroninc tag on DVD");

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addComponent(scanLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(codeLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scanLab, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
    File file= new File("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\orderDB.txt");
     Scanner sc = new Scanner(System.in);
     String dvdCode = sc.nextLine();                
        
            try {
            FileReader fr = new FileReader(file);		
            BufferedReader br = new BufferedReader(fr);
            String line = "";      
            
                while ((line = br.readLine())!=null)  {
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
               Logger.getLogger(ReturnDisc.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ReturnDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnDisc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codeLab;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logolab;
    private javax.swing.JPanel mainPane;
    private javax.swing.JLabel scanLab;
    // End of variables declaration//GEN-END:variables
}
