/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2.Problema3;


public class institucionesEducativas {
    private String nombre;
    private String tipo;
    private int nAlumnos;
    private int nDocentes;
    private int nSedes;
    private int nAulas;
    private double gastosPorEstudiante;
    private double presupuesto;   
    public institucionesEducativas(){}
    public institucionesEducativas(String nombre, String tipo, int nAlumnos, int nDocentes, int nSedes, int nAulas, double gastosPorEstudiante){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nAlumnos = nAlumnos;
        this.nDocentes = nDocentes;
        this.nSedes = nSedes;
        this.nAulas = nAulas;
        this.gastosPorEstudiante = gastosPorEstudiante;
    } 
    public void setNombre(String c){
        this.nombre = c;
    }
    public void setTipo(String c){
        this.tipo = c;
    }
    public void setNAlumnos(int c){
        this.nAlumnos = c;
    }
    public void setNDocentes(int c){
        this.nDocentes = c;
    }
    public void setNSedes(int c){
        this.nSedes = c;
    }
    public void setNAulas(int c){
        this.nAulas = c;
    }
    public void setGastosPorEstudiante(double c){
        this.gastosPorEstudiante = c;
    }
    public String getNombre (){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public int getNAlumnos(){
        return nAlumnos;
    }
    public int getNDocentes(){
        return nDocentes;
    }
    public int getNSedes(){
        return nSedes;
    }
    public int getNAulas(){
        return nAulas;
    }
    public double getGastosPorEstudiante(){
        return gastosPorEstudiante;
    }
    public double getPresupuesto(){
        return presupuesto;
    }
    public void calcularPresupuesto(){
        this.presupuesto = nAlumnos * gastosPorEstudiante;
    }
    public String toString(){
       return String.format("\nINSTITUCIONES EDUCATIVAS: "
               +"\nNombre de la institucion:%s"
               +"\nTipo de institucion:%s"
               +"\nNumero de alumnos:%d"
               +"\nNumero de Docentes:%d"
               +"\nNumero de Sedes:%d"
               +"\nNumero de Aulas:%d"
               +"\nGasto proyectado por Estudiante:%.2f"
               , getNombre()
               ,getTipo()
               ,getNAlumnos()
               ,getNDocentes()
               ,getNSedes()
               ,getNAulas()
               ,getGastosPorEstudiante()
               ,getPresupuesto());
    }   
}