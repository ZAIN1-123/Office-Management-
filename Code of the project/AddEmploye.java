/* The Color class is a part of Java Abstract Window Toolkit(AWT) package.
The Java KeyListener is notified whenever you change the state of key.
It is notified against KeyEvent.

The KeyListener interface is found in java.awt.event package, and it has three methods.

The java.sql package contains classes and interfaces for JDBC API.

The java.util.calendar class is an abstract class that provides methods for 
converting between a specific instant in time and a set of calendar fields 
such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on.

GregorianCalendar= It is a hybrid calendar that supports both the Julian
and Gregorian calendar systems with the support of a single discontinuity, 
which corresponds by default to the Gregorian date when the Gregorian calendar 
was instituted.

The Java Matcher class ( java. util. regex. Matcher ) is used to search through 
a text for multiple occurrences of a regular expression.

regex.Pattern =Classes for matching character sequences against patterns 
specified by regular expressions. 

JOptionPane is a component from Java Swing and it deals with dialog boxes especially.
*/

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/*
The new class is called AddEmployee and it is based on JFrame
The javax.swing.JFrame class is a type of container which
inherits the java.awt.Frame class. JFrame 
works like the main window where components
like labels, buttons, textfields are added to create a GUI.
*/

public class AddEmploye extends javax.swing.JFrame {

    /*
    variables "dob, lastid,userid,department" is used in getid() method
    to fetch the enterd employee department and
    id form employee table to generate the employee 
    id according to the department  which is stored in the variable "userid".
    
    */
    java.util.Date dob;  
    boolean dontSubmit;
      Connection conn; 
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    int lastid;
    String userid;
    String department; 
     long year;
     int lastp;
    
    public AddEmploye() // constructor 
    {
        initComponents();
      conn = javaconnect.ConnectDb(); // for connecting to the database
        getid();
        getperson();
    }
    
