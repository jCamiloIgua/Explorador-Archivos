package panelesNuevos;
import panelesNuevos.controladorCmd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cmd implements Runnable { //runname ejecutar segundo plano cmd
    private static String  comando; //ingreso comando
    private static boolean controlRu = false;
    
    public Cmd(){
        Thread hilo = new Thread(this); //hilo de proceso segundo plano
        hilo.start();
    }
    public void getLine(String comando){
        Cmd.comando = comando;
        Cmd.controlRu = true;
    }
    @Override
    public void run() { //iniciar hilo del cmd
         while(controlRu){
           Runtime se = Runtime.getRuntime();
           String salida = null;
           int i = 1;
           try{
               Process pro = se.exec("cmd /c " + comando);
               InputStreamReader entrada = new InputStreamReader(pro.getInputStream()); //leear el comando ingresado
               BufferedReader cmdEntrada = new BufferedReader(entrada);//leyendo comando
               //mostrar salida del comando
               if((salida = cmdEntrada.readLine()) != null){
                   while((salida = cmdEntrada.readLine()) != null){ //recorre el archivo comando
                       controladorCmd.panel.txareaComandos.append("\n" + i + "> " + salida);
                       controladorCmd.panel.txareaComandos.setCaretPosition(controladorCmd.panel.txareaComandos.getDocument().getLength());//se imprima ultima linea
                       i++; //contador
                   }
               }
                 controladorCmd.panel.txareaComandos.append("\n" + i + "> " + "Fin");
                 Cmd.controlRu = false; //salir del ciclo
           }catch(IOException ex){
               ex.getStackTrace();
           }
       } 
    }
}
