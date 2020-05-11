/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaveterinaria;

/**
 *
 * @author Nacho
 */
public class Cliente {    
        
        int numeroCliente;
        String nombre;
        int antiguedad;
        String nombreMascota;
        int edadMascota;

    public Cliente(int numeroCliente, String nombre, int antiguedad, String nombreMascota, int edadMascota) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numeroCliente=" + numeroCliente + ", nombre=" + nombre + ", antiguedad=" + antiguedad + ", nombreMascota=" + nombreMascota + ", edadMascota=" + edadMascota + '}';
    }
        
        
        
        
       
  
        
    }
    

