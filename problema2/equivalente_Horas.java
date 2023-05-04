/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema2;

/**
 *
 * @author USUARIOPC
 */
public class equivalente_Horas {
    private int dias;
    private int horas;
    private int minutos;
    private int segundos;    
    public equivalente_Horas(int horas){
    this.horas = horas;
    }
    public void setHoras (int c){
        horas = c;
    }
    public int getDias (){
        return this.dias;
    }
    public int getHoras (){
        return this.horas;
    }
    public int getMinutos (){
        return this.minutos;
    }
    public int getSegundos(){
        return this.segundos;
    }
    public void calcularEquivalente (){
        this.dias = horas / 24;
        this.horas = horas % 24;
        this.minutos = horas * 60;
        this.segundos = this.minutos * 60;
    }
    public String toString(){
        return String.format("NUMERO DE HORAS Y SUS EQUIVALENTES: "
                +"\nA dias:%d "
                +"\nA horas:%d"
                +"\nA minutos:%d"
                +"\nA segundos:%d"
                , getDias()
                ,getHoras()
                ,getMinutos()
                ,getSegundos());
    }           
}