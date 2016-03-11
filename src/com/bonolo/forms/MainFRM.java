package com.bonolo.forms;


import com.bonolo.rooms.FamilyFRM;
import com.bonolo.rooms.ConferenceRoomFRM;
import com.bonolo.classcalender.ClassCalender;
import com.bonolo.clientclasses.Address;
import com.bonolo.conditions.RegConditions;
import com.bonolo.rooms.DoubleRoomFRM;
import com.bonolo.rooms.ExecutiveSuiteFRM;
import com.bonolo.validation.Validate;
import java.awt.Component;
//import com.bonolo.rooms.ConferenceRoomFRM;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import com.bonolo.clientclasses.Client;
import com.bonolo.clientclasses.Contact;
import com.bonolo.clientclasses.Login;
import com.bonolo.daos.ClientDAO;
import com.bonolo.rooms.GranteSuiteFRM;
import com.bonolo.rooms.HoneyMoonFRM;
import com.bonolo.rooms.JuniorSuiteFRM;
import com.bonolo.rooms.KhutseFRM;
import com.bonolo.rooms.PresidentialSuite;
import com.bonolo.rooms.SingleRoomFRM;
import com.bonolo.rooms.SuperiorSuiteFRM;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.KeyStroke;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Don Luc
 */
public class MainFRM extends javax.swing.JFrame {
GregorianCalendar cal = new GregorianCalendar();
private Validate validate = new Validate();
private Client client;
private Address address;
private Contact contact;
private Login login;
private boolean isLoggedIn = false;
private String msg1 = "";
private String clientGender = "Male";
    /**
     * Creates new form MainFRM
     */


    public MainFRM() {
        initComponents();
        try    
        {
            setTime();
            testMenu();
            this.radMale.setSelected(true);
        }catch(Exception ex)
        {
            this.jPanel9.setVisible(false);
         //   btnClear.getInputMap().put(KeyStroke.getKeyStroke("K"), ""));
            
        }
        setTitle("Zindiba Inn Hotel Reservation System");
        displayForms(lblLogin);
      //      displayConference();
       displayForms(lblConference);
       displayForms(lblDouble);
      
       displayForms(lblExecutive);
       displayForms(lblConditions);
       displayForms(lblGrante);
       displayForms(lblHoney);
       displayForms(lblSuperior);
       displayForms(lblJunior);
       displayForms(lblPresident);
       displayForms(lblKhutse);
       displayForms(lblSingle);
       displayForms(lblNdebele);
    }
    
    public void testMenu()
    {
        jMenu1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    
    }
    
