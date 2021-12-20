/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import cap_logica.Vehiculo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Aaron Rojas Vera
 */
public class Rojas02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        int op;
        
        do{
            op = menu();
             
            switch(op){
                case 1: registrarVehiculo(vehiculos);
                    break;
                case 2: mostrasMayor90(vehiculos);
                    break;
                case 3: mostrarMontoTotal(vehiculos);
                    break;
            }
        }while(op != 4);
    }
    
    private static int menu() {
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("\n\n");
        System.out.println("---------- MENU ---------- ");
        System.out.println("[1] Registrar Vehiculo");
        System.out.println("[2] Mostrar placas con velocidad mayor a 90 km/h");
        System.out.println("[3] Mostrar monto total recaudado");
        System.out.println("[4] Salir");      
        
        do{
            System.out.print("  Ingrese Opcion: ");
            opcion = leer.nextInt();
        }while(opcion < 1 || opcion > 4);
        
        return opcion;
    }
    
    private static void registrarVehiculo(ArrayList<Vehiculo> auxList) {
        Vehiculo vehi = new Vehiculo();
        
        vehi.leer();
        
        auxList.add(vehi);
        
        System.out.println("\n * Vehiculo registrado exitosamente");
    }
    
    private static void mostrasMayor90(ArrayList<Vehiculo> auxList) {
        Iterator<Vehiculo> elemento;
        boolean flag = false;
        
        if(!auxList.isEmpty()){
        
            elemento = auxList.iterator();
            
            System.out.println("\n -- LISTA PLACAS CON VELOCIDADES MAYOR A 90 KM/H --");
            while(elemento.hasNext()){
                Vehiculo v = elemento.next();
                                 
                if(v.getVelocidad() > 90.0){
                    flag = true;
                    System.out.println("\tPlaca: " + v.getPlaca() + " - Velocidad: " + v.getVelocidad() + " km/h");
                }
            }
            if(flag == false){
                System.out.println("* No hay vehiculos con mayor velocidad");
            }
        }
    }
    
    private static void mostrarMontoTotal(ArrayList<Vehiculo> auxList) {
        Iterator<Vehiculo> elemento;
        
        int cantMultas = 0;
        
        if(!auxList.isEmpty()){
        
            elemento = auxList.iterator();
            
            while(elemento.hasNext()){
                Vehiculo v = elemento.next();
                                 
                if(v.getVelocidad() > 90.0){
                    cantMultas++;
                }
            }
        }
        
        System.out.println("\n -- MONTO TOTAL RECAUDADO --");
        if(cantMultas > 0){
            System.out.println("\t S/. " + cantMultas*550);
        }else{
            System.out.println("* No hay multas");
        }
        
    }
    
}
