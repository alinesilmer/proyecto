/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.*;
/**
 *
 * @author hecto
 */
class Pasajero {
    private String nombre;
    private String apellido;
    private int id;
    private int dia;
    private int mes;
    private int anio;
    
    public Pasajero(){
        
    }
    
    public Pasajero(String nombre, String apellido, int id, int dia, int mes, int anio){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setId(int id){
        Set<String> idsRegistrados = new HashSet<>();
        if (idsRegistrados.contains(id)) {
            System.out.println("El DNI ya está registrado");
        } else {
            this.id = id;
        }
    }
    
    public int getId(){
        return id;
    }
    
     public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getDia(){
        return dia;
    }
    
     public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getMes(){
        return mes;
    }
    
     public void setAnio(int anio){
        this.anio = anio;
    }
    
    public int getAnio(){
        return anio;
    }
}
