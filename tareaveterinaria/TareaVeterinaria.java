/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaveterinaria;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class TareaVeterinaria {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Cliente [] clientes;
        
        System.out.println("Ingrese la cantidad de clientes: ");
        int cant_clientes = sc.nextInt();
        clientes = new Cliente[cant_clientes];
        for (int i = 0; i < clientes.length; i++) {
            
            System.out.println("Ingrese numero del cliente "+(i+1)+": ");
            int numeroCliente = sc.nextInt();
            sc.nextLine();        
            System.out.println("Ingrese nombre del cliente "+(i+1)+": ");
            String nombre = sc.next();
            System.out.println("Ingrese cantidad de años de antiguedad del cliente "+(i+1)+": ");
            int antiguedad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre de la mascota del cliente "+(i+1)+": ");
            String nombreMascota = sc.next();
            System.out.println("Ingrese la edad de la mascota del cliente "+(i+1)+": ");
            int edadMascota = sc.nextInt();
            
            clientes[i] = new Cliente(numeroCliente,nombre,antiguedad,nombreMascota,edadMascota);
                     
       }
        
        System.out.println("La cantidad de clientes es de "+clientes.length);
        
        double promedio = 0;
        int sumaEdades = 0;
        for (int i = 0; i < clientes.length; i++) {
            sumaEdades += clientes[i].getEdadMascota();
            promedio = (double)sumaEdades/clientes.length;
            
        }
        System.out.println("El promedio de edades es de "+promedio);
                
                
        int mayorA5 = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].getAntiguedad() >= 5) {
                mayorA5++;
                
            }
            
        }
        
        System.out.println("La cantidad de clientes con una antiguedad mayor o igual a 5 es de "+mayorA5);
        
        
        
        
    }
    
}
