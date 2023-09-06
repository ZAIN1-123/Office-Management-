
/* The java.sql package contains classes and interfaces for JDBC API.

JOptionPane is a component from Java Swing and it deals with dialog boxes especially.

The KeyListener interface is found in java.awt.event package, and it has three methods.


*/
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/*
The new class is called Payment and it is based on JFrame
The javax.swing.JFrame class is a type of container which
inherits the java.awt.Frame class. JFrame 
works like the main window where components
like labels, buttons, textfields are added to create a GUI.
*/


public class Payment extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rs;
Statement st;
int lastid;
String userid;
String department ;
    public Payment() // constructor 
    {
        super("Payment");
        initComponents();
        conn = javaconnect.ConnectDb();
       
        jTable1();
      //  getid();
    }
    
    
    /*  public void getid()
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
   
    /* table to display the payment salary of all the employee of an organization 
    there is a query to fetch the data of from the database and that data showed in the table 
    
    */ 
    public void jTable1(){
        try{
      // query to fetch the payment data from the payment table from database
            String sql = "select `ID`, `Department`, `Date`, `Basic_Pay`, `Bonus`, `Month`, `Year` from `payment`";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            
        }
    }
    /* another table used to display the payment according to the month and year
    there is a query to fetch the data from the database according to the month and year 
    */
     public void jTable2(){
        try{
        // query to fetch the payment data from the payment table from database
            String sql = "select `ID`, `Department`, `Date`, `Basic_Pay`, `Bonus`, `Month`, `Year` from `payment` where Month=? and Year=?";
        pst=conn.prepareStatement(sql);
        pst.setString(1, (String) Monthcombo.getSelectedItem());
        pst.setString(2, (String) Yearcombo.getSelectedItem());
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            
        }
    }
    
    /* another table used to display the payment according to the employee id to
     show the specific employee payment 
     */
     public void jTable3(){
        try{
    // query to fetch the payment data from the payment table from database
            String sql = "select `ID`, `Department`, `Date`, `Basic_Pay`, `Bonus`, `Month`, `Year` from `payment` where ID=?";
        pst=conn.prepareStatement(sql);
        pst.setString(1, IDEditText.getText());
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            
        }
    }
    
    
   /*initcomponents() is a method that NetBeans (I guess you are using it)
   swing Designer creates to initialise components (set default values etc.)*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        idEditText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BonusEditText = new javax.swing.JTextField();
        SalaryEditText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MonthCombo = new javax.swing.JComboBox<>();
        Savebutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        YearCombo = new javax.swing.JComboBox<>();
        departmentedittext = new javax.swing.JTextField();
        DatePicker = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Yearcombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Monthcombo = new javax.swing.JComboBox<>();
        Searchbutton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        IDEditText = new javax.swing.JTextField();
        ShowButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\Payment-Business-Credit-Bank-Card-Payment-Card-Bank-Business-Credit-icon.png")); // NOI18N
        jLabel1.setText("PAYMENT");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setBackground(new java.awt.Color(175, 188, 231));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        idEditText.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        idEditText.setToolTipText("");
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
        idEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idEditTextKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\salary.png")); // NOI18N
        jLabel7.setText("SALARY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\image.png")); // NOI18N
        jLabel2.setText("ID");

        BonusEditText.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BonusEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BonusEditTextFocusLost(evt);
            }
        });
        BonusEditText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BonusEditTextActionPerformed(evt);
            }
        });
        BonusEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BonusEditTextKeyPressed(evt);
            }
        });

        SalaryEditText.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        SalaryEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SalaryEditTextFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\salary.png")); // NOI18N
        jLabel8.setText("BONUS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel5.setText("YEAR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\depat.png")); // NOI18N
        jLabel3.setText("DEPARTMENT");

        MonthCombo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        MonthCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        MonthCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MonthComboItemStateChanged(evt);
            }
        });
        MonthCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MonthComboFocusLost(evt);
            }
        });

        Savebutton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Savebutton.setText("SAVE");
        Savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebuttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel6.setText("DATE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel4.setText("MONTH");

        YearCombo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        YearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        YearCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                YearComboItemStateChanged(evt);
            }
        });
        YearCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                YearComboFocusLost(evt);
            }
        });

        departmentedittext.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        departmentedittext.setToolTipText("");
        departmentedittext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentedittextActionPerformed(evt);
            }
        });

        DatePicker.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DatePickerFocusLost(evt);
            }
        });

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
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(MonthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(departmentedittext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(idEditText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addContainerGap())))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BonusEditText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(YearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Savebutton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SalaryEditText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DatePicker, departmentedittext});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentedittext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(SalaryEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(BonusEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MonthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(19, 19, 19)
                .addComponent(Savebutton)
                .addGap(79, 79, 79))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DatePicker, departmentedittext});

        jPanel2.setBackground(new java.awt.Color(176, 192, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("YEAR");

        Yearcombo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Yearcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        Yearcombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                YearcomboFocusLost(evt);
            }
        });
        Yearcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearcomboActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("MONTH");

        jTable1.setBackground(new java.awt.Color(183, 177, 240));
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

        Monthcombo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Monthcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        Monthcombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MonthcomboFocusLost(evt);
            }
        });

        Searchbutton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Searchbutton.setText("SEARCH");
        Searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbuttonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setText("ID");

        IDEditText.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        IDEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDEditTextFocusLost(evt);
            }
        });

        ShowButton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        ShowButton.setText("SHOW");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Monthcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Yearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Searchbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDEditText, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(ShowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Monthcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchbutton)
                    .addComponent(jLabel11)
                    .addComponent(IDEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Yearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1174, 737));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        Home ob=new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebuttonActionPerformed
       String id=idEditText.getText();
       String depart=departmentedittext.getText();
       java.util.Date dob=DatePicker.getDate();
       String salary=SalaryEditText.getText();
       String bonus=BonusEditText.getText();
       String month= (String) MonthCombo.getSelectedItem();
       String year=(String) YearCombo.getSelectedItem();
       
       // query for inserting the data into the payment table in database
        String sql = "INSERT INTO `payment`(`ID`, `Department`, `Date`, `Basic_Pay`, `Bonus`, `Month`, `Year`) VALUES (?,?,?,?,?,?,?)";
        try{
            //getid();
            pst = conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, depart);
            java.sql.Date sqldate = new java.sql.Date(dob.getTime());
            pst.setDate(3,sqldate );
            pst.setString(4, salary);
            pst.setString(5, bonus);
            pst.setString(6, month);
            pst.setString(7, year);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Thanks...!!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        jTable1();
    }//GEN-LAST:event_SavebuttonActionPerformed

    private void SearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbuttonActionPerformed
        jTable2();
    }//GEN-LAST:event_SearchbuttonActionPerformed

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
        jTable3();
    }//GEN-LAST:event_ShowButtonActionPerformed

    private void idEditTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEditTextActionPerformed
        // TODO add your handling code here:
         userid = idEditText.getText();
          try{
        String sql = "Select `Department`from employee where ID LIKE ?";
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

    private void departmentedittextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentedittextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentedittextActionPerformed

    private void idEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idEditTextFocusLost
        // TODO add your handling code here:
       // DatePicker.requestFocus();
    }//GEN-LAST:event_idEditTextFocusLost

    private void DatePickerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatePickerFocusLost
        // TODO add your handling code here:
        //SalaryEditText.requestFocus();
    }//GEN-LAST:event_DatePickerFocusLost

    private void SalaryEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SalaryEditTextFocusLost
        // TODO add your handling code here:
       // BonusEditText.requestFocus();
    }//GEN-LAST:event_SalaryEditTextFocusLost

    private void BonusEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BonusEditTextFocusLost
        // TODO add your handling code here:
      //  MonthCombo.requestFocus();
    }//GEN-LAST:event_BonusEditTextFocusLost

    private void MonthComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MonthComboFocusLost
        // TODO add your handling code here:
      //  YearCombo.requestFocus();
    }//GEN-LAST:event_MonthComboFocusLost

    private void YearComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_YearComboFocusLost
        // TODO add your handling code here:
      //  Savebutton.requestFocus();
    }//GEN-LAST:event_YearComboFocusLost

    private void YearcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearcomboActionPerformed

    private void MonthcomboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MonthcomboFocusLost
        // TODO add your handling code here:
       // Yearcombo.requestFocus();
    }//GEN-LAST:event_MonthcomboFocusLost

    private void YearcomboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_YearcomboFocusLost
        // TODO add your handling code here:
      //  Searchbutton.requestFocus();
    }//GEN-LAST:event_YearcomboFocusLost

    private void IDEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDEditTextFocusLost
        // TODO add your handling code here:
      //  ShowButton.requestFocus();
    }//GEN-LAST:event_IDEditTextFocusLost

    private void idEditTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idEditTextKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
           SalaryEditText.requestFocus();
        }
    }//GEN-LAST:event_idEditTextKeyPressed

    private void BonusEditTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BonusEditTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BonusEditTextActionPerformed

    private void BonusEditTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BonusEditTextKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            MonthCombo.requestFocus();
        }
    }//GEN-LAST:event_BonusEditTextKeyPressed

    private void MonthComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MonthComboItemStateChanged
        // TODO add your handling code here:
        YearCombo.requestFocus();
    }//GEN-LAST:event_MonthComboItemStateChanged

    private void YearComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_YearComboItemStateChanged
        // TODO add your handling code here:
        Savebutton.requestFocus();
    }//GEN-LAST:event_YearComboItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BonusEditText;
    private com.toedter.calendar.JDateChooser DatePicker;
    private javax.swing.JTextField IDEditText;
    private javax.swing.JComboBox<String> MonthCombo;
    private javax.swing.JComboBox<String> Monthcombo;
    private javax.swing.JTextField SalaryEditText;
    private javax.swing.JButton Savebutton;
    private javax.swing.JButton Searchbutton;
    private javax.swing.JButton ShowButton;
    private javax.swing.JComboBox<String> YearCombo;
    private javax.swing.JComboBox<String> Yearcombo;
    private javax.swing.JTextField departmentedittext;
    private javax.swing.JTextField idEditText;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
