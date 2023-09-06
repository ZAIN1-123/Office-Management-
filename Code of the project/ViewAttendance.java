/* The java.sql package contains classes and interfaces for JDBC API

JOptionPane is a component from Java Swing and it deals with dialog boxes especially.

*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.proteanit.sql.DbUtils;

/*
The new class is called ViewAttendence and it is based on JFrame
The javax.swing.JFrame class is a type of container which
inherits the java.awt.Frame class. JFrame 
works like the main window where components
like labels, buttons, textfields are added to create a GUI.
*/
public class ViewAttendance extends javax.swing.JFrame {

Connection conn;
PreparedStatement pst;
ResultSet rs;
    public ViewAttendance() //constructor
    {
        super("View Attendance");
        initComponents();
        conn=javaconnect.ConnectDb();
        showDate();
        jTable1();
      
    }
/* showDate method is used for display the current date */
     void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
       // dateLab.setText(s.format(d));
       
    }
    /* table used to display the employee attendence */
     public void jTable1(){
        try{
       String sql ="select *from attendence";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            
        }
    }
    /* another table used to display  the attendence
     of the employee according to the employee id*/ 
    public void jTable2()
    {
        try{
        // query for selecting the data from databse according to the employee id 
            String sql="Select `Department`, `ID`,`Year`, `Month` from `attendence` where ID=?";
             pst=conn.prepareStatement(sql);
             pst.setString(1, idEditText.getText());
             rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
        {
            
        }
    }
    /* another table used to
    display the attendence of the employee according to the month and year */
    public void jTable3()
    {
         try{
            String sql="Select `Department`, `ID`,  `Year`, `Month` from `attendence` where Month=? and Year=?";
             pst=conn.prepareStatement(sql);
             pst.setString(1, (String) Monthcombo.getSelectedItem());
             pst.setString(2, (String) Yearcombo.getSelectedItem());
             rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
        {
            
        }
    }
    
   /*initcomponents() is a method that NetBeans (I guess you are using it)
   swing Designer creates to initialise components (set default values etc.)*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        MYShowbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        idEditText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Monthcombo = new javax.swing.JComboBox<>();
        Yearcombo = new javax.swing.JComboBox<>();
        IDSearchbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(166, 171, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel4.setText("Month");

        MYShowbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MYShowbtn.setText("SHOW");
        MYShowbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MYShowbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MYShowbtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\image.png")); // NOI18N
        jLabel1.setText("ID");

        idEditText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idEditTextFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel2.setText("Year");

        Monthcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month ", "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec", " " }));
        Monthcombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MonthcomboFocusLost(evt);
            }
        });

        Yearcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", " " }));
        Yearcombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                YearcomboFocusLost(evt);
            }
        });

        IDSearchbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDSearchbtn.setText("Search");
        IDSearchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDSearchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idEditText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(IDSearchbtn)
                                .addGap(13, 13, 13)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(Monthcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(59, 59, 59)
                        .addComponent(Yearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(MYShowbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Monthcombo, Yearcombo});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(MYShowbtn)
                            .addComponent(Yearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(Monthcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDSearchbtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Monthcombo, Yearcombo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1289, 386));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        Attendance ob=new Attendance();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MYShowbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MYShowbtnActionPerformed
        jTable3();
        
    }//GEN-LAST:event_MYShowbtnActionPerformed

    private void IDSearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDSearchbtnActionPerformed
            // TODO add your handling code here:
          jTable2(); 
       
    }//GEN-LAST:event_IDSearchbtnActionPerformed

    private void idEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idEditTextFocusLost
        // TODO add your handling code here:
        IDSearchbtn.requestFocus();
    }//GEN-LAST:event_idEditTextFocusLost

    private void MonthcomboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MonthcomboFocusLost
        // TODO add your handling code here:
        Yearcombo.requestFocus();
    }//GEN-LAST:event_MonthcomboFocusLost

    private void YearcomboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_YearcomboFocusLost
        // TODO add your handling code here:
        MYShowbtn.requestFocus();
    }//GEN-LAST:event_YearcomboFocusLost

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IDSearchbtn;
    private javax.swing.JButton MYShowbtn;
    private javax.swing.JComboBox<String> Monthcombo;
    private javax.swing.JComboBox<String> Yearcombo;
    private javax.swing.JTextField idEditText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
