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

/**
 *
 * @author hp
 */
public class AdminUbinario {
 private ArrayList<Persona>lista = new ArrayList();
 File archivo;

    public AdminUbinario(String path) {
    archivo = new File(path);

    }

    public AdminUbinario(ArrayList<Persona> lista, File archivo) {
        this.lista = lista;
        this.archivo = archivo;
    }
 // extra
    public void setLista(Persona p){
        lista.add(p);
    }

    @Override
    public String toString() {
        return "AdminUbinario{" + "lista=" + lista + ", archivo=" + archivo + '}';
    }
    
    
  public void cargarArchivo() {
        try {
            lista = new ArrayList();
           Persona temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Persona) objeto.readObject()) != null) {
                        lista.add(temp);
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
            for (Persona t : lista) {
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
