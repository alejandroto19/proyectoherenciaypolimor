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
public class Jet extends VehiculoconMotor {
         /**
 *declaracion variables
 */
    
    private int cantidaddeMotores;

    /**
 *creacion de constructor
 */

    public Jet(int cantidaddeMotores, String tipoGasolina, String marca, int modeloVehiculo) {
        super(tipoGasolina, marca, modeloVehiculo);
        this.cantidaddeMotores = cantidaddeMotores;
        
    }

     /**
 *incio de get y set 
 */
    public int getCantidaddeMotores() {
        return cantidaddeMotores;
    }

    public void setCantidaddeMotores(int cantidaddeMotores) {
        this.cantidaddeMotores = cantidaddeMotores;
    }

     /**
 *fin de get y set 
 */

     /**
 *inicio de llamado de  metodos abastractos
 */
    @Override
    public void prenderVehiculo() {
        System.out.println("___________________________________________________");
        System.out.println("prender  Jet");
    }

    @Override
    public void apagarVehiculo() {
        System.out.println("apagar Jet");
    }
     /**
 *metodo que imprime las variables de esta clase 
 */
    public void mostrarJet(){
        
        System.out.println("clase hija  jet de vehiculo con motor ");
        System.out.println("LA CANTIDAD DE MOTORES ES : " + this.cantidaddeMotores);


        System.out.println("***************************************************");
        System.out.println("*************H**E**R**E**D**A**********************");
       System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
    }
    
    
    
}
