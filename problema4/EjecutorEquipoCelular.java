/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodosLosProyectosOficiales.Problema1.Problema2.Problema3.Problema4;

/**
 *
 * @author USUARIOPC
 */
public class EjecutorEquipoCelular {
    public static void main(String[] args) {
        // Crea un objeto EquipoCelular con valores predefinidos
        EquipoCelular equipo1 = new EquipoCelular("Android", 5.5, 20000.0, 19.0, "00:11:22:33:44:55", "123456789012345");
        
        // Crea otro objeto EquipoCelular con valores predefinidos
        EquipoCelular equipo2 = new EquipoCelular("iOS", 6.1, 30000.0, 16.0, "AA:BB:CC:DD:EE:FF", "234567890123456");
        
        // Muestra por pantalla la información de cada equipo celular
        System.out.println("Equipo 1:");
        System.out.println("Sistema operativo: " + equipo1.getSistemaOperativo());
        System.out.println("Tamaño de pantalla: " + equipo1.getTamanoPantalla());
        System.out.println("Costo inicial: " + equipo1.getCostoInicial());
        System.out.println("IVA del costo inicial: " + equipo1.getIvaCostoInicial());
        System.out.println("Costo final: " + equipo1.getCostoFinal());
        System.out.println("Dirección MAC: " + equipo1.getDireccionMac());
        System.out.println("Información IMEI: " + equipo1.getInformacionIMEI());
        
        System.out.println("\nEquipo 2:");
        System.out.println("Sistema operativo: " + equipo2.getSistemaOperativo());
        System.out.println("Tamaño de pantalla: " + equipo2.getTamanoPantalla());
        System.out.println("Costo inicial: " + equipo2.getCostoInicial());
        System.out.println("IVA del costo inicial: " + equipo2.getIvaCostoInicial());
        System.out.println("Costo final: " + equipo2.getCostoFinal());
        System.out.println("Dirección MAC: " + equipo2.getDireccionMac());
        System.out.println("Información IMEI: " + equipo2.getInformacionIMEI());
    }
}