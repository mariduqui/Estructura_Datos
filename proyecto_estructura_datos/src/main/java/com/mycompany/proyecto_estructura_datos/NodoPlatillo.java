/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;

/**
 *
 * @author ngranado
 */
public class NodoPlatillo {
    Platillo dato;
    NodoPlatillo siguiente;
    
     public NodoPlatillo(Platillo dato) {
        this.dato = dato;
    }
     
    public Platillo getDato() {
        return dato;
    }

    public void setDato(Platillo dato) {
        this.dato = dato;
    }

    public NodoPlatillo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPlatillo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return this.dato.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
