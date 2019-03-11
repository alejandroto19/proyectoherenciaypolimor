/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ProyectoHerencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johann Alejandro Torres Soler
 *  
 * clase principal donde creamos la lista asignamos valores e imprimimos los resultados
 */

public class Principal {
    
    public void principal1(){
     /**
 *asignacion de valores a las varables de las diferentes clases
 */
        Carro carNum1 = new Carro("1300 cm ","corriente","chevrolet",2014);
        Carro carNum2 = new Carro("4500 cm ","diesel","aston martin",2019);
    
        Jet jetNum1 = new Jet(2,"avtur","Airbus",2019);
        Jet jetNum2 = new Jet(1,"jet","Boeing",2020);
      
        Patineta patiNum1 = new Patineta(120,"element",2019);
        Patineta patiNum2 = new Patineta(80,"fallen",2019);
    
        Bicicleta biciNum1 = new Bicicleta(1,"GW",2015);
        Bicicleta biciNum2 = new Bicicleta(2,"optimus",2019);
     
        /**
 *creacion de lista y asignacionde  valores a  las variables de la lista 
 */ 
        
    
        List<Vehiculo> vehiculos = new ArrayList<>();
    
        vehiculos.add(carNum1);
        vehiculos.add(carNum2);
        vehiculos.add(jetNum1);
        vehiculos.add(jetNum2);
        vehiculos.add(biciNum1);
        vehiculos.add(biciNum2);
        vehiculos.add(patiNum1);
        vehiculos.add(patiNum2);
        
         /**
 *creacion de listas temporales instaciandolas a los objetos 
 */
        for (Vehiculo listaTemporal:vehiculos){
            
            if (listaTemporal instanceof Carro){
           
                Carro carro1 = (Carro) listaTemporal;
                  /**
                  *llamado a los metodos 
                   */
                carro1.prenderVehiculo();
                carro1.apagarVehiculo();
                carro1.mostrarCarro();
                
                carro1.mostrarVehiculo();
                carro1.mostrarVehiculoMotor();
                
            }
            else if (listaTemporal instanceof Jet){
            
                Jet jet1 = (Jet) listaTemporal;
                /**
                *llamado a los metodos 
                */
                jet1.prenderVehiculo();
                jet1.apagarVehiculo();
                jet1.mostrarJet();
                jet1.mostrarVehiculo();
                jet1.mostrarVehiculoMotor();
            }
            else if (listaTemporal instanceof Bicicleta){
            
                Bicicleta bici1 = (Bicicleta) listaTemporal;
                 /**
                 *llamado a los metodos 
                 */
                bici1.prenderVehiculo();
                bici1.apagarVehiculo();
                bici1.mostrarBicicleta();
                bici1.mostrarVehiculo();
            }
            else if (listaTemporal instanceof Patineta){
            
                Patineta pati1 = (Patineta) listaTemporal;
                /**
                *llamado a los metodos 
                */
                pati1.prenderVehiculo();
                pati1.apagarVehiculo();
                pati1.mostrarPatineta();
                pati1.mostrarVehiculo();
            }
        }
    }
    
}
