package com.mycompany.explorador;


//Librerias
//import Imagenes.archivos.png;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;  //web
import java.net.URI;
import java.awt.Desktop;  //web
//import java.awt.event.ActionEvent;
import com.mycompany.explorador.Login; //login validacion varariable heredada
import javax.swing.DefaultListModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import panelesNuevos.Comandos;
import panelesNuevos.ComunicacionUno;
import panelesNuevos.EliminarArchivoTxt;
import panelesNuevos.LeerArchivo;
//import panelesNuevos.Intercomunicacion;
import panelesNuevos.RoundR;
import panelesNuevos.MultiProgramacion;
import panelesNuevos.NuevoArchivo;
import panelesNuevos.RenombrarArchivo;
import panelesNuevos.controladorCmd;

public class ExploradorArchivos extends javax.swing.JFrame implements Runnable{
    String hora, minutos, segundos;
    Thread hilo;
    DefaultListModel modelo = new DefaultListModel();

    
    //Configuracion de herencia, entre otras.
    public ExploradorArchivos() {
        initComponents();
        LabelFecha.setText(fecha());
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
    }
    
    //Configurcion Automatica de NetBeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clickDerecho = new javax.swing.JPopupMenu();
        ArchivoTXt = new javax.swing.JMenu();
        AbrirTxt = new javax.swing.JMenu();
        RenombrarTxt = new javax.swing.JMenu();
        EliminarTxt = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        LabelHora = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        btnCerrarS = new javax.swing.JButton();
        PanelDePaneles = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuAplicaciones = new javax.swing.JMenu();
        JMenuAppsGoogle = new javax.swing.JMenu();
        JMenuAppsCalculadora = new javax.swing.JMenu();
        JMenuAppsNotepad = new javax.swing.JMenu();
        JMenuAppsProgra = new javax.swing.JMenu();
        JMenuAppsPrograEclipse = new javax.swing.JMenu();
        JMenuAppsPrograBluej = new javax.swing.JMenu();
        JMenuPaginas = new javax.swing.JMenu();
        JMPaginasGoogle = new javax.swing.JMenu();
        JMenuPaginasEntretYoutube = new javax.swing.JMenu();
        JMenuEntrenimientoNextflix = new javax.swing.JMenu();
        JMenuEntrenimientoAmazon = new javax.swing.JMenu();
        JMenuPaginaInvestigacion = new javax.swing.JMenu();
        JMenuInvestigacionWikipedia = new javax.swing.JMenu();
        JMenuInvestigacionGoogleAcademico = new javax.swing.JMenu();
        JMenuInvestigacionBrainly = new javax.swing.JMenu();
        JMenuRedesS = new javax.swing.JMenu();
        JMenuRedesSFacebook = new javax.swing.JMenu();
        JMenuRedesSTwitter = new javax.swing.JMenu();
        JMenuRedesSInstagram = new javax.swing.JMenu();
        JMenuUniminuto = new javax.swing.JMenu();
        JMenuUniminutoAulas = new javax.swing.JMenu();
        JMenuUniminutoGenesis = new javax.swing.JMenu();
        JMenuUniminutoBiblioteca = new javax.swing.JMenu();
        jComandos = new javax.swing.JMenu();
        JMenuComunicacion = new javax.swing.JMenu();
        JMenuCommuMultipro = new javax.swing.JMenu();
        JMenuCommuInterComProcesos = new javax.swing.JMenu();
        JMenuAlgoritmo = new javax.swing.JMenu();
        JMenuAlgoritmoRoundRobin = new javax.swing.JMenu();

