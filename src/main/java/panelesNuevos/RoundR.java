/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package panelesNuevos;

import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; //importo para la tabla

/**
 *
 * @author 57316
 */
public class RoundR extends javax.swing.JFrame {

    //atributos
    int contador; //cantidad de procesos
    int Procesos; //numero de procesos en ejecucion
    int Rafaga =0; //la rafaga en ejecucion
    int Quantum = 0; //quantum en ejecucion
    int ResRafaga = 0; //residuo en ejecucion
    int TiempoProceso = 0; //tiempo que dura procesamiento
    int valorBarra; //porcentaje de la barra
    int cantidadProcesos; //procesos terminados
    
    public RoundR() {
        initComponents();
        this.setLocationRelativeTo(null); //aparesca el frame centrado
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldQuantum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1AñadirProceso = new javax.swing.JButton();
        jButton2IniciarProcesos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Funciones = new javax.swing.JTable();
        jTextField2Rafaga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jProgressBarraP = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel6NumeroProcesos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8PorcentajeBarra = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2Segunda = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelCatidadProcesos = new javax.swing.JLabel();
        jLabel14TiempoTotal = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setResizable(false);

        jTextFieldQuantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantumActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Simulador Algoritmo Round Robin");

        jButton1AñadirProceso.setText("Añadir");
        jButton1AñadirProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AñadirProcesoActionPerformed(evt);
            }
        });

        jButton2IniciarProcesos.setText("Iniciar");
        jButton2IniciarProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2IniciarProcesosActionPerformed(evt);
            }
        });

        jTable1Funciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Rafaga", "Quantum", "Residuo Rafaga", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1Funciones);

        jTextField2Rafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2RafagaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Procesos");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Quantum");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Rafaga");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jProgressBarraP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProgressBarraPMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("N.Proceso");

        jLabel6NumeroProcesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("%");

        jLabel8PorcentajeBarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Informe Procesos");

        jTable2Segunda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Rafaga", "Quantum", "Tiempo Final", "Estado"
            }
        ));
        jScrollPane3.setViewportView(jTable2Segunda);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText("Cantidad de Procesos");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setText("Tiempo Total Procesos");

        jLabelCatidadProcesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14TiempoTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel2)))
                .addGap(321, 321, 321))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldQuantum, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jTextField2Rafaga))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1AñadirProceso)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton2IniciarProcesos)
                                                .addContainerGap())))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCatidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14TiempoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6NumeroProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8PorcentajeBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jProgressBarraP, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel9)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1AñadirProceso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2Rafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2IniciarProcesos))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6NumeroProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel8PorcentajeBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6))
                            .addComponent(jProgressBarraP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCatidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14TiempoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantumActionPerformed

    private void jButton1AñadirProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AñadirProcesoActionPerformed
         //contador procesos barra no supere rafgsa
      if((Integer.parseInt(jTextField2Rafaga.getText()))<=100){
          añadir();
          jTextFieldQuantum.setEditable(false);
      }else{
          JOptionPane.showMessageDialog(null,"El valor de la rafaga no puede ser mayor a 100");
          jTextField2Rafaga.setText(null);
          jTextField2Rafaga.grabFocus();
      }
    }//GEN-LAST:event_jButton1AñadirProcesoActionPerformed

    private void jTextField2RafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2RafagaActionPerformed

    }//GEN-LAST:event_jTextField2RafagaActionPerformed

    private void jProgressBarraPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProgressBarraPMouseClicked
       
    }//GEN-LAST:event_jProgressBarraPMouseClicked

    private void jButton2IniciarProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2IniciarProcesosActionPerformed
        // todos los procesos de inicio
        //se usa clase de hilo
        new Thread(new Hilo()).start(); //crea un nuevo hilo
        iniciar(); //metodo de carge de datos de los textfile y ocultarlos
    }//GEN-LAST:event_jButton2IniciarProcesosActionPerformed

    private void jBAgrerarActionPerformed(java.awt.event.ActionEvent evt){
    }
    
    //clase de hilo
    private class Hilo implements Runnable{

        @Override
        public void run() { //metodo run se ejecuta el codigo del hilo
            int estado = 1; //condicion del ciclo while
            int i = 0; //contador del while
            
            while(estado!=0){ //diferente de cero esto del proceso
                while(i < contador){ //recorre filas
                    cargar(i);  //obtener valores de la tabla y los guarda en variables
                    if(ResRafaga != 0 && ResRafaga > Quantum){ //ejecute procesos
                     for(int c = 1; c <= Quantum; c++){
                       jTable1Funciones.setValueAt("Procesando", i, 4); //columa
                       ResRafaga--;
                       Barra(Rafaga,ResRafaga); //metodo  rafaga y el residuo calcular porcentaje
                       Pintar(); //muestra el avace del proceso
                       jTable1Funciones.setValueAt(String.valueOf(ResRafaga), i, 3);        
                       TiempoProceso++;
                       Dormir(); //metodo 
                     } 
                     jTable1Funciones.setValueAt("Espera", i, 4); //cambio a espera
                     if(ResRafaga == 0){
                        jTable1Funciones.setValueAt("Terminado", i, 4); //en ves de estado a terminado
                        Pintar();
                        Informe(i); //valores de proceso termiandos en la segunda tabla
                        Borrar(i);
                        jProgressBarraP.setValue(0); //la barra termina a cero porque ya termino proceso
                     }
                    }else{ //para proceso no a terminado cuando el Quantun sea igual que la rafaga
                        if(ResRafaga > 0  &&  Quantum!=0){
                           while(ResRafaga >0){
                               jTable1Funciones.setValueAt("Procesando", i, 4);
                               ResRafaga--; //menos uno
                               Barra(Rafaga,ResRafaga);
                               Pintar();
                               jTable1Funciones.setValueAt(String.valueOf(ResRafaga), i, 3);
                               TiempoProceso++;
                               Dormir();
                           } 
                            jTable1Funciones.setValueAt("Espera", i, 4);
                            if(ResRafaga == 0 && Quantum != 0){
                              jTable1Funciones.setValueAt("Terminado", i, 4);
                              Pintar();
                              Informe(i);
                              Borrar(i);
                              jProgressBarraP.setValue(0);
                            }
                        }else{ //residuo rafaga es igual a cero y el quantun es doferente de cero el primer if no se cumple
                            if(ResRafaga == 0 && Quantum != 0){
                                jTable1Funciones.setValueAt("Terminado", i, 4);
                                Pintar();
                                Informe(i);
                                Borrar(i);
                                jProgressBarraP.setValue(0);  
                            }
                        }
                    }
                    jLabel6NumeroProcesos.setText(String.valueOf(""));//se borra su inf
                    jLabel8PorcentajeBarra.setText(String.valueOf(""));
                    i++;
                }
                i=0;
                jLabel6NumeroProcesos.setText(String.valueOf(""));//vacios ejecucion continua del hilo
                jLabel8PorcentajeBarra.setText(String.valueOf(""));
            }
        }  
    }
    
    //metodos
    public void añadir(){ //añadir un proceso
        DefaultTableModel unModelo = (DefaultTableModel) jTable1Funciones.getModel(); //modelo tabla
        contador++; //cantidad Procesos
        Object[] miTabla = new Object[5]; //objeto de cinco columnas --> 0,1,2,3
        miTabla[0] = contador;
        miTabla[1] = jTextField2Rafaga.getText();
        miTabla[2] = jTextFieldQuantum.getText();
        miTabla[3] = jTextField2Rafaga.getText();
        miTabla[4] = "Listo..."; //estado
        unModelo.addRow(miTabla); //anadir a la tabla el objeto de miTabla
        jTable1Funciones.setModel(unModelo);
        jTextField2Rafaga.setText(null); //se limpie el espacio de rafaga para una nueva
        jTextField2Rafaga.grabFocus(); //enfocamos
    }
    
    public void cargar(int i){ //parametro entero
        Procesos = (int) jTable1Funciones.getValueAt(i, 0); //metodo tabla jTIngreso
        Rafaga = parseInt((String) (jTable1Funciones.getValueAt(i, 1)));
        Quantum = parseInt((String) (jTable1Funciones.getValueAt(i, 2)));
        ResRafaga = parseInt((String) (jTable1Funciones.getValueAt(i, 3)));
        if(Procesos>0){
            jLabel6NumeroProcesos.setText (String.valueOf (Procesos )); //cuaddrado n procesos lado de barra
        }
    }
    
    public void Barra(int rafaga, int residuo){ //logica del porcentaje, parametros
        int Rafaga = rafaga;
        int valor = 100/rafaga;
        int porcentaje = 100  - (valor*residuo);
        valorBarra = porcentaje;
        jLabel8PorcentajeBarra.setText(String.valueOf(valorBarra+"%")); //label agregar valor proceso
    }
    
    public void Pintar(){ //color de la barra
        jProgressBarraP.setValue(valorBarra);
        jProgressBarraP.repaint(); //muestre el avance
    }
    
    public void Dormir(){
        try {
            Thread.sleep(700); //dormir hilo un seguno mil milesegundos pausar sistema
        } catch (InterruptedException ex){
            Logger.getLogger(RoundR.class.getName()). log(Level.SEVERE, null, ex);
        }
    }
    
    public void Informe(int c){ //valores segunda tabla
        DefaultTableModel dosModelo = (DefaultTableModel) jTable2Segunda.getModel();
        Object[] mitabla = new Object[5];
        mitabla[0] = c+1;
        mitabla[1] =  Rafaga;
        mitabla[2] = Quantum;
        mitabla[3] = TiempoProceso + " Segundos";
        mitabla[4] = "Terminado";
        dosModelo.addRow(mitabla);
        jTable2Segunda.setModel (dosModelo);
        
        cantidadProcesos++; //se incrementa en uno
        jLabelCatidadProcesos.setText(String.valueOf(cantidadProcesos+" Terminados"));
        jLabel14TiempoTotal.setText(String.valueOf(TiempoProceso+" Segundos")); //agrege un proceso agrega tiempo final del proceso se agrege el ultimo proceso todos los tiempos de los hilos
    }
    
    public void Borrar(int c){ //elimina registro de la tabla
        jTable1Funciones.setValueAt(0, c,0);
        jTable1Funciones.setValueAt("0", c,1);
        jTable1Funciones.setValueAt("0", c,2);
        jTable1Funciones.setValueAt("0", c,3);
        jTable1Funciones.setValueAt("****", c,4); //estado
    }
    
    public void iniciar(){ //
        jTextFieldQuantum.setVisible(false);
        jTextField2Rafaga.setVisible(false);
        jButton1AñadirProceso.setVisible(false);
        jButton2IniciarProcesos.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1AñadirProceso;
    private javax.swing.JButton jButton2IniciarProcesos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14TiempoTotal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6NumeroProcesos;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8PorcentajeBarra;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCatidadProcesos;
    private javax.swing.JProgressBar jProgressBarraP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable1Funciones;
    private javax.swing.JTable jTable2Segunda;
    private javax.swing.JTextField jTextField2Rafaga;
    private javax.swing.JTextField jTextFieldQuantum;
    // End of variables declaration//GEN-END:variables
}
