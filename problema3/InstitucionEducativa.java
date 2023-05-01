/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problema3;

public class InstitucionEducativa {
    // Atributos privados
    private String nombre;
    private String tipo;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastosPorEstudiante;
    private double presupuesto;
    
    // Constructor por defecto
    public InstitucionEducativa() {}
    
    // Constructor con parámetros
    public InstitucionEducativa(String nombre, String tipo, int numAlumnos, int numDocentes, 
            int numSedes, double gastosPorEstudiante) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastosPorEstudiante = gastosPorEstudiante;
        this.presupuesto = numAlumnos * gastosPorEstudiante;
    }
    
    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
        this.presupuesto = numAlumnos * gastosPorEstudiante;
    }

    public int getNumDocentes() {
        return numDocentes;
    }

    public void setNumDocentes(int numDocentes) {
        this.numDocentes = numDocentes;
    }

    public int getNumSedes() {
        return numSedes;
    }

    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }

    public double getGastosPorEstudiante() {
        return gastosPorEstudiante;
    }

    public void setGastosPorEstudiante(double gastosPorEstudiante) {
        this.gastosPorEstudiante = gastosPorEstudiante;
        this.presupuesto = numAlumnos * gastosPorEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }
    
    // Método toString para imprimir los datos de la institución
    @Override
    public String toString() {
        return "Institución Educativa: " + nombre + "\n"
                + "Tipo: " + tipo + "\n"
                + "Número de Alumnos: " + numAlumnos + "\n"
                + "Número de Docentes: " + numDocentes + "\n"
                + "Número de Sedes: " + numSedes + "\n"
                + "Gastos Proyectados por Estudiante: " + gastosPorEstudiante + "\n"
                + "Presupuesto: " + presupuesto + "\n";
    }
}