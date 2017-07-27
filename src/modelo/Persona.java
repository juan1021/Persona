/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author admin-lcg
 */
public class Persona {
     private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Set the value of codigo
     *
     * @param apellido new value of codigo
     */
    public void setApellido(String apellido){ 
            
        this.apellido = apellido;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}

