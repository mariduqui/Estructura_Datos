/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;

/**
 *
 * @author ngranado
 */
public class NodoArbolPlatillo {
    Platillo dato;
    NodoArbolPlatillo hijoIzq;
    NodoArbolPlatillo hijoDer;
    
    public NodoArbolPlatillo(Platillo dato) {
        this.dato = dato;
        this.hijoIzq = null;
        this.hijoDer = null;
    }
    

    public Platillo getDato() {
        return dato;
    }

    public void setDato(Platillo dato) {
        this.dato = dato;
    }

    public NodoArbolPlatillo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbolPlatillo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbolPlatillo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbolPlatillo hijoDer) {
        this.hijoDer = hijoDer;
    }
    
    
}
