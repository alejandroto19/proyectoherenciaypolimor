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
public abstract class VehiculoconMotor extends Vehiculo {
    
    /**
 *declaracion variables
 */
   private String tipoGasolina;

 /**
 *creacion constructor
 */
    public VehiculoconMotor(String tipoGasolina, String marca, int modeloVehiculo) {
        super( marca, modeloVehiculo);
        this.tipoGasolina = tipoGasolina;
        
    }
 /**
 *inicio get y set
 */
   public String getTipoGasolina() {
        return tipoGasolina;
   }

    public void seTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

   /**
 *fin get y set 
 */
    
    
    
 /**
 *llamado  metodos  abstractos
 */
    @Override
    public abstract void prenderVehiculo();

    @Override
    public abstract void apagarVehiculo();

     /**
 *metodo que imprime las variables  de esta clase 
 */
    public void mostrarVehiculoMotor(){
        System.out.println("___________________________________________________");

        System.out.println("segunda clase padre --> vehiculo con motor ");
        System.out.println("El TIPO DE GASOLINA  ES : " + this.tipoGasolina);
        System.out.println("***************************************************");
        System.out.println("*********S**I**G**U**I**E**N**T**E*****************");

    }
   
   
    
}
