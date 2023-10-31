/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_estructura_datos;

/**
 *
 * @author ngranado
 */
public class Proyecto_estructura_datos {

    public static void main(String[] args) {
        System.out.println("Proyecto Estructura de Datos Restaurante \n");
        System.out.println("Platillos \n");
        ListaCircular l = new ListaCircular();
        
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
        System.out.println(l.imprimirSiguienteDelUltimo());
        
        System.out.println("Empleados \n");
        PilaEmpleados pila = new PilaEmpleados();

        pila.apilar(new Empleado(0, "Pablo Ortiz", "Cocinero"));
        System.out.println(pila.imprimirPila());

        pila.apilar(new Empleado(1, "Luis Calderon", "Cajero"));
        System.out.println(pila.imprimirPila());
        
    }
}
