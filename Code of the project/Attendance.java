
/* The java.sql package contains classes and interfaces for JDBC API.

The java.util.calendar class is an abstract class that provides methods for 
converting between a specific instant in time and a set of calendar fields 
such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on.

JOptionPane is a component from Java Swing and it deals with dialog boxes especially.

*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


/*
The new class is called Attendence and it is based on JFrame
The javax.swing.JFrame class is a type of container which
inherits the java.awt.Frame class. JFrame 
works like the main window where components
like labels, buttons, textfields are added to create a GUI.
*/
public class Attendance extends javax.swing.JFrame {
    
       /*
    variables "lastid,userid,department" is used in getid() method
   to fetch the employee id from the employee table .*/
Connection conn; 
PreparedStatement pst;
ResultSet rs;
Statement st;
int lastid;
String userid;
String department ;
    public Attendance() //constructor 
    {
        super("Attendance");
        initComponents();
        conn=javaconnect.ConnectDb();
        showDate();
        showTime();
    }
/* showDate method is used for display the current date
    */
      void showDate()
      { 
          DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now=LocalDateTime.now();
        dateLab.setText(date.format(now));
        
    }
    /* showTime method is used for display the current time  */
    void showTime(){
        DateTimeFormatter times=DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalDateTime now=LocalDateTime.now();
        timeLab.setText(times.format(now));
   }
   
  
    /*initcomponents() is a method that NetBeans (I guess you are using it)
   swing Designer creates to initialise components (set default values etc.)*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VIewAttenButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idEditText = new javax.swing.JTextField();
        PresentButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        monthcombo = new javax.swing.JComboBox<>();
        yearcombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        departmentedittext = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        timeLab = new javax.swing.JTextField();
        dateLab = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 184, 223));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));

        BackButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BackButton.setText("BACK");
        BackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        BackButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BackButtonStateChanged(evt);
            }
        });
        BackButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BackButtonFocusGained(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("ATTENDENCE");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        VIewAttenButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        VIewAttenButton.setText("View Attendence");
        VIewAttenButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        VIewAttenButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                VIewAttenButtonFocusLost(evt);
            }
        });
        VIewAttenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIewAttenButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\image.png")); // NOI18N
        jLabel3.setText("ID");

        idEditText.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        idEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idEditTextFocusLost(evt);
            }
        });
        idEditText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEditTextActionPerformed(evt);
            }
        });

        PresentButton.setBackground(new java.awt.Color(181, 204, 211));
        PresentButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        PresentButton.setForeground(new java.awt.Color(0, 51, 0));
        PresentButton.setText("Present");
        PresentButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        PresentButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PresentButtonFocusLost(evt);
            }
        });
        PresentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresentButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel8.setText("Year");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel9.setText("Month ");

        monthcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month ", "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        monthcombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                monthcomboFocusLost(evt);
            }
        });

        yearcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));
        yearcombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearcomboFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\depat.png")); // NOI18N
        jLabel4.setText("Department");

        departmentedittext.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("DATE");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("TIME");

        timeLab.setEditable(false);
        timeLab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        dateLab.setEditable(false);
        dateLab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idEditText)
                                    .addComponent(departmentedittext)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))))
                                .addGap(141, 145, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(monthcombo, 0, 173, Short.MAX_VALUE)
                                    .addComponent(yearcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateLab)
                                    .addComponent(timeLab))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(85, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(VIewAttenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(383, 383, 383))))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {idEditText, monthcombo, yearcombo});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(idEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(departmentedittext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(38, 38, 38)
                                .addComponent(monthcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PresentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(VIewAttenButton)
                        .addGap(36, 36, 36)
                        .addComponent(BackButton)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(timeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {idEditText, monthcombo, yearcombo});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateLab, timeLab});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1038, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*  BackButtonActionPerformed method is used for going back to the previous
    frames*/
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        setVisible(false);
        Home ob=new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    /* PresentButtonActionPerformed used for storing the employee attendence into the attendence table
    idEditText,departmentedittext,monthcombo,yearcombo are the textfields and combobox used int the frame.
    */
    private void PresentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentButtonActionPerformed
        //query for inserting the data into database
        String sql = "INSERT INTO `attendence`( `ID`,`Department`, `Month`,`Year`) VALUES(?,?,?,?)";
        try{
            //getid();
            pst = conn.prepareStatement(sql);
           // pst.setString(1, ;
          
           
            pst.setString(1, idEditText.getText());
            //pst.setString(2, dateLab.getText());
            pst.setString(2, departmentedittext.getText());
           // pst.setString(3, timeLab.getText());
            pst.setString(3, (String) monthcombo.getSelectedItem());
            pst.setString(4, (String) yearcombo.getSelectedItem());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Added...!!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_PresentButtonActionPerformed

    private void VIewAttenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIewAttenButtonActionPerformed
        setVisible(false);
        ViewAttendance ob=new ViewAttendance();
        ob.setVisible(true);
    }//GEN-LAST:event_VIewAttenButtonActionPerformed

    private void idEditTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEditTextActionPerformed
        // TODO add your handling code here:
        userid = idEditText.getText();
        try{
       // query to fetch the employee id from the database according to the selected department 
            String sql = "Select Department from employee where ID LIKE ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, userid);
        rs = pst.executeQuery();
        if(rs.next())
        {   department=rs.getString("Department");
            departmentedittext.setText(department);
            
        }
        }catch(Exception ex)
        {
        }
    }//GEN-LAST:event_idEditTextActionPerformed

    private void BackButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BackButtonStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonStateChanged

    private void BackButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BackButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonFocusGained

    private void idEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idEditTextFocusLost
        // TODO add your handling code here:
        monthcombo.requestFocus();
    }//GEN-LAST:event_idEditTextFocusLost

    private void monthcomboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthcomboFocusLost
        // TODO add your handling code here:
        yearcombo.requestFocus();
    }//GEN-LAST:event_monthcomboFocusLost

    private void yearcomboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearcomboFocusLost
        // TODO add your handling code here:
        PresentButton.requestFocus();
    }//GEN-LAST:event_yearcomboFocusLost

    private void PresentButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PresentButtonFocusLost
        // TODO add your handling code here:
        VIewAttenButton.requestFocus();
    }//GEN-LAST:event_PresentButtonFocusLost

    private void VIewAttenButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VIewAttenButtonFocusLost
        // TODO add your handling code here:
        BackButton.requestFocus();
    }//GEN-LAST:event_VIewAttenButtonFocusLost

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton PresentButton;
    private javax.swing.JButton VIewAttenButton;
    private javax.swing.JTextField dateLab;
    private javax.swing.JTextField departmentedittext;
    private javax.swing.JTextField idEditText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> monthcombo;
    private javax.swing.JTextField timeLab;
    private javax.swing.JComboBox<String> yearcombo;
    // End of variables declaration//GEN-END:variables
}
