/* The java.sql package contains classes and interfaces for JDBC API.

JOptionPane is a component from Java Swing and it deals with dialog boxes especially.

The KeyListener interface is found in java.awt.event package, and it has three methods.
*/
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/*
The new class is called MonthlyStat and it is based on JFrame
The javax.swing.JFrame class is a type of container which
inherits the java.awt.Frame class. JFrame 
works like the main window where components
like labels, buttons, textfields are added to create a GUI.
*/

public class MonthlyStat extends javax.swing.JFrame {

Connection conn;
PreparedStatement pst;
ResultSet rs;
    public MonthlyStat() //constructor
    {
        super("Monthly Statistic");
        initComponents();
        conn = javaconnect.ConnectDb();
    }

/*initcomponents() is a method that NetBeans (I guess you are using it)
   swing Designer creates to initialise components (set default values etc.)*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TCEditText = new javax.swing.JTextField();
        MonthCombo = new javax.swing.JComboBox<>();
        YearCombo = new javax.swing.JComboBox<>();
        LossEditText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TEEditText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ProfitEditText = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(211, 177, 229));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 3));

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackButton.setText("BACK");
        BackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BackButtonFocusLost(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel4.setText("Year");

        TCEditText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TCEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TCEditTextFocusLost(evt);
            }
        });
        TCEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TCEditTextKeyPressed(evt);
            }
        });

        MonthCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MonthCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        MonthCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MonthComboFocusLost(evt);
            }
        });
        MonthCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MonthComboKeyPressed(evt);
            }
        });

        YearCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        YearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", " " }));
        YearCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                YearComboFocusLost(evt);
            }
        });
        YearCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YearComboKeyPressed(evt);
            }
        });

        LossEditText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LossEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LossEditTextFocusLost(evt);
            }
        });
        LossEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LossEditTextKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("     Total Earn");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("     Total Cost");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\loss.png")); // NOI18N
        jLabel6.setText("Loss");

        TEEditText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TEEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TEEditTextFocusLost(evt);
            }
        });
        TEEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TEEditTextKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel5.setText("Month");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\profit.png")); // NOI18N
        jLabel7.setText("Profit");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Monthly Statistic");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ProfitEditText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ProfitEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProfitEditTextFocusLost(evt);
            }
        });
        ProfitEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProfitEditTextKeyPressed(evt);
            }
        });

        SaveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaveButton.setText("SAVE");
        SaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\chart-icon.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(13, 13, 13))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MonthCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YearCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProfitEditText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LossEditText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TEEditText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TCEditText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TEEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(TCEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(MonthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(YearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(ProfitEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LossEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel10)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BackButton, SaveButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(850, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
       // query for inserting statistics data of the offfice into the database 
        String sql = "INSERT INTO `monthly_stat`(`Earn`, `Cost`, `Month`, `Year`, `Profit`, `Loss`) VALUES (?,?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, TEEditText.getText());
            pst.setString(2, TCEditText.getText());
            pst.setString(3, (String) MonthCombo.getSelectedItem());
            pst.setString(4, (String) YearCombo.getSelectedItem());
            pst.setString(5, ProfitEditText.getText());
            pst.setString(6, LossEditText.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Added...!!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        setVisible(false);
        StatisticsHome ob = new StatisticsHome();
        ob.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void TEEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TEEditTextFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TEEditTextFocusLost

    private void TCEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TCEditTextFocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TCEditTextFocusLost

    private void MonthComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MonthComboFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MonthComboFocusLost

    private void YearComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_YearComboFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_YearComboFocusLost

    private void ProfitEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProfitEditTextFocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_ProfitEditTextFocusLost

    private void LossEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LossEditTextFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_LossEditTextFocusLost

    private void BackButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BackButtonFocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_BackButtonFocusLost

    private void TEEditTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEEditTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            TCEditText.requestFocus();
        }
    }//GEN-LAST:event_TEEditTextKeyPressed

    private void TCEditTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TCEditTextKeyPressed
       // TODO add your handling code here:
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            MonthCombo.requestFocus();
        }
    }//GEN-LAST:event_TCEditTextKeyPressed

    private void MonthComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MonthComboKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            YearCombo.requestFocus();
        }
    }//GEN-LAST:event_MonthComboKeyPressed

    private void YearComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YearComboKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            ProfitEditText.requestFocus();
        }
    }//GEN-LAST:event_YearComboKeyPressed

    private void ProfitEditTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProfitEditTextKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            LossEditText.requestFocus();
        }
    }//GEN-LAST:event_ProfitEditTextKeyPressed

    private void LossEditTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LossEditTextKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
           SaveButton.requestFocus();
        }
    }//GEN-LAST:event_LossEditTextKeyPressed

  
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonthlyStat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField LossEditText;
    private javax.swing.JComboBox<String> MonthCombo;
    private javax.swing.JTextField ProfitEditText;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField TCEditText;
    private javax.swing.JTextField TEEditText;
    private javax.swing.JComboBox<String> YearCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
