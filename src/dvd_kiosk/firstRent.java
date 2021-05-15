
package dvd_kiosk;

import java.io.*;
import java.util.Scanner;
import javax.swing.*;

public class firstRent extends javax.swing.JFrame {
File file1 = new File("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\cardDB.txt"); 
File file = new File("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\orderDB.txt"); 

    public firstRent() {
        initComponents();
         this.setLocationRelativeTo(null);
         this.setTitle("FIRST ORDER");
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLa = new javax.swing.JLabel();
        mainpane = new javax.swing.JPanel();
        voucherTf = new javax.swing.JTextField();
        cardTf1 = new javax.swing.JTextField();
        voucherBtn = new javax.swing.JButton();
        payBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLa.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\logo_s.png")); // NOI18N
        jPanel1.add(logoLa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 416, 73));

        mainpane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        voucherTf.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        voucherTf.setText(" Discount Code");

        cardTf1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        cardTf1.setText("Card No.");
        cardTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardTf1ActionPerformed(evt);
            }
        });

        voucherBtn.setBackground(new java.awt.Color(0, 0, 0));
        voucherBtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        voucherBtn.setForeground(new java.awt.Color(255, 255, 255));
        voucherBtn.setText("REDEEM");
        voucherBtn.setBorder(null);
        voucherBtn.setBorderPainted(false);
        voucherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voucherBtnActionPerformed(evt);
            }
        });

        payBtn.setBackground(new java.awt.Color(0, 0, 0));
        payBtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        payBtn.setForeground(new java.awt.Color(255, 255, 255));
        payBtn.setText("CHECKOUT");
        payBtn.setActionCommand("");
        payBtn.setBorderPainted(false);
        payBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainpaneLayout = new javax.swing.GroupLayout(mainpane);
        mainpane.setLayout(mainpaneLayout);
        mainpaneLayout.setHorizontalGroup(
            mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpaneLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpaneLayout.createSequentialGroup()
                        .addComponent(cardTf1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpaneLayout.createSequentialGroup()
                        .addComponent(voucherTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voucherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        mainpaneLayout.setVerticalGroup(
            mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpaneLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voucherTf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voucherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardTf1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(mainpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voucherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voucherBtnActionPerformed
        String codeInput = voucherTf.getText();
        String freeCode = "free123";
        if (codeInput.equalsIgnoreCase(freeCode) )  {
            JOptionPane.showMessageDialog(null,"Code applied\nEnter your Card number");
        }else {
            JOptionPane.showMessageDialog(null,"Promo Code is invalid", "Error",JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_voucherBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        Scanner sc = new Scanner(System.in);
        String cardInput =  cardTf1.getText();
        int pass = 0;   
    
        try {
            FileReader filereader = new FileReader(file1);		
            BufferedReader br = new BufferedReader(filereader);
            String line = "";      
            
                while ((line = br.readLine())!=null) {
                    System.out.println(line.indexOf(cardInput));
                    int cardNum = line.indexOf(cardInput);
                    if(cardNum !=-1) {
                        JOptionPane.showMessageDialog(null,"It's not your first transaction\nSorry code can't be applied","Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }  
                }
         
        if (pass == 0) { 
            JOptionPane.showMessageDialog(null,"Code was successfully applied\n DVD in progress");   
            FileWriter fw1 = new FileWriter(file1, true);
            fw1.write("\r\n"+cardInput);
            fw1.close();
            
            FileWriter fw2 = new FileWriter(file, true);
            fw2.write("Card no: "+cardInput+"\r\n");
            fw2.close();           
           }
        } catch(IOException e) {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_payBtnActionPerformed

    private void cardTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardTf1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firstRent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cardTf1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoLa;
    private javax.swing.JPanel mainpane;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton voucherBtn;
    private javax.swing.JTextField voucherTf;
    // End of variables declaration//GEN-END:variables
}