        ArchivoTXt.setText("Crear Archivo txt");
        ArchivoTXt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArchivoTXtMouseClicked(evt);
            }
        });
        clickDerecho.add(ArchivoTXt);

        AbrirTxt.setText("Abrir Archivo txt");
        AbrirTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbrirTxtMouseClicked(evt);
            }
        });
        clickDerecho.add(AbrirTxt);

        RenombrarTxt.setText("Renombrar Archivo txt");
        RenombrarTxt.setToolTipText("");
        RenombrarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RenombrarTxtMouseClicked(evt);
            }
        });
        clickDerecho.add(RenombrarTxt);

        EliminarTxt.setText("Eliminar");
        EliminarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarTxtMouseClicked(evt);
            }
        });
        clickDerecho.add(EliminarTxt);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Explorador de Archivos");
        setName("frame 1"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        LabelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelHora.setText("Hora");

        LabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelFecha.setText("DD/MM/YYYY");

        jTree1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Archivos");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("blue");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("violet");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("red");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Imagenes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("basketball");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hot dogs");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Comandos");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("basketball");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setToolTipText("");
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        btnCerrarS.setText("Cerrar Sesión");
        btnCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnCerrarS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnCerrarS)
                .addGap(34, 34, 34))
        );

        PanelDePaneles.setBackground(new java.awt.Color(255, 255, 255));
        PanelDePaneles.setComponentPopupMenu(clickDerecho);

        javax.swing.GroupLayout PanelDePanelesLayout = new javax.swing.GroupLayout(PanelDePaneles);
        PanelDePaneles.setLayout(PanelDePanelesLayout);
        PanelDePanelesLayout.setHorizontalGroup(
            PanelDePanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );
        PanelDePanelesLayout.setVerticalGroup(
            PanelDePanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 153, 255));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(300, 23));

        JMenuAplicaciones.setText("Aplicaciones            ");

        JMenuAppsGoogle.setText("Google");
        JMenuAppsGoogle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuAppsGoogleMouseClicked(evt);
            }
        });
        JMenuAplicaciones.add(JMenuAppsGoogle);

        JMenuAppsCalculadora.setText("Calculadora");
        JMenuAppsCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuAppsCalculadoraMouseClicked(evt);
            }
        });
        JMenuAplicaciones.add(JMenuAppsCalculadora);

        JMenuAppsNotepad.setText("Notepad++");
        JMenuAppsNotepad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuAppsNotepadMouseClicked(evt);
            }
        });
        JMenuAplicaciones.add(JMenuAppsNotepad);

        JMenuAppsProgra.setText("Programacion");

        JMenuAppsPrograEclipse.setText("Eclipse");
        JMenuAppsPrograEclipse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuAppsPrograEclipseMouseClicked(evt);
            }
        });
        JMenuAppsProgra.add(JMenuAppsPrograEclipse);

        JMenuAppsPrograBluej.setText("BlueJ");
        JMenuAppsPrograBluej.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuAppsPrograBluejMouseClicked(evt);
            }
        });
        JMenuAppsProgra.add(JMenuAppsPrograBluej);

        JMenuAplicaciones.add(JMenuAppsProgra);

        jMenuBar1.add(JMenuAplicaciones);

        JMenuPaginas.setText("Paginas Web            ");

        JMPaginasGoogle.setText("Entretenimiento");

        JMenuPaginasEntretYoutube.setText("Youtube");
        JMenuPaginasEntretYoutube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuPaginasEntretYoutubeMouseClicked(evt);
            }
        });
        JMPaginasGoogle.add(JMenuPaginasEntretYoutube);

        JMenuEntrenimientoNextflix.setText("Netflix");
        JMenuEntrenimientoNextflix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuEntrenimientoNextflixMouseClicked(evt);
            }
        });
        JMPaginasGoogle.add(JMenuEntrenimientoNextflix);

        JMenuEntrenimientoAmazon.setText("Amazon Prime");
        JMenuEntrenimientoAmazon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuEntrenimientoAmazonMouseClicked(evt);
            }
        });
        JMPaginasGoogle.add(JMenuEntrenimientoAmazon);

        JMenuPaginas.add(JMPaginasGoogle);

        JMenuPaginaInvestigacion.setText("Investigacion");

        JMenuInvestigacionWikipedia.setText("Wikipedia");
        JMenuInvestigacionWikipedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuInvestigacionWikipediaMouseClicked(evt);
            }
        });
        JMenuPaginaInvestigacion.add(JMenuInvestigacionWikipedia);

        JMenuInvestigacionGoogleAcademico.setText("Google Academico");
        JMenuInvestigacionGoogleAcademico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuInvestigacionGoogleAcademicoMouseClicked(evt);
            }
        });
        JMenuPaginaInvestigacion.add(JMenuInvestigacionGoogleAcademico);

        JMenuInvestigacionBrainly.setText("Brainly");
        JMenuInvestigacionBrainly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuInvestigacionBrainlyMouseClicked(evt);
            }
        });
        JMenuPaginaInvestigacion.add(JMenuInvestigacionBrainly);

        JMenuPaginas.add(JMenuPaginaInvestigacion);

        JMenuRedesS.setText("Redes Sociales");

        JMenuRedesSFacebook.setText("Facebook");
        JMenuRedesSFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuRedesSFacebookMouseClicked(evt);
            }
        });
        JMenuRedesS.add(JMenuRedesSFacebook);

        JMenuRedesSTwitter.setText("Twitter");
        JMenuRedesSTwitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuRedesSTwitterMouseClicked(evt);
            }
        });
        JMenuRedesS.add(JMenuRedesSTwitter);

        JMenuRedesSInstagram.setText("Instagram");
        JMenuRedesSInstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuRedesSInstagramMouseClicked(evt);
            }
        });
        JMenuRedesS.add(JMenuRedesSInstagram);

        JMenuPaginas.add(JMenuRedesS);

        jMenuBar1.add(JMenuPaginas);

        JMenuUniminuto.setText("Uniminuto");

        JMenuUniminutoAulas.setText("Aulas virtuales");
        JMenuUniminutoAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuUniminutoAulasMouseClicked(evt);
            }
        });
        JMenuUniminuto.add(JMenuUniminutoAulas);

        JMenuUniminutoGenesis.setText("Genesis +");
        JMenuUniminutoGenesis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuUniminutoGenesisMouseClicked(evt);
            }
        });
        JMenuUniminuto.add(JMenuUniminutoGenesis);

        JMenuUniminutoBiblioteca.setText("Biblioteca");
        JMenuUniminutoBiblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuUniminutoBibliotecaMouseClicked(evt);
            }
        });
        JMenuUniminuto.add(JMenuUniminutoBiblioteca);

        jMenuBar1.add(JMenuUniminuto);

        jComandos.setText("Comandos");
        jComandos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComandosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jComandos);

        JMenuComunicacion.setText("Comunicacion");

        JMenuCommuMultipro.setText("Multiprogramación");
        JMenuCommuMultipro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuCommuMultiproMouseClicked(evt);
            }
        });
        JMenuComunicacion.add(JMenuCommuMultipro);

        JMenuCommuInterComProcesos.setText("Intercomunicacion Procesos");
        JMenuCommuInterComProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuCommuInterComProcesosMouseClicked(evt);
            }
        });
        JMenuComunicacion.add(JMenuCommuInterComProcesos);

        jMenuBar1.add(JMenuComunicacion);

        JMenuAlgoritmo.setText("Algoritmo");

        JMenuAlgoritmoRoundRobin.setText("Round Robin");
        JMenuAlgoritmoRoundRobin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuAlgoritmoRoundRobinMouseClicked(evt);
            }
        });
        JMenuAlgoritmo.add(JMenuAlgoritmoRoundRobin);

        jMenuBar1.add(JMenuAlgoritmo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDePaneles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDePaneles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //evento paginas web 
    private void JMenuPaginasEntretYoutubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuPaginasEntretYoutubeMouseClicked
        try {
         Desktop.getDesktop().browse(URI.create("www.youtube.com"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuPaginasEntretYoutubeMouseClicked

    private void JMenuEntrenimientoNextflixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuEntrenimientoNextflixMouseClicked
        try {
         Desktop.getDesktop().browse(URI.create("www.netflix.com/co/"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuEntrenimientoNextflixMouseClicked

    private void JMenuEntrenimientoAmazonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuEntrenimientoAmazonMouseClicked
        try {
         Desktop.getDesktop().browse(URI.create("www.primevideo.com"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuEntrenimientoAmazonMouseClicked

    private void JMenuInvestigacionWikipediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuInvestigacionWikipediaMouseClicked
        try {
         Desktop.getDesktop().browse(URI.create("https://es.wikipedia.org/"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuInvestigacionWikipediaMouseClicked

    private void JMenuInvestigacionGoogleAcademicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuInvestigacionGoogleAcademicoMouseClicked
        try {
         Desktop.getDesktop().browse(URI.create("https://scholar.google.es/schhp?hl=es"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuInvestigacionGoogleAcademicoMouseClicked

    private void JMenuInvestigacionBrainlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuInvestigacionBrainlyMouseClicked
        try {
         Desktop.getDesktop().browse(URI.create("https://brainly.lat/"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuInvestigacionBrainlyMouseClicked

    private void JMenuRedesSFacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuRedesSFacebookMouseClicked
       try {
         Desktop.getDesktop().browse(URI.create("https://es-la.facebook.com/"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuRedesSFacebookMouseClicked

    private void JMenuRedesSTwitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuRedesSTwitterMouseClicked
       try {
         Desktop.getDesktop().browse(URI.create("www.twitter.com"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuRedesSTwitterMouseClicked

    private void JMenuRedesSInstagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuRedesSInstagramMouseClicked
        try {
         Desktop.getDesktop().browse(URI.create("www.instagram.com/"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuRedesSInstagramMouseClicked

    private void JMenuUniminutoAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuUniminutoAulasMouseClicked
        try {
            Desktop.getDesktop().browse(URI.create("https://www.aulasuniminuto.edu.co/"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuUniminutoAulasMouseClicked

    private void JMenuUniminutoGenesisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuUniminutoGenesisMouseClicked
        try {
            Desktop.getDesktop().browse(URI.create("https://genesisgo.uniminuto.edu/index.html"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuUniminutoGenesisMouseClicked

    private void JMenuUniminutoBibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuUniminutoBibliotecaMouseClicked
       try {
            Desktop.getDesktop().browse(URI.create("https://www.uniminuto.edu/biblioteca"));
        } catch (IOException ex) {
            Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuUniminutoBibliotecaMouseClicked

    private void JMenuAppsGoogleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuAppsGoogleMouseClicked
        try {
           Runtime rt = Runtime.getRuntime();
        Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        } catch (IOException ex) {
           Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_JMenuAppsGoogleMouseClicked

    private void JMenuAppsCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuAppsCalculadoraMouseClicked
       try {
           Runtime rt = Runtime.getRuntime();
        Runtime.getRuntime().exec("calc");
        } catch (IOException ex) {
           Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuAppsCalculadoraMouseClicked

    private void JMenuAppsNotepadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuAppsNotepadMouseClicked
       try {
           Runtime rt = Runtime.getRuntime();
        Runtime.getRuntime().exec("C:\\Program Files\\Notepad++\\notepad++.exe");
        } catch (IOException ex) {
           Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuAppsNotepadMouseClicked

    private void JMenuAppsPrograEclipseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuAppsPrograEclipseMouseClicked
        try {
           Runtime rt = Runtime.getRuntime();
        Runtime.getRuntime().exec("C:\\Users\\RGH-LS12-05\\eclipse\\committers-2022-03\\eclipse\\eclipse.exe");
        } catch (IOException ex) {
           Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuAppsPrograEclipseMouseClicked

    private void JMenuAppsPrograBluejMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuAppsPrograBluejMouseClicked
        try {
           Runtime rt = Runtime.getRuntime();
        Runtime.getRuntime().exec("C:\\Program Files\\BlueJ\\BlueJ.exe");
        } catch (IOException ex) {
           Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMenuAppsPrograBluejMouseClicked

    //tree de busqueda
    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked

    }//GEN-LAST:event_jTree1MouseClicked
//cmd
    private void jComandosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComandosMouseClicked
       if(InicioS.validacionCmd == 1){ //si es uno esta bloqueado para el usuario
         
       }else{
         Comandos fp = new Comandos();
        controladorCmd cp = new controladorCmd(fp);
      }
    }//GEN-LAST:event_jComandosMouseClicked

    private void ArchivoTXtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArchivoTXtMouseClicked
       if(InicioS.validacion == 1){
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoArchivo().setVisible(false);
            }
        });
       }else{ // validacion ==  0
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoArchivo().setVisible(true);
            }
        });
       }  
    }//GEN-LAST:event_ArchivoTXtMouseClicked

    private void AbrirTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbrirTxtMouseClicked

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeerArchivo().setVisible(true);
            }
        });
    }//GEN-LAST:event_AbrirTxtMouseClicked

    private void RenombrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RenombrarTxtMouseClicked
       if(InicioS.validacion == 1){ //si es uno esta bloqueado para el usuario
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RenombrarArchivo().setVisible(false);
            }
        }); 
       }else{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RenombrarArchivo().setVisible(true);
            }
        }); 
    }
    }//GEN-LAST:event_RenombrarTxtMouseClicked

    private void EliminarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarTxtMouseClicked
       if(InicioS.validacion == 1){
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarArchivoTxt().setVisible(false);
            }
         });
      }else{
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarArchivoTxt().setVisible(true);
            }
        });
       } 
            
    }//GEN-LAST:event_EliminarTxtMouseClicked

    private void JMenuCommuMultiproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuCommuMultiproMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiProgramacion().setVisible(true);
            }
        });
    }//GEN-LAST:event_JMenuCommuMultiproMouseClicked

    private void JMenuAlgoritmoRoundRobinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuAlgoritmoRoundRobinMouseClicked
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoundR().setVisible(true);
            }
        });
    }//GEN-LAST:event_JMenuAlgoritmoRoundRobinMouseClicked

    private void btnCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSActionPerformed
        InicioS salir = new InicioS();
        salir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSActionPerformed

    private void JMenuCommuInterComProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuCommuInterComProcesosMouseClicked
        ComunicacionUno uno = new ComunicacionUno();
        uno.setVisible(true);
    }//GEN-LAST:event_JMenuCommuInterComProcesosMouseClicked
    //fin web
//metodos de clic derecho
    
    
    //Configuracion de la fecha
    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    //Configuracion de la hora 1
    public void hora(){
        Calendar calendario=new GregorianCalendar();
        Date horaActual=new Date();
        calendario.setTime(horaActual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
        
    }
    
    //Configuracion de la hora 2
    @Override
    public void run(){
        Thread current=Thread.currentThread();
        while(current==hilo){
            hora();
            LabelHora.setText(hora+":"+minutos+":"+segundos);
        }
    }
    
    //Configuracion de NetBeans
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExploradorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExploradorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExploradorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExploradorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExploradorArchivos().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JMenu AbrirTxt;
    protected javax.swing.JMenu ArchivoTXt;
    protected javax.swing.JMenu EliminarTxt;
    private javax.swing.JMenu JMPaginasGoogle;
    protected javax.swing.JMenu JMenuAlgoritmo;
    private javax.swing.JMenu JMenuAlgoritmoRoundRobin;
    private javax.swing.JMenu JMenuAplicaciones;
    private javax.swing.JMenu JMenuAppsCalculadora;
    private javax.swing.JMenu JMenuAppsGoogle;
    private javax.swing.JMenu JMenuAppsNotepad;
    private javax.swing.JMenu JMenuAppsProgra;
    private javax.swing.JMenu JMenuAppsPrograBluej;
    private javax.swing.JMenu JMenuAppsPrograEclipse;
    private javax.swing.JMenu JMenuCommuInterComProcesos;
    private javax.swing.JMenu JMenuCommuMultipro;
    protected javax.swing.JMenu JMenuComunicacion;
    private javax.swing.JMenu JMenuEntrenimientoAmazon;
    private javax.swing.JMenu JMenuEntrenimientoNextflix;
    private javax.swing.JMenu JMenuInvestigacionBrainly;
    private javax.swing.JMenu JMenuInvestigacionGoogleAcademico;
    private javax.swing.JMenu JMenuInvestigacionWikipedia;
    private javax.swing.JMenu JMenuPaginaInvestigacion;
    private javax.swing.JMenu JMenuPaginas;
    private javax.swing.JMenu JMenuPaginasEntretYoutube;
    private javax.swing.JMenu JMenuRedesS;
    private javax.swing.JMenu JMenuRedesSFacebook;
    private javax.swing.JMenu JMenuRedesSInstagram;
    private javax.swing.JMenu JMenuRedesSTwitter;
    private javax.swing.JMenu JMenuUniminuto;
    private javax.swing.JMenu JMenuUniminutoAulas;
    private javax.swing.JMenu JMenuUniminutoBiblioteca;
    private javax.swing.JMenu JMenuUniminutoGenesis;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelHora;
    protected javax.swing.JPanel PanelDePaneles;
    protected javax.swing.JMenu RenombrarTxt;
    private javax.swing.JButton btnCerrarS;
    protected javax.swing.JPopupMenu clickDerecho;
    protected javax.swing.JMenu jComandos;
    public javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}

//comandos guardados
//abrir app del pc
//try {
        //    Runtime rt = Runtime.getRuntime();
        //    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\WINWORD.EXE\"");
        //} catch (IOException ex) {
        //    Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        //}
//abrir web
//try {
        //    Desktop.getDesktop().browse(URI.create("www.youtube.com"));
        //} catch (IOException ex) {
        //    Logger.getLogger(ExploradorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        //}
//para abrir nueva ventana en Label
    //Comando mv = new Comando();
    //mv.setVisible(true);
//desplegue condicion
//if (JPanelIzquierdaPrincipal.getX()==0){
        //    desplace.desplazarIzquierda(JPanelIzquierdaPrincipal, JPanelIzquierdaPrincipal.getX(), -210, 10, 10);
        //}else if(JPanelIzquierdaPrincipal.getX()== -210){
        //    desplace.desplazarDerecha(JPanelIzquierdaPrincipal, JPanelIzquierdaPrincipal.getX(), 0, 10, 10);
        //}
//
//rchivos archivos = new Archivos();
//        PanelDePaneles.add(archivos);
//        archivos.show();