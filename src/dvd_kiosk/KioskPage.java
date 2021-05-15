
package dvd_kiosk;

import Return.ReturnDisc;

public class KioskPage extends javax.swing.JFrame {

    /**
     * Creates new form Main1
     */
    public KioskPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        topPan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        middlePan = new javax.swing.JPanel();
        middleLa1 = new javax.swing.JLabel();
        middleLa3 = new javax.swing.JLabel();
        middleLa2 = new javax.swing.JLabel();
        middleLa4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        middleLa5 = new javax.swing.JLabel();
        bottomPan = new javax.swing.JPanel();
        returnBtn = new javax.swing.JButton();
        rentBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      //  jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_s.png"))); // NOI18N
               jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\logo_s.png"));


        javax.swing.GroupLayout topPanLayout = new javax.swing.GroupLayout(topPan);
        topPan.setLayout(topPanLayout);
        topPanLayout.setHorizontalGroup(
            topPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        topPanLayout.setVerticalGroup(
            topPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        middlePan.setBackground(new java.awt.Color(255, 255, 255));
        middlePan.setToolTipText("");
        middlePan.setAutoscrolls(true);
        middlePan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        middlePan.setFocusCycleRoot(true);
        middlePan.setFocusTraversalPolicyProvider(true);
        middlePan.setFocusable(false);
        middlePan.setInheritsPopupMenu(true);
        middlePan.setOpaque(false);
        middlePan.setPreferredSize(new java.awt.Dimension(600, 300));

        middleLa1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        middleLa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        middleLa1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\free.png"));
       
        middleLa3.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        middleLa3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        middleLa3.setText("Use coupon code: ");

        middleLa2.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        middleLa2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        middleLa2.setText("Your first retal is FREE!");

        middleLa4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        middleLa4.setForeground(new java.awt.Color(255, 0, 0));
        middleLa4.setText("FREE123");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Credit and Debit Cards accepted");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        middleLa5.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        middleLa5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        middleLa5.setText("NO Xtra-vision membership or signup required!");
        middleLa5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout middlePanLayout = new javax.swing.GroupLayout(middlePan);
        middlePan.setLayout(middlePanLayout);
        middlePanLayout.setHorizontalGroup(
            middlePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePanLayout.createSequentialGroup()
                .addGroup(middlePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(middleLa5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(middlePanLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(middleLa1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(middlePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(middlePanLayout.createSequentialGroup()
                                .addComponent(middleLa3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(middleLa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(middleLa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        middlePanLayout.setVerticalGroup(
            middlePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePanLayout.createSequentialGroup()
                .addGroup(middlePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(middlePanLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(middleLa2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(middlePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(middleLa4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(middleLa3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(middlePanLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(middleLa1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(middleLa5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottomPan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bottomPan.setFocusTraversalPolicyProvider(true);
        bottomPan.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        returnBtn.setBackground(new java.awt.Color(255, 51, 0));
        returnBtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        returnBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnBtn.setText("RETURN");
        returnBtn.setBorder(null);
        returnBtn.setBorderPainted(false);
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        rentBtn.setBackground(new java.awt.Color(255, 51, 0));
        rentBtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        rentBtn.setForeground(new java.awt.Color(255, 255, 255));
        rentBtn.setText("RENT");
        rentBtn.setBorder(null);
        rentBtn.setBorderPainted(false);
        rentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanLayout = new javax.swing.GroupLayout(bottomPan);
        bottomPan.setLayout(bottomPanLayout);
        bottomPanLayout.setHorizontalGroup(
            bottomPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(rentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        bottomPanLayout.setVerticalGroup(
            bottomPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanLayout.createSequentialGroup()
                .addGroup(bottomPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomPan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(middlePan, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(middlePan, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void rentBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
      this.dispose();
      this.setLocationRelativeTo(null);
      MovieList mList = new MovieList();
      mList.setVisible(true);
    }                                       

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
       this.dispose();
       ReturnDisc  returnDisc = new ReturnDisc();
       returnDisc.setVisible(true);
    }                                         

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
            java.util.logging.Logger.getLogger(KioskPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KioskPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KioskPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KioskPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KioskPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel bottomPan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel middleLa1;
    private javax.swing.JLabel middleLa2;
    private javax.swing.JLabel middleLa3;
    private javax.swing.JLabel middleLa4;
    private javax.swing.JLabel middleLa5;
    private javax.swing.JPanel middlePan;
    private javax.swing.JButton rentBtn;
    private javax.swing.JButton returnBtn;
    private javax.swing.JPanel topPan;
    // End of variables declaration                   
}
