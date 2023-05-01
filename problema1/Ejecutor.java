package Problema1;
public class Ejecutor{

    public static void main(String[] args) {
        // Crear objeto 1
        EquipoCelular equipo1 = new EquipoCelular();
        equipo1.setSistemaOperativo("Android");
        equipo1.setTamañoPantalla(6.5);
        equipo1.setCostoInicial(350.0);
        equipo1.setIvaPorcentaje(19.0);
        equipo1.setDireccionMac("12:34:56:78:90:AB");
        equipo1.setInformacionIMEI("123456789012345");
        equipo1.calcularCostoFinal();
        
        // Crear objeto 2
        EquipoCelular equipo2 = new EquipoCelular();
        equipo2.setSistemaOperativo("iOS");
        equipo2.setTamañoPantalla(6.1);
        equipo2.setCostoInicial(799.0);
        equipo2.setIvaPorcentaje(21.0);
        equipo2.setDireccionMac("AB:CD:EF:12:34:56");
        equipo2.setInformacionIMEI("098765432109876");
        equipo2.calcularCostoFinal();
        
        // Mostrar información de los equipos
        System.out.println("Equipo 1:");
        System.out.println("Sistema operativo: " + equipo1.getSistemaOperativo());
        System.out.println("Tamaño pantalla: " + equipo1.getTamañoPantalla() + " pulgadas");
        System.out.println("Costo inicial: " + equipo1.getCostoInicial() + " USD");
        System.out.println("Costo final: " + equipo1.getCostoFinal() + " USD");
        System.out.println("Dirección MAC: " + equipo1.getDireccionMac());
        System.out.println("Información IMEI: " + equipo1.getInformacionIMEI());
        
        System.out.println();
        
        System.out.println("Equipo 2:");
        System.out.println("Sistema operativo: " + equipo2.getSistemaOperativo());
        System.out.println("Tamaño pantalla: " + equipo2.getTamañoPantalla() + " pulgadas");
        System.out.println("Costo inicial: " + equipo2.getCostoInicial() + " USD");
        System.out.println("Costo final: " + equipo2.getCostoFinal() + " USD");
        System.out.println("Dirección MAC: " + equipo2.getDireccionMac());
        System.out.println("Información IMEI: " + equipo2.getInformacionIMEI());
    }

}