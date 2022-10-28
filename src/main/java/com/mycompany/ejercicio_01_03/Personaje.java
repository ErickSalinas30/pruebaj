/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author usuario
 */
public class Personaje extends Persona {
    private String rValor;
    
    public Personaje(String nombre,int fN, String rV){
        this.rValor= rV;
    }
           
    public String getrValor() {
        return rValor;
    }

    public void setrValor(String rValor) {
        this.rValor = rValor;
    }

    @Override
    public String mostrarInfo() {
        return "El personaje se llama "+this.getNombre()+" nacio en el año "
                +this.getfNacimiento()+" y es un personaje "+this.rValor;
    }
    
    
    
}
