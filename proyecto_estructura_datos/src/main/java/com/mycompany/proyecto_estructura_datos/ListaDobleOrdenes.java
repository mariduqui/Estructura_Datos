/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;

/**
 *
 * @author ngranado
 */
public class ListaDobleOrdenes {
    private NodoOrden primero;
    private NodoOrden ultimo;
    private int size;

    public ListaDobleOrdenes() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public void agregarOrden(Orden orden) {
        NodoOrden nuevoNodo = new NodoOrden(orden);

        if (isEmpty()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }

        size++;
    }

    public void imprimirOrdenes() {
        NodoOrden actual = primero;

        while (actual != null) {
            System.out.println("ID: " + actual.getOrden().id);
            System.out.println("Nombre del Cliente: " + actual.getOrden().nombreCliente);
            System.out.println("Platillo: " + actual.getOrden().platillo);
            System.out.println("Monto: " + actual.getOrden().monto);
            System.out.println("-----------");

            actual = actual.getSiguiente();
        }
    }
}
class NodoOrden {
    private Orden orden;
    private NodoOrden siguiente;
    private NodoOrden anterior;

    public NodoOrden(Orden orden) {
        this.orden = orden;
        this.siguiente = null;
        this.anterior = null;
    }

    public Orden getOrden() {
        return orden;
    }

    public NodoOrden getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoOrden siguiente) {
        this.siguiente = siguiente;
    }

    public NodoOrden getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoOrden anterior) {
        this.anterior = anterior;
    }
}
