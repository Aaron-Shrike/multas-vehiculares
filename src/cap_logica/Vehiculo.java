/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_logica;

import java.util.Scanner;

/**
 *
 * @author Aaron Rojas Vera
 */
public class Vehiculo {
    private String placa;
    private float velocidad;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    public void leer(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese placa : ");
        placa = leer.next();
        
        System.out.print("Ingrese velocidad(km/h) : ");
        velocidad = leer.nextFloat();
    }
}
