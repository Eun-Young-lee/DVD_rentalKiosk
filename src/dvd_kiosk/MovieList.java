package dvd_kiosk;

import java.awt.Component;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;


public class MovieList extends javax.swing.JFrame {

    private DefaultTableModel model;
    int count=1;
    Double price =2.99;  
    File file= new File("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\orderDB.txt");
  
       public MovieList() {
        initComponents();   
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) table.getModel();            
        btnAction();   
        getSum();  
         }  
       
       public DefaultTableModel getModel(){
           return model;
       }      
       
       void createFolder() {
        if(!file.exists()){
            file.mkdirs();
        }
    }
       
      
   
   public void getSum () {
   price = 2.99;
   int i =table.getRowCount();  
   String answer = String.valueOf(i*price);
   totalTf.setText(answer); 
 
   double total = 0;
   total = Double.parseDouble(String.valueOf(answer));
	if (total >11.96) { 
	         JOptionPane.showMessageDialog(null,"You can rent only 4 discs at once or\nFirst rent is limited to 2 discs\nPlease cancel item","SORRY", JOptionPane.ERROR_MESSAGE); 
	totalTf.setText(" ");
        }    return;
   }                     
   
   public void btnAction() {
       Component [] components = topPane.getComponents();
       for(Component component : components)
       {
           if (component instanceof JButton) {
           JButton button = (JButton) component;
           button.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  model.insertRow(model.getRowCount(), new Object[]{button.getText(), count, price});                                              
                  getSum();
                   }                
           });
       
           }    
       }
   }
   
 
    private void initComponents() {

        logoPane = new javax.swing.JPanel();
        topLabel = new javax.swing.JLabel();
        mainPan = new javax.swing.JPanel();
        TabPane = new javax.swing.JTabbedPane();
        topPane = new javax.swing.JPanel();
        topBT1 = new javax.swing.JButton();
        topBT2 = new javax.swing.JButton();
        topBT3 = new javax.swing.JButton();
        topBT4 = new javax.swing.JButton();
        topBT5 = new javax.swing.JButton();
        topBT7 = new javax.swing.JButton();
        topBT6 = new javax.swing.JButton();
        topBT8 = new javax.swing.JButton();
        actPane = new javax.swing.JPanel();
        actBtn1 = new javax.swing.JButton();
        comPane = new javax.swing.JPanel();
        comBtn1 = new javax.swing.JButton();
        horPane = new javax.swing.JPanel();
        horBtn1 = new javax.swing.JButton();
        romPane = new javax.swing.JPanel();
        romBtn1 = new javax.swing.JButton();
        DocPane = new javax.swing.JPanel();
        docBtn1 = new javax.swing.JButton();
        aniPane = new javax.swing.JPanel();
        aniBtn1 = new javax.swing.JButton();
        bottompane = new javax.swing.JPanel();
        totalTf = new javax.swing.JTextField();
        canBtn1 = new javax.swing.JButton();
        canBtn2 = new javax.swing.JButton();
        payBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        totalBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 550));

        topLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); 
        topLabel.setForeground(new java.awt.Color(255, 102, 0));
        topLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\logo3.png"));
        topLabel.setText(" Choose your movie");

        javax.swing.GroupLayout logoPaneLayout = new javax.swing.GroupLayout(logoPane);
        logoPane.setLayout(logoPaneLayout);
        logoPaneLayout.setHorizontalGroup(
            logoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPaneLayout.createSequentialGroup()
                .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logoPaneLayout.setVerticalGroup(
            logoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topLabel)
        );

        mainPan.setFont(new java.awt.Font("Tahoma", 0, 8)); 

        TabPane.setBackground(new java.awt.Color(255, 255, 255));
        TabPane.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        TabPane.setPreferredSize(new java.awt.Dimension(500, 284));

        topPane.setBackground(new java.awt.Color(204, 255, 102));
        topPane.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        topPane.setPreferredSize(new java.awt.Dimension(500, 200));

        topBT1.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        topBT1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\top10.jpg")); 
        topBT1.setText("PARASITE");
        topBT1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topBT1.setName(""); 
        topBT1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        topBT1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        topBT2.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        topBT2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\top3.jpg")); 
        topBT2.setText("1917");
        topBT2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topBT2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        topBT2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        topBT3.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        topBT3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\top2.jpg")); 
        topBT3.setText("LEGEND");
        topBT3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topBT3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        topBT3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        topBT4.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        topBT4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\top9.jpg")); // NOI18N
        topBT4.setText("LIFE");
        topBT4.setToolTipText("");
        topBT4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topBT4.setName(""); 
        topBT4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        topBT4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        topBT5.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        topBT5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\top6.jpg"));
        topBT5.setText("THE HELP");
        topBT5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topBT5.setName(""); 
        topBT5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        topBT5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        topBT7.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        topBT7.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\top5.jpg")); // NOI18N
        topBT7.setText("ROOM");
        topBT7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topBT7.setName(""); 
        topBT7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        topBT7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        topBT6.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        topBT6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\top7.jpg")); 
        topBT6.setText("FIGHT CLUB");
        topBT6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topBT6.setName(""); 
        topBT6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        topBT6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);


        topBT8.setFont(new java.awt.Font("Segoe Print", 1, 8)); 
        topBT8.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\3D Objects\\NetBeansProjects\\DVD_Kiosk\\src\\img\\top4.jpg")); // NOI18N
        topBT8.setText("THE TURNING");
        topBT8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topBT8.setName(""); 
        topBT8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        topBT8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);


        javax.swing.GroupLayout topPaneLayout = new javax.swing.GroupLayout(topPane);
        topPane.setLayout(topPaneLayout);
        topPaneLayout.setHorizontalGroup(
            topPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(topPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topBT5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(topPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(topPaneLayout.createSequentialGroup()
                        .addComponent(topBT6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(topBT7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(topBT8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topPaneLayout.createSequentialGroup()
                        .addComponent(topBT2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topBT3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(topBT4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 34, Short.MAX_VALUE))
        );
        topPaneLayout.setVerticalGroup(
            topPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topBT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topBT2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topBT3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topBT4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(topPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(topBT7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(topBT6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(topBT5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topBT8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabPane.addTab("Top-rated", topPane);

        actPane.setBackground(new java.awt.Color(153, 255, 204));

        actBtn1.setName(""); 

        javax.swing.GroupLayout actPaneLayout = new javax.swing.GroupLayout(actPane);
        actPane.setLayout(actPaneLayout);
        actPaneLayout.setHorizontalGroup(
            actPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actPaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(actBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        actPaneLayout.setVerticalGroup(
            actPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(actBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        TabPane.addTab("Action", actPane);

        comPane.setBackground(new java.awt.Color(255, 255, 102));

        comBtn1.setName(""); 


        javax.swing.GroupLayout comPaneLayout = new javax.swing.GroupLayout(comPane);
        comPane.setLayout(comPaneLayout);
        comPaneLayout.setHorizontalGroup(
            comPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(comBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );
        comPaneLayout.setVerticalGroup(
            comPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        TabPane.addTab("Comedy", comPane);

        horPane.setBackground(new java.awt.Color(204, 204, 255));

        horBtn1.setName("");

        javax.swing.GroupLayout horPaneLayout = new javax.swing.GroupLayout(horPane);
        horPane.setLayout(horPaneLayout);
        horPaneLayout.setHorizontalGroup(
            horPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(horBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );
        horPaneLayout.setVerticalGroup(
            horPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(horBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        TabPane.addTab("Horror", horPane);

        romPane.setBackground(new java.awt.Color(255, 204, 255));

        romBtn1.setText("jButton1");
        romBtn1.setName(""); 

        javax.swing.GroupLayout romPaneLayout = new javax.swing.GroupLayout(romPane);
        romPane.setLayout(romPaneLayout);
        romPaneLayout.setHorizontalGroup(
            romPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(romPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(romBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(386, Short.MAX_VALUE))
        );
        romPaneLayout.setVerticalGroup(
            romPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(romPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(romBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        TabPane.addTab("Romance", romPane);

        DocPane.setBackground(new java.awt.Color(204, 255, 255));

        docBtn1.setText("jButton1");
        docBtn1.setName(""); 

        javax.swing.GroupLayout DocPaneLayout = new javax.swing.GroupLayout(DocPane);
        DocPane.setLayout(DocPaneLayout);
        DocPaneLayout.setHorizontalGroup(
            DocPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocPaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(docBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        DocPaneLayout.setVerticalGroup(
            DocPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(docBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        TabPane.addTab("Documentary", DocPane);

        aniPane.setBackground(new java.awt.Color(255, 255, 51));

        aniBtn1.setText("jButton1");
        aniBtn1.setName(""); 


        javax.swing.GroupLayout aniPaneLayout = new javax.swing.GroupLayout(aniPane);
        aniPane.setLayout(aniPaneLayout);
        aniPaneLayout.setHorizontalGroup(
            aniPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aniPaneLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(aniBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        aniPaneLayout.setVerticalGroup(
            aniPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aniPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aniBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        TabPane.addTab("Anime", aniPane);

        totalTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTfActionPerformed(evt);
            }
        });

        canBtn1.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        canBtn1.setText("Cancel Item");
        canBtn1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        canBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canBtn1ActionPerformed(evt);
                getSum();
            }
        });

        canBtn2.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        canBtn2.setText("Cancel All");
        canBtn2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        canBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canBtn2ActionPerformed(evt);
                getSum();
            }
        });

        payBtn.setFont(new java.awt.Font("Segoe Print", 1, 10)); 
        payBtn.setBackground(new java.awt.Color(0, 0, 0));
        payBtn.setText("Proceed to Checkout");
        payBtn.setForeground(new java.awt.Color(255, 255, 255));
        payBtn.setBorder(null);
        payBtn.setBorderPainted(false);
        payBtn.setMargin(new java.awt.Insets(2, 1, 2, 1));
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Segoe Print", 0, 11)); 
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {  },
            new String [] { "Movie Title     ", "No. ", "Price " }  )
        {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        jScrollPane1.setViewportView(table);
        
        

        totalBtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); 
        totalBtn.setText("Total Price");
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottompaneLayout = new javax.swing.GroupLayout(bottompane);
        bottompane.setLayout(bottompaneLayout);
        bottompaneLayout.setHorizontalGroup(
            bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottompaneLayout.createSequentialGroup()
                .addGroup(bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottompaneLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(totalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalTf, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bottompaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        bottompaneLayout.setVerticalGroup(
            bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottompaneLayout.createSequentialGroup()
                .addGroup(bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bottompaneLayout.createSequentialGroup()
                        .addComponent(canBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalBtn)
                        .addComponent(totalTf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanLayout = new javax.swing.GroupLayout(mainPan);
        mainPan.setLayout(mainPanLayout);
        mainPanLayout.setHorizontalGroup(
            mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bottompane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TabPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        mainPanLayout.setVerticalGroup(
            mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanLayout.createSequentialGroup()
                .addComponent(TabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottompane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mainPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    
    private void canBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
        model.removeRow(table.getSelectedRow());
    }

    private void canBtn2ActionPerformed(java.awt.event.ActionEvent evt) {
        model.setRowCount(0);
    }

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {
        View payment = new View(); 
        payment.setVisible(true); 
        getTotal();
        }
        
 public void getTotal() {      
     try {   
     
     FileWriter fw = new FileWriter(file.getAbsoluteFile());
     BufferedWriter bw = new BufferedWriter(fw);
  
fw.append("\n                                                       \n ");
     fw.append("Movie Title , No,  PRICE");
     fw.append("\n--------------------------------------------------------\n");
     
     for (int i=0; i<table.getRowCount(); i++) {
     for( int j=0; j<table.getColumnCount(); j++) { 
         bw.write (table.getModel().getValueAt(i, j )+ "        ");       
     }
         bw.newLine();
     }   
     bw.close();
     fw.close(); 
     }      catch (Exception e) {
       e.printStackTrace();
 }
 }
  

 private void totalBtnActionPerformed(java.awt.event.ActionEvent evt)  {
    getSum();
    }

    private void totalTfActionPerformed(java.awt.event.ActionEvent evt) {
     }

   
    public static void main(String args[]) {   
        

       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieList().setVisible(true);
            }
        });
    }

    private javax.swing.JPanel DocPane;
    private javax.swing.JTabbedPane TabPane;
    private javax.swing.JButton actBtn1;
    private javax.swing.JPanel actPane;
    private javax.swing.JButton aniBtn1;
    private javax.swing.JPanel aniPane;
    private javax.swing.JPanel bottompane;
    private javax.swing.JButton canBtn1;
    private javax.swing.JButton canBtn2;
    private javax.swing.JButton comBtn1;
    private javax.swing.JPanel comPane;
    private javax.swing.JButton docBtn1;
    private javax.swing.JButton horBtn1;
    private javax.swing.JPanel horPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel logoPane;
    private javax.swing.JPanel mainPan;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton romBtn1;
    private javax.swing.JPanel romPane;
    public static javax.swing.JTable table;
    private javax.swing.JButton topBT1;
    private javax.swing.JButton topBT2;
    private javax.swing.JButton topBT3;
    private javax.swing.JButton topBT4;
    private javax.swing.JButton topBT5;
    private javax.swing.JButton topBT6;
    private javax.swing.JButton topBT7;
    private javax.swing.JButton topBT8;
    private javax.swing.JLabel topLabel;
    private javax.swing.JPanel topPane;
    private javax.swing.JButton totalBtn;
    public static javax.swing.JTextField totalTf;
  }     

