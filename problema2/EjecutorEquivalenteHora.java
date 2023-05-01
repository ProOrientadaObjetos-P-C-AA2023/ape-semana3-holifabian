/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodosLosProyectosOficiales.Problema1.Problema2;

/**
 *
 * @author USUARIOPC
 */
public class EjecutorEquivalenteHora {
    public static void main(String[] args) {
        EquivalenteHora objeto1 = new EquivalenteHora(24);
        EquivalenteHora objeto2 = new EquivalenteHora(48);

        System.out.println("Objeto 1:");
        System.out.println("Horas: " + objeto1.horas);
        System.out.println("Minutos: " + objeto1.convertirHorasAMinutos());
        System.out.println("Segundos: " + objeto1.convertirHorasASegundos());
        System.out.println("Días: " + objeto1.convertirHorasADias());

        System.out.println();

        System.out.println("Objeto 2:");
        System.out.println("Horas: " + objeto2.horas);
        System.out.println("Minutos: " + objeto2.convertirHorasAMinutos());
        System.out.println("Segundos: " + objeto2.convertirHorasASegundos());
        System.out.println("Días: " + objeto2.convertirHorasADias());
    }
}
