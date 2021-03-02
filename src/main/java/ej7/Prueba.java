/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

/**
 *
 * @author Cris
 */
public class Prueba {

    public static void main(String[] args) {

        //Lista de Maîtres
        Trabajador maria = new Maitre("0154", "María", "Fernández", "30546121457P");
        Maitre fernanda = new Maitre("0184", "Fernanda", "Matrinez", "30548471457T");

        // Lista de Camareros
        Camarero juan = new Camarero("Jefe Sala", "Juan", "Gil", "111hfk");
        Camarero pedro = new Camarero("Encargado", "Pedro", "López", "026541641J");

        // Empleado 1
        System.out.println("El camarero se llama: " + juan.getNombre()+"\nY cotiza: ");
        juan.cotizar();
        System.out.println("----------------------------------------------------");
        
        // Empleado 2
        System.out.println("El camarero se llama: " + pedro.getNombre()+"\nY cotiza: ");
        pedro.cotizar();
        System.out.println("----------------------------------------------------");
        
        // Empleado 3
        System.out.println("El maître se llama: " + maria.getNombre()+"\nY cotiza: ");
        maria.cotizar();
        System.out.println("----------------------------------------------------");
        
        // Empleado 4
        System.out.println("El maître se llama: " + fernanda.getNombre()+"\nY cotiza: ");
        fernanda.cotizar();
        System.out.println("----------------------------------------------------");
        
    }
}
