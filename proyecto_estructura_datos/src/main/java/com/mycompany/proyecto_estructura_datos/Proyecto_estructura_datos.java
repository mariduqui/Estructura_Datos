/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_estructura_datos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ngranado
 */
public class Proyecto_estructura_datos {

    public static void main(String[] args) {
        System.out.println("Proyecto Estructura de Datos Restaurante \n");
        System.out.println("Platillos \n");
        
        //Lista circular de platillos
        ListaCircular l = new ListaCircular();
        
        //Agrega platillos de forma estatica y muestra la informacion.
        
        l.inserta(new Platillo(0, "Arroz con Pollo", 3000, 4000));
        System.out.println(l.toString());
        l.inserta(new Platillo(1, "La Carnita Roja", 4000, 6000));
        System.out.println(l.toString());
        l.inserta(new Platillo(2, "Pasta en salsa blanca", 2500, 3500));
        System.out.println(l.toString());
        l.inserta(new Platillo(3, "Ensalada ", 1500, 2200));
        System.out.println(l.toString());
        l.inserta(new Platillo(4, "Caviar", 7800, 10200));
        System.out.println(l.toString());
        // Muestra el platillo que sigue despues del ultimo.
        System.out.println(l.imprimirSiguienteDelUltimo());
        
        // Se crea una lista de tipo "LinkedList" para recrear la lista de clientes
        Queue<String> colaClientes = new LinkedList<>();
        colaClientes.add("Maria");
        colaClientes.add("Pablo");
        colaClientes.add("Rebeca");
        colaClientes.add("Pedro");
        
        // Titulo
        System.out.println("\nLista de pedidos pendientes: \n");
        
    //Ciclo while para atender a los clientes 
    while (!colaClientes.isEmpty()) {
      // Crear una copia de la cola de clientes
        Queue<String> copiaColaClientes = new LinkedList<>(colaClientes);

        System.out.println("\nAtendiendo a: " + copiaColaClientes.peek());
        // Se imprime la informacion del ciclo de vida de un pedido.
        System.out.println("El cliente está seleccionando su orden");
        System.out.println("Registrando orden");
        System.out.println("El cliente realizó el pago.");

        // Elimina el cliente de la cola original
        String clienteAtendido = colaClientes.poll();
        System.out.println(clienteAtendido + " ha sido atendido.\n");

        // Fila actual despues de atender al cliente que estaba de primer lugar en la lista.
        System.out.println("Fila actual:\n ");
        for (String cliente : colaClientes) {
            System.out.println(cliente);
        }
        }
        // Sale del while para imprimir la pila de empleados.
        System.out.println("Empleados \n");
        PilaEmpleados pila = new PilaEmpleados();

        pila.apilar(new Empleado(0, "Pablo Ortiz", "Cocinero"));
        System.out.println(pila.imprimirPila());

        pila.apilar(new Empleado(1, "Luis Calderon", "Cajero"));
        System.out.println(pila.imprimirPila());
        
    
    
    }
}
