/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;

/**
 *
 * @author ngranado
 */
public class ArbolEmpleado {
    private NodoEmpleadoArbol raiz;

    public void insertar(Empleado empleado) {
        raiz = insertarRec(raiz, empleado);
    }

    private NodoEmpleadoArbol insertarRec(NodoEmpleadoArbol nodo, Empleado empleado) {
        if (nodo == null) {
            return new NodoEmpleadoArbol(empleado);
        }

        if (empleado.getPuesto().compareTo(nodo.getDato().getPuesto()) < 0) {
            nodo.setHijoIzq(insertarRec(nodo.getHijoIzq(), empleado));
        } else if (empleado.getPuesto().compareTo(nodo.getDato().getPuesto()) > 0) {
            nodo.setHijoDer(insertarRec(nodo.getHijoDer(), empleado));
        }

        return nodo;
    }

    public void inOrdenConPuesto(String puesto) {
        inOrdenConPuestoRec(raiz, puesto);
    }

    private void inOrdenConPuestoRec(NodoEmpleadoArbol nodo, String puesto) {
        if (nodo != null) {
            inOrdenConPuestoRec(nodo.getHijoIzq(), puesto);
            if (nodo.getDato().getPuesto().equals(puesto)) {
                System.out.print(nodo.getDato() + ", ");
            }
            inOrdenConPuestoRec(nodo.getHijoDer(), puesto);
        }
    }

    public void buscarTodosPorPuesto(String puesto) {
        buscarTodosPorPuestoRec(raiz, puesto);
    }

    private void buscarTodosPorPuestoRec(NodoEmpleadoArbol nodo, String puesto) {
        if (nodo != null) {
            buscarTodosPorPuestoRec(nodo.getHijoIzq(), puesto);
            if (nodo.getDato().getPuesto().equals(puesto)) {
                System.out.println(nodo.getDato());
            }
            buscarTodosPorPuestoRec(nodo.getHijoDer(), puesto);
        }
    }
}