    public void setIndex(int index)
    {
        this.jTabbedPane1.setSelectedIndex(index);
    }
    
    
    public void displayForms(final Component comp)
    {
        comp.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int count = e.getClickCount();
                if(comp.equals(lblConference))
                {
                    if(count == 1)
                    {
                        
                        setVisible(false);
                      
                      
                        
                      new ConferenceRoomFRM().setVisible(true);
                        
                    }
                
                }else if(comp.equals(lblDouble))
                {
                    if(count == 1)
                    {
                        setVisible(false);
                        new DoubleRoomFRM().setVisible(true);
                        JOptionPane.showMessageDialog(rootPane, "Double");
                        
                    }
                
                }else if(comp.equals(lblLogin))
                {
                    if(count == 1)
                    {
                          JOptionPane.showMessageDialog(rootPane,"Working");
                        
                          setVisible(false);
                          new LoginFRM().setVisible(true);
                         
                    }
                
                }else if(comp.equals(lblExecutive))
                {
                    if(count == 1)
                    {
                        new ExecutiveSuiteFRM().setVisible(true);
                        setVisible(false);
                    }
                }else if(comp.equals(lblConditions))
                {
                    if (count == 1)
                    {
                        
                        jTabbedPane1.setSelectedIndex(4);
                    
                    }
                
                }else if(comp.equals(lblFamily))
                {
                    new FamilyFRM().setVisible(true);
                    setVisible(false);
                
                }else if(comp.equals(lblGrante))
                {
                    new GranteSuiteFRM().setVisible(true);
                    setVisible(false);
                }else if(comp.equals(lblHoney))
                {
                    new HoneyMoonFRM().setVisible(true);
                    setVisible(false);
                }else if(comp.equals(lblSuperior))
                {
                    new SuperiorSuiteFRM().setVisible(true);
                    setVisible(false);
                }else if(comp.equals(lblJunior))
                {
                    new JuniorSuiteFRM().setVisible(true);
                    setVisible(false);
                }else if(comp.equals(lblPresident))
                {
                    new PresidentialSuite().setVisible(true);
                    setVisible(true);
                }else if(comp.equals(lblKhutse))
                {
                    new KhutseFRM().setVisible(true);
                    setVisible(false);
                }else if(comp.equals(lblSingle) )
                {
                    new SingleRoomFRM().setVisible(true);
                    setVisible(false);
                }
            
            }
        
        });
    
    
    }
    
  //set time
    public final void setTime()
    {
        String info[] = cal.getTime().toString().split(" ");
        
        this.lblDay.setText(info[0]);
       // this.lbl
        String d = info[2] + " " + info[1] + " " + info[5];
        this.lblDate.setText(d);
        
        String[] splitTime = info[3].split(":");
        
        this.lblTime.setText(splitTime[0] + ":" + splitTime[1]);
        
    }
    
    //Rooms
   // public final void displayConference()
    //{
        
    
    //}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        lblDay2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtHouseNO = new javax.swing.JTextField();
        txtStreetName = new javax.swing.JTextField();
        txtAreaCode = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtPassConfirm = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtRegisteredClient = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtUsername2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtReference = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        chkConditions = new javax.swing.JCheckBox();
        lblConditions = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblDouble = new javax.swing.JLabel();
        lblFamily = new javax.swing.JLabel();
        lblConference = new javax.swing.JLabel();
        lblExecutive = new javax.swing.JLabel();
        lblGrante = new javax.swing.JLabel();
        lblHoney = new javax.swing.JLabel();
        lblSuperior = new javax.swing.JLabel();
        lblJunior = new javax.swing.JLabel();
        lblPresident = new javax.swing.JLabel();
        lblSingle = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lblKhutse = new javax.swing.JLabel();
        lblNdebele = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel22 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblLogin = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\IMG2.png")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Time:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Date:");

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTime.setText("12:01");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDate.setText("19 September 2014");

        lblDay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDay.setText("Day");

        lblDay2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDay2.setText("Day:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDay2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDay))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 54, Short.MAX_VALUE)
                                .addComponent(lblDate))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTime)))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDay2)
                    .addComponent(lblDay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDate))
                .addContainerGap())
        );

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setComponentPopupMenu(jPopupMenu1);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\ISY\\Project\\booking-icon.png")); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\AboutUs.png")); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Mission Statement.png")); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\vision.png")); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Location.png")); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\awards.png")); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\CSI.png")); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31)))
                .addGap(89, 89, 89)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel29)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel31)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel32)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Home", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Client's Information"));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Details"));

        jLabel4.setText("Name");

        jLabel6.setText("Surname");

        jLabel7.setText("ID Number");

        jLabel34.setText("Contact No.");

        jLabel35.setText("Email");

        Gender.setText("Gender");

        radMale.setText("Male");
        radMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMaleActionPerformed(evt);
            }
        });

        radFemale.setText("Female");
        radFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel34)
                        .addComponent(jLabel35)
                        .addComponent(Gender)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSurname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txtID))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txtContact)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(radMale)
                        .addGap(18, 18, 18)
                        .addComponent(radFemale)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender)
                    .addComponent(radMale)
                    .addComponent(radFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));

        jLabel8.setText("House#");

        jLabel9.setText("City");

        jLabel10.setText("Area Code");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHouseNO, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtStreetName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addComponent(txtAreaCode, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtHouseNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtAreaCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Set Login Details"));

        jLabel13.setText("Username");

        jLabel14.setText("Password");

        jLabel15.setText("Confirm Password");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(txtPassConfirm))
                .addGap(31, 31, 31))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPassConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnRegister.setBackground(new java.awt.Color(153, 255, 153));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Registration Information"));
        jPanel9.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Registered Client");

        txtRegisteredClient.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Username");

        txtUsername2.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Password");

        txtPassword2.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Reference Number");

        txtReference.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\reg.png")); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRegisteredClient, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtReference, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel21)
                .addGap(34, 34, 34))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtRegisteredClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addComponent(jLabel21)))
        );

        chkConditions.setText("I've read the terms and conditions");

        lblConditions.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblConditions.setForeground(new java.awt.Color(102, 153, 255));
        lblConditions.setText("Terms And Conditions");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 297, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(lblConditions))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(chkConditions))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblConditions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkConditions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(213, 213, 213))
        );

        jTabbedPane1.addTab("Registration", jPanel4);

        lblDouble.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\edited\\double.png")); // NOI18N
        lblDouble.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblFamily.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\edited\\family.png")); // NOI18N
        lblFamily.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblConference.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\edited\\conference.png")); // NOI18N
        lblConference.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblExecutive.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\edited\\EXECUTIVE.jpg")); // NOI18N
        lblExecutive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblGrante.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\edited\\Grante.png")); // NOI18N
        lblGrante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblHoney.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\edited\\honey.png")); // NOI18N
        lblHoney.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblSuperior.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\edited\\superior.png")); // NOI18N
        lblSuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblJunior.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\edited\\junior.png")); // NOI18N
        lblJunior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblPresident.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\edited\\presi.png")); // NOI18N
        lblPresident.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblSingle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\edited\\single.png")); // NOI18N
        lblSingle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel44.setText("Conference Room");

        jLabel45.setText("Double Room");

        jLabel46.setText("Executive Suite");

        jLabel47.setText("Family Suite");

        jLabel48.setText("Grante Suite");

        jLabel49.setText("Honeymoon Suite");

        jLabel50.setText("Single Room");

        jLabel51.setText("Presidential Suite");

        jLabel52.setText("Ndebele Hut");

        jLabel53.setText("Khutse Suite");

        jLabel54.setText("Junior Suite");

        jLabel55.setText("Superior Suite");

        lblKhutse.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\Rooms p2\\kHUTSE2.png")); // NOI18N
        lblKhutse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblNdebele.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Rooms\\Rooms p2\\ndebele.png")); // NOI18N
        lblNdebele.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(lblSuperior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblJunior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPresident)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNdebele, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(lblConference)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDouble)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExecutive)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGrante, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKhutse, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSingle, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoney, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(125, 125, 125)
                                .addComponent(jLabel45)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel46)
                                .addGap(124, 124, 124)
                                .addComponent(jLabel47)
                                .addGap(133, 133, 133)
                                .addComponent(jLabel48)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel49)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(147, 147, 147)
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel51)
                                .addGap(131, 131, 131)
                                .addComponent(jLabel52)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel53)
                                .addGap(128, 128, 128)
                                .addComponent(jLabel50)
                                .addGap(68, 68, 68)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFamily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDouble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConference, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblExecutive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGrante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHoney))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(jLabel45)
                        .addComponent(jLabel46)
                        .addComponent(jLabel47))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49)
                        .addComponent(jLabel48)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblJunior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblPresident, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblNdebele, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSingle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblKhutse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54)
                        .addComponent(jLabel51)
                        .addComponent(jLabel55)
                        .addComponent(jLabel52))
                    .addComponent(jLabel53))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rooms & Rates", jPanel11);

        jPanel10.setBackground(new java.awt.Color(153, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jEditorPane1.setEditable(false);
        jEditorPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jEditorPane1.setText("1. Confidentiality is guaranteed in terms of the client’s information. No information will be given to any other company without the client’s concern unless our company wants to use the client’s information for survey purposes .\n2. A client is not prohibited to withdraw from the registration at any time if he/she feels that they no longer want to proceed with it.\n3. By registering with our company does not necessarily reserve a space for accommodation since there is a booking process to be completed.\nBy agreeing to the terms and conditions stated above it means you are accepting the company’s policy.\n");
        jScrollPane1.setViewportView(jEditorPane1);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setText("Registration's Terms and Conditions");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Accept");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(445, 445, 445))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(518, 518, 518))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel22)
                .addGap(12, 12, 12)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Registration Ts & Cs", jPanel10);

        lblLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\LoginIcon2.png")); // NOI18N
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Don Luc\\Documents\\Don\\Zindiba\\Bonolo.png")); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel23.setText("Powered by");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(27, 27, 27)
                .addComponent(jLabel19)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblLogin)))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel23)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenu3.setText("Login");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenu4.setText("Register");
        jMenu1.add(jMenu4);

        jMenuItem1.setText("Rooms & Rates Tab");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        this.chkConditions.setSelected(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        //boolean isName = validate.validNameSurname(this.txtName.getText());
        //boolean isSurname = validate.validNameSurname(this.txtSurname.getText());
        // boolean isID = validate.validID(this.txtID.getText());
        // boolean isContact = validate.validContact(this.txtContact.getText());
        //boolean isEmail = validate.validEmail(this.txtEmail.getText());
        //boolean isHouseNO = validate.validNumbers(this.txtHouseNO.getText());
        //boolean isAreaCode = validate.validNumbers(this.txtAreaCode.getText());
        //boolean passwordMatch = validate.confirmPassword(this.txtPassword.getText(), this.txtPassConfirm.getText().toString());

        //Client's record
        if(validate.validNameSurname(this.txtName.getText()) == true )
        {
            if(validate.validNameSurname(this.txtSurname.getText()) == true)
            {
                this.txtRegisteredClient.setText(this.txtName.getText() + " " + this.txtSurname.getText());
                if(validate.validID(this.txtID.getText()) == true)
                {
                   //  String gend = (String)comboGender.getSelectedItem();
                    JOptionPane.showMessageDialog(rootPane, clientGender);
                   
                    client = new Client(this.txtName.getText(), this.txtSurname.getText(),this.txtID.getText(),clientGender);
                    
                }else
                {
                    msg1 =  "Invalid Identity Number was entered\n" +
                    "Please re-enter the Identity Number";
                    JOptionPane.showMessageDialog(rootPane, msg1,"Invalid ID",JOptionPane.ERROR_MESSAGE);
                    this.txtID.setText("");
                    this.txtID.requestFocus();
                }
            }else
            {
                msg1 =  "The surname you've entered either contains numbers or special characters\n" +
                "Please re-enter surname";
                JOptionPane.showMessageDialog(rootPane,msg1 ,"Invalid Surname",JOptionPane.ERROR_MESSAGE);
                this.txtSurname.setText("");
                this.txtSurname.requestFocus();
            }

        }else
        {
            msg1 =  "Your name either contains numbers or special characters\n" +
            "Please re-enter name";
            JOptionPane.showMessageDialog(rootPane, msg1,"Invalid Name",JOptionPane.ERROR_MESSAGE);
            this.txtName.setText("");
            this.txtName.requestFocus();
        }

        if(validate.validNumbers(this.txtHouseNO.getText()))
        {
            if(validate.validNameSurname(this.txtStreetName.getText()) )
            {
                if(validate.validNumbers(this.txtAreaCode.getText()))
                {
                    
                    address = new Address(Integer.parseInt(this.txtHouseNO.getText()), this.txtStreetName.getText(), Integer.parseInt(this.txtAreaCode.getText()));

                }else
                {
                    msg1 =   "The area code you've entered either contains letters or special characters\n" +
                    "Please re-enter the area code";
                    JOptionPane.showMessageDialog(rootPane,msg1 ,"Invalid Area Code",JOptionPane.ERROR_MESSAGE);
                    this.txtAreaCode.setText("");
                    this.txtAreaCode.requestFocus();
                }
            }else
            {
                msg1 =  "The street name you've entered either contains numbers or special characters\n" +
                "Please re-enter the streetname";
                JOptionPane.showMessageDialog(rootPane,msg1 ,"Invalid Street Name",JOptionPane.ERROR_MESSAGE);
                this.txtStreetName.setText("");
                this.txtStreetName.requestFocus();
            }
        }else
        {
            msg1 =  "The house number you've entered either contains letters or special characters\n" +
            "Please re-enter";
            JOptionPane.showMessageDialog(rootPane,msg1 ,"Invalid House Number",JOptionPane.ERROR_MESSAGE);
            this.txtHouseNO.setText("");
            this.txtHouseNO.requestFocus();
        }

        //if(this.txtContact.getText().equals("") && this.txtEmail.getText.equals(""))
        //{
          //  contact = new Contact(txtContact.getText(), txtEmail.getText());
       // }else if(this.txtContact.getText() == null && validate.validEmail(this.txtEmail.getText()) == true)
        //{
        //    contact = new Contact(txtContact.getText(), this.txtEmail.getText());
       
        if(validate.validEmail(this.txtEmail.getText()) == false)
        {
             
            msg1 = "The email you've entered is invalid\n" +
            "Please re-enter";
            JOptionPane.showMessageDialog(rootPane, msg1,"Invalid Street Name",JOptionPane.ERROR_MESSAGE);
            this.txtEmail.setText("");
            this.txtEmail.requestFocus();   
        }
            contact = new Contact(this.txtContact.getText(), this.txtEmail.getText());
        

        //Username======================================================================================================================================
        if(validate.confirmPassword(validate.getPassword(this.txtPassword.getPassword()), validate.getPassword(this.txtPassConfirm.getPassword())))
        {
            this.txtUsername2.setText(this.txtUsername.getText());
            this.txtPassword2.setText(validate.getPassword(this.txtPassword.getPassword()));
            login = new Login(this.txtUsername.getText(), validate.getPassword(this.txtPassword.getPassword()), "Client");
        }else if(validate.confirmPassword(validate.getPassword(this.txtPassword.getPassword()), validate.getPassword(this.txtPassConfirm.getPassword())) == false )
        {
            msg1 =    "The password you've entered doesn't match the confirmed password.\n" +
            "Please re-enter password";
            JOptionPane.showMessageDialog(rootPane,msg1,"Invalid Password" ,JOptionPane.ERROR_MESSAGE);
            this.txtPassConfirm.setText("");
            this.txtPassword.setText("");
            this.txtPassConfirm.requestFocus();
        }else if(this.txtUsername.getText().equals("")  || validate.getPassword(this.txtPassword.getPassword()).equals("") || validate.getPassword(this.txtPassConfirm.getPassword()).equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,msg1,"You forgot to enter a username or password!" ,JOptionPane.WARNING_MESSAGE);
            this.txtRegisteredClient.setText("");
            this.txtUsername2.setText("");
            this.txtPassword2.setText("");
        }
        
        ClientDAO dao = new ClientDAO();
        try
        {
            dao.openConnect();
            if(dao.addClient(client) > 0)
            {
                if(dao.addClientAddress(address) > 0)
                {
                    if(dao.addClientLogin(login) > 0) //Logic error
                        {
                        
                            
                        if(dao.addClientContact(contact) > 0)
                            {
                      
                                this.txtReference.setText(String.valueOf(dao.getReference(client)));
                            }else
                            {
                                    JOptionPane.showMessageDialog(rootPane, "Contact Not added");
                             }
                        }else
                            {
                                String msg =    "The username provided already exists\n" +
                                                "Please enter another one!";
                                JOptionPane.showMessageDialog(rootPane,msg,"Existing Username",JOptionPane.INFORMATION_MESSAGE);
                                this.txtUsername.setText("");
                                this.txtUsername.requestFocus();
                            
                            }
                }
            }else 
            {
                JOptionPane.showMessageDialog(rootPane, "The ID Number provided already exists!","ID Number Error",JOptionPane.INFORMATION_MESSAGE);
                this.txtID.setText("");
                this.txtID.requestFocus();
            }
        
        }catch(Exception ex)
        {
            System.out.println("Error " + ex.getMessage());
        
        }finally
        {
            try {
                dao.closeConnect();
            } catch (SQLException ex) {
                System.out.println("Error " + ex.getMessage());
            }
        }
        

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void radMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMaleActionPerformed
        if(radMale.isSelected())
        {
            radFemale.setSelected(false);
            clientGender = "Male";
        }
    }//GEN-LAST:event_radMaleActionPerformed

    private void radFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFemaleActionPerformed
        if(radFemale.isSelected())
        {
            radMale.setSelected(false);
            clientGender = "Female";
        }



    }//GEN-LAST:event_radFemaleActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(MainFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFRM().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkConditions;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblConditions;
    private javax.swing.JLabel lblConference;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblDay2;
    private javax.swing.JLabel lblDouble;
    private javax.swing.JLabel lblExecutive;
    private javax.swing.JLabel lblFamily;
    private javax.swing.JLabel lblGrante;
    private javax.swing.JLabel lblHoney;
    private javax.swing.JLabel lblJunior;
    private javax.swing.JLabel lblKhutse;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNdebele;
    private javax.swing.JLabel lblPresident;
    private javax.swing.JLabel lblSingle;
    private javax.swing.JLabel lblSuperior;
    private javax.swing.JLabel lblTime;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTextField txtAreaCode;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHouseNO;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassConfirm;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPassword2;
    private javax.swing.JTextField txtReference;
    private javax.swing.JTextField txtRegisteredClient;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsername2;
    // End of variables declaration//GEN-END:variables
}

