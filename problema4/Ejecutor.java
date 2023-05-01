/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author USUARIOPC
 */
public class Ejecutor {
    public static void main(String[] args) {
        EquipoCelular equipo1 = new EquipoCelular();
        equipo1.setSistemaOperativo("Android");
        equipo1.setTamañoPantalla(6.2);
        equipo1.setCostoInicial(1500);
        equipo1.setIvaPorcentaje(19);
        equipo1.setDireccionMac("A1:B2:C3:D4:E5:F6");
        equipo1.setInformacionIMEI("123456789012345");
        equipo1.calcularCostoFinal();
        
        EquipoCelular equipo2 = new EquipoCelular();
        equipo2.setSistemaOperativo("iOS");
        equipo2.setTamañoPantalla(5.8);
        equipo2.setCostoInicial(2000);
        equipo2.setIvaPorcentaje(19);
        equipo2.setDireccionMac("F6:E5:D4:C3:B2:A1");
        equipo2.setInformacionIMEI("987654321098765");
        equipo2.calcularCostoFinal();
        
        System.out.println("Equipo 1:");
        System.out.println("Sistema operativo: " + equipo1.getSistemaOperativo());
        System.out.println("Tamaño de pantalla: " + equipo1.getTamañoPantalla());
        System.out.println("Costo inicial: " + equipo1.getCostoInicial());
        System.out.println("IVA porcentaje: " + equipo1.getIvaPorcentaje());
        System.out.println("Costo final: " + equipo1.getCostoFinal());
        System.out.println("Dirección MAC: " + equipo1.getDireccionMac());
        System.out.println("Información IMEI: " + equipo1.getInformacionIMEI());
        
        System.out.println("\nEquipo 2:");
        System.out.println("Sistema operativo: " + equipo2.getSistemaOperativo());
        System.out.println("Tamaño de pantalla: " + equipo2.getTamañoPantalla());
        System.out.println("Costo inicial: " + equipo2.getCostoInicial());
        System.out.println("IVA porcentaje: " + equipo2.getIvaPorcentaje());
        System.out.println("Costo final: " + equipo2.getCostoFinal());
        System.out.println("Dirección MAC: " + equipo2.getDireccionMac());
        System.out.println("Información IMEI: " + equipo2.getInformacionIMEI());
    }
}
