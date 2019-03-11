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
public class Carro extends VehiculoconMotor {
    
     /**
 *declaracion variables
 */
  private String tamañodelMotor; 

   /**
 *creacion de constructor
 */
    public Carro(String tamañodelMotor, String tipoGasolina,  String marca, int modeloVehiculo ) {
        super( tipoGasolina,marca, modeloVehiculo);
        this.tamañodelMotor = tamañodelMotor;
        
    }
     /**
 *inicio de get y set 
 */
    public String getTamañodelMotor() {
        return tamañodelMotor;
    }

    public void setTamañodelMotor(String tamañodelMotor) {
        this.tamañodelMotor = tamañodelMotor;
    }

     /**
 *fin  de get y set 
 */

    
     /**
 *llamado de metodos  abstractos
 */
    @Override
    public void prenderVehiculo() {
        System.out.println("___________________________________________________");
        System.out.println("Carro se prende");
    }

    @Override
    public void apagarVehiculo() {
        System.out.println("Carro se apaga");
    }
     /**
 *metodo que imprime las variables de esta clase 
 */
    public void mostrarCarro(){
        
        System.out.println("clase hija carro de vehiculo con motor");
               System.out.println("El TAMAÑO DEL MOTOR ES : " + this.tamañodelMotor);

        System.out.println("***************************************************");
        System.out.println("*************H**E**R**E**D**A**********************");
        System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
    }
    
    
    
    
}
