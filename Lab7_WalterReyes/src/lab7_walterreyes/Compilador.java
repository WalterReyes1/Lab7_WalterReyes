
package lab7_walterreyes;

import java.io.Serializable;
import javax.swing.JTable;


public class Compilador implements Serializable  {
    private static final long SerialVersionUID=777L;
    private String nombre;
    private String creador;
    private float lineas;
    private float léxico;
    private float sintático;
    private float semántico;
    private float intermedio;
    private float optimizador;
    private float generador;
    private JTable tabla;

    public Compilador() {
    }

    public Compilador(String nombre, String creador, float lineas, float léxico, float sintático, float semántico, float intermedio, float optimizador, float generador, JTable tabla) {
        this.nombre = nombre;
        this.creador = creador;
        this.lineas = lineas;
        this.léxico = léxico;
        this.sintático = sintático;
        this.semántico = semántico;
        this.intermedio = intermedio;
        this.optimizador = optimizador;
        this.generador = generador;
        this.tabla = tabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public float getLineas() {
        return lineas;
    }

    public void setLineas(float lineas) {
        this.lineas = lineas;
    }

    public float getLéxico() {
        return léxico;
    }

    public void setLéxico(float léxico) {
        this.léxico = léxico;
    }

    public float getSintático() {
        return sintático;
    }

    public void setSintático(float sintático) {
        this.sintático = sintático;
    }

    public float getSemántico() {
        return semántico;
    }

    public void setSemántico(float semántico) {
        this.semántico = semántico;
    }

    public float getIntermedio() {
        return intermedio;
    }

    public void setIntermedio(float intermedio) {
        this.intermedio = intermedio;
    }

    public float getOptimizador() {
        return optimizador;
    }

    public void setOptimizador(float optimizador) {
        this.optimizador = optimizador;
    }

    public float getGenerador() {
        return generador;
    }

    public void setGenerador(float generador) {
        this.generador = generador;
    }

    @Override
    public String toString() {
        return nombre ;
    }
            
            
    
    
}
