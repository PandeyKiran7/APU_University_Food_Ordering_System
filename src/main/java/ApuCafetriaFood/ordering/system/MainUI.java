/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.ApuCafetriaFood.ordering.system;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author kiran
 */
public class MainUI extends javax.swing.JFrame {

    private final String userRole;

    /**
     * Creates new form MainUI
     * @param role
     */
    public MainUI(String role) {
        this.userRole = role;
        initComponents();
        showRoleBasedContent();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default closing behavior
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int response = JOptionPane.showConfirmDialog(MainUI.this, 
                    "Do you really want to leave this site?", 
                    "Exit Confirmation", 
                    JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0); // Close the application if 'Yes'
                }
            }
        });

    }

    MainUI() {
        this ("Guest");
    }

     public void showRoleBasedContent() {
           if (null == userRole) {
               // If any other role (Admin, Vendor, Runner), enable all dashboards
               AdminDashboard.setEnabled(true);
               VendorDashboard.setEnabled(true);
               Customerdashboard.setEnabled(true);  // Customer can access their dashboard
               RunnerDashboard.setEnabled(true);
           } else switch (userRole) {
            case "Guest" -> {
                // If user is a guest, disable all dashboards
                AdminDashboard.setEnabled(false);
                VendorDashboard.setEnabled(false);
                Customerdashboard.setEnabled(false); // Disable Customer Dashboard
                RunnerDashboard.setEnabled(false);
               }
            case "Customer" -> {
                // If user is a Customer, allow only Customer Dashboard
                AdminDashboard.setEnabled(false);
                VendorDashboard.setEnabled(false);
                Customerdashboard.setEnabled(true); // Enable Customer Dashboard for Customer
                RunnerDashboard.setEnabled(false);
               }
            default -> {
                // If any other role (Admin, Vendor, Runner), enable all dashboards
                AdminDashboard.setEnabled(true);
                VendorDashboard.setEnabled(true);
                Customerdashboard.setEnabled(true);  // Customer can access their dashboard
                RunnerDashboard.setEnabled(true);
               }
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AdminDashboard = new javax.swing.JButton();
        VendorDashboard = new javax.swing.JButton();
        Customerdashboard = new javax.swing.JButton();
        RunnerDashboard = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KIAASHAR CAFE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        AdminDashboard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AdminDashboard.setText("ADMIN DASHBOARD");
        AdminDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminDashboardActionPerformed(evt);
            }
        });
        jPanel1.add(AdminDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 344, 252, 45));

        VendorDashboard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        VendorDashboard.setText("VENDOR DASHBOARD");
        VendorDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorDashboardActionPerformed(evt);
            }
        });
        jPanel1.add(VendorDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, 45));

        Customerdashboard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Customerdashboard.setText("CUSTOMER DASHBOARD");
        Customerdashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerdashboardActionPerformed(evt);
            }
        });
        jPanel1.add(Customerdashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 466, -1, 44));

        RunnerDashboard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RunnerDashboard.setText("RUNNER DASHBOARD");
        RunnerDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunnerDashboardActionPerformed(evt);
            }
        });
        jPanel1.add(RunnerDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, 48));

        Login.setBackground(new java.awt.Color(0, 204, 255));
        Login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login/Register");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 221, -1, 45));

        Logout.setBackground(new java.awt.Color(255, 0, 0));
        Logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 221, 126, 45));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/ApuCafetriaFood/ordering/system/banner.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 410, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminDashboardActionPerformed
      if ("Guest".equals(userRole)) {
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to log in?", "Login Required", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            Login loginPage = new Login();
            loginPage.setVisible(true);
            this.setVisible(false);
        }
    } else if (!"Customer".equals(userRole)) {  // Prevent Customer from accessing Admin
        AdminDashboard adminUI = new AdminDashboard();
        adminUI.setVisible(true); 
        this.setVisible(false);
    } else {
        JOptionPane.showMessageDialog(this, "You do not have permission to access this dashboard.", "Access Denied", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_AdminDashboardActionPerformed

    private void RunnerDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunnerDashboardActionPerformed
         if ("Guest".equals(userRole)) {
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to log in?", "Login Required", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            Login loginPage = new Login();
            loginPage.setVisible(true);
            this.setVisible(false);
        }
    } else if (!"Customer".equals(userRole)) {  // Prevent Customer from accessing Runner
        RunnerDashboard runnerUI = new RunnerDashboard();
        runnerUI.setVisible(true);
        this.setVisible(false);
    } else {
        JOptionPane.showMessageDialog(this, "You do not have permission to access this dashboard.", "Access Denied", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_RunnerDashboardActionPerformed

    private void CustomerdashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerdashboardActionPerformed
       if ("Guest".equals(userRole)) {
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to log in?", "Login Required", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            Login loginPage = new Login();
            loginPage.setVisible(true);
            this.setVisible(false);
        }
    } else {
        // Allow access to the Customer Dashboard for Customer role
        CustomerDashboard customerUI = new CustomerDashboard();
        customerUI.setVisible(true);
        this.setVisible(false);
    }

    }//GEN-LAST:event_CustomerdashboardActionPerformed

    private void VendorDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorDashboardActionPerformed
         if ("Guest".equals(userRole)) {
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to log in?", "Login Required", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            Login loginPage = new Login();
            loginPage.setVisible(true);
            this.setVisible(false);
        }
    } else if (!"Customer".equals(userRole)) {  // Prevent Customer from accessing Vendor
        VendorDashboard vendorUI = new VendorDashboard();
        vendorUI.setVisible(true);
        this.setVisible(false);
    } else {
        JOptionPane.showMessageDialog(this, "You do not have permission to access this dashboard.", "Access Denied", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_VendorDashboardActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        JOptionPane.showMessageDialog(this, "If you are not yet registered, please Register first.", "Registration Info", JOptionPane.INFORMATION_MESSAGE);

    // Open the login page
    Login loginPage = new Login();
    loginPage.setVisible(true); 
    this.setVisible(false);
    }//GEN-LAST:event_LoginActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
         int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
    
    if (response == JOptionPane.YES_OPTION) {
        // If the user clicks "Yes", exit the application
        System.exit(0); // This will close the program
    }
    }//GEN-LAST:event_LogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
                    String selectedRole = "Guest";
            new MainUI(selectedRole).setVisible(true);
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminDashboard;
    private javax.swing.JButton Customerdashboard;
    private javax.swing.JButton Login;
    private javax.swing.JButton Logout;
    private javax.swing.JButton RunnerDashboard;
    private javax.swing.JButton VendorDashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
