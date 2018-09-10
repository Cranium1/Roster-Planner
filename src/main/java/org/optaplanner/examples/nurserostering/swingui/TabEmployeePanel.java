/*
 * Copyright 2018 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.optaplanner.examples.nurserostering.swingui;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Martien
 */
public class TabEmployeePanel extends javax.swing.JPanel {

    /**
     * Creates new form TabEmployeePanel
     */
    public TabEmployeePanel() {
        initComponents();
    }
    
    public void handleOKButtonClicked(){
    //Override in customTabEmployeePanel
    }
    
    public void handleCancelButtonClicked(){
    //Override in customTabEmployeePanel
    }
    
    public void handleNewButtonClicked(){
    //Override in customTabEmployeePanel
    }
    
    public void handleDeleteButtonClicked(){
    //Override in customTabEmployeePanel   
    };
    
    public void handleDayOffButtonClicked(){
    //Override in customTabEmployeePanel 
    };
    

    public void handleEmployeeListValueChanged(javax.swing.event.ListSelectionEvent evt){
    //Override in customTabEmployeePanel
    }
    
    public void emptyListBox(){
        String[] listData = null;
        jEmployeeList.setListData(listData);
    }
    
    public void setListBox(String[] listData){
        jEmployeeList.setListData(listData);
    }
    
    public void setEmployeeListBox(DefaultListModel listData){
        jEmployeeList.setModel(listData);
    }
    
    public void setListBoxMode() {
        jEmployeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public ListSelectionModel getListSelectionModel(){
        return jEmployeeList.getSelectionModel();
    }
    
    public void setEmployeeListBoxSelection(int selection){
        jEmployeeList.setSelectedIndex(selection);
    }
    
    public String getCode() {
        return jCodeTextField.getText();
    }

    public void setCode(String text) {
        jCodeTextField.setText(text);
    }

    public String getContract() {
        return jContractTextField.getText();
    }

    public void setContract(String text) {
        jContractTextField.setText(text);
    }

    public JList<String> getEmployeeList() {
        return jEmployeeList;
    }

    public void setEmployeeList(JList<String> jEmployeeList) {
        this.jEmployeeList = jEmployeeList;
    }

    public String getName() {
        if (jNameTextField == null){
            return "Name not set";
        }
        else {
            return jNameTextField.getText();
        }
    }

    //original setter
    //public void setName(JTextField jNameTextField) {
    //    this.jNameTextField = jNameTextField;
    //}
    
    //method used but better as we dont use jTextField and we converted everything to string
    //and have to reconvert to original object later when we save the textfields
    public void setName(String text) {
        jNameTextField.setText(text);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEmployeeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEmployeeList = new javax.swing.JList<>();
        jNameLabel = new javax.swing.JLabel();
        jContractLabel = new javax.swing.JLabel();
        jNewButton = new javax.swing.JButton();
        jOKButton = new javax.swing.JButton();
        jCancelButton = new javax.swing.JButton();
        jDeleteButton = new javax.swing.JButton();
        jNameTextField = new javax.swing.JTextField();
        jContractTextField = new javax.swing.JTextField();
        jCodeLabel = new javax.swing.JLabel();
        jCodeTextField = new javax.swing.JTextField();
        jDayOffButton = new javax.swing.JButton();

        jEmployeeLabel.setText("Employees");

        jEmployeeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jEmployeeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jEmployeeListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jEmployeeList);

        jNameLabel.setText("Name");

        jContractLabel.setText("Contract");

        jNewButton.setText("New");
        jNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewButtonActionPerformed(evt);
            }
        });

        jOKButton.setText("OK");
        jOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOKButtonActionPerformed(evt);
            }
        });

        jCancelButton.setText("Cancel");
        jCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelButtonActionPerformed(evt);
            }
        });

        jDeleteButton.setText("Delete");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });

        jNameTextField.setText("name");

        jContractTextField.setText("contract");

        jCodeLabel.setText("Code");

        jCodeTextField.setText("code");

        jDayOffButton.setText("DayOff");
        jDayOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDayOffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jOKButton)
                                .addGap(27, 27, 27)
                                .addComponent(jCancelButton))
                            .addComponent(jEmployeeLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNewButton)
                                .addGap(18, 18, 18)
                                .addComponent(jDeleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDayOffButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCodeLabel)))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jContractLabel)
                                    .addComponent(jContractTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jEmployeeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameLabel)
                    .addComponent(jContractLabel)
                    .addComponent(jCodeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jContractTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNewButton)
                    .addComponent(jDeleteButton)
                    .addComponent(jDayOffButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOKButton)
                    .addComponent(jCancelButton))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewButtonActionPerformed
        // TODO add your handling code here:
        handleNewButtonClicked();
    }//GEN-LAST:event_jNewButtonActionPerformed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
        // TODO add your handling code here:
        handleDeleteButtonClicked();
    }//GEN-LAST:event_jDeleteButtonActionPerformed

    private void jOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOKButtonActionPerformed
        // TODO add your handling code here:
        handleOKButtonClicked();
    }//GEN-LAST:event_jOKButtonActionPerformed

    private void jCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelButtonActionPerformed
        // TODO add your handling code here:
        handleCancelButtonClicked();
    }//GEN-LAST:event_jCancelButtonActionPerformed

    private void jEmployeeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jEmployeeListValueChanged
        // TODO add your handling code here:
        handleEmployeeListValueChanged(evt);
    }//GEN-LAST:event_jEmployeeListValueChanged

    private void jDayOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDayOffButtonActionPerformed
        // TODO add your handling code here:
        handleDayOffButtonClicked();
    }//GEN-LAST:event_jDayOffButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancelButton;
    private javax.swing.JLabel jCodeLabel;
    private javax.swing.JTextField jCodeTextField;
    private javax.swing.JLabel jContractLabel;
    private javax.swing.JTextField jContractTextField;
    private javax.swing.JButton jDayOffButton;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JLabel jEmployeeLabel;
    private javax.swing.JList<String> jEmployeeList;
    private javax.swing.JLabel jNameLabel;
    private javax.swing.JTextField jNameTextField;
    private javax.swing.JButton jNewButton;
    private javax.swing.JButton jOKButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
