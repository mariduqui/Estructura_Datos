/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;

/**
 *
 * @author ngranado
 */
public class PilaEmpleados {
    NodoEmpleado cima;

    public PilaEmpleados() {
        this.cima = null;
    }

    public boolean esVacia() {
        return cima == null;
    }

    public void apilar(Empleado empleado) {
        NodoEmpleado nuevo = new NodoEmpleado(empleado);

        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.siguiente = cima;
            cima = nuevo;
        }
    }

    public void desapilar() {
        if (!esVacia()) {
            cima = cima.siguiente;
            System.out.println("El empleado fue desapilado de la pila");
        } else {
            System.out.println("No se pueden desapilar empleados de una pila vacía.");
        }
    }

    public String imprimirPila() {
        String respuesta = "";
        NodoEmpleado temp = cima;

        if (!esVacia()) {
            while (temp != null) {
                respuesta += temp.dato.toString() + "\n";
                temp = temp.siguiente;
            }
        } else {
            respuesta = "La pila de empleados está vacía.";
        }

        return respuesta;
    }
}
