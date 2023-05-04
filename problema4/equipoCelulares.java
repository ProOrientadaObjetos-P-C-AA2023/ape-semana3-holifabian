/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2.Problema3.problema4;

/**
 *
 * @author USUARIOPC
 */
public class equipoCelulares {
 private String sistemaOperativo;
 private double tamanoPantalla;  
 private double costoInicial;  
 private double ivaPorcentaje;  
 private double ivaCostoInicial;  
 private double ivaCostoFinal;  
 private String direccionMac;  
 private int imei;  
 public equipoCelulares(String sistemaOperativo, double tamanoPantalla
         , double costoInicial, double ivaPorcentaje, String direccionMac, int imei){
     this.sistemaOperativo = sistemaOperativo;
     this.tamanoPantalla = tamanoPantalla;
     this.costoInicial = costoInicial;
     this.ivaPorcentaje = ivaPorcentaje;
     this.direccionMac = direccionMac;
     this.imei = imei;
 }
 public void setSistemaOperativo(String sistemaOperativo){
     this.sistemaOperativo = sistemaOperativo;
 }
 public void setTamanoPantalla(double tamanoPantalla){
     this.tamanoPantalla = tamanoPantalla;
 }
 public void setCostoInicial(double costoInicial){
     this.costoInicial = costoInicial;
 }
 public void setIvaPorcentaje(double ivaPorcentaje){
     this.ivaPorcentaje = ivaPorcentaje;
 }
 public void setDireccionMac (String direccionMac){
     this.direccionMac = direccionMac;
 }
 public void setImei (int imei){
     this.imei = imei;
 }
 public String getSistemaOperativo (){
     return sistemaOperativo;
 }
 public double getTamanoPantalla(){
     return tamanoPantalla;
 }
 public double getCostoInicial(){
     return costoInicial;
 }
 public double getIvaPorcentaje (){
     return ivaPorcentaje;
 }
 public double getIvaCostoInicial(){
     return this.ivaCostoInicial;
 }
 public double getIvaCostoFinal(){
     return this.ivaCostoFinal;
 }
 public String getDireccionMac(){
     return direccionMac;
 }
 public int getImei(){
     return imei;
 }
 public void calcularIvaCostoInicial(){
     this.ivaCostoInicial = costoInicial * (ivaPorcentaje/100);   
 }
 public void calcularIvaCostoFinal(){
     this.ivaCostoFinal = this.costoInicial + ivaCostoInicial;
 }
 @Override
public String toString(){
    return String.format("CARACTERISTICAS DE EQUIPO CELULAR:"
            +"\nSistema Operativo: %s"
            +"\nTamaño de pantalla: %.2f"
            +"\nCosto inicial: %.2f"
            +"\nIVA: %.2f"
            +"\nIVA costo inicial: %.2f"
            +"\nIVA costo final: %.2f"
            +"\nDirección MAC: %s"
            +"\nIMEI: %d"
            , getSistemaOperativo()
            , getTamanoPantalla()
            , getCostoInicial()
            , getIvaPorcentaje()
            , getIvaCostoInicial()
            , getIvaCostoFinal()
            , getDireccionMac()
            , getImei());
}

}