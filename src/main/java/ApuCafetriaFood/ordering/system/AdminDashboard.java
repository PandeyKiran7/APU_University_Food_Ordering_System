/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.ApuCafetriaFood.ordering.system;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kiran
 */
public class AdminDashboard extends javax.swing.JFrame {

   
    public AdminDashboard() {
      
        setTitle("Admin Dashboard");
        initComponents();
        
          setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default closing behavior
         // Add window listener to confirm exit
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Show confirmation dialog when trying to close the window
                int response;
                response = JOptionPane.showConfirmDialog(AdminDashboard.this, 
                        "Do you really want to leave this site?",
                        "Exit Confirmation", 
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0); // Close the application if 'Yes'
                }
                // If 'No', nothing happens and the window remains open
            }
        });
    }

    
    // Password validation method
private boolean isValidPassword(String password) {
    // Regular expression for password validation
    String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{6,}$";
    Pattern pattern = Pattern.compile(passwordPattern);
    Matcher matcher = pattern.matcher(password);
    return matcher.matches();
}

private void openDashboard() {
    JOptionPane.showMessageDialog(null, "Welcome to the Dashboard!", "Dashboard", JOptionPane.INFORMATION_MESSAGE);
    // Add code to open your dashboard window here
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        SelectRole = new javax.swing.JComboBox<>();
        Register = new javax.swing.JButton();
        viewusers = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsers = new javax.swing.JTable();
        deleteuser = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernametopup = new javax.swing.JTextField();
        amounttopup = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        topupcredit = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        logout = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        generateTransactionReceipt = new javax.swing.JButton();
        receiptUsernameField = new javax.swing.JTextField();
        receiptAmountField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        updateUserInformation = new javax.swing.JButton();
        updateUsernameField = new javax.swing.JTextField();
        updatePasswordField = new javax.swing.JPasswordField();
        updateRoleComboBox = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        userselectiontable = new javax.swing.JTable();
        alluser = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewtransaction = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BackToHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 84, 140, -1));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 124, 140, -1));

        SelectRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select Role---", "Customer", "Vendors", "Runners" }));
        SelectRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectRoleActionPerformed(evt);
            }
        });
        getContentPane().add(SelectRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 164, 140, -1));

        Register.setText("Register ");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 204, 126, -1));

        viewusers.setText("View Users");
        viewusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewusersActionPerformed(evt);
            }
        });
        getContentPane().add(viewusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 258, 234, -1));

        jTableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableUsers);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 287, 688, 184));

        deleteuser.setText("Delete Users");
        deleteuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteuserActionPerformed(evt);
            }
        });
        getContentPane().add(deleteuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 258, 141, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Top-Up Credit");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 60, 130, 26));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amount   :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 147, 71, -1));

        usernametopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametopupActionPerformed(evt);
            }
        });
        getContentPane().add(usernametopup, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 104, 140, -1));

        amounttopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amounttopupActionPerformed(evt);
            }
        });
        getContentPane().add(amounttopup, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 144, 140, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 104, 71, -1));

        topupcredit.setText("Top-Up Credit");
        topupcredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topupcreditActionPerformed(evt);
            }
        });
        getContentPane().add(topupcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 192, 120, -1));

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name ", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(transactionTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 524, 688, 217));

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1282, 13, 83, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Genetate Receipt");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 258, 130, -1));

        generateTransactionReceipt.setText("Generate Receipt");
        generateTransactionReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateTransactionReceiptActionPerformed(evt);
            }
        });
        getContentPane().add(generateTransactionReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 372, 160, -1));
        getContentPane().add(receiptUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 292, 163, -1));
        getContentPane().add(receiptAmountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 332, 163, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Username :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 295, 71, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Amount   :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 335, 71, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Update User Data ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 435, 140, -1));
        jLabel12.getAccessibleContext().setAccessibleName("Update User Data");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("New Username : ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 466, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("New Password : ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 497, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("New Role : ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 531, -1, -1));

        updateUserInformation.setText("Update user");
        updateUserInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserInformationActionPerformed(evt);
            }
        });
        getContentPane().add(updateUserInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 740, 151, -1));
        getContentPane().add(updateUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(991, 463, 143, -1));
        getContentPane().add(updatePasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(988, 494, 140, -1));

        updateRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select Role---", "Customer ", "Vendors", "Runners" }));
        getContentPane().add(updateRoleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(988, 528, 114, -1));

        userselectiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(userselectiontable);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 568, -1, 146));

        alluser.setText("All User");
        alluser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alluserActionPerformed(evt);
            }
        });
        getContentPane().add(alluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 740, 127, -1));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1215, 740, 101, -1));

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 204, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel16.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ADMIN DASHBOARD");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password : ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username : ");

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register User ");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("View Users");

        viewtransaction.setText("View Transactions");
        viewtransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtransactionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TransactionS Details ");

        BackToHome.setBackground(new java.awt.Color(255, 0, 0));
        BackToHome.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        BackToHome.setForeground(new java.awt.Color(255, 255, 255));
        BackToHome.setText("Dashboard");
        BackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BackToHome)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(76, 76, 76)
                                .addComponent(viewtransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))))
                .addContainerGap(601, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackToHome))
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(118, 118, 118)
                .addComponent(jLabel4)
                .addGap(210, 210, 210)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewtransaction)
                    .addComponent(jLabel8))
                .addContainerGap(518, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 1030));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectRoleActionPerformed
