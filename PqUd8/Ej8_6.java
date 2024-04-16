/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd8;

import java.awt.event.MouseEvent;

/**
 *
 * @author andreu
 */
public class Ej8_6 extends javax.swing.JFrame {

    /**
     * Creates new form Ej8_6
     */
    public Ej8_6() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txaTexto = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txaTexto.setColumns(20);
        txaTexto.setRows(5);
        txaTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txaTextoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txaTextoMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txaTextoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txaTextoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txaTextoMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(txaTexto);

        btnLimpiar.setMnemonic('L');
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txaTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txaTextoMouseClicked
        // TODO add your handling code here:
        txaTexto.append("Se ha hecho clic\n");
        txaTexto.append("Posicion X: " + evt.getX() + "\n");
        txaTexto.append("Posicion Y: " + evt.getY() + "\n");
    }//GEN-LAST:event_txaTextoMouseClicked

    private void txaTextoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txaTextoMouseEntered
        // TODO add your handling code here:
        txaTexto.append("El ratón ha entrado en el componente\n");
    }//GEN-LAST:event_txaTextoMouseEntered

    private void txaTextoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txaTextoMousePressed
        // TODO add your handling code here:
        txaTexto.append("Se ha pulsado un boton del ratón\n");
        
        if ((evt.getButton() == MouseEvent.BUTTON3))
        {
            txaTexto.append("El boton pulsado es el derecho.\n");
        }
    }//GEN-LAST:event_txaTextoMousePressed

    private void txaTextoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txaTextoMouseExited
        // TODO add your handling code here:
        txaTexto.append("El ratón ha salido del componente\n");
    }//GEN-LAST:event_txaTextoMouseExited

    private void txaTextoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txaTextoMouseReleased
        // TODO add your handling code here:
        txaTexto.append("Se ha soltado el boton del ratón\n");
    }//GEN-LAST:event_txaTextoMouseReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txaTexto.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Ej8_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ej8_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ej8_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ej8_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ej8_6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaTexto;
    // End of variables declaration//GEN-END:variables
}
