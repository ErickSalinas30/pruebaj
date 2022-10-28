/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author usuario
 */
public class Actor extends Persona {
    private String apodo;
    private double salario;
    private String nacionalidad;
    private int yearTrayectoria;
    
    public Actor(String nombre,int fN,String apodo,double salario,String nacionalidad,
            int yT){
        
        this.apodo=apodo;
        this.salario=salario;
        this.nacionalidad=nacionalidad;
        this.yearTrayectoria=yT;
        
        
    }
    
    

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getYearTrayectoria() {
        return yearTrayectoria;
    }

    public void setYearTrayectoria(int yearTrayectoria) {
        this.yearTrayectoria = yearTrayectoria;
    }

    @Override
    public String mostrarInfo() {
        return "El nombre del actor es "+this.getNombre()+" nacio en el año "+this.getfNacimiento()
                +" lo conocen como "+this.apodo+" por cada apricion gana "+this.salario
                +" nacido en el pais "+this.nacionalidad+" y con una larga carrera de"
                +this.yearTrayectoria;
    }
    
    
    
    
    
    
}
