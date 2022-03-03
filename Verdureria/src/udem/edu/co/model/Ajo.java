/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.model;

 /**
 *
 * @author jario
 * @since 03/03/2022
 * @version 1
 * Esta es la clase Ajo, que hereda atributos de Bulbo
 */ 
public class Ajo extends Bulbo{
    
    private int numdientes;

    public Ajo() {
    }
    
    public Ajo(int numdientes) {
        this.numdientes = numdientes;
    }

    public int getNumdientes() {
        return numdientes;
    }

    public void setNumdientes(int numdientes) {
        this.numdientes = numdientes;
    }

    @Override
    public float peso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float valor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
