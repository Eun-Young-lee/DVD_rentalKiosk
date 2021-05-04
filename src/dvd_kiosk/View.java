
package dvd_kiosk;

import java.io.*;
import java.util.*;
import javax.swing.*;
import dvd_kiosk.MovieList;
import java.awt.Component;
import java.text.*;

public class View extends javax.swing.JFrame {
File file = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\DVD_Kiosk\\orderDB.txt"); 
emailCon confirm = new emailCon();

    public View() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PAYMENT");        
         }
    
    void createFolder() {
        if(!file.exists()){
            file.mkdirs();
        }
    }
      
    void readFile() {
    	try {
    	FileReader fr = new FileReader(file);
    	System.out.println("file exists");
   
    	FileWriter fw = new FileWriter(file);
    	System.out.println("File created");
    	
    	} catch (Exception e) {
    		e.getStackTrace();
    	}
    }
    
    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("EEE, d MMM yyyy HH:mm");
        confirm.dateTf.setText(s.format(d));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pane1 = new javax.swing.JPanel();
        addRentLa2 = new javax.swing.JLabel();
        AddRentLa1 = new javax.swing.JLabel();
        daysTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dayTotalTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        daysBox = new javax.swing.JComboBox<>();
        cardpanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cardTf = new javax.swing.JTextField();
        pinTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        checkBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        fistla = new javax.swing.JLabel();
        clickBtn = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pane1.setPreferredSize(new java.awt.Dimension(600, 400));
        pane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addRentLa2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        addRentLa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addRentLa2.setText("If you wish to extend your rental day");
        pane1.add(addRentLa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 62, 466, 35));

        AddRentLa1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        AddRentLa1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddRentLa1.setText("  Addtional Cost ONLY 1.50!");
        pane1.add(AddRentLa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 23, 353, -1));

        daysTf.setBackground(new java.awt.Color(240, 240, 240));
        daysTf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        daysTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        daysTf.setBorder(null);
        pane1.add(daysTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 103, 80, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DVD_Kiosk\\src\\img\\logo3.png")); // NOI18N
        pane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 0, 73, 56));

        dayTotalTf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dayTotalTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pane1.add(dayTotalTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 149, 158, 38));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Price");
        pane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 152, 86, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Days   €");
        jLabel6.setPreferredSize(new java.awt.Dimension(29, 20));
        pane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 103, 52, 35));

        daysBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        daysBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysBoxActionPerformed(evt);
            }
        });
        pane1.add(daysBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 108, 47, 28));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DVD_Kiosk\\src\\img\\cardi.png")); // NOI18N

        cardTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cardTf.setToolTipText("");

        pinTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pinTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Card Number");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pin Number");

        checkBtn.setBackground(new java.awt.Color(0, 0, 0));
        checkBtn.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        checkBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkBtn.setText("CHECKOUT");
        checkBtn.setBorder(null);
        checkBtn.setBorderPainted(false);
        checkBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(pinTf, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardTf, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cardTf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pinTf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout cardpanelLayout = new javax.swing.GroupLayout(cardpanel);
        cardpanel.setLayout(cardpanelLayout);
        cardpanelLayout.setHorizontalGroup(
            cardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardpanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cardpanelLayout.setVerticalGroup(
            cardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane1.add(cardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 243, 553, -1));

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        fistla.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        fistla.setForeground(new java.awt.Color(255, 255, 255));
        fistla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fistla.setText("Is It Your First Transaction?  Get Free !");

        clickBtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        clickBtn.setForeground(new java.awt.Color(204, 0, 0));
        clickBtn.setText("Click here!");
        clickBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(fistla, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clickBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(fistla, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addComponent(clickBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 199, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clickBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickBtnActionPerformed
        firstRent first = new firstRent(); 
        first.setVisible(true);
    }//GEN-LAST:event_clickBtnActionPerformed

    private void days() {
         String selectedDay=daysBox.getSelectedItem().toString();
         Double selectedDays = Double.parseDouble(selectedDay);
         double price = 1.50;
         double total = 0;
         total = selectedDays*price; 
         daysTf.setText(String.valueOf(total));        
    }
    
    private void orderData() {  
        try {
            FileReader fr = new FileReader(file);		
            BufferedReader br = new BufferedReader(fr);
            confirm.orderTa.read(fr, null);
            br.close();
            confirm.orderTa.requestFocus();          
     } catch (IOException ex) {
      ex.printStackTrace();
    }          
    }
    
    private void daysBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysBoxActionPerformed
         days();          
         double subTotal=0;
         subTotal = Double.parseDouble(String.valueOf(MovieList.totalTf.getText()))+Double.parseDouble(String.valueOf(daysTf.getText()));
         dayTotalTf.setText(" € " + String.valueOf(subTotal));
    }//GEN-LAST:event_daysBoxActionPerformed

   
      
    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
            String cardNo=cardTf.getText();   
            String pinNo=pinTf.getText();  
            ImageIcon icon1 = new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DVD_Kiosk\\src\\img\\paid.png");
            ImageIcon icon2 = new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DVD_Kiosk\\src\\img\\thanks.png");
    
           if ((cardNo == null) || (cardNo.length() <13 ) ||  (cardNo.length() >16 )) {
               JOptionPane.showMessageDialog(null, "This card number is invaild","Oops", JOptionPane.ERROR_MESSAGE);
               return;
               } if ((pinNo == null) || ! (pinNo.length() ==3 )) {
                   JOptionPane.showMessageDialog(null, "This pin number is invaild","Oops", JOptionPane.ERROR_MESSAGE);  
                   } 
               else 
                   {
                       int response = JOptionPane.showConfirmDialog(this, "Payment Successful!\nWould you like a receipt?","THANK YOU", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon1); 
                       if(response == JOptionPane.YES_OPTION){
                           confirm.totalTf.setText( String.valueOf(dayTotalTf.getText()));
                           String totalcost = confirm.totalTf.getText();
                           confirm.orderTa.append(totalcost) ;  
                           confirm.setVisible(true);                        
                           orderData();
                           showDate(); 
                           } else {
                           JOptionPane.showMessageDialog(null, "Order Completed ", "See You Soon",JOptionPane.DEFAULT_OPTION, icon2);
                          }
                       }              
    }//GEN-LAST:event_checkBtnActionPerformed
        
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddRentLa1;
    private javax.swing.JLabel addRentLa2;
    private javax.swing.JTextField cardTf;
    private javax.swing.JPanel cardpanel;
    private javax.swing.JButton checkBtn;
    private javax.swing.JButton clickBtn;
    protected static javax.swing.JTextField dayTotalTf;
    private javax.swing.JComboBox<String> daysBox;
    private javax.swing.JTextField daysTf;
    private javax.swing.JLabel fistla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pane1;
    private javax.swing.JTextField pinTf;
    // End of variables declaration//GEN-END:variables
}
