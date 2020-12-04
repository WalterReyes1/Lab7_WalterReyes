
package lab7_walterreyes;

/**
 *
 * @author hp
 */
public class Usuarios extends Persona{
  private Compilador compi;
  private String nota;

    public Usuarios() {
        super();
    }

    public Usuarios(Compilador compi, String nota, String nombre, String Apellido, String Usuario, String Contraseña) {
        super(nombre, Apellido, Usuario, Contraseña);
        this.compi = compi;
        this.nota = nota;
    }

    public Usuarios(Compilador compi, String nombre, String Apellido, String Usuario, String Contraseña) {
        super(nombre, Apellido, Usuario, Contraseña);
        this.compi = compi;
    }

    public Compilador getCompi() {
        return compi;
    }

    public void setCompi(Compilador compi) {
        this.compi = compi;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString()+  " compilador: " + compi + ", nota= " + nota;
    }
  
  
}
