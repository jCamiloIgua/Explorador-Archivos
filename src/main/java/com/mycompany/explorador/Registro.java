
package com.mycompany.explorador;

import Security.Encriptar;//seguridad
import javax.swing.JOptionPane;
import com.mycompany.explorador.Login; //claveR validacion varariable heredada
public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
         this.setLocationRelativeTo(this); //centrado
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboRangoR = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        btnEntrarR = new javax.swing.JButton();
        btnRegistrarR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jComboRangoR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "INVITADO", "ESTUDIANTE" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Registro de Usuarios");

        jLabel2.setText("TIPO DE USUARIO: ");

        jLabel3.setText("NOMBRE DE USUARIO:");

        jLabel4.setText("CONTRASEÑA DE USUARIO: ");

        btnEntrarR.setText("Volver");
        btnEntrarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarRActionPerformed(evt);
            }
        });

        btnRegistrarR.setText("Registrase ");
        btnRegistrarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistrarR)
                        .addGap(61, 61, 61)
                        .addComponent(btnEntrarR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboRangoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(txtContrasena)))))
                .addGap(73, 73, 73)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboRangoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrarR)
                    .addComponent(btnRegistrarR))
                .addGap(0, 17, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRActionPerformed
        String usuario = txtUsuario.getText();
        String Contrasena= txtContrasena.getText();
        String Rango = jComboRangoR.getSelectedItem().toString(); //permite guardar el rango escogido
 
        Usuario obj = new Usuario();  //guardo los valors en clase Usuario
        if(Usuario.vericarUsuarioNuevo(usuario)==-1){ //si despues de recorrer la lista da -1 sera un usuario nuevo
          obj.setNombre(usuario); 
          //obj.setContrasena(Contrasena); //guarde la clave normal
          obj.setRango(Rango);
            Encriptar conexion = new Encriptar();
            //variable a encriptar Contrasena
            String contrasenaEncriptada =conexion.ecnode(Encriptar.secretKey, Contrasena) ; //llave maestra y clave a asegurar / cadena encriptada
            //JOptionPane.showMessageDialog(null,"Contraseña encriptada: " + contrasenaEncriptada );
            String contrasenaDesencriptada = conexion.deecnode(Encriptar.secretKey, contrasenaEncriptada); //cadena desencriptada
            //JOptionPane.showMessageDialog(null,"Contraseña desencriptada: " + contrasenaDesencriptada);
            obj.setContrasena(contrasenaDesencriptada);//guardo la variable desencriptada para el inicio de seccion en el set contraseña.
            if(Rango == "ADMINISTRADOR"){  //validacion de administrador
                int clave =0 ;
                 JOptionPane.showMessageDialog(this,"Si desea crear un usuario tipo administrador debe ingresar la llave root");
                 clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la llave: "));
                 if(Login.claveR == clave){ //evalua llave root con usuario de root 
                     ListaUsuario.agregar(obj); //agregar el usuario al vector
                     JOptionPane.showMessageDialog(this,"El usuario se registro correctamente");
                 }else{
                     JOptionPane.showMessageDialog(this,"La llave ingresada no es correcta, no se puedo crear el usuario tipo administrador");
                 }
            }
            if(Rango != "ADMINISTRADOR"){ //si escoje los demas tipos de usuario
                 ListaUsuario.agregar(obj); //agregar el usuario al vector
                JOptionPane.showMessageDialog(this,"El usuario se registro correctamente");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Este usuario ya esta en uso");
        }
    }//GEN-LAST:event_btnRegistrarRActionPerformed

    private void btnEntrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarRActionPerformed
        InicioS abrir = new InicioS();
        abrir.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnEntrarRActionPerformed

    /*
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarR;
    private javax.swing.JButton btnRegistrarR;
    private javax.swing.JComboBox<String> jComboRangoR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
