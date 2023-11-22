/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;

/**
 *
 * @author ngranado
 */
public class Platillo {
    int id;
    String nombre;
    int gastoIngredientes;
    int precio;
    Platillo siguiente;
    String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Platillo() {
    }

    public Platillo(int id, String nombre, int gastoIngredientes, int precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.gastoIngredientes = gastoIngredientes;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGastoIngredientes() {
        return gastoIngredientes;
    }

    public void setGastoIngredientes(int gastoIngredientes) {
        this.gastoIngredientes = gastoIngredientes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Platillo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Platillo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Platillo{" + "id=" + id + ", nombre=" + nombre + ", gastoIngredientes=" + gastoIngredientes + ", precio=" + precio + ", siguiente=" + siguiente + ", categoria=" + categoria + '}';
    }

}
