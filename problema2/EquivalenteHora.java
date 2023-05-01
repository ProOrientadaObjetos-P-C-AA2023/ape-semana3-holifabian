/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodosLosProyectosOficiales.Problema1.Problema2;

/**
 *
 * @author USUARIOPC
 */
public class EquivalenteHora {
    int horas;
    private int minutos;
    private int segundos;
    private int dias;

    public EquivalenteHora(int horas) {
        this.horas = horas;
    }

    public int convertirHorasAMinutos() {
        minutos = horas * 60;
        return minutos;
    }

    public int convertirHorasASegundos() {
        segundos = horas * 60 * 60;
        return segundos;
    }

    public double convertirHorasADias() {
        dias = horas / 24;
        return dias;
    }
}