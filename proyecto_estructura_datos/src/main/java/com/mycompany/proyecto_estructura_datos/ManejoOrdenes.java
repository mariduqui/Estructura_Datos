/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
/**
 *
 * @author ngranado
 */
public class ManejoOrdenes {
    private Queue<String> filaClientes = new LinkedList<>();
    private Stack<Orden> listaOrdenes = new Stack<>();
    private ListaDobleOrdenes listaDobleOrdenes = new ListaDobleOrdenes(); // Declara e inicializa la instancia
    private int nextOrderId = 0; // Variable de instancia para el ID

    public void agregarCliente(String nombreCliente) {
        filaClientes.add(nombreCliente);
    }

    public void procesarCliente() {
        if (!filaClientes.isEmpty()) {
        String nombreCliente = filaClientes.poll();
        
        // Simulación de generación de orden aleatoria
        Platillo platillo = new Platillo(0, "Arroz con Pollo", 3000, 4000,"almuerzo");
        int monto = platillo.precio;
        Orden orden = new Orden(nombreCliente, platillo.nombre, monto);
        listaDobleOrdenes.agregarOrden(orden); // Utiliza el método agregarOrden de la lista doble
    }
    }

    public void imprimirOrdenes() {
        for (Orden orden : listaOrdenes) {
            System.out.println("ID: " + orden.getId());
            System.out.println("Nombre del Cliente: " + orden.getNombreCliente());
            System.out.println("Platillo: " + orden.getPlatillo());
            System.out.println("Monto: " + orden.getMontoPagado());
            System.out.println("-----------");
        }
    }
}
