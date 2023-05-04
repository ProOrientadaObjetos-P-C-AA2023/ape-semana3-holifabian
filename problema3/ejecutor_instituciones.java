/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2.Problema3;

/**
 *
 * @author USUARIOPC
 */
public class ejecutor_instituciones {

    public static void main(String[] args) {
        // Creamos dos objetos de tipo institucionesEducativas
        Problema3.institucionesEducativas institucion1 = new Problema3.institucionesEducativas("Colegio San Jose", "Privado", 500, 20, 2, 25, 1000.50);
        Problema3.institucionesEducativas institucion2 = new Problema3.institucionesEducativas("Escuela Publica 123", "Publico", 300, 10, 1, 12, 500.75);
        
        // Calculamos el presupuesto de cada institución
        institucion1.calcularPresupuesto();
        institucion2.calcularPresupuesto();
        
        // Imprimimos la información de cada institución
        System.out.println(institucion1.toString());
        System.out.println(institucion2.toString());
    }
}