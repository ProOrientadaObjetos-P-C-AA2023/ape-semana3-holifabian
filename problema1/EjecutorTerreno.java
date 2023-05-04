/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author USUARIOPC
 */
public class EjecutorTerreno{
    public static void main(String[] args) {        
        Terreno terreno1 = new Terreno(20.0,40.0,50.0);
        //
        terreno1.calcularAreaTerreno();
        terreno1.calcularCostoTerreno();
        System.out.println(terreno1);
        //
        Terreno terreno2 = new Terreno(53.2, 76.3, 200.5);        
        double anchoterreno = 32.5;
        double largoterreno = 40.0;
        double valormetrocuadrado = 100.2; 
        //enviar valores a terreno 1 con la variable "c" del set
        terreno1.establecerAnchoTerreno(anchoterreno);
        terreno1.establecerLargoTerreno(largoterreno);
        terreno1.establecerValorMetroCuadrado(valormetrocuadrado);        
        //calculos terreno 1 enviando valores variable c
        terreno1.calcularAreaTerreno();
        terreno1.calcularCostoTerreno(); 
        //calculos terreno2
        terreno2.calcularAreaTerreno();
        terreno2.calcularCostoTerreno();        
        System.out.printf("\nTerreno1\n"+"Ancho de terreno: %.2f "
                +"\nLargo del terreno:%.2f "
                +"\nValor por metro cuadrado:%.2f "
                +"\nArea del terreno:%.2f "
                +"\nCosto del terreno:%.2f\n "
                , terreno1.obtenerAnchoTerreno()
                ,terreno1.obtenerLargoTerreno()
                ,terreno1.obtenerValorMetroCuadrado()
                ,terreno1.obtenerAreaTerreno()
                ,terreno1.obtenerCostoTerreno());                
        System.out.printf("\nTerreno2\n"+"Ancho de terreno: %.2f "
                +"\nLargo del terreno:%.2f "
                +"\nValor por metro cuadrado:%.2f "
                +"\nArea del terreno:%.2f "
                +"\nCosto del terreno:%.2f "
                , terreno2.obtenerAnchoTerreno()
                ,terreno2.obtenerLargoTerreno()
                ,terreno2.obtenerValorMetroCuadrado()
                ,terreno2.obtenerAreaTerreno()
                ,terreno2.obtenerCostoTerreno());
    }
}