/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_walterreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Admin_compi_binario {
 private ArrayList<Compilador>compis = new ArrayList();
 private File archivo = null;
    public Admin_compi_binario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Compilador> getCompis() {
        return compis;
    }

    public void setCompis(ArrayList<Compilador> compis) {
        this.compis = compis;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    //Mutador Extra
    public void setCompis(Compilador c){
        compis.add(c);
    }
    
    public void cargarArchivo() {
        try {
            compis = new ArrayList();
            Compilador temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Compilador) objeto.readObject()) != null) {
                        compis.add(temp);
                    }
                } catch (EOFException e) {
                   
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Compilador t : compis) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
