/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Elias
 */
public class Vendedor extends Usuario{
    private String Correo;
    private double MayorDeEdad;
    private String CuentaBancaria;

    public Vendedor() {
    }

    public Vendedor(String Nombre, String ApellidoPaterno, String ApellidoMaterno, int Edad, String Correo, double MayorDeEdad, String CuentaBancaria) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, Edad);
        this.Correo = Correo;
        this.MayorDeEdad = MayorDeEdad;
        this.CuentaBancaria = CuentaBancaria;
    }
    
    public void EdadMayor(){
        
    } 

    public String getCorreo() {
        return Correo;
    }

    public double getMayorDeEdad() {
        return MayorDeEdad;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setMayorDeEdad(double MayorDeEdad) {
        this.MayorDeEdad = MayorDeEdad;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }
    
    
    
}
