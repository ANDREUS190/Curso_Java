/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmEj10_15A.java
 *
 * Created on 29-may-2012, 17:05:00
 */
package PqUd8;

import javax.swing.JOptionPane;

/**
 *
 * @author p
 */
public class Ej8_17 extends javax.swing.JFrame {

    /** Creates new form frmEj10_15A */
    public Ej8_17() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panAlumno = new javax.swing.JPanel();
        txfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfNota = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Introducción Notas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder(" Alumno "));

        txfCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel1.setDisplayedMnemonic('C');
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setLabelFor(txfCodigo);
        jLabel1.setText("Código :");

        jLabel2.setDisplayedMnemonic('C');
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setLabelFor(txfCodigo);
        jLabel2.setText("Nota :");

        txfNota.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfNota.setText("0");
        txfNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNotaActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAlumnoLayout = new javax.swing.GroupLayout(panAlumno);
        panAlumno.setLayout(panAlumnoLayout);
        panAlumnoLayout.setHorizontalGroup(
            panAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAlumnoLayout.createSequentialGroup()
                        .addGroup(panAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(panAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panAlumnoLayout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        panAlumnoLayout.setVerticalGroup(
            panAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAlumnoLayout.createSequentialGroup()
                .addGroup(panAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validaCodigo()
    {// ----------- Valida el campo Código
        boolean continua;
        String codStr;

        codStr = ((txfCodigo.getText()).trim());
        continua = true;

        // Debe estar informado (campo obligatorio)
        if ((continua) && (codStr.isEmpty() ))
        {
            continua = false;
            JOptionPane.showMessageDialog(this, "Campo obligatorio","Error en Código",  JOptionPane.ERROR_MESSAGE);
        }

        // Si ha sido todo correcto y longitud distinta de 4 caracteres
        if ((continua) && (codStr.length() != 4 ))
        {
            continua = false;
            JOptionPane.showMessageDialog(this, "Longitud debe ser igual a 4","Error en Código",  JOptionPane.ERROR_MESSAGE);
        }

         

        // Si ha habido error
        if (continua == false) 
        {
            txfCodigo.requestFocus(); // Enviamos foco a campo erróneo
        }

        return continua;
    } // FIN validaNombre()
    
    
    private boolean validaNota()
    {// ----------- Valida el campo Nota
        boolean continua;
        int notaInt;
        String notaStr;

        continua = true;
        notaInt = 0;
        notaStr = ((txfNota.getText()).trim());

        // Si Nota está informada
        if (notaStr.length() != 0)
        {
            // transformo a entero
            notaInt = Integer.parseInt(notaStr);

            // Si la Nota no está entre 0 y 10
            if ((continua == true) && ((notaInt <0) || (notaInt>10)))
            {
                continua = false;
                JOptionPane.showMessageDialog(this, "Debe estar entre 0 y 10","Error en Nota",  JOptionPane.ERROR_MESSAGE);
            } // FIN Si la Nota NO está entre 0 y 10

            // Si ha habido error
            if (continua == false)
            {
                txfNota.requestFocus(); // Enviamos foco a campo erróneo
            }

        }//Fin  Si Nota NO está informada
        else
        {
            //La informamos a 0
            txfNota.setText("0");
        }


        return continua;
    }// FIN validaNota()

    
    private void muestraYCreaAlumno()
    {
        String datos;
        String codigoStr, notaStr;
        int notaInt;
        
        codigoStr = txfCodigo.getText().trim();
        notaStr = txfNota.getText().trim();
        
        notaInt = Integer.parseInt(notaStr);
        
        Alumno al1;
        al1 = new Alumno(codigoStr, notaInt);
        
        datos = "Código: "+ al1.getCodigo() +" \n";
        datos = datos + "Nota: "+ al1.getNota() +" \n";

        JOptionPane.showMessageDialog(this, datos, "Datos a almacenar", JOptionPane.INFORMATION_MESSAGE);
    } // FIN muestraDatos()


    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
            // Si todo ha ido correcto visualizamos los datos
        if ( validaCodigo() && validaNota())
        {            
            muestraYCreaAlumno();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        rootPane.setDefaultButton(btnCancelar);
        txfCodigo.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
            int resp;
        
        resp = JOptionPane.showOptionDialog(this, "¿Desea salir de la aplicación?",
                "Salir", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        
        if(resp == JOptionPane.YES_OPTION)
        {        
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txfNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNotaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Ej8_17().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panAlumno;
    private javax.swing.JTextField txfCodigo;
    private javax.swing.JTextField txfNota;
    // End of variables declaration//GEN-END:variables
}
