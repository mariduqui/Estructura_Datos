/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_estructura_datos;

/**
 *
 * @author ngranado
 */
public class ArbolPlatillos {
   private NodoArbolPlatillo raiz;

    public void insertar(Platillo platillo) {
        raiz = insertarRec(raiz, platillo);
    }

    private NodoArbolPlatillo insertarRec(NodoArbolPlatillo nodo, Platillo platillo) {
        if (nodo == null) {
            return new NodoArbolPlatillo(platillo);
        }

        if (platillo.getCategoria().compareTo(nodo.getDato().getCategoria()) < 0) {
            nodo.setHijoIzq(insertarRec(nodo.getHijoIzq(), platillo));
        } else if (platillo.getCategoria().compareTo(nodo.getDato().getCategoria()) > 0) {
            nodo.setHijoDer(insertarRec(nodo.getHijoDer(), platillo));
        }

        return nodo;
    }

    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(NodoArbolPlatillo nodo) {
        if (nodo != null) {
            inOrdenRec(nodo.getHijoIzq());
            System.out.print(nodo.getDato() + ", ");
            inOrdenRec(nodo.getHijoDer());
        }
    }

    public Platillo buscarPorCategoria(String categoria) {
        return buscarPorCategoriaRec(raiz, categoria);
    }

    private Platillo buscarPorCategoriaRec(NodoArbolPlatillo nodo, String categoria) {
        if (nodo == null || nodo.getDato().getCategoria().equals(categoria)) {
            return (nodo != null) ? nodo.getDato() : null;
        }

        if (categoria.compareTo(nodo.getDato().getCategoria()) < 0) {
            return buscarPorCategoriaRec(nodo.getHijoIzq(), categoria);
        } else {
            return buscarPorCategoriaRec(nodo.getHijoDer(), categoria);
        }
    }
}
