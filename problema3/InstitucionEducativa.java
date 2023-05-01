/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodosLosProyectosOficiales.Problema1.Problema2.Problema3;

/**
 *
 * @author USUARIOPC
 */
public class InstitucionEducativa {
    // Atributos privados de la clase
    private String nombre;
    private String tipoInstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastosProyectadosPorEstudiante;
    private double presupuesto;

    // Constructor de la clase
    public InstitucionEducativa(String nombre, String tipoInstitucion, int numAlumnos,
            int numDocentes, int numSedes, double gastosProyectadosPorEstudiante) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
        // Cálculo del presupuesto
        this.presupuesto = numAlumnos * gastosProyectadosPorEstudiante;
    }

    // Métodos de acceso para los atributos privados de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
        // Actualización del presupuesto
        this.presupuesto = numAlumnos * gastosProyectadosPorEstudiante;
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

    public double getGastosProyectadosPorEstudiante() {
        return gastosProyectadosPorEstudiante;
    }

    public void setGastosProyectadosPorEstudiante(double gastosProyectadosPorEstudiante) {
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
        // Actualización del presupuesto
        this.presupuesto = numAlumnos * gastosProyectadosPorEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }
}