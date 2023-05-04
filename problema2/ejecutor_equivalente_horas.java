/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema2;

/**
 *
 * @author USUARIOPC
 */
public class ejecutor_equivalente_horas {

    public static void main(String[] args) {
        equivalente_Horas horas1 = new equivalente_Horas(50);
        equivalente_Horas horas2 = new equivalente_Horas(72);
        
        horas1.calcularEquivalente();
        horas2.calcularEquivalente();
        
        System.out.println("Horas 1: " + horas1);
        System.out.println("Horas 2: " + horas2);
    }
}
}