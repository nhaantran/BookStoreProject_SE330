/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Tab;

import java.awt.Color;

/**
 *
 * @author nhaantran
 */
public class UpdateDiscount extends javax.swing.JPanel {

    /**
     * Creates new form UpdateBook
     */
    public UpdateDiscount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updatebookpane1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdbtnname = new javax.swing.JRadioButton();
        rdbtnvalue = new javax.swing.JRadioButton();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtvalue = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        updatebookpane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Input ID:");

        rdbtnname.setForeground(new java.awt.Color(0, 0, 0));
        rdbtnname.setText("Name");
        rdbtnname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnnameActionPerformed(evt);
            }
        });

        rdbtnvalue.setForeground(new java.awt.Color(0, 0, 0));
        rdbtnvalue.setText("Value");
        rdbtnvalue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnvalueActionPerformed(evt);
            }
        });

        txtid.setForeground(new java.awt.Color(153, 153, 153));
        txtid.setText("Enter ID");
        txtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidFocusLost(evt);
            }
        });

        txtname.setForeground(new java.awt.Color(153, 153, 153));
        txtname.setText("Enter Name");
        txtname.setEnabled(false);
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });

        txtvalue.setForeground(new java.awt.Color(153, 153, 153));
        txtvalue.setText("Enter Value");
        txtvalue.setEnabled(false);
        txtvalue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtvalueFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtvalueFocusLost(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(0, 153, 255));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update Discount");
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout updatebookpane1Layout = new javax.swing.GroupLayout(updatebookpane1);
        updatebookpane1.setLayout(updatebookpane1Layout);
        updatebookpane1Layout.setHorizontalGroup(
            updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatebookpane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnvalue)
                    .addComponent(rdbtnname)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtvalue, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(updatebookpane1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        updatebookpane1Layout.setVerticalGroup(
            updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatebookpane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatebookpane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnvalue)
                    .addComponent(txtvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnupdate)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updatebookpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updatebookpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusGained
        // TODO add your handling code here:
        if (txtid.getText().equals("Enter ID")) {
            txtid.setText("");
            txtid.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtidFocusGained

    private void txtidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusLost
        // TODO add your handling code here:
        if (txtid.getText().equals("")) {
            txtid.setText("Enter ID");
            txtid.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtidFocusLost

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        // TODO add your handling code here:
        if (txtname.getText().equals("Enter Name")) {
            txtname.setText("");
            txtname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        // TODO add your handling code here:
        if (txtname.getText().equals("")) {
            txtname.setText("Enter Name");
            txtname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtnameFocusLost

    private void txtvalueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtvalueFocusGained
        // TODO add your handling code here:
        if (txtvalue.getText().equals("Enter Value")) {
            txtvalue.setText("");
            txtvalue.setForeground(new Color(153, 153, 153));
        }

    }//GEN-LAST:event_txtvalueFocusGained

    private void txtvalueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtvalueFocusLost
        // TODO add your handling code here:
        if (txtvalue.getText().equals("")) {
            txtvalue.setText("Enter Value");
            txtvalue.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtvalueFocusLost

    private void rdbtnnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnnameActionPerformed
        // TODO add your handling code here:
        if(txtname.isEnabled())
            txtname.setEnabled(false);
        else txtname.setEnabled(true);
        
    }//GEN-LAST:event_rdbtnnameActionPerformed

    private void rdbtnvalueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnvalueActionPerformed
        // TODO add your handling code here:
        if(txtvalue.isEnabled())
            txtvalue.setEnabled(false);
        else txtvalue.setEnabled(true);
    }//GEN-LAST:event_rdbtnvalueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rdbtnname;
    private javax.swing.JRadioButton rdbtnvalue;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtvalue;
    private javax.swing.JPanel updatebookpane1;
    // End of variables declaration//GEN-END:variables
}
