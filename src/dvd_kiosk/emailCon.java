
package dvd_kiosk;

import java.awt.Color;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;


public class emailCon extends javax.swing.JFrame {

  
    public emailCon() {
        initComponents();
        rentalTf.setBackground (new Color (0,0,0,1));   
        returnTf.setBackground (new Color (0,0,0,1));
        totalTf.setBackground (new Color (0,0,0,1));
       
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);
        jScrollPane.setBorder(null);
        jScrollPane.setViewportBorder(null);       
        
        orderTa.setBorder(null);
        orderTa.setBackground(new Color (0,0,0,0));  
        orderTa.setText((orderTa.getText()+"                            Receipt         \n"));
        orderTa.setText((orderTa.getText()+" *********************************************************** \n"));
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toLabel = new javax.swing.JLabel();
        toEmailTf = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        fromLab = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        orderTa = new javax.swing.JTextArea();
        rentalTf = new javax.swing.JTextField();
        totalTf = new javax.swing.JTextField();
        returnTf = new javax.swing.JTextField();
        totalLa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        toLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toLabel.setText("To");
        getContentPane().add(toLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 40, 30));

        toEmailTf.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        toEmailTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        toEmailTf.setText("enter email");
        toEmailTf.requestFocus();
        getContentPane().add(toEmailTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 190, 30));

        sendBtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        sendBtn.setText("SEND");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 30));

        fromLab.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        fromLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fromLab.setText("From  order@Xtra-vision.com");
        fromLab.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(fromLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 240, -1));

        jScrollPane.setOpaque(false);

        orderTa.setColumns(20);
        orderTa.setLineWrap(true);
        orderTa.setRows(5);
        orderTa.setOpaque(false);
        orderTa.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane.setViewportView(orderTa);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 340, 260));

        rentalTf.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        rentalTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rentalTf.setText("Rental Date: ");
        rentalTf.setBorder(null);
        getContentPane().add(rentalTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 340, 20));

        totalTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(totalTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 170, 30));

        returnTf.setBackground(new java.awt.Color(240, 240, 240));
        returnTf.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        returnTf.setForeground(new java.awt.Color(0, 0, 153));
        returnTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        returnTf.setText("Return Date: ");
        returnTf.setBorder(null);
        getContentPane().add(returnTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 340, 20));

        totalLa.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        totalLa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLa.setText("TOTAL PRICE");
        getContentPane().add(totalLa, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 310, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        final String username = "poply2@gmail.com";
        final String password = "0000";
        String fromEmail = "order@Xtra-vision.com";
        
        String toEmail =toEmailTf.getText() ;
        String textContents=orderTa.getText();
        String date1 = rentalTf.getText();
        String date2 = returnTf.getText();
        String totalPrice=totalTf.getText();
           			
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
			
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
                }
            });
            //Start our mail message
            MimeMessage msg = new MimeMessage(session);
            try {
                msg.setFrom(new InternetAddress(fromEmail));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                msg.setSubject("Xtra-Vision Confirmation");                
				
               //Text body part 
                Multipart emailContent = new MimeMultipart();
                MimeBodyPart textMainPart = new MimeBodyPart();
                textMainPart.setText("*****ORDER DETAIL**********\r\n");
             				
                //Attach body parts               
               MimeBodyPart bodyPart1 = new MimeBodyPart(); 
               MimeBodyPart bodyPart2 = new MimeBodyPart();  
               MimeBodyPart bodyPart3 = new MimeBodyPart(); 
               MimeBodyPart  bodyPart4 = new MimeBodyPart(); 
               emailContent.addBodyPart(textMainPart);
                
                bodyPart1.setText(date1+"\r\n");
                bodyPart2.setText(date2);
                bodyPart3.setText(textContents);   
                bodyPart4.setText("-----------------------------------------------------\r\n");
                bodyPart4.setText("Total Cost: " + totalPrice);
                emailContent.addBodyPart(bodyPart1);
                emailContent.addBodyPart(bodyPart2);
                emailContent.addBodyPart(bodyPart3);
                emailContent.addBodyPart(bodyPart4);		
                //Attach multipart to message
                msg.setContent(emailContent);				
                Transport.send(msg);
                System.out.println("Sent message");
                                
                } catch (MessagingException e) {
                    e.printStackTrace();
                    }
             
                if (toEmail.length() >0 && toEmail.contains("@") && toEmail.endsWith(".com")) {
                    ImageIcon ic = new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\emailSend.png");
                     JOptionPane.showMessageDialog(null,"Email sent", "OK",JOptionPane.DEFAULT_OPTION, ic);
                    } else {
                    JOptionPane.showMessageDialog(null,"Email address is invaild\nTry again", "Oops", JOptionPane.ERROR_MESSAGE);
                }     
    }//GEN-LAST:event_sendBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(emailCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emailCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emailCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emailCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emailCon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fromLab;
    private javax.swing.JScrollPane jScrollPane;
    public static javax.swing.JTextArea orderTa;
    public static javax.swing.JTextField rentalTf;
    public static javax.swing.JTextField returnTf;
    private javax.swing.JButton sendBtn;
    private javax.swing.JTextField toEmailTf;
    private javax.swing.JLabel toLabel;
    private javax.swing.JLabel totalLa;
    public static javax.swing.JTextField totalTf;
    // End of variables declaration//GEN-END:variables
}
