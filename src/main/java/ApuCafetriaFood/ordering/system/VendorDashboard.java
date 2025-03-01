/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.ApuCafetriaFood.ordering.system;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kiran
 */
public class VendorDashboard extends javax.swing.JFrame {

   
    public VendorDashboard() {
        setTitle("Vendor Dashboard");
        initComponents();
        
          setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default closing behavior
         // Add window listener to confirm exit
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Show confirmation dialog when trying to close the window
                int response;
                response = JOptionPane.showConfirmDialog(VendorDashboard.this, 
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

        jLabel1 = new javax.swing.JLabel();
        viewbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        update = new javax.swing.JButton();
        TaskAssigned = new javax.swing.JComboBox<>();
        addbutton = new javax.swing.JButton();
        editbutton = new javax.swing.JButton();
        foodtextfield = new javax.swing.JTextField();
        pricetextfield = new javax.swing.JTextField();
        deleetbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        view = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        acceptOrder = new javax.swing.JButton();
        cancelOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reviewTable = new javax.swing.JTable();
        BackToHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        revenuetotal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        viewreview = new javax.swing.JButton();
        txtVendorNotification = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnCheckVendorNotifications = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Orders");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 70, 90, -1));

        viewbutton.setText("View");
        viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(viewbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 67, -1, -1));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Item", "Quantity", "Final", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 114, 707, 207));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 67, -1, -1));

        TaskAssigned.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECT---", "Pending", "Preparing ", "Out for Delivery", "Delivered" }));
        TaskAssigned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskAssignedActionPerformed(evt);
            }
        });
        getContentPane().add(TaskAssigned, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 67, 103, -1));

        addbutton.setText("Add ");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(addbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 352, -1, -1));

        editbutton.setText("Edit");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(editbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 352, -1, -1));

        foodtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodtextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(foodtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 352, 99, -1));

        pricetextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(pricetextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 352, 96, -1));

        deleetbutton.setText("Delete");
        deleetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleetbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(deleetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 352, -1, -1));

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Food Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 387, 718, 176));

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 352, -1, -1));

        Logout.setBackground(new java.awt.Color(255, 51, 51));
        Logout.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("LogOut");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1238, 23, -1, -1));

        acceptOrder.setText("Accept");
        acceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderActionPerformed(evt);
            }
        });
        getContentPane().add(acceptOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 67, -1, -1));

        cancelOrder.setText("Cancel");
        cancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderActionPerformed(evt);
            }
        });
        getContentPane().add(cancelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 67, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("View Reviews");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 70, -1, -1));

        reviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Item Name", "Review Text", "Rating From 1 to 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(reviewTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 114, 527, 207));

        BackToHome.setBackground(new java.awt.Color(255, 0, 0));
        BackToHome.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        BackToHome.setForeground(new java.awt.Color(255, 255, 255));
        BackToHome.setText("Dashboard");
        BackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToHomeActionPerformed(evt);
            }
        });
        getContentPane().add(BackToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 6, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calculate Revenue");

        revenuetotal.setText("Total Revenue");
        revenuetotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revenuetotalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Menu");

        viewreview.setText("View");
        viewreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewreviewActionPerformed(evt);
            }
        });

        txtVendorNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendorNotificationActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("VENDOR DASHBOARD");

        btnCheckVendorNotifications.setText("CheckNotifications");
        btnCheckVendorNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckVendorNotificationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 639, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(revenuetotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(viewreview, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(367, 367, 367))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(599, 599, 599))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVendorNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCheckVendorNotifications))
                        .addGap(128, 128, 128))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(31, 31, 31)
                .addComponent(viewreview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(revenuetotal)))
                .addGap(35, 35, 35)
                .addComponent(btnCheckVendorNotifications)
                .addGap(18, 18, 18)
                .addComponent(txtVendorNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//viewing the orders
    private void viewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbuttonActionPerformed
    DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
    model.setRowCount(0);



try (BufferedReader br = new BufferedReader(new FileReader("src/CustomerTextFiles/orders.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println("Reading line: " + line); 
        String[] details = line.trim().split(",");

        if (details.length == 5) { 
            model.addRow(new Object[]{details[0], details[1], details[2], details[3], details[4]});
        } else {
            System.out.println("Invalid line format: " + line);
        }
    }
} catch (IOException e) {
    JOptionPane.showMessageDialog(this, "Error reading orders file!", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_viewbuttonActionPerformed
//updating the order like preparing pendingetc
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
          int selectedRow = orderTable.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an order to update!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

   
    String customerName = orderTable.getValueAt(selectedRow, 0).toString();
    String itemName = orderTable.getValueAt(selectedRow, 1).toString();
    String quantity = orderTable.getValueAt(selectedRow, 2).toString();
    String totalAmount = orderTable.getValueAt(selectedRow, 3).toString();
    
   
    String newStatus = TaskAssigned.getSelectedItem().toString();
    
  
    if (newStatus.equals("Pending") || newStatus.equals("Preparing") || newStatus.equals("Out for Delivery") || newStatus.equals("Delivered")) {
        
        orderTable.setValueAt(newStatus, selectedRow, 4);
    } else {
        JOptionPane.showMessageDialog(this, "Invalid status!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    File file = new File("src/CustomerTextFiles/orders.txt");
    File tempFile = new File("src/CustomerTextFiles/orders_temp.txt");
    
    try (BufferedReader br = new BufferedReader(new FileReader(file));
         BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");
            if (details.length == 5 &&
                details[0].equals(customerName) &&
                details[1].equals(itemName) &&
                details[2].equals(quantity) &&
                details[3].equals(totalAmount)) {
                bw.write(customerName + "," + itemName + "," + quantity + "," + totalAmount + "," + newStatus);
            } else {
                bw.write(line);
            }
            bw.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error updating order status!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
  
    if (!file.delete() || !tempFile.renameTo(file)) {
        JOptionPane.showMessageDialog(this, "Error updating order file!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    JOptionPane.showMessageDialog(this, "Order status updated to: " + newStatus, "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_updateActionPerformed

    private void pricetextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetextfieldActionPerformed
//adding the new foodin menu button
    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        String foodName = foodtextfield.getText().trim();
        String priceText = pricetextfield.getText().trim();

        if (foodName.isEmpty() || priceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter food name and price!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
    }

    try {
        int price = Integer.parseInt(priceText);

       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/CustomerTextFiles/menu.txt", true))) {
            writer.write(foodName + "," + price);
            writer.newLine();
        }

       
        DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
        model.addRow(new Object[]{foodName, price});

        JOptionPane.showMessageDialog(this, "Menu item added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

     
        foodtextfield.setText("");
        pricetextfield.setText("");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Price must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving menu item!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_addbuttonActionPerformed
//editing the menu like editing name price etc
    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
       int selectedRow = menuTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an item to edit!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String newFoodName = foodtextfield.getText().trim();
    String newPriceText = pricetextfield.getText().trim();

    if (newFoodName.isEmpty() || newPriceText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter new name and price!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int newPrice = Integer.parseInt(newPriceText);
        String oldFoodName = menuTable.getValueAt(selectedRow, 0).toString();

        // Read menu file and update item
        File file = new File("src/CustomerTextFiles/menu.txt");
        File tempFile = new File("src/CustomerTextFiles/menu_temp.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file));
             BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(oldFoodName)) {
                    bw.write(newFoodName + "," + newPrice); // Update line with new values
                } else {
                    bw.write(line); // Write original line for non-matching items
                }
                bw.newLine();
            }
        }

        // After file operations, delete original and rename temporary file
        if (!file.delete() || !tempFile.renameTo(file)) {
            JOptionPane.showMessageDialog(this, "Error updating menu file!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Update the table with new food name and price
        menuTable.setValueAt(newFoodName, selectedRow, 0);
        menuTable.setValueAt(newPrice, selectedRow, 1);

        JOptionPane.showMessageDialog(this, "Menu item updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Clear text fields
        foodtextfield.setText("");
        pricetextfield.setText("");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Price must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error updating menu item!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_editbuttonActionPerformed

    private void foodtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodtextfieldActionPerformed
        foodtextfield.setText("Enter food name...");
foodtextfield.setForeground(Color.RED); // Gray color for the placeholder text

    }//GEN-LAST:event_foodtextfieldActionPerformed
//deelte the food from menu button 
    private void deleetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleetbuttonActionPerformed
         int selectedRow = menuTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an item to delete!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String foodNameToDelete = menuTable.getValueAt(selectedRow, 0).toString();


    File file = new File("src/CustomerTextFiles/menu.txt");
    File tempFile = new File("src/CustomerTextFiles/menu_temp.txt");
    try (BufferedReader br = new BufferedReader(new FileReader(file));
         BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
        
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (!parts[0].equals(foodNameToDelete)) {
                bw.write(line);
                bw.newLine();
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error deleting menu item!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!file.delete() || !tempFile.renameTo(file)) {
        JOptionPane.showMessageDialog(this, "Error updating menu file!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }


    DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
    model.removeRow(selectedRow);

    JOptionPane.showMessageDialog(this, "Menu item deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleetbuttonActionPerformed
//viewing the menu again 
    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
       String filePath = "src/CustomerTextFiles/menu.txt"; 
    
    try {
       
        FileReader fileReader = new FileReader(filePath);
           try (BufferedReader BufferedReader = new BufferedReader(fileReader)) {
               DefaultTableModel model = (DefaultTableModel)  menuTable.getModel();
               model.setRowCount(0);
               
               String line;
               while ((line = BufferedReader.readLine()) != null) {
                   
                   String[] rowData = line.split(",");
                   
                   
                   model.addRow(rowData);
               }  }
    } catch (IOException e) {
    }
    }//GEN-LAST:event_viewActionPerformed
//accepting the order
    private void acceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderActionPerformed
       int selectedRow = orderTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an order to accept!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }


    String customerName = orderTable.getValueAt(selectedRow, 0).toString();
    String itemName = orderTable.getValueAt(selectedRow, 1).toString();
    String quantity = orderTable.getValueAt(selectedRow, 2).toString();
    String totalAmount = orderTable.getValueAt(selectedRow, 3).toString();


    orderTable.setValueAt("Accepted", selectedRow, 4);

    updateOrderStatusInFile(customerName, itemName, quantity, totalAmount, "Accepted");
    }//GEN-LAST:event_acceptOrderActionPerformed
//canceling the order
    private void cancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderActionPerformed
       int selectedRow = orderTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an order to cancel!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String customerName = orderTable.getValueAt(selectedRow, 0).toString();
    String itemName = orderTable.getValueAt(selectedRow, 1).toString();
    String quantity = orderTable.getValueAt(selectedRow, 2).toString();
    String totalAmount = orderTable.getValueAt(selectedRow, 3).toString();
    orderTable.setValueAt("Canceled", selectedRow, 4);
    updateOrderStatusInFile(customerName, itemName, quantity, totalAmount, "Canceled");
    }//GEN-LAST:event_cancelOrderActionPerformed
//viewing review 
    private void viewreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewreviewActionPerformed
       DefaultTableModel model = (DefaultTableModel) reviewTable.getModel();
    model.setRowCount(0); 

    try (BufferedReader br = new BufferedReader(new FileReader("src/CustomerTextFiles/reviews.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");
            if (details.length == 4) { 
                model.addRow(new Object[]{details[0], details[1], details[2], details[3]});
            } else {
                System.out.println("Invalid review format: " + line); 
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading reviews file!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_viewreviewActionPerformed
//calcualteing revenue using the button as it shows the popup only
    private void revenuetotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revenuetotalActionPerformed
       double totalRevenue = calculateTotalRevenue();
        JOptionPane.showMessageDialog(this, "Total Revenue: $" + String.format("%.2f", totalRevenue), "Revenue Summary", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_revenuetotalActionPerformed

    private void BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToHomeActionPerformed
       this.setVisible(false);  // Hides the current page
String userRole = "Vendors"; 
    // Show the Main UI (Home Page)
    MainUI mainUI = new MainUI(userRole);  // Assuming MainUI is the class for your main home screen
    mainUI.setVisible(true); 
     mainUI.showRoleBasedContent(); 
    }//GEN-LAST:event_BackToHomeActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void TaskAssignedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskAssignedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaskAssignedActionPerformed

    private void btnCheckVendorNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckVendorNotificationsActionPerformed
      try (BufferedReader br = new BufferedReader(new FileReader("src/NotificationFiles/vendor_notifications.txt"))) {
        String line;
        Set<String> uniqueOrders = new HashSet<>();  // HashSet to store orders and remove duplicates

        // Read through each line in the file
        while ((line = br.readLine()) != null) {
            // Skip empty lines or lines without "New Order from"
            if (line.trim().isEmpty() || !line.contains("New Order from")) {
                continue; // Skip this line and move to the next
            }

            // Add the order to the set (duplicates will be automatically removed)
            uniqueOrders.add(line.trim());
        }

        // If there are no orders found, display "No new orders"
        StringBuilder ordersText = new StringBuilder();
        if (uniqueOrders.isEmpty()) {
            ordersText.append("No new orders");
            btnCheckVendorNotifications.setBackground(Color.WHITE);  // Change button color to white
        } else {
            for (String order : uniqueOrders) {
                if (ordersText.length() > 0) {
                    ordersText.append("\n");  // Add a line break between multiple orders
                }
                ordersText.append(order);  // Append the order to the StringBuilder
            }
            btnCheckVendorNotifications.setBackground(Color.RED);  // Change button color to red if orders exist
        }

        // Set the text to show all unique orders (or "No new orders" if none found)
        txtVendorNotification.setText(ordersText.toString());
    } catch (IOException ex) {
        // If there is an error reading the file, show an error message in the JTextField
        txtVendorNotification.setText("Error reading file.");
        btnCheckVendorNotifications.setBackground(Color.WHITE);  // Reset the button color to white on error
    }
    }//GEN-LAST:event_btnCheckVendorNotificationsActionPerformed

    private void txtVendorNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendorNotificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendorNotificationActionPerformed
    //calcualting total revenu button 
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
}  //updating the order status 
    private void updateOrderStatusInFile(String customerName, String itemName, String quantity, String totalAmount, String newStatus) {
    File file = new File("src/CustomerTextFiles/orders.txt");
    File tempFile = new File("src/CustomerTextFiles/orders_temp.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(file));
         BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");
            if (details.length == 5 &&
                details[0].equals(customerName) &&
                details[1].equals(itemName) &&
                details[2].equals(quantity) &&
                details[3].equals(totalAmount)) {
                // Update the status to "Accepted" or "Canceled"
                bw.write(customerName + "," + itemName + "," + quantity + "," + totalAmount + "," + newStatus);
            } else {
                bw.write(line);
            }
            bw.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error updating order status!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Ensure the original file is replaced by the updated temp file
    if (!file.delete() || !tempFile.renameTo(file)) {
        JOptionPane.showMessageDialog(this, "Error updating order file!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Show the appropriate success message based on the new status
    if ("Accepted".equals(newStatus)) {
        JOptionPane.showMessageDialog(this, "Order Accepted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else if ("Canceled".equals(newStatus)) {
        JOptionPane.showMessageDialog(this, "Order Canceled successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VendorDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToHome;
    private javax.swing.JButton Logout;
    private javax.swing.JComboBox<String> TaskAssigned;
    private javax.swing.JButton acceptOrder;
    private javax.swing.JButton addbutton;
    private javax.swing.JButton btnCheckVendorNotifications;
    private javax.swing.JButton cancelOrder;
    private javax.swing.JButton deleetbutton;
    private javax.swing.JButton editbutton;
    private javax.swing.JTextField foodtextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable menuTable;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField pricetextfield;
    private javax.swing.JButton revenuetotal;
    private javax.swing.JTable reviewTable;
    private javax.swing.JTextField txtVendorNotification;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    private javax.swing.JButton viewbutton;
    private javax.swing.JButton viewreview;
    // End of variables declaration//GEN-END:variables
}