    /* clearFields method is used to clear all fields after the registration 
    of an employee */
   private void clearFields(){
    
         NameEditText.setText("");
         IdEditText.setText("");
         PhoneEditText.setText("");
         EmailEditText.setText("");
         QualificationCombo.removeItem("");
        
         ShiftCombo.removeItem("");
         PersonEdittext.setText("");
         ExperienceCombo.removeItem("");
        
         GenderCombo.removeItem("");
         SalaryEditText.setText("");
         
    }
/*initcomponents() is a method that NetBeans (I guess you are using it)
   swing Designer creates to initialise components (set default values etc.)*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        departmentCombo = new javax.swing.JComboBox<>();
        IdEditText = new javax.swing.JTextField();
        NameEditText = new javax.swing.JTextField();
        PhoneEditText = new javax.swing.JTextField();
        EmailEditText = new javax.swing.JTextField();
        QualificationCombo = new javax.swing.JComboBox<>();
        JoinningDatePicker = new com.toedter.calendar.JDateChooser();
        ShiftCombo = new javax.swing.JComboBox<>();
        PersonEdittext = new javax.swing.JTextField();
        ExperienceCombo = new javax.swing.JComboBox<>();
        DobDatePicker = new com.toedter.calendar.JDateChooser();
        GenderCombo = new javax.swing.JComboBox<>();
        SalaryEditText = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        Nlab = new javax.swing.JLabel();
        Plab = new javax.swing.JLabel();
        Elab = new javax.swing.JLabel();
        Slab = new javax.swing.JLabel();
        IDlab = new javax.swing.JLabel();
        Dlab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 227, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 5));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\depat.png")); // NOI18N
        jLabel3.setText("DEPT");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\image.png")); // NOI18N
        jLabel16.setText("ID");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\name.png")); // NOI18N
        jLabel4.setText("NAME");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\shift.png")); // NOI18N
        jLabel10.setText("SHIFT");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel9.setText("JOINING DATE");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\qual.png")); // NOI18N
        jLabel8.setText("QUALIFICATION");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\email.png")); // NOI18N
        jLabel6.setText("EMAIL");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\phone.png")); // NOI18N
        jLabel5.setText("PHONE");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\date.png")); // NOI18N
        jLabel13.setText("DATE OF BIRTH");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\experience.png")); // NOI18N
        jLabel12.setText("EXPERIENCE");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\person.png")); // NOI18N
        jLabel1.setText("PERSON");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\gender.png")); // NOI18N
        jLabel15.setText("GENDER");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\OFFICE_MANAGEMENT_SYSTEM_IN_JAVA_WITH_SOURCE_CODE\\Office Management System\\Image\\salary.png")); // NOI18N
        jLabel11.setText("SALARY");

        departmentCombo.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        departmentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "ACCOUNTS", "MANAGER", "ASSISTANT MANAGER", "SUPERVISOR", "SECURITY", "PROJECT LEADER", " " }));
        departmentCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentComboItemStateChanged(evt);
            }
        });
        departmentCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentComboActionPerformed(evt);
            }
        });

        IdEditText.setEditable(false);
        IdEditText.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        IdEditText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdEditTextActionPerformed(evt);
            }
        });

        NameEditText.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        NameEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameEditTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameEditTextFocusLost(evt);
            }
        });
        NameEditText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameEditTextActionPerformed(evt);
            }
        });
        NameEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NameEditTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NameEditTextKeyReleased(evt);
            }
        });

        PhoneEditText.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        PhoneEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneEditTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PhoneEditTextFocusLost(evt);
            }
        });
        PhoneEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneEditTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PhoneEditTextKeyReleased(evt);
            }
        });

        EmailEditText.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        EmailEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailEditTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailEditTextFocusLost(evt);
            }
        });
        EmailEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailEditTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailEditTextKeyReleased(evt);
            }
        });

        QualificationCombo.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        QualificationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Qualification", "BCA", "BBA", "MBA", "MCA", "M.tech", "B.tech", "M.Phil", "P.hd", " " }));
        QualificationCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                QualificationComboItemStateChanged(evt);
            }
        });
        QualificationCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                QualificationComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                QualificationComboFocusLost(evt);
            }
        });
        QualificationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QualificationComboActionPerformed(evt);
            }
        });
        QualificationCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QualificationComboKeyPressed(evt);
            }
        });

        JoinningDatePicker.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JoinningDatePickerFocusLost(evt);
            }
        });
        JoinningDatePicker.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JoinningDatePickerKeyPressed(evt);
            }
        });

        ShiftCombo.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        ShiftCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Shift", "Day", "Night", " ", " " }));
        ShiftCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ShiftComboItemStateChanged(evt);
            }
        });
        ShiftCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ShiftComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ShiftComboFocusLost(evt);
            }
        });

        PersonEdittext.setEditable(false);
        PersonEdittext.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        PersonEdittext.setText("1");
        PersonEdittext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonEdittextActionPerformed(evt);
            }
        });

        ExperienceCombo.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        ExperienceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Experience ", "Unexperienced", "1 YEAR", "2 YEARS", "3 YEARS", "MORE THAN 3 YEARS" }));
        ExperienceCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ExperienceComboItemStateChanged(evt);
            }
        });
        ExperienceCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ExperienceComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ExperienceComboFocusLost(evt);
            }
        });

        DobDatePicker.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DobDatePickerFocusLost(evt);
            }
        });
        DobDatePicker.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DobDatePickerPropertyChange(evt);
            }
        });
        DobDatePicker.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DobDatePickerKeyPressed(evt);
            }
        });

        GenderCombo.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        GenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "MALE", "FEMALE", "Other", " " }));
        GenderCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GenderComboItemStateChanged(evt);
            }
        });
        GenderCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GenderComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GenderComboFocusLost(evt);
            }
        });
        GenderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboActionPerformed(evt);
            }
        });

        SalaryEditText.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        SalaryEditText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SalaryEditTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SalaryEditTextFocusLost(evt);
            }
        });
        SalaryEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SalaryEditTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SalaryEditTextKeyReleased(evt);
            }
        });

        SaveButton.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(253, 225, 243), new java.awt.Color(135, 255, 237), null, null));
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        SaveButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SaveButtonKeyPressed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(253, 225, 243), new java.awt.Color(135, 255, 237), null, null));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        Nlab.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        Nlab.setForeground(new java.awt.Color(204, 0, 0));

        Plab.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        Plab.setForeground(new java.awt.Color(204, 0, 0));

        Elab.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        Elab.setForeground(new java.awt.Color(204, 0, 51));

        Slab.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        Slab.setForeground(new java.awt.Color(255, 0, 0));

        IDlab.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        IDlab.setText("Remenber your ID for Future");

        Dlab.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(Plab, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(Elab, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IdEditText, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(departmentCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(IDlab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PhoneEditText, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailEditText, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QualificationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JoinningDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ShiftCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(NameEditText, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(67, 67, 67))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExperienceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderCombo, 0, 186, Short.MAX_VALUE)
                            .addComponent(SalaryEditText)
                            .addComponent(DobDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PersonEdittext))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addComponent(Slab, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(Nlab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dlab, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {GenderCombo, SalaryEditText});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(PersonEdittext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDlab)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(ExperienceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16)
                    .addComponent(IdEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(DobDatePicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(NameEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Nlab, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PhoneEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Plab, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EmailEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Elab, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QualificationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Dlab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(GenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SalaryEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(Slab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BackButton)
                                .addComponent(SaveButton))
                            .addComponent(JoinningDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShiftCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JoinningDatePicker, QualificationCombo});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DobDatePicker, ExperienceCombo});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GenderCombo, SalaryEditText});

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /*  BackButtonActionPerformed method is used for going back to the previous
    frames s.t. Manage frame for managing employee information  */
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Manage ob = new Manage();
        ob.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed
/* SaveButtonActionPerformed method is used for save the 
    employee information into the database
    "departmentCombo,IdEditText,NameEditText,PhoneEditText,
    EmailEditText,QualificationCombo,JoiningDatePicker,ShiftCombo,SalaryEditText,
    ExperienceCombo,GenderCombo,PersonEditText are the name of textfields and Combobox 
    which are used in the frames.
    */
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
         String dept = (String) departmentCombo.getSelectedItem();
        String id = IdEditText.getText();
        String name = NameEditText.getText();
        String pno = PhoneEditText.getText();
        String email = EmailEditText.getText();
        String quali = (String) QualificationCombo.getSelectedItem();
        java.util.Date jdate =JoinningDatePicker.getDate();
        String shft = (String) ShiftCombo.getSelectedItem();
        String sal = SalaryEditText.getText();
        String exp = (String) ExperienceCombo.getSelectedItem();
        String gen = (String) GenderCombo.getSelectedItem();
        String per = PersonEdittext.getText();
        if( name.equals("")|pno.equals("")|email.equals("")|sal.equals("")){
                JOptionPane.showMessageDialog(null, "All Fields are Mandatory to fill");
            }
        
