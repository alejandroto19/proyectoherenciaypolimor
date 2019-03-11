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
public class Patineta extends Vehiculo{
     /**
 *declaracion variables
 */
    private int longituddelTablero;

     /**
 *creacion de constructor 
 */
    public Patineta(int longituddelTablero, String marca, int modeloVehiculo) {
        super( marca, modeloVehiculo);
        this.longituddelTablero = longituddelTablero;
    }

     /**
 *inciio get y set 
 */
    public int getLongituddelTablero() {
        return longituddelTablero;
    }

    public void setlongituddelTablero(int longituddelTablero) {
        this.longituddelTablero = longituddelTablero;
    }
     /**
 *fin get y set 
 */
    
    
     /**
 *llamado de metodos abstractos
 */
    @Override
    public void prenderVehiculo() {
        System.out.println("___________________________________________________");
        System.out.println(" prender la patineta");
    }

    @Override
    public void apagarVehiculo() {
        System.out.println("apagar la  patineta");
    }
    
    
     /**
 *metodo que imprime la svariables de esta clase 
 */
    public void mostrarPatineta(){
    
        System.out.println("clase hija patineta de vehiculo");
        System.out.println("LA LONGITUD DEL TABLERO  ES : " + this.longituddelTablero);

        System.out.println("***************************************************");
        System.out.println("*************H**E**R**E**D**A**********************");
         System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
    }
    
}
