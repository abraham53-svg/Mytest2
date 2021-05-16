/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

/**
 *
 * @author usuario
 */
public class Persona {
    private String nombre;
    private int edad;
    
    /**
     * contructor sin parametros para inicializar los atributos
     */
    public Persona(){
        this.edad=1;
        this.nombre="ataulfo";
    }
    /**
     * contructor con parametros 
     * @param nombre
     * @param edad 
     */
    public Persona(String nombre,int edad){
        this.edad=edad;
        this.nombre=nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return un String que es el mensaje de salida con los valores de los atributos
     */
    public  String ToString(){
        String mensaje;
        mensaje="los valores son"+" edad="+this.getEdad();
        return mensaje;
        
    }
    
    
}
