package Problema2;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        // Lectura de horas por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cantidad de horas para el primer objeto: ");
        int horas1 = sc.nextInt();
        System.out.print("Ingrese una cantidad de horas para el segundo objeto: ");
        int horas2 = sc.nextInt();
        
        // Creación de los objetos EquivalenteHora
        EquivalenteHora equivalente1 = new EquivalenteHora(horas1);
        EquivalenteHora equivalente2 = new EquivalenteHora(horas2);
        
        // Impresión de los datos de los objetos EquivalenteHora
        System.out.println("Datos del primer objeto: " + equivalente1);
        System.out.println("Datos del segundo objeto: " + equivalente2);
    }
}