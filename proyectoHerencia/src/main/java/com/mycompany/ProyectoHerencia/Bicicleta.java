/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ProyectoHerencia;

/**
 *
 * @author Johann Alejandro Torres Soler
 */
public class Bicicleta extends Vehiculo {
     /**
 *declaracion variables
 */   
    private int numerodeEngranajes;

   
 /**
 *creacion de constructor
 */
    public Bicicleta(int numerodeEngranajes ,String marca, int modeloVehiculo) {
        super( marca, modeloVehiculo);
        this.numerodeEngranajes = numerodeEngranajes;
       
    }

     /**
 *incio get y set
 */
    public int getNumerodeEngranajes() {
        return numerodeEngranajes;
    }

    public void setNumerodeEngranajes(int numerodeEngranajes) {
        this.numerodeEngranajes = numerodeEngranajes;
    }

    /**
 *fin get y set 
 */

     /**
 *llamado metodos abstractos
 */
    @Override
    public void prenderVehiculo() {
        System.out.println("___________________________________________________");
        System.out.println("prender la  Bicicleta");
    }

    @Override
    public void apagarVehiculo() {
        System.out.println("apagar la Bicicleta");
    }
    
     /**
 *metodo que sirve para imprmir las variables de esta clase 
 */
    public void mostrarBicicleta(){
        
        System.out.println("clase hija bicileta de vehiculo  ");
        System.out.println("El NUMERO DE ENGRANAJES ES : " + this.numerodeEngranajes);

        System.out.println("***************************************************");
        System.out.println("*************H**E**R**E**D**A**********************");
        System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
    }
   
   
    
}