//Register action perfermed 
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
    String username = jTextField1.getText().trim();
    String password = new String(jPasswordField1.getPassword()).trim();
    String role = (String) SelectRole.getSelectedItem();

    // Validate username and password are not empty
    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username and Password cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate password format
    if (!isValidPassword(password)) {
        JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long and include:\n• One uppercase letter\n• One lowercase letter\n• One number", 
                                      "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate role selection
    if (role == null || role.equals("---Select Role---")) {
        JOptionPane.showMessageDialog(this, "Please select a valid role.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Assign the correct file path
    String fileName = switch (role) {
        case "Customer" -> "src/Login/customers.txt";
        case "Vendors" -> "src/Login/vendors.txt";
        case "Runners" -> "src/Login/runners.txt";
        default -> "";
    };

    if (fileName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Invalid role selected!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Save user details
    try (FileWriter writer = new FileWriter(fileName, true)) { 
        writer.write("Username: " + username + "\n");
        writer.write("Password: " + password + "\n"); // Note: Consider hashing the password for security
        writer.write("Role: " + role + "\n");
        writer.write("--------------------------\n");

        JOptionPane.showMessageDialog(this, "User Registered Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Clear fields
        jTextField1.setText("");
        jPasswordField1.setText("");
        SelectRole.setSelectedIndex(0);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving user: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_RegisterActionPerformed
//View users
    private void viewusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewusersActionPerformed
 String[] columns = {"Username", "Password", "Role"};
    DefaultTableModel model = new DefaultTableModel(columns, 0);
    
    readDataFromFile("src/Login/vendors.txt", model); 
    readDataFromFile("src/Login/customers.txt", model); 
    readDataFromFile("src/Login/runners.txt", model);
    
    // Set the model for the JTable
    jTableUsers.setModel(model);
    }//GEN-LAST:event_viewusersActionPerformed
//Delete users
    private void deleteuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteuserActionPerformed
        
    int selectedRow = jTableUsers.getSelectedRow();

   
    if (selectedRow >= 0) {
        
        String username = (String) jTableUsers.getValueAt(selectedRow, 0);

        
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete user: " + username + "?", 
            "Delete User", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
           
            boolean deleted = deleteUserFromFile(username);
            
            if (deleted) {
              
                javax.swing.JOptionPane.showMessageDialog(this, "User deleted successfully!");
                
               
                DefaultTableModel model = (DefaultTableModel) jTableUsers.getModel();
                model.removeRow(selectedRow);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "User not found or error deleting.");
            }
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a user to delete.");
    }
    }//GEN-LAST:event_deleteuserActionPerformed
//topup credit 
    private void topupcreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topupcreditActionPerformed
         String username = usernametopup.getText().trim();
    String amountStr = amounttopup.getText().trim();

    // Check if fields are empty
    if (username.isEmpty() || amountStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter username and amount!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double topUpAmount = Double.parseDouble(amountStr);

        // Ensure the amount is positive
        if (topUpAmount <= 0) {
            JOptionPane.showMessageDialog(this, "Enter a valid positive amount!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        List<String> lines = new ArrayList<>();
        boolean userExists = false;

        // Read the transactions file
        try (BufferedReader br = new BufferedReader(new FileReader("src/Transactions/transactions.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split("\\|");
                if (details[0].equals(username)) {
                    double newBalance = Double.parseDouble(details[1]) + topUpAmount;
                    lines.add(details[0] + "|" + newBalance);
                    userExists = true;
                } else {
                    lines.add(line);
                }
            }
        }

        
        if (!userExists) {
            lines.add(username + "|" + topUpAmount);
        }

       
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/Transactions/transactions.txt"))) {
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
        }

        JOptionPane.showMessageDialog(this, "Top-Up Successful! New balance updated.", "Success", JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid amount! Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error updating file!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_topupcreditActionPerformed

    private void usernametopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametopupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametopupActionPerformed

    private void amounttopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amounttopupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amounttopupActionPerformed
//View transactions
    private void viewtransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtransactionActionPerformed
    DefaultTableModel model = (DefaultTableModel) transactionTable.getModel();
    model.setRowCount(0);

    try (BufferedReader br = new BufferedReader(new FileReader("src/Transactions/transactions.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] details = line.split("\\|");
            if (details.length == 2) {
                model.addRow(new Object[]{details[0], details[1]}); 
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading transactions file!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_viewtransactionActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
         Login login = new Login(); 
    login.setVisible(true);  
    this.dispose();
    }//GEN-LAST:event_logoutActionPerformed
//Generate Receipt and save it in text file
    private void generateTransactionReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateTransactionReceiptActionPerformed

   // Get the values from the text fields
    String username = receiptUsernameField.getText(); // Get username from the text field
    String amountStr = receiptAmountField.getText(); // Get amount from the text field

    // Call the method to generate the receipt
    generateTransactionReceipt(username, amountStr);
    }//GEN-LAST:event_generateTransactionReceiptActionPerformed
//Gives thhe selected username
    private String getCurrentSelectedUsername() {
     int selectedRow = userselectiontable.getSelectedRow();
    System.out.println("Selected Row Index: " + selectedRow); // Debugging line
    if (selectedRow >= 0) {
        String selectedUsername = (String) userselectiontable.getValueAt(selectedRow, 0);
        System.out.println("Selected Username: " + selectedUsername); // Debugging line
        return selectedUsername;
    } else {
        return null; // No row selected
    }
    }
    
    
    //Updating user information 
    private void updateUserInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserInformationActionPerformed
  String newUsername = updateUsernameField.getText();
    String newPassword = updatePasswordField.getText();
    String newRole = (String) updateRoleComboBox.getSelectedItem();

    if (newRole == null || newRole.equals("---Select Role---")) {
        JOptionPane.showMessageDialog(this, "Please select a valid role.");
        return;
    }

    // Get the current username of the selected user
    String currentUsername = getCurrentSelectedUsername();
    System.out.println("Current Username: " + currentUsername); // Debugging line

    if (currentUsername == null) {
        JOptionPane.showMessageDialog(this, "Please select a user to update.");
        return;
    }

    // Trim and normalize the case for comparison
    currentUsername = currentUsername.trim().toLowerCase();
    newUsername = newUsername.trim(); // Also trim the new username input
    String[] files = {"src/Login/customers.txt", "src/Login/vendors.txt", "src/Login/runners.txt"};
    boolean userUpdated = false;

    for (String fileName : files) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                StringBuilder content = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        // Normalize case and trim the username for comparison
                        if (line.startsWith("Username: ")) {
                            String fileUsername = line.substring(10).trim().toLowerCase(); // Extract username from file and normalize it
                             System.out.println("File Username: " + fileUsername);
                              
                            if (fileUsername.equals(currentUsername)) {
                                // Update the user information
                                content.append("Username: ").append(newUsername).append("\n");
                                content.append("Password: ").append(newPassword).append("\n");
                                content.append("Role: ").append(newRole).append("\n");
                                content.append("--------------------------\n");
                                userUpdated = true;

                                // Skip the next 2 lines for password and role
                                reader.readLine();
                                reader.readLine();
                            } else {
                                // Append the unchanged user information
                                content.append(line).append("\n");
                            }
                        } else {
                            // Append lines that are not related to the username
                            content.append(line).append("\n");
                        }
                    }
                }

                // Write the updated content back to the file
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(content.toString());
                }
                break; // Exit after updating the user in one of the files
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error updating user: " + e.getMessage());
        }
    }

    // Show message based on update success
    if (userUpdated) {
        JOptionPane.showMessageDialog(this, "User information updated successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "User not found.");
    }
    }//GEN-LAST:event_updateUserInformationActionPerformed
//Shows all users in table
    private void alluserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alluserActionPerformed
    DefaultTableModel model = (DefaultTableModel) userselectiontable.getModel();
    model.setRowCount(0); 

   
    readDataFromFile("src/Login/customers.txt", model); 
    readDataFromFile("src/Login/vendors.txt", model);   
    readDataFromFile("src/Login/runners.txt", model);  
    }//GEN-LAST:event_alluserActionPerformed

    //Reads the data from file 
    private void readDataFromFile(String fileName, DefaultTableModel model) {
     try {
         try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
             String line;
             String username = "";
             String password = "";
             String role = "";
             
             while ((line = br.readLine()) != null) {
                 if (line.startsWith("Username:")) {
                     username = line.substring(10).trim();
                 } else if (line.startsWith("Password:")) {
                     password = line.substring(10).trim();
                 } else if (line.startsWith("Role:")) {
                     role = line.substring(5).trim();
                 }
                 if (!username.isEmpty() && !password.isEmpty() && !role.isEmpty()) {
                     model.addRow(new Object[]{username, password, role});
                     username = password = role = "";
                 }
             }}
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
    }
}
    //deleting the users in table and shows iin table
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      int selectedRow = userselectiontable.getSelectedRow(); 

    if (selectedRow >= 0) {
        String username = (String) userselectiontable.getValueAt(selectedRow, 0); 

        int confirm = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete user: " + username + "?", 
            "Delete User", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            boolean deleted = deleteUserFromFile(username); 
            if (deleted) {
                JOptionPane.showMessageDialog(this, "User  deleted successfully!");
                ((DefaultTableModel) userselectiontable.getModel()).removeRow(selectedRow); 
            } else {
                JOptionPane.showMessageDialog(this, "User  not found or error deleting.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a user to delete.");
    }
    }//GEN-LAST:event_deleteActionPerformed

 
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
          // Get the password from the field
    String enteredPassword = new String(jPasswordField1.getPassword()).trim(); // Convert char array to String

    // Validate password format
    if (!isValidPassword(enteredPassword)) {
        JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long and include:\n• One uppercase letter\n• One lowercase letter\n• One number", 
                                      "Password Format Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        Login login = new Login(); 
    login.setVisible(true); 
    this.dispose();
    }//GEN-LAST:event_LoginActionPerformed

    private void BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToHomeActionPerformed
        this.setVisible(false);  // Hides the current page
String userRole = "Admin"; 
    // Show the Main UI (Home Page)
    MainUI mainUI = new MainUI(userRole);  // Assuming MainUI is the class for your main home screen
    mainUI.setVisible(true); 
     mainUI.showRoleBasedContent(); 
    }//GEN-LAST:event_BackToHomeActionPerformed
//delete user in file deletes the user from file
    private boolean deleteUserFromFile(String username) {
    String[] files = {"src/Login/customers.txt", "src/Login/vendors.txt", "src/Login/runners.txt"}; 
    boolean userDeleted = false;

    // Iterate through each file
    for (String fileName : files) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                StringBuilder content = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    boolean isUserFound = false;

                    while ((line = reader.readLine()) != null) {
                        // Check if the line contains the username to delete
                        if (line.startsWith("Username: " + username)) {
                            isUserFound = true;

                            // Skip the next 3 lines associated with this user
                            reader.readLine(); // Skip password line
                            reader.readLine(); // Skip email or other line
                            reader.readLine(); // Skip any other associated info
                        } else {
                            // Add the non-deleted user data to content
                            content.append(line).append("\n");
                        }
                    }

                    // If user was found and deleted
                    if (isUserFound) {
                        // Write the updated content back to the file
                        try (FileWriter writer = new FileWriter(file)) {
                            writer.write(content.toString());
                        }
                        userDeleted = true;
                        break;  // Exit after deleting the user
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error deleting user: " + e.getMessage());
        }
    }

    return userDeleted;
}
//Generates the trsanction receipt
    private void generateTransactionReceipt(String username, String amountStr) {
  
    if (username.isEmpty() || amountStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both username and amount.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double amount;
    try {
        amount = Double.parseDouble(amountStr); 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid amount! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

   
    String receipt = "Transaction Receipt\n";
    receipt += "---------------------\n";
    receipt += "Username: " + username + "\n";
    receipt += "Amount: " + amount + "\n";
    receipt += "Date: " + java.time.LocalDate.now() + "\n";
    receipt += "Thank you for your transaction!\n";

   
    JOptionPane.showMessageDialog(this, receipt, "Transaction Receipt", JOptionPane.INFORMATION_MESSAGE);

    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Receipt/receipts.txt", true))) {
        writer.write(receipt);
        writer.newLine();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving receipt: " + e.getMessage());
    }
}
    
  

    
    
   


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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToHome;
    private javax.swing.JButton Login;
    private javax.swing.JButton Register;
    private javax.swing.JComboBox<String> SelectRole;
    private javax.swing.JButton alluser;
    private javax.swing.JTextField amounttopup;
    private javax.swing.JButton delete;
    private javax.swing.JButton deleteuser;
    private javax.swing.JButton generateTransactionReceipt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableUsers;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField receiptAmountField;
    private javax.swing.JTextField receiptUsernameField;
    private javax.swing.JToggleButton topupcredit;
    private javax.swing.JTable transactionTable;
    private javax.swing.JPasswordField updatePasswordField;
    private javax.swing.JComboBox<String> updateRoleComboBox;
    private javax.swing.JButton updateUserInformation;
    private javax.swing.JTextField updateUsernameField;
    private javax.swing.JTextField usernametopup;
    private javax.swing.JTable userselectiontable;
    private javax.swing.JButton viewtransaction;
    private javax.swing.JButton viewusers;
    // End of variables declaration//GEN-END:variables
}
