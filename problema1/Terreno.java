/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author USUARIOPC
 */
class Terreno{
    private double costoTerreno;
    private double anchoTerreno;
    private double largoTerreno;
    private double areaTerreno;
    private double valorMetroCuadrado;    
    public Terreno(){}
    public Terreno(double anchoTerreno, double largoTerreno, double valorMetroCuadrado){
    this.anchoTerreno = anchoTerreno;
    this.largoTerreno = largoTerreno;
    this.valorMetroCuadrado = valorMetroCuadrado;
    }    
    public void establecerAnchoTerreno(double c){
        anchoTerreno = c;
    }    
    public void establecerLargoTerreno(double c){
        largoTerreno = c;
    }    
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }    
    public double obtenerCostoTerreno(){
        return this.costoTerreno;
    }    
    public double obtenerAnchoTerreno(){
        return this.anchoTerreno;
    }    
    public double obtenerLargoTerreno(){
        return this.largoTerreno;
    }    
    public double obtenerAreaTerreno(){
        return this.areaTerreno;
    }    
    public double obtenerValorMetroCuadrado(){
        return this.valorMetroCuadrado;
    }    
    public void calcularAreaTerreno() {
    this.areaTerreno = anchoTerreno * largoTerreno;
    }    
    public void calcularCostoTerreno() {
    this.costoTerreno = areaTerreno * valorMetroCuadrado;
    } 
    public String toString(){
        return String.format("SU TERRENO CON LOS SIGUIENTES PARAMETROS:"
                +"\nAncho del terreno:%.2f"
                +"\nLargo del terreno:%.2f"
                +"\nValor por metro cuadrado:%.2f"
                +"\nArea del terreno:%.2f"
                +"\nCosto del terreno:%.2f"
                ,obtenerAnchoTerreno()
                ,obtenerLargoTerreno()
                ,obtenerValorMetroCuadrado()
                ,obtenerAreaTerreno()
                ,obtenerCostoTerreno());
    }
}