         try {
             // sql query to insert the data into the database
             String sql = "INSERT INTO `employee`(`ID`,`Department`, `Name`, `Phone`, `Email`, `Qualification`, `Join_Date`, `Shift`, `Salary`, `Experience`, `Date_of_Birth`, `Gender`, `Person`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
            getid();

            pst = conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, dept);
            pst.setString(3, name);
            pst.setString(4, pno);
            pst.setString(5, email);
            pst.setString(6, quali);
            java.sql.Date sqldate = new java.sql.Date(jdate.getTime());
            pst.setDate(7, sqldate);
            pst.setString(8, shft);
            pst.setString(9, sal);
            pst.setString(10, exp);
            java.sql.Date sqldate1 = new java.sql.Date(dob.getTime());
            pst.setDate(11, sqldate1);
            pst.setString(12, gen);
            pst.setString(13, per);
           pst.executeUpdate();
          int res= JOptionPane.showConfirmDialog(null,"Are you sure to Submit","Confirm",JOptionPane.YES_NO_OPTION);
           if(res==JOptionPane.YES_OPTION)
           {
               JOptionPane.showMessageDialog(null, "New Employee Added");
               clearFields();
            NameEditText.requestFocus();
            getperson();

           }
          else
          {
              JOptionPane.showMessageDialog(null,"Please Fill Correctly");
          }
                   //clearFields();
            //NameEditText.requestFocus();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
            //clearFields();
            //NameEditText.requestFocus();*/
        

       
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void departmentComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departmentComboItemStateChanged
        // TODO add your handling code here:
        getid();
    }//GEN-LAST:event_departmentComboItemStateChanged

    private void NameEditTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameEditTextFocusGained
        // TODO add your handling code here:
        NameEditText.setBackground(Color.pink);
    }//GEN-LAST:event_NameEditTextFocusGained

    private void NameEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameEditTextFocusLost
        // TODO add your handling code here:
   
        NameEditText.setBackground(Color.white);
    }//GEN-LAST:event_NameEditTextFocusLost

    private void PhoneEditTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneEditTextFocusGained
        // TODO add your handling code here:
        PhoneEditText.setBackground(Color.pink);
    }//GEN-LAST:event_PhoneEditTextFocusGained

    private void PhoneEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneEditTextFocusLost
        // TODO add your handling code here:
        
        PhoneEditText.setBackground(Color.white);
    }//GEN-LAST:event_PhoneEditTextFocusLost

    private void EmailEditTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailEditTextFocusGained
        // TODO add your handling code here:
        EmailEditText.setBackground(Color.pink);
    }//GEN-LAST:event_EmailEditTextFocusGained

    private void EmailEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailEditTextFocusLost
        // TODO add your handling code here:
        //QualificationCombo.requestFocus();
        EmailEditText.setBackground(Color.white);
    }//GEN-LAST:event_EmailEditTextFocusLost

    private void QualificationComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_QualificationComboFocusGained
        // TODO add your handling code here:
       QualificationCombo.setBackground(Color.pink);
    }//GEN-LAST:event_QualificationComboFocusGained

    private void QualificationComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_QualificationComboFocusLost
        // TODO add your handling code here:
        // JoinningDatePicker.requestFocus();
          QualificationCombo.setBackground(Color.white);
    }//GEN-LAST:event_QualificationComboFocusLost

    private void JoinningDatePickerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JoinningDatePickerFocusLost
        // TODO add your handling code here:
        ShiftCombo.requestFocus();
    }//GEN-LAST:event_JoinningDatePickerFocusLost

    private void ShiftComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ShiftComboFocusGained
        // TODO add your handling code here:
        ShiftCombo.setBackground(Color.pink);
    }//GEN-LAST:event_ShiftComboFocusGained

    private void ShiftComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ShiftComboFocusLost
      
    }//GEN-LAST:event_ShiftComboFocusLost

    private void ExperienceComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ExperienceComboFocusGained
        // TODO add your handling code here:
        ExperienceCombo.setBackground(Color.pink);
    }//GEN-LAST:event_ExperienceComboFocusGained

    private void ExperienceComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ExperienceComboFocusLost
        // TODO add your handling code here:
       ExperienceCombo.setBackground(Color.white);
       
    }//GEN-LAST:event_ExperienceComboFocusLost

    private void DobDatePickerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DobDatePickerFocusLost
        // TODO add your handling code here:
       
        java.util.Date jdate =JoinningDatePicker.getDate();
        long year = jdate.getYear();
        if(1975<year && year<2003)
        {
            Dlab.setText("Employee is not eligible");
        }
        else{
//            Dlab.setText("");
            
        }
        
    }//GEN-LAST:event_DobDatePickerFocusLost

    private void GenderComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenderComboFocusGained
        // TODO add your handling code here:
        GenderCombo.setBackground(Color.pink);
    }//GEN-LAST:event_GenderComboFocusGained

    private void GenderComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenderComboFocusLost
        // TODO add your handling code here:
        //SalaryEditText.requestFocus();
        
    }//GEN-LAST:event_GenderComboFocusLost

    private void SalaryEditTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SalaryEditTextFocusGained
        // TODO add your handling code here:
        SalaryEditText.setBackground(Color.pink);
    }//GEN-LAST:event_SalaryEditTextFocusGained

    private void SalaryEditTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SalaryEditTextFocusLost
        // TODO add your handling code here:
        SalaryEditText.setBackground(Color.white);
      //  SaveButton.requestFocus();
    }//GEN-LAST:event_SalaryEditTextFocusLost

    private void NameEditTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameEditTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            PhoneEditText.requestFocus();
        }
    }//GEN-LAST:event_NameEditTextKeyPressed

    private void NameEditTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameEditTextKeyReleased
        // TODO add your handling code here:
         Pattern q = Pattern.compile("^[a-zA-Z ]{4,16}$");
                Matcher n = q.matcher(NameEditText.getText());
                if (!n.matches()) {
                  //  JOptionPane.showMessageDialog(null, "Enter a valid Name");
                    Nlab.setText("Please enter a valid Name");
                } else {

                    Nlab.setText("");
                }
    }//GEN-LAST:event_NameEditTextKeyReleased

    private void PhoneEditTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneEditTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            EmailEditText.requestFocus();
        }
    }//GEN-LAST:event_PhoneEditTextKeyPressed

    private void PhoneEditTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneEditTextKeyReleased
        // TODO add your handling code here:
         Pattern p = Pattern.compile("^\\d{10}$");
                Matcher m = p.matcher(PhoneEditText.getText());
                if (!m.matches()) {
                   // JOptionPane.showMessageDialog(null, "Invalid Phone number");
                    Plab.setText("Please enter a valid Number");
                } else {
                   Plab.setText("");
                }
    }//GEN-LAST:event_PhoneEditTextKeyReleased

    private void EmailEditTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailEditTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            QualificationCombo.requestFocus();
        }
    }//GEN-LAST:event_EmailEditTextKeyPressed

    private void EmailEditTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailEditTextKeyReleased
        // TODO add your handling code here:
        
                String regex = "^[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
                Pattern w = Pattern.compile(regex);
                Matcher a = w.matcher(EmailEditText.getText());
                if (!a.matches()) {
                    //JOptionPane.showMessageDialog(null, "Enter a valid email id");
                    Elab.setText("Please enter a valid Email-id");
                } else {
                        Elab.setText("");
                    
                }
    }//GEN-LAST:event_EmailEditTextKeyReleased

    private void QualificationComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QualificationComboKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_QualificationComboKeyPressed

    private void QualificationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QualificationComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QualificationComboActionPerformed

    private void JoinningDatePickerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JoinningDatePickerKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JoinningDatePickerKeyPressed

    private void QualificationComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_QualificationComboItemStateChanged
        // TODO add your handling code here:
        JoinningDatePicker.requestFocus();
    }//GEN-LAST:event_QualificationComboItemStateChanged

    private void ShiftComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ShiftComboItemStateChanged
        // TODO add your handling code here:
        ExperienceCombo.requestFocus();
    }//GEN-LAST:event_ShiftComboItemStateChanged

    private void ExperienceComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ExperienceComboItemStateChanged
        // TODO add your handling code here:
        DobDatePicker.requestFocus();
    }//GEN-LAST:event_ExperienceComboItemStateChanged

    private void GenderComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GenderComboItemStateChanged
        // TODO add your handling code here:
      
        SalaryEditText.requestFocus();
    }//GEN-LAST:event_GenderComboItemStateChanged

    private void SalaryEditTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalaryEditTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            SaveButton.requestFocus();
        }
    }//GEN-LAST:event_SalaryEditTextKeyPressed

    private void SalaryEditTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalaryEditTextKeyReleased
        // TODO add your handling code here:
        String sal=SalaryEditText.getText();
        if((sal.length()<5)&&(sal.length()>=1))
        {
            Slab.setText("Please enter valid Salary");
            SalaryEditText.requestFocus();
        }
        else
        {  
            Slab.setText("");
        }  
    }//GEN-LAST:event_SalaryEditTextKeyReleased

    private void DobDatePickerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DobDatePickerKeyPressed
        
    }//GEN-LAST:event_DobDatePickerKeyPressed

    private void DobDatePickerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DobDatePickerPropertyChange
        // TODO add your handling code here:
          dob = DobDatePicker.getDate();
        if(dob == null){}else{
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dob);
        int year = calendar.get(Calendar.YEAR);
         System.out.println(" year in dob "+year);
        if(!(year>1975 && year<2003))
        {
            dontSubmit = false;
            Dlab.setText("DOB must be 1975 >x>2003 Employee is not eligible");
            DobDatePicker.requestFocus();
            
        }
        else{
            Dlab.setText("");
        }}
         
    }//GEN-LAST:event_DobDatePickerPropertyChange

    private void IdEditTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdEditTextActionPerformed
        // TODO add your handling code here:
