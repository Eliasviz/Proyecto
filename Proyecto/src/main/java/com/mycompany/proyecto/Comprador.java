/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Elias
 */
public class Comprador extends Usuario{
    private String canasta;
    private int Dinero;
    private String Domicilio;

    public Comprador() {
    }

    public Comprador(String canasta, int Dinero, String Domicilio, String Nombre, String ApellidoPaterno, String ApellidoMaterno, int Edad) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, Edad);
        this.canasta = canasta;
        this.Dinero = Dinero;
        this.Domicilio = Domicilio;
    }

    public String getCanasta() {
        return canasta;
    }

    public int getDinero() {
        return Dinero;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setCanasta(String canasta) {
        this.canasta = canasta;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }
    
    
    
    
    
}
