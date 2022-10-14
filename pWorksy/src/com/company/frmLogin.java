
package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import main.Conexion;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();       
        setLocationRelativeTo(null);
        rootPane.setDefaultButton(btnIngresar);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnMenuPrincipal = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(1367, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1367, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1367, 768));
        jPanel1.setLayout(null);

        txtUser.setBackground(new java.awt.Color(0, 0, 0));
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setToolTipText("Ingrese su usuario");
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser);
        txtUser.setBounds(590, 280, 300, 30);

        txtPwd.setBackground(new java.awt.Color(0, 0, 0));
        txtPwd.setForeground(new java.awt.Color(255, 255, 255));
        txtPwd.setToolTipText("Ingrese su contraseña");
        jPanel1.add(txtPwd);
        txtPwd.setBounds(590, 410, 300, 30);

        btnCancelar.setToolTipText("Cierra la aplicación");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(430, 633, 190, 40);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(454, 59, 0, 0);

        btnRegistrar.setToolTipText("Ve a la ventana de registro");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(700, 633, 190, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(490, 190, 660, 10);

        btnMenuPrincipal.setBorderPainted(false);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.setFocusPainted(false);
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenuPrincipal);
        btnMenuPrincipal.setBounds(1100, 40, 190, 40);

        btnIngresar.setToolTipText("Inicia sesión");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setFocusPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(970, 630, 190, 40);

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INICIO DE SESION");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(690, 120, 180, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sitio web tecnológico con formas 3d fondo negro (3).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -10, 1370, 790);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Conexion conexion = new Conexion();
        Connection connection = conexion.conectar();

        String userName = txtUser.getText();
        String password = txtPwd.getText();
        int longitudUser = userName.length();
        int longitudPassword = password.length();

        if (longitudUser == 0 || longitudPassword == 0){
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar sin un usuario o una contrasena");
        }else{
            try {
                
                Statement s = connection.createStatement();
                ResultSet rs = s.executeQuery ("SELECT * FROM `users` WHERE `userName` = '" + userName + "'");

                if (rs.next()){
                    String passwordDb = rs.getString("password");
                    if (passwordDb.equals(password)) {
                        new MenuPrincipal().setVisible(true);
                        dispose(); 
                    }else{
                        JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "El usuario no existe");
                    new frmRegistro().setVisible(true);
                    dispose();
                }

                connection.close();
            }
            catch (SQLException ex) {               
                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalido");
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        new MenuPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        new frmRegistro().setVisible(true);
        dispose();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    /**
     * @param args the command line arguments
     */ 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
