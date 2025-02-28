/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.ApuCafetriaFood.ordering.system;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author kiran
 */
public class Login extends javax.swing.JFrame {


    public Login() {
        setTitle("Login");
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default closing behavior
         // Add window listener to confirm exit
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Show confirmation dialog when trying to close the window
                int response;
                response = JOptionPane.showConfirmDialog(Login.this, 
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

  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        selectrole = new javax.swing.JComboBox<>();
        registerbutton = new javax.swing.JButton();
        loginbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BackToHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Create  New  Account");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 130, -1));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 130, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 90, -1));

        selectrole.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        selectrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select Role---", "Admin", "Customer", "Vendors", "Runners" }));
        selectrole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectroleActionPerformed(evt);
            }
        });
        jPanel1.add(selectrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 130, -1));

        registerbutton.setBackground(new java.awt.Color(255, 0, 0));
        registerbutton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        registerbutton.setForeground(new java.awt.Color(255, 255, 255));
        registerbutton.setText("Register");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 282, -1, 30));

        loginbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("If You doesnot have account yet? ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        BackToHome.setBackground(new java.awt.Color(255, 51, 51));
        BackToHome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackToHome.setForeground(new java.awt.Color(255, 255, 255));
        BackToHome.setText("Dashboard");
        BackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToHomeActionPerformed(evt);
            }
        });
        jPanel1.add(BackToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Login Button action performed
    private int loginAttempts = 0;

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
  String selectedRole = (String) selectrole.getSelectedItem();
    String username = jTextField1.getText();
    String password = new String(jPasswordField1.getPassword());

    if (selectedRole.equals("---Select Role---")) {
        JOptionPane.showMessageDialog(this, "Please select a role!");
        return;
    }

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username and password cannot be empty!");
        return;
    }

    String fileName = "";

    switch (selectedRole) {
        case "Admin" -> fileName = "admin.txt";
        case "Customer" -> fileName = "customers.txt";
        case "Vendors" -> fileName = "vendors.txt";
        case "Runners" -> fileName = "runners.txt";
    }

    if (checkCredentials(fileName, username, password)) {
        JOptionPane.showMessageDialog(this, "Login Successful!");

        // Pass the role to MainUI
        new MainUI(selectedRole).setVisible(true);
        this.dispose(); // Close the login window
    } else {
        loginAttempts++;
        JOptionPane.showMessageDialog(this, "Invalid Username or Password!");

        // Check if the number of attempts has reached 3
        if (loginAttempts >= 3) {
            JOptionPane.showMessageDialog(this, "3 incorrect attempts. Please try again in 30 seconds.");

            // Disable the login button for 30 seconds
            loginbutton.setEnabled(false);

            // Start a new thread to wait for 30 seconds
            new Thread(() -> {
                try {
                    Thread.sleep(30000); // Wait for 30 seconds
                } catch (InterruptedException e) {
                }

                // After 30 seconds, re-enable the login button
                SwingUtilities.invokeLater(() -> loginbutton.setEnabled(true));
            }).start();
        }
    }

    }//GEN-LAST:event_loginbuttonActionPerformed
    //checking credentials
    private boolean checkCredentials(String fileName, String username, String password) {
    String filePath = "src/Login/" + fileName;
File file = new File(filePath);
    
    if (!file.exists()) {
        JOptionPane.showMessageDialog(this, "Error: " + filePath + " not found!");
        return false;
    }

     try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        String fileUsername = "", filePassword = "", fileRole = "";
        
        while ((line = br.readLine()) != null) {
            if (line.startsWith("Username:")) {
                fileUsername = line.substring(10).trim(); 
            } else if (line.startsWith("Password:")) {
                filePassword = line.substring(10).trim(); 
            } else if (line.startsWith("Role:")) {
                fileRole = line.substring(6).trim(); 
            }
        }
        
        // After reading the file, check if the credentials match
        if (fileUsername.equals(username) && filePassword.equals(password)) {
            return true; // Match found
        }
        
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading file: " + filePath);
    }
    return false; // No match found
}
    
    //When clicked in the registerbutton 
    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        JOptionPane.showMessageDialog(this, "You need to be an admin to register users, First Login Admin !", "Admin Access Required", JOptionPane.INFORMATION_MESSAGE);
        Login login = new Login();
    login.setVisible(true);

    // Close current page if needed
    this.dispose();

    }//GEN-LAST:event_registerbuttonActionPerformed
    
    
    
    
    private void selectroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectroleActionPerformed
       
    }//GEN-LAST:event_selectroleActionPerformed

    private void BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToHomeActionPerformed
      this.setVisible(false);  // Hides the current page

    // Show the Main UI (Home Page)
    MainUI mainUI = new MainUI();  // Assuming MainUI is the class for your main home screen
    mainUI.setVisible(true); 
    }//GEN-LAST:event_BackToHomeActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JButton registerbutton;
    private javax.swing.JComboBox<String> selectrole;
    // End of variables declaration//GEN-END:variables

    void setLoginMessage(String admin_Login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
