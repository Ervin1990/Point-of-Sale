/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package al.ervini.superpos.restaurantapp;

import java.awt.print.PrinterException;
import javax.swing.table.TableModel;

/**
 *
 * @author user
 */
public class print extends javax.swing.JFrame {

    /**
     * Creates new form print
     */
    public print() {
        initComponents();
    }

    String lsub;
    String lpay;
    String lbal;

    public print(String sub, String pay, String bal, TableModel tableModel) throws PrinterException {
        initComponents();
        this.lsub = sub;
        this.lpay = pay;
        this.lbal = bal;

        txtprint.setText(txtprint.getText() + "*********************************\n");
        txtprint.setText(txtprint.getText() + "***********Point of Sale*********\n");
        txtprint.setText(txtprint.getText() + "\n");
        txtprint.setText(txtprint.getText() + "Product" + "\t" + "Price" + "\t" + "Total");
        
        for(int i=0; i<tableModel.getRowCount(); i++)
        {
            
            String product = (String) tableModel.getValueAt(i, 1);
            String price = (String) tableModel.getValueAt(i, 2);
            int total = (int) tableModel.getValueAt(i, 4);
         
            
            
            txtprint.setText(txtprint.getText() + "product" + "\t" + "price" + "\t" + "total");
        }
        txtprint.setText(txtprint.getText() + "\n");
        txtprint.setText(txtprint.getText() + "\n");
        txtprint.setText(txtprint.getText() +  "       " + " Subtotal : " + sub +     "\n");
        txtprint.setText(txtprint.getText() +  "       " + " Pay : " + sub +     "\n");
        txtprint.setText(txtprint.getText() +  "       " + " Balance : " + sub +     "\n");
        
        
        txtprint.setText(txtprint.getText() + "*********************************\n");
        txtprint.setText(txtprint.getText() + "*********************************\n");
        txtprint.setText(txtprint.getText() + " Thank you.......................\n");
        
        txtprint.print();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtprint = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(210, 307));

        txtprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtprint, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtprint, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprintActionPerformed

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
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txtprint;
    // End of variables declaration//GEN-END:variables
}
