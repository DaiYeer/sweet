/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.sweet.ui;

import mx.itson.sweet.business.Operacion;

/**
 *
 * @author castr
 */
public class Sweet {
//Esto es una prueba para GitHub
    public static void main(String[] args) {
       
        int[] numero = {4,78,2,90,156,34,81,16,9,24};
        //Subido al OptoGato:)
        Operacion op = new Operacion();
        int numeroMayor = op.obtenerNumeroMayor(numero);
        System.out.println("El número mayor es: " + numeroMayor);
        
        int numeroMenor = op.obtenerNumeroMenor(numero);
        System.out.println("El numero menor es: " + numeroMenor);
    }
}
