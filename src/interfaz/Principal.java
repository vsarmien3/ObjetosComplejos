/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        txtRealUno.requestFocusInWindow();

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
        txtImaginarioUno = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox<>();
        txtRealDos = new javax.swing.JTextField();
        txtImaginarioDos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRealTres = new javax.swing.JTextField();
        txtImaginarioTres = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtRealUno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtImaginarioDosDivi = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtRealDosDivi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtImaginarioUnoDivi = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtRealUnoDivi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("OPERACIONES CON DOS NÚMEROS COMPLEJOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));
        jPanel1.add(txtImaginarioUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 30, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));
        jPanel1.add(txtRealDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 30, -1));
        jPanel1.add(txtImaginarioDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 30, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("+");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 10, 20));

        txtRealTres.setEditable(false);
        jPanel1.add(txtRealTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 30, -1));

        txtImaginarioTres.setEditable(false);
        jPanel1.add(txtImaginarioTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 30, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 92, 370, 10));
        jPanel1.add(txtRealUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 30, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("+");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 10, 20));

        jLabel9.setText("=");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("+");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 10, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 140, 160));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "División", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12)))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtImaginarioDosDivi.setEditable(false);
        jPanel3.add(txtImaginarioDosDivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 30, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 30, 10));

        txtRealDosDivi.setEditable(false);
        jPanel3.add(txtRealDosDivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 30, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("+");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 10, 20));

        txtImaginarioUnoDivi.setEditable(false);
        jPanel3.add(txtImaginarioUnoDivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 30, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 30, 10));

        txtRealUnoDivi.setEditable(false);
        jPanel3.add(txtRealUnoDivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 30, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        // TODO add your handling code here:
        int op, sw = 1;
        double re1 = 0, re2 = 0, imag1 = 0, imag2 = 0;
        Complejos c1, c2, c3 = null, c4 = null;
        op = cmbOperacion.getSelectedIndex();
        
        if (txtRealUno.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el primer número real", "Error", JOptionPane.ERROR_MESSAGE);
            txtRealUno.requestFocusInWindow();
            sw = 0;
        }else if (txtImaginarioUno.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el primer número imaginario", "Error", JOptionPane.ERROR_MESSAGE);
            txtImaginarioUno.requestFocusInWindow();
            sw = 0;
        }else if (txtRealDos.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el segundo número real", "Error", JOptionPane.ERROR_MESSAGE);
            txtRealDos.requestFocusInWindow();
            sw = 0;   
        }else if (txtImaginarioDos.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el segundo número imaginario", "Error", JOptionPane.ERROR_MESSAGE);
            txtImaginarioDos.requestFocusInWindow();
            sw = 0;    
        }else{
            try{
               re1 = Integer.parseInt(txtRealUno.getText()); 
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El primer número real debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtRealUno.requestFocusInWindow();
                txtRealUno.selectAll();
                sw = 0;
        }  
            try{
               imag1 = Integer.parseInt(txtImaginarioUno.getText());   
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El primer número imaginario debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtImaginarioUno.requestFocusInWindow();
                txtImaginarioUno.selectAll();
                sw = 0;
        }
            try{
               re2 = Integer.parseInt(txtRealDos.getText());   
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El segundo número real debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtRealDos.requestFocusInWindow();
                txtRealDos.selectAll();
                sw = 0;
        }
            try{
               imag2 = Integer.parseInt(txtImaginarioDos.getText());   
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El segundo número imaginario debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtImaginarioDos.requestFocusInWindow();
                txtImaginarioDos.selectAll();
                sw = 0;
        }
            
        try{
        c1 = new Complejos (re1,imag1);
        c2 = new Complejos (re2,imag2);  
        
        switch(op){
            
            case 0:
                c3 = c1.suma(c2);
                txtRealTres.setText(""+c3.getReal());
                txtImaginarioTres.setText(""+c3.getImaginario());
            break; 
            
            case 1: 
                c3 = c1.resta(c2);
                txtRealTres.setText(""+c3.getReal());
                txtImaginarioTres.setText(""+c3.getImaginario());
            break;
            
            case 2: 
                c3 = c1.multiplicacion(c2);
                txtRealTres.setText(""+c3.getReal());
                txtImaginarioTres.setText(""+c3.getImaginario());
            break;
            
            case 3:
                c3 = c1.denominadordivision(c2);
                c4 = c1.numeradordivision(c2);
            break;    
        }
        }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
      }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        txtRealUno.setText("");
        txtRealDos.setText("");
        txtRealTres.setText("");
        txtImaginarioUno.setText("");
        txtImaginarioDos.setText("");
        txtImaginarioTres.setText("");
        txtRealUno.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtImaginarioDos;
    private javax.swing.JTextField txtImaginarioDosDivi;
    private javax.swing.JTextField txtImaginarioTres;
    private javax.swing.JTextField txtImaginarioUno;
    private javax.swing.JTextField txtImaginarioUnoDivi;
    private javax.swing.JTextField txtRealDos;
    private javax.swing.JTextField txtRealDosDivi;
    private javax.swing.JTextField txtRealTres;
    private javax.swing.JTextField txtRealUno;
    private javax.swing.JTextField txtRealUnoDivi;
    // End of variables declaration//GEN-END:variables
}
