/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodosLosProyectosOficiales.Problema1.Problema2.Problema3;

/**
 *
 * @author USUARIOPC
 */
public class EjecutorInstitucionEducativa {
    public static void main(String[] args) {
        // Creación de dos objetos InstitucionEducativa
        InstitucionEducativa institucion1 = new InstitucionEducativa("Colegio Calasanz", "Privado", 1000, 50, 2, 5000);
        InstitucionEducativa institucion2 = new InstitucionEducativa("Colegio Eugenio", "Público", 2000, 100, 3, 4000);

        // Impresión de datos de los objetos creados
        System.out.println("Datos de la Institución Educativa 1:");
        System.out.println("Nombre: " + institucion1.getNombre());
        System.out.println("Tipo: " + institucion1.getTipoInstitucion());
        System.out.println("Número de alumnos: " + institucion1.getNumAlumnos());
        System.out.println("Número de docentes: " + institucion1.getNumDocentes());
        System.out.println("Número de sedes: " + institucion1.getNumSedes());
        System.out.println("Gastos proyectados por estudiante: " + institucion1.getGastosProyectadosPorEstudiante());
        System.out.println("Presupuesto: " + institucion1.getPresupuesto());

        System.out.println();

        System.out.println("Datos de la Institución Educativa 2:");
        System.out.println("Nombre: " + institucion2.getNombre());
        System.out.println("Tipo: " + institucion2.getTipoInstitucion());
        System.out.println("Número de alumnos: " + institucion2.getNumAlumnos());
        System.out.println("Número de docentes: " + institucion2.getNumDocentes());
        System.out.println("Número de sedes: " + institucion2.getNumSedes());
        System.out.println("Gastos proyectados por estudiante: " + institucion2.getGastosProyectadosPorEstudiante());
        System.out.println("Presupuesto: " + institucion2.getPresupuesto());
    }
}
