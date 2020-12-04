/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_walterreyes;

import java.io.Serializable;


public class Persona implements Serializable{
    private static final long SerialVersionUID=777L;

  private String nombre;
  private String Apellido;
  private String Usuario;
  private String Contraseña;

    public Persona() {
    }

    public Persona(String nombre, String Apellido, String Usuario, String Contraseña) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", Apellido: " + Apellido + " ";
    }
  
  
  
}
