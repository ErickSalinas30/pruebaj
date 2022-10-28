/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_03;

/**
 *
 * @author usuario
 */
public class Ejercicio_01_03 {

    public static void main(String[] args) {
        var dicaprio=new Actor("Leonardo Dicaprio",1974,"Amante",175000,"EEUU",30);
        dicaprio.setNombre("Leonardo Dicaprio");
        dicaprio.setfNacimiento(1974);
        
        var matthew=new Actor("Matthew McConaughey",1969,"El Renacido",125000,"EEUU",35); 
        matthew.setNombre("Matthew McConaughey");
        matthew.setfNacimiento(1969);
        
        var josep=new Personaje("Joseph Cooper",2000,"Importante");
        josep.setNombre("Joseph Cooper");
        josep.setfNacimiento(2000);
        
        var jack=new Personaje("Jack Dawson",1997,"Principal");
        jack.setNombre("Jack Dawson");
        jack.setfNacimiento(1997);
        
        var lobo=new Pelicula(12000000,25,"Lobo Walls Street","Martin Scorsese",dicaprio);
        lobo.setActorFamoso(dicaprio);
        
        System.out.println("La pelicula de nombre "+lobo.getTitulo()+"realizada con un presupuesto de "
                +lobo.getPresupuesto()+" con el famoso actor"+lobo.getActorFamoso().getNombre()
                +" y producida por: "+lobo.getnProductor());
        
        var inter=new Pelicula(25000000,12,"Interstellar","Christopher Nolan",matthew);
        inter.setActorFamoso(matthew);
        
        System.out.println("La pelicula de nombre "+inter.getTitulo()+"realizada con un presupuesto de "
                +inter.getPresupuesto()+" con el famoso actor"+inter.getActorFamoso().getNombre()
                +" y producida por: "+inter.getnProductor());
        
        System.out.println(dicaprio.mostrarInfo());
        System.out.println(matthew.mostrarInfo());
        System.out.println(jack.mostrarInfo());
        System.out.println(josep.mostrarInfo());
        
        
        
        
        
    }
}
