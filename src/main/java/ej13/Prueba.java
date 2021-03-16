/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class Prueba {

    public static void main(String[] args) {
        //Crea estudiantes
        Estudiante est1 = new Estudiante("2UM75QAL", "Gloria", "Zambrano Rodenas", "54876019C", new Direccion("Paseo Lorem", "Tel Aviv", 64951, "Israel"));
        Estudiante est2 = new Estudiante("ZFE6CMYE", "Ismael", "Sastre Benavides", "16835738Z", new Direccion("Miguel Rapid", "Sioux Falls", 26671, "EEUU"));

        //Crea trabajadores
        Profesor prof1 = new Profesor("Biología", "Beatriz", "Cabrera Quiñones", "73000630X", new Direccion("Kulas Squares", "Tlanchinol", 43162, "México"));
        Profesor prof2 = new Profesor("Matemáticas", "Victor", "Pelaez Sánchez", "59633339C", new Direccion("Martin Luther King Jr Ave", "Carolina del Norte", 27565, "EEUU"));

        //Los añado al array
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(est1);
        personas.add(est2);
        personas.add(prof1);
        personas.add(prof2);

        for (Persona a : personas) {
            System.out.println("");
            System.out.println("-----------------Mostrar el identificate-------------");
            a.identificate();

            System.out.println("");
            System.out.println("------------------El instanceof-------------------");
            if (a instanceof Estudiante) {
                System.out.println("El ID del alumno: " + a.getNombre() + " " + a.getApellidos() + " es: " + ((Estudiante) a).getIdEstudiante());
            } else if (a instanceof Profesor) {
                System.out.println("La especialidad del profesor/a " + a.getNombre() + " " + a.getApellidos() + " es: " + ((Profesor) a).getEspecialidad());
            }
            System.out.println(" ");
            System.out.println("---------------Mostrar los datos de cada objeto(que no se ven en otros)---------------------");
            System.out.println(a.getNombre());//Para que se sepa de quien es
            System.out.println(a.getDireccion());
            System.out.println(a.getNif());
        }
    }

}
