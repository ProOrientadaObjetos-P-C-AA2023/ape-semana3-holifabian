package problema4;

public class EquipoCelular {
    private String sistemaOperativo;
    private double tamañoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionIMEI;
    
    public EquipoCelular() {
    }
    
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public double getTamañoPantalla() {
        return tamañoPantalla;
    }
    
    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }
    
    public double getCostoInicial() {
        return costoInicial;
    }
    
    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }
    
    public double getIvaPorcentaje() {
        return ivaPorcentaje;
    }
    
    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }
    
    public double getIvaCostoInicial() {
        return ivaCostoInicial;
    }
    
    public void setIvaCostoInicial(double ivaCostoInicial) {
        this.ivaCostoInicial = ivaCostoInicial;
    }
    
    public double getCostoFinal() {
        return costoFinal;
    }
    
    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
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
    
    public void calcularCostoFinal() {
        ivaCostoInicial = costoInicial * ivaPorcentaje / 100;
        costoFinal = costoInicial + ivaCostoInicial;
    }
}
