/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodosLosProyectosOficiales.Problema1.Problema2.Problema3.Problema4;

/**
 *
 * @author USUARIOPC
 */
public class EquipoCelular {
    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionIMEI;
    
    public EquipoCelular(String sistemaOperativo, double tamanoPantalla, double costoInicial, 
                         double ivaPorcentaje, String direccionMac, String informacionIMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.informacionIMEI = informacionIMEI;
        
        // Calcula el iva del costo inicial y el costo final
        this.ivaCostoInicial = costoInicial * ivaPorcentaje / 100;
        this.costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public double getTamanoPantalla() {
        return tamanoPantalla;
    }
    
    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }
    
    public double getCostoInicial() {
        return costoInicial;
    }
    
    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
        // Recalcula el iva del costo inicial y el costo final
        this.ivaCostoInicial = costoInicial * ivaPorcentaje / 100;
        this.costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public double getIvaPorcentaje() {
        return ivaPorcentaje;
    }
    
    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
        // Recalcula el iva del costo inicial y el costo final
        this.ivaCostoInicial = costoInicial * ivaPorcentaje / 100;
        this.costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public double getIvaCostoInicial() {
        return ivaCostoInicial;
    }
    
    public double getCostoFinal() {
        return costoFinal;
    }
    
    public String getDireccionMac() {
        return direccionMac;
    }
    
    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }
    
    public String getInformacionIMEI() {
        return informacionIMEI;
    }
    
    public void setInformacionIMEI(String informacionIMEI) {
        this.informacionIMEI = informacionIMEI;
    }
}