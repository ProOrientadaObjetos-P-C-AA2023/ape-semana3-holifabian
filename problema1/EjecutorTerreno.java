/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodosLosProyectosOficiales.Problema1;

/**
 *
 * @author USUARIOPC
 */
public class EjecutorTerreno {
    public static void main(String[] args) {
        Terreno terreno1 = new Terreno(10, 20, 1000);
        Terreno terreno2 = new Terreno(5, 15, 1500);

        System.out.println("Datos del primer terreno:");
        terreno1.imprimirDatos();

        System.out.println("\nDatos del segundo terreno:");
        terreno2.imprimirDatos();
    }
}
