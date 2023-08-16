package panelesNuevos;
//para el evento del boton todo publico
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import panelesNuevos.Cmd;
import panelesNuevos.Comandos;

public class controladorCmd implements ActionListener {
    public static Comandos panel = null; //tipo formulario
    
    public controladorCmd(Comandos panel){
        this.panel = panel; //parametros formulario
        inicializar();
    }
    private void inicializar(){
        this.panel.btnEjecutar.addActionListener(this);
        this.panel.setVisible(true);
        this.panel.setLocationRelativeTo(null); //formulario en el centro
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() .equals(this.panel.btnEjecutar)){ //si el evento es igual a formulario
            panel.txareaComandos.setText("");
            if(panel.txtQuery.getText() .equals("")){ //no hay datos
                JOptionPane.showMessageDialog(null,"No se permite dejar vacio el espacio","Error",0);
            }else{
                Cmd coman = new Cmd(); //clase que invoca al cma
                coman.getLine(this.panel.txtQuery.getText());
            }
        }
    } 
}
