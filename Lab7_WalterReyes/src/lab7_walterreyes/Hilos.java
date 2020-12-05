
package lab7_walterreyes;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hp
 */
public class Hilos {
   private JProgressBar barra1;
   private JProgressBar barra2;
   private JTable tabla;
   private float lineas;
    private float léxico;
    private float sintático;
    private float semántico;
    private float intermedio;
    private float optimizador;
    private float generador;

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
   private boolean avanzar;
   private boolean vive;

    public Hilos() {
    }

    public JProgressBar getBarra1() {
        return barra1;
    }

    public void setBarra1(JProgressBar barra1) {
        this.barra1 = barra1;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
   int cont= 0;
   int cont2=0;
   int cont3 = 0;
   int cont4= 0;
   int cont5 = 0;
   int x = (int)léxico;
   int y = (int)sintático;
    
   public void run(){
    while(vive){
        if(avanzar){
           barra1.setMaximum(x);
           barra1.setValue(barra1.getValue()+1 );
        barra1.setString(Float.toString(barra1.getValue()));
           if(barra1.getValue()==x){
               barra1.setValue(0);
               if(léxico<300&& cont == 0){
                   cont++;
                   DefaultTableModel modelo2 = (DefaultTableModel) tabla.getModel();
         Object[] newRow = {
                    "1632",
                     "Error de análisis léxico,faltaron: "+(300-léxico)+"Lineas"
                    
                };
         modelo2.addRow(newRow);
               }
           }
        
        barra1.setMaximum(y);
        barra1.setValue(barra1.getValue()+1 );
        barra1.setString(Float.toString(barra1.getValue()));
           if(barra1.getValue()==y){
               barra1.setValue(0);
               if(léxico<300&& cont2 == 0){
                   cont2++;
                   DefaultTableModel modelo2 = (DefaultTableModel) tabla.getModel();
         Object[] newRow = {
                    "4132",
                     "Error de análisis Sintáctico,faltaron: "+(300-sintático)+"Lineas"
                    
                };
                 modelo2.addRow(newRow);
               }
           }
           
        }
        
        try{
         Thread.sleep(50);

        } catch (InterruptedException ex) {
            }
    }
    }
}
