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
public abstract class Vehiculo implements Interface {
    /**
 *creacion de variables 
 */
   
    private String marca;
    private int modeloVehiculo;

    /**
 *creacion de constructores 
 */
    public Vehiculo( String marca, int modeloVehiculo) {
        this.marca = marca;
        this.modeloVehiculo = modeloVehiculo;
    }

    /**
 *inicio de get y set 
 */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(int modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }
/**
 *fin de get y  set 
 */
   
/**
 *llamado a los metodos absrtactos
 */
    @Override
    public abstract void apagarVehiculo();

    @Override
    public abstract void prenderVehiculo();
    
    /**
 *metodo para imprimir las variables de esta clase 
 */
    public void mostrarVehiculo(){
        System.out.println("___________________________________________________");
        System.out.println("primera Clase padre -> vehiculo");
        System.out.println("LA MARCA DEL VEHICULO ES : " + this.marca);
        System.out.println("El MODELO DEL VEHICULO ES : " + this.modeloVehiculo);
        System.out.println("***************************************************");
        System.out.println("*************H**E**R**E**D**A**********************");
         System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
        
        
        
    }
    
    
}
