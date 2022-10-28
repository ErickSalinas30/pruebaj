/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author usuario
 */
public class Pelicula {
    private double presupuesto;
    private int numActor;
    private String titulo;
    private String nProductor;
    private Actor actorFamoso;
    
    public Pelicula(double presupuesto,int numActor,String titulo,String nProductor,
            Actor aF){
        this.presupuesto=presupuesto;
        this.numActor=numActor;
        this.titulo=titulo;
        this.nProductor=nProductor;
        this.actorFamoso=aF;
                
    }
    
    
    

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getNumActor() {
        return numActor;
    }

    public void setNumActor(int numActor) {
        this.numActor = numActor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getnProductor() {
        return nProductor;
    }

    public void setnProductor(String nProductor) {
        this.nProductor = nProductor;
    }

    public Actor getActorFamoso() {
        return actorFamoso;
    }

    public void setActorFamoso(Actor actorFamoso) {
        this.actorFamoso = actorFamoso;
    }
    
    
    
}
