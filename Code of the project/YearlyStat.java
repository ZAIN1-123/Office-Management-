/*

The KeyListener interface is found in java.awt.event package, and it has three methods.

The java.sql package contains classes and interfaces for JDBC API.

JOptionPane is a component from Java Swing and it deals with dialog boxes especially.

*/
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/*
The new class is called YearlyStat based on JFrame
The javax.swing.JFrame class is a type of container which
inherits the java.awt.Frame class. JFrame 
works like the main window where components
like labels, buttons, textfields are added to create a GUI.
*/
public class YearlyStat extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rs;
    public YearlyStat() {
        super("Yearly Statistic");
        initComponents();
        conn = javaconnect.ConnectDb();
    }

   
/*initcomponents() is a method that NetBeans (I guess you are using it)
   swing Designer creates to initialise components (set default values etc.)*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        YearCombo = new javax.swing.JComboBox<>();
        LossEdittext = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        YCedittext = new javax.swing.JTextField();
        YEedittext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ProfitEdittext = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(199, 246, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Year");
        jLabel4.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Yearly Earn");
        jLabel2.setEnabled(false);

        YearCombo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        YearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        YearCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                YearComboItemStateChanged(evt);
            }
        });

        LossEdittext.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        LossEdittext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LossEdittextKeyPressed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BackButton.setText("BACK");
        BackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        YCedittext.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        YCedittext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YCedittextKeyPressed(evt);
            }
        });

        YEedittext.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        YEedittext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YEedittextActionPerformed(evt);
            }
        });
        YEedittext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YEedittextKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Yearly Statistic");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ProfitEdittext.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        ProfitEdittext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProfitEdittextKeyPressed(evt);
            }
        });

        SaveButton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        SaveButton.setText("SAVE");
        SaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Yearly Cost");
        jLabel3.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Loss");
        jLabel6.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Profit");
        jLabel5.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(YEedittext)
                            .addComponent(YCedittext)
                            .addComponent(YearCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProfitEdittext)
                            .addComponent(LossEdittext, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(YEedittext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(YCedittext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(YearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ProfitEdittext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LossEdittext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(SaveButton))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(484, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        setVisible(false);
        StatisticsHome ob = new StatisticsHome();
        ob.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
       // for inserting data into the statistics table 
        String sql = "INSERT INTO `yearly_stat`(`Yearly_Earn`, `Yearly_Cost`, `Year`, `Profit`, `Loss`) VALUES (?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, YEedittext.getText());
            pst.setString(2, YCedittext.getText());
            pst.setString(3, (String) YearCombo.getSelectedItem());
            pst.setString(4, ProfitEdittext.getText());
            pst.setString(5, LossEdittext.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Added...!!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void YEedittextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YEedittextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YEedittextActionPerformed

    private void YEedittextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YEedittextKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            YCedittext.requestFocus();
        }
    }//GEN-LAST:event_YEedittextKeyPressed

    private void YCedittextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YCedittextKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            YearCombo.requestFocus();
        }
    }//GEN-LAST:event_YCedittextKeyPressed

    private void YearComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_YearComboItemStateChanged
        // TODO add your handling code here:
        ProfitEdittext.requestFocus();
    }//GEN-LAST:event_YearComboItemStateChanged

    private void ProfitEdittextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProfitEdittextKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            LossEdittext.requestFocus();
        }
    }//GEN-LAST:event_ProfitEdittextKeyPressed

    private void LossEdittextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LossEdittextKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            SaveButton.requestFocus();
        }
    }//GEN-LAST:event_LossEdittextKeyPressed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YearlyStat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField LossEdittext;
    private javax.swing.JTextField ProfitEdittext;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField YCedittext;
    private javax.swing.JTextField YEedittext;
    private javax.swing.JComboBox<String> YearCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
