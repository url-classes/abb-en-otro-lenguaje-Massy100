/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasLineales;

import EstructurasNoLineales.NodoArbol;

/**
 *
 * @author Massielle
 */
public class Arbol {
    NodoArbol inicial;
    public Arbol(){
        this.inicial = null;
    }
    public void insertar(int valor){
        if(this.inicial == null){
            this.inicial = new NodoArbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }
    public void iniciarPreorder(){
        this.preorder(this.inicial);
    }
    public void preorder(NodoArbol nodo){
        if(nodo == null){ // caso base
            return; // detener recursividad
        }else{
            System.out.print(nodo.getValor()+" ");
            preorder(nodo.getNodoIzquierdo());
            preorder(nodo.getNodoDerecho());
        }
    }
    public void iniciarInorder(){
        this.inorder(this.inicial);
    }
    public void inorder(NodoArbol nodo){
        if(nodo == null){ // caso base
            return; // detener recursividad
        }else{
            inorder(nodo.getNodoIzquierdo());
            System.out.print(nodo.getValor()+" ");
            inorder(nodo.getNodoDerecho());
        }
    }
    public void iniciarPostorder(){
        this.postorder(this.inicial);
    }
    public void postorder(NodoArbol nodo){
        if(nodo == null){ // caso base
            return; // detener recursividad
        }else{
            postorder(nodo.getNodoIzquierdo());
            postorder(nodo.getNodoDerecho());
            System.out.print(nodo.getValor()+" ");
        }
    }
}
