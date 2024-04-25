package com.mycompany.arbol_binario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import EstructurasLineales.Arbol;

/**
 *
 * @author Massielle
 */
public class Arbol_binario {
    public static void main(String[] arg){
        Arbol arbol = new Arbol();
        arbol.insertar(13);
        arbol.insertar(15);
        arbol.insertar(18);
        arbol.insertar(19);
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(2);
        arbol.insertar(6);
        System.out.println("INORDER: ");
        arbol.iniciarInorder();
        System.out.println("");
        System.out.println("PREORDER: ");
        arbol.iniciarPreorder();
        System.out.println("");
        System.out.println("POSTORDER: ");
        arbol.iniciarPostorder();
    }
}
