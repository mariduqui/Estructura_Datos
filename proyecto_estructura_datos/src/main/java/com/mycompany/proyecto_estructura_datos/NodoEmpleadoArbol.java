/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;

/**
 *
 * @author ngranado
 */
public class NodoEmpleadoArbol {
    Empleado dato;
    NodoEmpleadoArbol hijoIzq;
    NodoEmpleadoArbol hijoDer;

    public NodoEmpleadoArbol(Empleado dato) {
        this.dato = dato;
        this.hijoIzq = null;
        this.hijoDer = null;
    }
    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }

    public NodoEmpleadoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoEmpleadoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoEmpleadoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoEmpleadoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }
    
    
}
