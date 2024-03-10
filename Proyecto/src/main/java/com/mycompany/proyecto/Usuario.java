/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Elias
 */
public class Usuario {
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int Edad;

    public Usuario(String Nombre, String ApellidoPaterno, String ApellidoMaterno, int Edad) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Edad = Edad;
    }

    public Usuario() {
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public int getEdad() {
        return Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public void ImprimrDatos (){
        System.out.println("Nombre: ");
        System.out.println("Apellido Paterno: ");
        System.out.println("Apellido Materno: ");
        System.out.println("Edad: ");
    }
    
}
