/*JOptionPane is a component from Java Swing and it deals with dialog boxes especially.
The java.sql package contains classes and interfaces for JDBC API.

*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
The new class is called AddLeave and it is based on JFrame
The javax.swing.JFrame class is a type of container which
inherits the java.awt.Frame class. JFrame 
works like the main window where components
like labels, buttons, textfields are added to create a GUI.
*/

public class AddLeave extends javax.swing.JFrame {
    
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
String Uname;

    public AddLeave() //constructor
    {
        super("Add Leave Info");
        initComponents();
        conn=javaconnect.ConnectDb(); // for connecting to the database
    }
/*initcomponents() is a method that NetBeans (I guess you are using it)
   swing Designer creates to initialise components (set default values etc.)*/
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameEditText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Savebutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idEdittext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NoEditText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        departmentedittext = new javax.swing.JTextField();
        leavecombo = new javax.swing.JComboBox<>();
        leaveStartDatePicker = new com.toedter.calendar.JDateChooser();
        LeaveEndDatePicker = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(203, 245, 225));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 3));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\leavet.png")); // NOI18N
        jLabel5.setText("LEAVE TYPE");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\leavet.png")); // NOI18N
        jLabel7.setText("LEAVE START");

        nameEditText.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        nameEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameEditTextFocusLost(evt);
            }
        });
        nameEditText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameEditTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("ADD LEAVE INFORMATION");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\depat.png")); // NOI18N
        jLabel3.setText("DEPARTMENT");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\day.png")); // NOI18N
        jLabel6.setText("NO OF DAYS");

        Savebutton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Savebutton.setText("SAVE");
        Savebutton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Savebutton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SavebuttonFocusLost(evt);
            }
        });
        Savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebuttonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\leavet.png")); // NOI18N
        jLabel8.setText("LEAVE END");

        BackButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BackButton.setText("BACK");
        BackButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\image.png")); // NOI18N
        jLabel2.setText("ID");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\person.png")); // NOI18N
        jLabel4.setText("NAME");

        idEdittext.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        idEdittext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idEdittextFocusLost(evt);
            }
        });
        idEdittext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEdittextActionPerformed(evt);
            }
        });

        NoEditText.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        NoEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NoEditTextFocusLost(evt);
            }
        });

        departmentedittext.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        leavecombo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        leavecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Leave", "Casual Leave", "Half Day Leave", "One Day Leave", "Vacation Leave", "Sick/Medical Leave", "Maternity Leave", "Paternity Leave", "Marriage Leave " }));
        leavecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leavecomboActionPerformed(evt);
            }
        });

        leaveStartDatePicker.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                leaveStartDatePickerFocusLost(evt);
            }
        });

        LeaveEndDatePicker.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LeaveEndDatePickerFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idEdittext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameEditText, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(NoEditText)
                                .addComponent(departmentedittext)
                                .addComponent(leaveStartDatePicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LeaveEndDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(leavecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(29, 29, 29)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LeaveEndDatePicker, NoEditText, departmentedittext, idEdittext, leaveStartDatePicker, leavecombo, nameEditText});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idEdittext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Savebutton)
                            .addComponent(departmentedittext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nameEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(leavecombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(NoEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(leaveStartDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(LeaveEndDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                        .addGap(59, 59, 59))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LeaveEndDatePicker, NoEditText, departmentedittext, idEdittext, leaveStartDatePicker, leavecombo, nameEditText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1014, 651));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 // function for genrating id according to the department
    
    /*public void getid()
    {
    try {
        
        conn=javaconnect.ConnectDb();
        department = jComboBox1.getSelectedItem().toString();
        String sql="select COUNT(1) as NumOfUserInSelectedDepartment  from employee where department LIKE '"+department+"';";
        st=conn.createStatement();
        rs=st.executeQuery(sql);
   
        if(rs.next())
        {
            lastid = rs.getInt("NumOfUserInSelectedDepartment");
            lastid++;
            userid = department + Integer.toString(lastid);
            jTextField1.setText(userid);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex);
    }
        
    }*/
    
    
   
    /**
     *
     */
/* SaveButtonActionPerformed method is used for save the 
    employee information into the database
    "idEditText,departedittext,nameEditText,leavecombo,
    NoEditText,leaveStartDatePicker,LeaveEndDatePicker "
    are the name of textfields and Combobox 
    which are used in the frames.
    */
    
    private void SavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebuttonActionPerformed
       String id=idEdittext.getText();
       String depart=departmentedittext.getText();
       String name= nameEditText.getText();
       String leave=(String) leavecombo.getSelectedItem();
       String days=NoEditText.getText();
        java.util.Date LSD= leaveStartDatePicker.getDate();
         java.util.Date LED=  LeaveEndDatePicker.getDate();
       //query for storing the data into the database
         String sql = "INSERT INTO `leave_apply`(`ID`, `Department`, `Name`, `Leave_Type`, `No_Of_Days`, `Leave_Start`, `Leave_End`) VALUES(?,?,?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(sql);
           
            pst.setString(1, id);
            pst.setString(2, depart);
            pst.setString(3, name);
            pst.setString(4, leave);
            pst.setString(5, days);
            java.sql.Date sqldate = new java.sql.Date(LSD.getTime());
             pst.setDate(6, sqldate);
          java.sql.Date sqldate1 = new java.sql.Date(LED.getTime());
           pst.setDate(7, sqldate);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Added...!!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SavebuttonActionPerformed

     /*  BackButtonActionPerformed method is used for going back to the previous
    frames.*/
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        setVisible(false);
        Leave ob = new Leave();
        ob.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void nameEditTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameEditTextActionPerformed
        // TODO add your handling code here:
        leavecombo.requestFocus();
    }//GEN-LAST:event_nameEditTextActionPerformed

    private void idEdittextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEdittextActionPerformed
     // TODO add your handling code here:
        userid = idEdittext.getText();
      //  nameEditText.requestFocus();
        try{
       // query to fetch the employee id from the databse for leave apply 
            String sql = "Select `Department`,`Name` from employee where ID LIKE ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, userid);
      
        rs = pst.executeQuery();
        if(rs.next())
        {   department=rs.getString("Department");
            departmentedittext.setText(department);
            Uname=rs.getString("Name");
            nameEditText.setText(Uname);
            
        }
        }catch(Exception ex)
        {
        }
        
                
    }//GEN-LAST:event_idEdittextActionPerformed

    private void idEdittextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idEdittextFocusLost
        // TODO add your handling code here:
       leavecombo.requestFocus(); 
    }//GEN-LAST:event_idEdittextFocusLost

    private void nameEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameEditTextFocusLost
        // TODO add your handling code here:
       // leavecombo.requestFocus();
    }//GEN-LAST:event_nameEditTextFocusLost

    private void leavecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leavecomboActionPerformed
        // TODO add your handling code here:
        NoEditText.requestFocus();
    }//GEN-LAST:event_leavecomboActionPerformed

    private void NoEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NoEditTextFocusLost
        // TODO add your handling code here:
        leaveStartDatePicker.requestFocus();
    }//GEN-LAST:event_NoEditTextFocusLost

    private void leaveStartDatePickerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_leaveStartDatePickerFocusLost
        // TODO add your handling code here:
        LeaveEndDatePicker.requestFocus();
    }//GEN-LAST:event_leaveStartDatePickerFocusLost

    private void LeaveEndDatePickerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LeaveEndDatePickerFocusLost
        // TODO add your handling code here:
        Savebutton.requestFocus();
    }//GEN-LAST:event_LeaveEndDatePickerFocusLost

    private void SavebuttonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SavebuttonFocusLost
        // TODO add your handling code here:
        BackButton.requestFocus();
    }//GEN-LAST:event_SavebuttonFocusLost


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLeave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private com.toedter.calendar.JDateChooser LeaveEndDatePicker;
    private javax.swing.JTextField NoEditText;
    private javax.swing.JButton Savebutton;
    private javax.swing.JTextField departmentedittext;
    private javax.swing.JTextField idEdittext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser leaveStartDatePicker;
    private javax.swing.JComboBox<String> leavecombo;
    private javax.swing.JTextField nameEditText;
    // End of variables declaration//GEN-END:variables
}
