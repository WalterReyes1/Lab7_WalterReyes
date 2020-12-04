/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_walterreyes;


public class Error {
 private int código;
 private String Descripción;

    public Error() {
    }

    public Error(int código, String Descripción) {
        this.código = código;
        this.Descripción = Descripción;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    @Override
    public String toString() {
        return "Error: " + "código: " + código + ", Descripción: " + Descripción ;
    }
 
 
}
