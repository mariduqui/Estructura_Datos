/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;

/**
 *
 * @author ngranado
 */
public class ListaCircular {
    private NodoPlatillo primero;
    NodoPlatillo cabeza;
    NodoPlatillo ultimo;
    
    public Platillo obtenerPrimeroPlatillo() {
    if (cabeza != null) {
        Platillo platillo = cabeza.getDato();
        eliminarPrimeroPlatillo(); // Elimina el platillo asignado
        return platillo;
    } else {
        System.out.println("La lista de platillos está vacía.");
        return null; // O manejar el caso según tus requisitos.
    }
}
    public void inserta(Platillo platillo) {
        NodoPlatillo nuevoNodo = new NodoPlatillo(platillo);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = cabeza;
            ultimo.siguiente = cabeza;
        } else {
            if (platillo.id < cabeza.dato.id) {
                
                // Insertamos al inicio
                NodoPlatillo auxiliar = nuevoNodo;
                auxiliar.siguiente = cabeza;
                cabeza = auxiliar;
                ultimo.siguiente = cabeza;
                
            } else {
                if (ultimo.dato.id < platillo.id) {
                    
                    // Insertamos al final
                    NodoPlatillo auxiliar = nuevoNodo;
                    ultimo.siguiente = auxiliar;
                    ultimo = auxiliar;
                    ultimo.siguiente = cabeza;
                    
                } else {
                    
                    // Insertamos en el medio de la lista
                    NodoPlatillo auxiliar = cabeza;
                    
                    while (auxiliar.siguiente.dato.id < platillo.id) {
                        auxiliar = auxiliar.siguiente;
                    }
                    
                    nuevoNodo.siguiente = auxiliar.siguiente;
                    auxiliar.siguiente = nuevoNodo;
                }
            }
        }
    }
      public void eliminarPrimeroPlatillo() {
    if (cabeza != null) {
        cabeza = cabeza.siguiente;
        ultimo.siguiente = cabeza;

        // Actualiza el último platillo después de eliminar el primero
        if (cabeza == null) {
            ultimo = null;
        }
    }
}

    public void eliminarPlatillo(Platillo platillo) {
        if (primero != null) {
            NodoPlatillo actual = primero;
            NodoPlatillo anterior = ultimo;

            // Buscar el nodo que contiene el platillo
            while (actual != null && actual.dato != platillo) {
                anterior = actual;
                actual = actual.siguiente;
            }

            // Verificar si se encontró el platillo
            if (actual != null) {
                anterior.siguiente = actual.siguiente;
                if (actual == primero) {
                    primero = actual.siguiente;
                }
                if (actual == ultimo) {
                    ultimo = anterior;
                }
            }
        }
    }
    
    public String imprimirSiguienteDelUltimo() {
        return ultimo.siguiente.dato.toString();
    }

    @Override
    public String toString() {
        String respuesta = "Lista circular de Platillos: \n";
        
        NodoPlatillo auxiliar = cabeza;
        
        if (auxiliar != null) {
            // Para determinar que no está vacía
            respuesta += auxiliar.dato.toString() + "\n";
            auxiliar = auxiliar.siguiente;
            while (auxiliar != cabeza) {
                respuesta += auxiliar.dato.toString() + "\n";
                auxiliar = auxiliar.siguiente;
            }
        } else {
            respuesta += "Vacía";
        }
        
        return respuesta;
    }
}
