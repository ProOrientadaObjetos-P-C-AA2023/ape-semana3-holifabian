
package Problema2;
public class EquivalenteHora {
    // Atributos privados de la clase
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;
    
    // Constructor con parámetros
    public EquivalenteHora(int horas) {
        this.horas = horas;
        this.minutos = horas * 60;
        this.segundos = horas * 3600;
        this.dias = horas / 24.0;
    }
    
    // Métodos getters para acceder a los atributos privados
    public int getHoras() {
        return horas;
    }
    
    public int getMinutos() {
        return minutos;
    }
    
    public int getSegundos() {
        return segundos;
    }
    
    public double getDias() {
        return dias;
    }
    
    // Método toString para imprimir los datos del objeto
    @Override
    public String toString() {
        return "Horas: " + horas + ", Minutos: " + minutos + ", Segundos: " + segundos + ", Días: " + dias;
    }
}