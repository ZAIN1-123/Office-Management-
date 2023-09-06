/* The java.sql package contains classes and interfaces for JDBC API.
 
This class is defined in java.awt.event package.
The ActionEvent is generated when button is clicked 
or the item of a list is double clicked.

The java.text.SimpleDateFormat class provides methods 
to format and parse date and time in java. The SimpleDateFormat
is a concrete class for formatting and parsing date which inherits
java.text.DateFormat class.

The class Date represents a specific instant in time, with millisecond precision.
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


/*
The new class is called Home and it is based on JFrame
The javax.swing.JFrame class is a type of container which
inherits the java.awt.Frame class. JFrame 
works like the main window where components
like labels, buttons, textfields are added to create a GUI.

*/
public class Home extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rs;
    public Home() // constructor 
    {
        super("Home Page");
        initComponents();
        conn=javaconnect.ConnectDb();
        showDate();
        showTime();
    }
    
    /* showDate method is used for display the current date
    */
    void showDate(){
        Date d = new Date();
//    int year =d.getyear()
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
        dateLab.setText(s.format(d));
    }
    /* showTime method is used for display the current date
    */
    void showTime(){
        new Timer(0, new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
        timeLab.setText(s.format(d));
            }
        }).start();
   }

   
    /*initcomponents() is a method that NetBeans (I guess you are using it)
   swing Designer creates to initialise components (set default values etc.)*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        attendance = new javax.swing.JButton();
        Payment = new javax.swing.JButton();
        jStatistic = new javax.swing.JButton();
        jLeaveApply = new javax.swing.JButton();
        department = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dateLab = new javax.swing.JTextField();
        timeLab = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(212, 195, 201));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 3));

        jPanel2.setBackground(new java.awt.Color(237, 232, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        exit.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        exit.setText("EXIT");
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        attendance.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        attendance.setText("ATTENDENCE");
        attendance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceActionPerformed(evt);
            }
        });

        Payment.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Payment.setText("PAYMENT");
        Payment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });

        jStatistic.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jStatistic.setText("STATISTICS");
        jStatistic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jStatistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatisticActionPerformed(evt);
            }
        });

        jLeaveApply.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLeaveApply.setText("LEAVE APPLY");
        jLeaveApply.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jLeaveApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLeaveApplyActionPerformed(evt);
            }
        });

        department.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        department.setText("MANAGE EMPLOYEES");
        department.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        department.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                departmentFocusLost(evt);
            }
        });
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attendance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(department, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(Payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLeaveApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jStatistic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(department)
                .addGap(18, 18, 18)
                .addComponent(attendance)
                .addGap(18, 18, 18)
                .addComponent(jLeaveApply)
                .addGap(18, 18, 18)
                .addComponent(jStatistic)
                .addGap(18, 18, 18)
                .addComponent(Payment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Payment, exit, jLeaveApply, jStatistic});

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("Office MANAGEMENT SYSTEM");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));

        jPanel1.setBackground(new java.awt.Color(239, 231, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("TIME");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        dateLab.setEditable(false);
        dateLab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateLabActionPerformed(evt);
            }
        });

        timeLab.setEditable(false);
        timeLab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("DATE");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeLab, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(dateLab))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(timeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jButton6.setBackground(new java.awt.Color(187, 242, 249));
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\Dept.png")); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(132, 132, 132)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(204, 204, 204))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        setSize(new java.awt.Dimension(1001, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 /* exitActionPerformed method is used for closing the window*/
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed
 /* departmentActionPerformed method is used for goining to the
    Manage frame */

    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        setVisible(false);
        Manage ob=new Manage();
        ob.setVisible(true);
       
    }//GEN-LAST:event_departmentActionPerformed
/*attendanceActionPerformed method is used for goining to the attendeance frame
    */
    private void attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceActionPerformed
        setVisible(false);
        Attendance ob=new Attendance();
        ob.setVisible(true);
        
    }//GEN-LAST:event_attendanceActionPerformed
/* jLeaveApplyActionPerformed method is used for goining to the Leave frame 
    */
    private void jLeaveApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLeaveApplyActionPerformed
        setVisible(false);
        Leave ob=new Leave();
        ob.setVisible(true);
       
    }//GEN-LAST:event_jLeaveApplyActionPerformed
 /* jStatisticActionPerformed is used for goining to the Statistics frame 
    */
    private void jStatisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStatisticActionPerformed
        setVisible(false);
        StatisticsHome ob=new StatisticsHome();
        ob.setVisible(true);
        
    }//GEN-LAST:event_jStatisticActionPerformed

    /* PaymentActionPerformed method is used for goining to the Payment frame 
    */
    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        setVisible(false);
        Payment ob=new Payment();
        ob.setVisible(true);
    }//GEN-LAST:event_PaymentActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void dateLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateLabActionPerformed

    private void departmentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departmentFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_departmentFocusLost

  
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Payment;
    private javax.swing.JButton attendance;
    private javax.swing.JTextField dateLab;
    private javax.swing.JButton department;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jLeaveApply;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jStatistic;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField timeLab;
    // End of variables declaration//GEN-END:variables
}
