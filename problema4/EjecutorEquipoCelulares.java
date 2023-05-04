/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2.Problema3.problema4;

/**
 *
 * @author USUARIOPC
 */
public class EjecutorEquipoCelulares {
    public static void main(String[] args) {
        problema4.equipoCelulares equipo1 = new problema4.equipoCelulares("Android", 5.5, 500, 16, "00:11:22:33:44:55", 123456789);
        equipo1.calcularIvaCostoInicial();
        equipo1.calcularIvaCostoFinal();

        problema4.equipoCelulares equipo2 = new problema4.equipoCelulares("iOS", 6.1, 1000, 16, "AA:BB:CC:DD:EE:FF", 987654321);
        equipo2.calcularIvaCostoInicial();
        equipo2.calcularIvaCostoFinal();

        System.out.println("Información del equipo 1:");
        System.out.println(equipo1.toString());

        System.out.println("Información del equipo 2:");
        System.out.println(equipo2.toString());
    }
}
