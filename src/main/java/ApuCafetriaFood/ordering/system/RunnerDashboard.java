/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.ApuCafetriaFood.ordering.system;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kiran
 */
public class RunnerDashboard extends javax.swing.JFrame {

    /**
     * Creates new form RunnerDashboard
     */
    public RunnerDashboard() {
        setTitle("Runner Dashboard");
        initComponents();
        
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default closing behavior
         // Add window listener to confirm exit
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Show confirmation dialog when trying to close the window
                int response;
                response = JOptionPane.showConfirmDialog(RunnerDashboard.this, 
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
    
      private double calculateTotalRevenue() {
    double totalRevenue = 0.0;

    try (BufferedReader br = new BufferedReader(new FileReader("src/CustomerTextFiles/orders.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] details = line.split(","); 
            if (details.length == 5) {
                String status = details[4].trim();
                double amount = Double.parseDouble(details[3].trim()); 
                if (status.equalsIgnoreCase("Paid") || status.equalsIgnoreCase("Delivered")) {
                    totalRevenue += amount;
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading orders file!", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error parsing order amount!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    return totalRevenue;
}
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        completedtaskTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reviewTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BackToHome = new javax.swing.JButton();
        updatetask = new javax.swing.JButton();
        viewtask = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        viewrevuew = new javax.swing.JButton();
        calculaterevenu = new javax.swing.JButton();
        viewcompleted = new javax.swing.JButton();
        btnCheckRunnerNotifications = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRunnersNotification = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delivery Tasks");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 71, 110, -1));

        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer Name", "Item", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(taskTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 115, 773, 216));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Completed Tasks");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 354, 170, -1));

        completedtaskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer Name", "Item", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(completedtaskTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 380, 773, 173));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LogOut");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("View Feedback");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 71, 110, -1));

        reviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Item Name", "Give Feedback ", "Rating from 1 to 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(reviewTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 115, -1, 216));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calculate Revenue");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 351, 160, 23));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        BackToHome.setBackground(new java.awt.Color(255, 0, 51));
        BackToHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackToHome.setForeground(new java.awt.Color(255, 255, 255));
        BackToHome.setText("Dashboard");
        BackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToHomeActionPerformed(evt);
            }
        });

        updatetask.setText("Update Task");
        updatetask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatetaskActionPerformed(evt);
            }
        });

        viewtask.setText("View Task");
        viewtask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtaskActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("RUNNER DASHBOARD");

        viewrevuew.setText("View Feedback");
        viewrevuew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewrevuewActionPerformed(evt);
            }
        });

        calculaterevenu.setText("Calculate Revenue");
        calculaterevenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculaterevenuActionPerformed(evt);
            }
        });

        viewcompleted.setText("View Completed");
        viewcompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcompletedActionPerformed(evt);
            }
        });

        btnCheckRunnerNotifications.setText("CheckNotification");
        btnCheckRunnerNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckRunnerNotificationsActionPerformed(evt);
            }
        });

        txtRunnersNotification.setColumns(20);
        txtRunnersNotification.setRows(5);
        jScrollPane4.setViewportView(txtRunnersNotification);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(viewtask, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatetask))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewcompleted)
                            .addComponent(BackToHome))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(638, 638, 638))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(viewrevuew)
                        .addGap(283, 283, 283))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckRunnerNotifications)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(calculaterevenu)))
                .addGap(254, 254, 254))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(BackToHome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel16)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewtask)
                        .addComponent(updatetask))
                    .addComponent(viewrevuew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(calculaterevenu)
                .addGap(43, 43, 43)
                .addComponent(btnCheckRunnerNotifications)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(viewcompleted)
                .addGap(61, 61, 61))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1420, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//view task for the runners 
    private void viewtaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtaskActionPerformed
    String sourceFile = "src/CustomerTextFiles/orders.txt";
        String assignedFile = "src/RunnersTextFiles/assigned_tasks.txt";
        String completedFile = "src/RunnersTextFiles/completed_tasks.txt";

        // Process orders and categorize them
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             // Overwrite assignedTasks (tasks pending) file
             BufferedWriter assignedWriter = new BufferedWriter(new FileWriter(assignedFile));
             // Append to completedTasks file so that history is maintained
             BufferedWriter completedWriter = new BufferedWriter(new FileWriter(completedFile, true))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                // Expecting orders.txt to have at least 5 fields: 
                // [customerName, item, ..., amount, status]
                if (data.length >= 5) {
                    String customerName = data[0].trim();
                    String item = data[1].trim();
                    String status = data[4].trim();
                    // Prepare a 3-field line for runners’ tasks
                    String taskLine = customerName + "," + item + "," + status;
                    if (status.equalsIgnoreCase("Delivered")) {
                        completedWriter.write(taskLine);
                        completedWriter.newLine();
                    } else {
                        assignedWriter.write(taskLine);
                        assignedWriter.newLine();
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error processing file!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Load assigned tasks into the table
        DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
        model.setRowCount(0); // Clear table before loading

        try (BufferedReader br = new BufferedReader(new FileReader("src/RunnersTextFiles/assigned_tasks.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    model.addRow(new Object[]{data[0].trim(), data[1].trim(), data[2].trim()});
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading tasks!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_viewtaskActionPerformed
//update the task like if the orders has been tpending in-transit or delivererd
    private void updatetaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatetaskActionPerformed
      int selectedRow = taskTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select a task to update!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get customer name and current status from the selected row
        String customerName = taskTable.getValueAt(selectedRow, 0).toString();
        String currentStatus = taskTable.getValueAt(selectedRow, 2).toString();

        // Status options
        String[] statuses = {"Pending", "In-Transit", "Delivered"};
        String newStatus = (String) JOptionPane.showInputDialog(this, "Update Status:", "Change Status",
                JOptionPane.QUESTION_MESSAGE, null, statuses, currentStatus);

        if (newStatus != null && !newStatus.equals(currentStatus)) {
            if (newStatus.equals("Delivered")) {
                // Remove row from table if delivered
                ((DefaultTableModel) taskTable.getModel()).removeRow(selectedRow);
            } else {
                // Update table status for other states
                taskTable.setValueAt(newStatus, selectedRow, 2);
            }
            // Update the tasks file(s)
            updateTaskStatus(customerName, newStatus);
        }
    }//GEN-LAST:event_updatetaskActionPerformed
//updating the above task to be in the file this method shows the updated task in the file
    private void updateTaskStatus(String customerName, String newStatus) {
      String assignedFile = "src/RunnersTextFiles/assigned_tasks.txt";
        String completedFile = "src/RunnersTextFiles/completed_tasks.txt";
        List<String> assignedTasks = new ArrayList<>();
        boolean taskUpdated = false;

        try (BufferedReader br = new BufferedReader(new FileReader(assignedFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3 && data[0].trim().equals(customerName)) {
                    data[2] = newStatus; 
                    taskUpdated = true; 
                    if (newStatus.equals("Delivered")) {
                        // Append delivered task to completed_tasks.txt
                        try (BufferedWriter completedWriter = new BufferedWriter(new FileWriter(completedFile, true))) {
                            completedWriter.write(String.join(",", data));
                            completedWriter.newLine();
                        }
                        // Skip adding it back to assignedTasks
                        continue;
                    }
                }
                assignedTasks.add(String.join(",", data));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error updating task!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Rewrite updated assigned_tasks.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(assignedFile))) {
            for (String task : assignedTasks) {
                bw.write(task);
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving updated task!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Notify user
        if (taskUpdated) {
            JOptionPane.showMessageDialog(this, "Task status updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No task found to update!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
}
    //this shows whether the task is completed or not in the table it stores in the file if the task is completed
    private void viewcompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcompletedActionPerformed
          DefaultTableModel model = (DefaultTableModel) completedtaskTable.getModel();
        model.setRowCount(0); // Clear table before loading

        try (BufferedReader br = new BufferedReader(new FileReader("src/RunnersTextFiles/completed_tasks.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    model.addRow(new Object[]{data[0].trim(), data[1].trim(), data[2].trim()});
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading completed tasks!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewcompletedActionPerformed

    
    //checking the review
    private void viewrevuewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewrevuewActionPerformed
    DefaultTableModel model = (DefaultTableModel) reviewTable.getModel();
        model.setRowCount(0); // Clear existing rows before loading new data

        try (BufferedReader br = new BufferedReader(new FileReader("src/CustomerTextFiles/reviews.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); 
                if (data.length == 4) { 
                    String customerName = data[0].trim(); 
                    String itemName = data[1].trim();
                    String reviewText = data[2].trim();
                    String reviewNumber = data[3].trim(); 
                    model.addRow(new Object[]{customerName, itemName, reviewText, reviewNumber});
                } else {
                    System.out.println("Invalid review format: " + line); 
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading customer reviews!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewrevuewActionPerformed

    
    //calucalte the total revenue as the ruuner and show in the popup
    private void calculaterevenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaterevenuActionPerformed
                                                  
   double totalRevenue = calculateTotalRevenue();
        JOptionPane.showMessageDialog(this, "Total Revenue: $" + String.format("%.2f", totalRevenue), 
                "Revenue Summary", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_calculaterevenuActionPerformed

    private void BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToHomeActionPerformed
         this.setVisible(false);  // Hides the current page
String userRole = "Runners"; 
    // Show the Main UI (Home Page)
    MainUI mainUI = new MainUI(userRole);  // Assuming MainUI is the class for your main home screen
    mainUI.setVisible(true); 
     mainUI.showRoleBasedContent(); 
    }//GEN-LAST:event_BackToHomeActionPerformed

    private void btnCheckRunnerNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckRunnerNotificationsActionPerformed
        try {
        String line;
        StringBuilder pendingTasks;
        boolean hasPendingTasks;

        // Read the notifications from the runner_notifications.txt file
        try (BufferedReader brAssigned = new BufferedReader(new FileReader("src/NotificationFiles/runner_notifications.txt"))) {
            pendingTasks = new StringBuilder(); // To collect all pending tasks
            hasPendingTasks = false; // Flag to track if any pending tasks exist

            // Process each line in runner_notifications.txt
            while ((line = brAssigned.readLine()) != null) {
                // Debugging: Print the raw line
                System.out.println("Line read: " + line);

                // Check if the line contains "New Delivery Assigned"
                if (line.contains("New Delivery Assigned")) {
                    // Extract the details from the line using regular expressions
                    String[] parts = line.split("ordered");

                    if (parts.length == 2) {
                        String name = parts[0].replace("New Delivery Assigned:", "").trim();
                        String[] itemAndQty = parts[1].split("\\(Qty:");

                        if (itemAndQty.length == 2) {
                            String item = itemAndQty[0].trim();
                            String qty = itemAndQty[1].replace(")", "").trim();

                            // Format the string for each task
                            if (hasPendingTasks) {
                                pendingTasks.append("\n");  // Add a line break between multiple tasks
                            }

                            pendingTasks.append("New Delivery Assigned: ").append(name)
                                         .append(" ordered ").append(item)
                                         .append(" (Qty: ").append(qty).append(")");

                            hasPendingTasks = true;  // Mark as found at least one pending task
                        }
                    }
                }
            }
        }

        // If there are no pending tasks, display a message in the text field
        if (!hasPendingTasks) {
            txtRunnersNotification.setText("No new tasks found.");
        } else {
            // If there are pending tasks, display them in the text field
            txtRunnersNotification.setText("Pending Tasks:\n" + pendingTasks.toString());
        }
    } catch (IOException ex) {
        // Handle error in case of file reading issues
        txtRunnersNotification.setText("Error reading files.");
    }
    }//GEN-LAST:event_btnCheckRunnerNotificationsActionPerformed
    
    
    
    //updateing the task in assigned_taskfile whreheret the task is been updated or not 
    private void updateTaskFile(String orderId, String newStatus) {
    List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/RunnersTextFiles/assigned_tasks.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].trim().equals(orderId)) {
                    data[2] = newStatus; 
                }
                lines.add(String.join(",", data));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error updating task!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/RunnersTextFiles/assigned_tasks.txt"))) {
            for (String updatedLine : lines) {
                bw.write(updatedLine);
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving updated task!", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(RunnerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RunnerDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToHome;
    private javax.swing.JButton btnCheckRunnerNotifications;
    private javax.swing.JButton calculaterevenu;
    private javax.swing.JTable completedtaskTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable reviewTable;
    private javax.swing.JTable taskTable;
    private javax.swing.JTextArea txtRunnersNotification;
    private javax.swing.JButton updatetask;
    private javax.swing.JButton viewcompleted;
    private javax.swing.JButton viewrevuew;
    private javax.swing.JButton viewtask;
    // End of variables declaration//GEN-END:variables
}
