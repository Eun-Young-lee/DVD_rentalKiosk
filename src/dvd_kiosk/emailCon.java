
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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;


public class emailCon extends javax.swing.JFrame {

  
    public emailCon() {
        initComponents();
        dateTf.setBackground (new Color (0,0,0,1));    
        totalTf.setBackground (new Color (0,0,0,50));
       
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);
        jScrollPane.setBorder(null);
        jScrollPane.setViewportBorder(null);       
        
        orderTa.setBorder(null);
        orderTa.setBackground(new Color (0,0,0,0));    
        orderTa.setText((orderTa.getText()+"                                 Receipt    \n"));
        orderTa.setText((orderTa.getText()+" ******************************************** \n"));
     
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        toTf = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        orderTa = new javax.swing.JTextArea();
        dateTf = new javax.swing.JTextField();
        totalTf = new javax.swing.JTextField();
        totalLa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setText("From");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 40, 30));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("To");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 40, 30));

        toTf.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        toTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(toTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 200, 30));

        sendBtn.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        sendBtn.setText("SEND");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("order@Xtra-vision.com");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 230, 30));

        jScrollPane.setOpaque(false);

        orderTa.setColumns(20);
        orderTa.setLineWrap(true);
        orderTa.setRows(5);
        orderTa.setOpaque(false);
        orderTa.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane.setViewportView(orderTa);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 340, 210));

        dateTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(dateTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 320, -1));

        totalTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(totalTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 170, -1));

        totalLa.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        totalLa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLa.setText("TOTAL PRICE");
        getContentPane().add(totalLa, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 280, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        final String username = "poply2@gmail.com";
        final String password = "Lg108829";
        String fromEmail = "order@Xtra-vision.com";
        String toEmail =toTf.getText() ;
        String textContents=orderTa.getText();
			
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
                msg.setSubject("Xtra-Vision CONFIRMATION");
                msg.setContent("ORDER DETAILS","text/plain");
				
               //Text body part 
                Multipart emailContent = new MimeMultipart();
                MimeBodyPart textBodyPart = new MimeBodyPart();
                textBodyPart.setText("ORDER DETAIL");
				
                //Attach body parts
                MimeBodyPart bodyPart = new MimeBodyPart();                
                bodyPart.setText(textContents);
                emailContent.addBodyPart(textBodyPart);
                emailContent.addBodyPart(bodyPart);
				
                //Attach multipart to message
                msg.setContent(emailContent);				
                Transport.send(msg);
                System.out.println("Sent message");
                                
                } catch (MessagingException e) {
                    e.printStackTrace();
                    }
             
                if (toEmail.length() >0 && toEmail.contains("@") && toEmail.endsWith(".com")) {
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
    public static javax.swing.JTextField dateTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane;
    public static javax.swing.JTextArea orderTa;
    private javax.swing.JButton sendBtn;
    private javax.swing.JTextField toTf;
    private javax.swing.JLabel totalLa;
    public static javax.swing.JTextField totalTf;
    // End of variables declaration//GEN-END:variables
}
