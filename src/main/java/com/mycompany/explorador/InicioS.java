
package com.mycompany.explorador;

import javax.swing.JOptionPane;

public class InicioS extends javax.swing.JFrame {
    protected static int validacion = 0; //para la validacion inicial cero
    protected static int validacionCmd = 0; //para la validacion inicial cero
    
    public InicioS() {
        initComponents();
        this.setLocationRelativeTo(this); //centrado
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLoguear = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jComboRoles = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnroot = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("USUARIO: ");

        jLabel2.setText("CONTRASEÑA: ");

        btnLoguear.setText("Entrar");
        btnLoguear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoguearActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jComboRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "INVITADO", "ESTUDIANTE" }));

        jLabel3.setText("TIPO DE USUARIO: ");

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        btnroot.setText("Root");
        btnroot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrootMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLoguear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnRegistrar)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnroot)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnroot)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoguear)
                    .addComponent(btnRegistrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Registro abrir = new Registro();
        abrir.setVisible(true);
        this.dispose(); // este se elimine
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLoguearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoguearActionPerformed
        String usuarioI = txtUsuario.getText();
        String contrasenaI = txtContrasena.getText();
        String Rango = jComboRoles.getSelectedItem().toString();  // guarda el rango del login
        //logica de ingreso
        int pos = Usuario.verificarIngreso(usuarioI, contrasenaI, Rango); //valido que el usuario clave y rango sean correctos
        if(pos==-1){
            JOptionPane.showMessageDialog(this,"USUARIO, CONTRASEÑA O TIPO DE USUARIO INCORRECTOS  ");
        }else{ //si es correcto ingresa al explorador 
           if(Rango == "ADMINISTRADOR"){
            ExploradorArchivos abrir = new ExploradorArchivos();
            abrir.setVisible(true);
            this.dispose();
            validacion =0 ; //permitir metodos de click derecho en este usuario
            validacionCmd = 0;
           }
           if(Rango == "INVITADO"){
            ExploradorArchivos abrir = new ExploradorArchivos();
            abrir.setVisible(true);
        
            //Restriccion 
            validacion = 1; //quitar metodos de click derecho en este usuario
            validacionCmd = 1;
            abrir.ArchivoTXt.setEnabled(false);
            abrir.RenombrarTxt.setEnabled(false);
            abrir.EliminarTxt.setEnabled(false);
            //
            abrir.JMenuAlgoritmo.setEnabled(false); //desabilita por defecto el algoritmo cuando inicia seccion 
            abrir.JMenuComunicacion.setEnabled(false);
            abrir.jComandos.setEnabled(false);
            this.dispose();
            
           }
           if(Rango == "ESTUDIANTE"){
               ExploradorArchivos abrir = new ExploradorArchivos();
               abrir.setVisible(true);
               validacion =0; //permitir metodos de click derecho en este usuario
               validacionCmd = 1;
               abrir.JMenuAlgoritmo.setEnabled(false); //desabilita por defecto el algoritmo cuando inicia seccion 
               abrir.JMenuComunicacion.setEnabled(false);
               abrir.jComandos.setEnabled(false);
               this.dispose();
           }
        }
    }//GEN-LAST:event_btnLoguearActionPerformed

    private void btnrootMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrootMouseClicked

            Login root = new Login(); //ingreso super usuario
            root.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnrootMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoguear;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnroot;
    private javax.swing.JComboBox<String> jComboRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
