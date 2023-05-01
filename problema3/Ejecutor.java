/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

/**
 *
 * @author USUARIOPC
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Creación de dos objetos de InstitucionEducativa
        InstitucionEducativa institucion1 = new InstitucionEducativa("Colegio San José", "Privado", 1000, 50, 3, 5000);
        InstitucionEducativa institucion2 = new InstitucionEducativa("Colegio Nacional", "Público", 2000, 80, 5, 3000);
        
        // Impresión de los datos de cada institución
        System.out.println(institucion1);
        System.out.println(institucion2);
    }
}
