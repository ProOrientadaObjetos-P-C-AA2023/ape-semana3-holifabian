/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodosLosProyectosOficiales.Problema1;

/**
 *
 * @author USUARIOPC
 */
public class Terreno {
    private int costo_terreno;
    private int ancho;
    private int largo;
    private int area;
    private int valorMetroCuadrado;

    // Constructor
    public Terreno(int ancho, int largo, int valorMetroCuadrado) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
        this.area = ancho * largo;
        this.costo_terreno = this.area * this.valorMetroCuadrado;
    }

    // Métodos
    public void imprimirDatos() {
        System.out.println("Ancho: " + this.ancho);
        System.out.println("Largo: " + this.largo);
        System.out.println("Valor del metro cuadrado: " + this.valorMetroCuadrado);
        System.out.println("Área del terreno: " + this.area);
        System.out.println("Costo del terreno: " + this.costo_terreno);
    }
}