//        PhoneEditText.requestFocus();
    }//GEN-LAST:event_IdEditTextActionPerformed

    private void NameEditTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameEditTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameEditTextActionPerformed

    private void SaveButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SaveButtonKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_SaveButtonKeyPressed

    private void PersonEdittextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonEdittextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonEdittextActionPerformed

    private void GenderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderComboActionPerformed

    private void departmentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentComboActionPerformed

   
    // method for genrating employee id according to the selected department 
    public void getid() {
        try {

            conn = javaconnect.ConnectDb();
            department =departmentCombo .getSelectedItem().toString();
            if (department.contains("Select Department")) {
                IdEditText.setText("");

            } else {
                department = departmentCombo.getSelectedItem().toString();
           // query to fetch the selected department for generating id 
                String sql = "select COUNT(1) as NumOfUserInSelectedDepartment  from employee where department LIKE '" + department + "';";
                st = conn.createStatement();
                rs = st.executeQuery(sql);

                if (rs.next()) {
                    lastid = rs.getInt("NumOfUserInSelectedDepartment");
                    lastid++;
                    userid = department + " " + Integer.toString(lastid);
                    IdEditText.setText(userid);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
// method for checking total number of employees in the office and total entries in the database
    public void getperson() {
        try {
            conn = javaconnect.ConnectDb();
            String sql = "select max(Person) from employee";
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                lastp = rs.getInt(1);
                lastp++;
                PersonEdittext.setText(Integer.toString(lastp));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }


    
    
    public static void main(String args[]) {
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmploye().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Dlab;
    private com.toedter.calendar.JDateChooser DobDatePicker;
    private javax.swing.JLabel Elab;
    private javax.swing.JTextField EmailEditText;
    private javax.swing.JComboBox<String> ExperienceCombo;
    private javax.swing.JComboBox<String> GenderCombo;
    private javax.swing.JLabel IDlab;
    private javax.swing.JTextField IdEditText;
    private com.toedter.calendar.JDateChooser JoinningDatePicker;
    private javax.swing.JTextField NameEditText;
    private javax.swing.JLabel Nlab;
    private javax.swing.JTextField PersonEdittext;
    private javax.swing.JTextField PhoneEditText;
    private javax.swing.JLabel Plab;
    private javax.swing.JComboBox<String> QualificationCombo;
    private javax.swing.JTextField SalaryEditText;
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox<String> ShiftCombo;
    private javax.swing.JLabel Slab;
    private javax.swing.JComboBox<String> departmentCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
