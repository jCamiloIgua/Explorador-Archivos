
package com.mycompany.explorador;

import java.util.Vector;

public class Usuario {
    
    private String nombre;
    private String contrasena;
    private String rango;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    public static int vericarUsuarioNuevo(String usuario){
        Vector lista = mostrar();
        Usuario obj;
        for(int i = 0;i<lista.size();i++){
            obj = (Usuario)lista.elementAt(i);
            if(obj.getNombre().equalsIgnoreCase(usuario)){
                return i;
            }
        }
        return -1;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRango() {
        return rango;
    }
    
    public void setRango(String rango) {
        this.rango = rango;
    }
    
    //verificar credenciales
    public static  int verificarIngreso(String usuario, String contrasena, String rango){
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++){
            obj = (Usuario) lista.elementAt(i);//galando el getUsuario para validar en inicio si es igual la del get guarda y la de ingresada por el parametro
            if(obj.getNombre().equalsIgnoreCase(usuario) && obj.getContrasena().equalsIgnoreCase(contrasena) && obj.getRango().equalsIgnoreCase(rango)){
                return i;
            }
        }
        return -1;
    }
    public static Vector mostrar(){
        return  ListaUsuario.mostrar();
    }
}
