/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.model;

import udem.edu.co.controller.Calculable;

 /**
 *
 * @author jario
 * @since 03/03/2022
 * @version 1
 * Esta verduras donde se encuentran los metodos para cada clase creada
 */ 
public abstract class Verduras implements Calculable{

 private String nombre;
 private float peso;
 private float precio;

    public Verduras() {
    }

    public Verduras(String nombre, float peso, float precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

 

 
}
