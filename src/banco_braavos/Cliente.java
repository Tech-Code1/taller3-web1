/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_braavos;

/**
 *
 * @author David
 */
public class Cliente {
    
    //Atributos
    private String nombre;
    private String apellido;
    private String cedula;
   
    
    //Constructor

    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
    
    
    //Metodos de encapsulamiento

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
