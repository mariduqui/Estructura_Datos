/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;

public class Orden {
       private static int nextOrderId = 1; // Variable estática para el siguiente ID disponible
    
        int id;
        String nombreCliente;
        String platillo;
        int monto;
        
    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getPlatillo() {
        return platillo;
    }

    public int getMontoPagado() {
        return monto;
    }

    public Orden(String nombreCliente, String platillo, int monto) {
       this.id = nextOrderId++;
        this.nombreCliente = nombreCliente;
        this.platillo = platillo;
        this.monto = monto;
    }
    
}
