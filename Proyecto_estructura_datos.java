/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_estructura_datos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Proyecto_estructura_datos {

    public static void main(String[] args) {

        System.out.println("Proyecto Estructura de Datos Restaurante \n");
        System.out.println("Platillos \n");

        int sumaTotal = 0; // Variable para la suma total
        // Lista circular de platillos
        ListaCircular l = new ListaCircular();

        // Agrega platillos de forma estática y muestra la información.
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

        List<Orden> ordenesPendientes = new ArrayList<>(); // Declaración fuera del bucle

        // Ciclo while para atender a los clientes
        while (!colaClientes.isEmpty()) {
            String clienteActual = colaClientes.peek();
            System.out.println("\nAtendiendo a: " + clienteActual);
            // Se imprime la información del ciclo de vida de un pedido.
            System.out.println("El cliente está seleccionando su orden");

            // Obtener el platillo seleccionado para el cliente actual
            Platillo platilloSeleccionado = l.obtenerPrimeroPlatillo();

            // Verificar si hay platillos disponibles
            if (platilloSeleccionado != null) {
                // Calcular monto final aplicando el 10% de servicio
                int montoFinal = (int) (platilloSeleccionado.precio * 1.1);
                 // Sumar el monto final al total
                sumaTotal += montoFinal;
        
                // Crear una orden y agregarla a la lista doble de órdenes
            Orden orden = new Orden( clienteActual, platilloSeleccionado.nombre, montoFinal);
            ordenesPendientes.add(orden);
            
                System.out.println(clienteActual + " eligió " + platilloSeleccionado.nombre);
                System.out.println("Registrando orden para " + clienteActual);
                System.out.println("El cliente realizó el pago.");

                // Eliminar el platillo seleccionado de la lista de platillos disponibles
                l.eliminarPrimeroPlatillo();

                // Eliminar el cliente de la cola original
                colaClientes.poll();
            } else {
                System.out.println("Lo sentimos, no hay platillos disponibles en este momento para " + clienteActual);
                // Puedes agregar más lógica aquí según tus requisitos

                // Mover al siguiente cliente
                colaClientes.add(colaClientes.poll());
            }

            // Fila actual después de atender al cliente que estaba de primer lugar en la lista.
            System.out.println("Fila actual:\n" + colaClientes.toString());
        }

         // Imprimir la lista de pedidos pendientes
         System.out.println("\nLista de pedidos: ");
         double sumaTotalMontos = 0;
         for (int i = 0; i < ordenesPendientes.size(); i++) {
            Orden orden = ordenesPendientes.get(i);
            System.out.println("ID: " + i + ", " +
                       "Cliente: " + orden.getNombreCliente() + ", " +
                       "Platillo: " + orden.getPlatillo() + ", " +
                       "Monto: " + orden.getMontoPagado());
            
            sumaTotalMontos += orden.getMontoPagado();  // Suma directamente los montos finales
}
        // Imprimir la suma total con el 10% de servicio
       System.out.println("\nSuma total de montos finales: " + sumaTotalMontos);
        
        // Sale del while para imprimir la pila de empleados.
            System.out.println("\nEmpleados \n");
            PilaEmpleados pila = new PilaEmpleados();

            pila.apilar(new Empleado(0, "Pablo Ortiz", "Cocinero"));
            System.out.println(pila.imprimirPila());

                pila.apilar(new Empleado(1, "Luis Calderon", "Cajero"));
                System.out.println(pila.imprimirPila());
    }
}

