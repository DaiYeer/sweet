/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.sweet.business;

/**
 *
 * @author castr
 */
public class Operacion {
    
    /**
     * Obtiene el número contenido en un array.
     * @param numeros Array de números enteros.
     * @return retorna el numero mayor.
     */
    
    public int obtenerNumeroMayor(int[] numeros){
        int mayor = 0;
        for(int i = 0;i < numeros.length; i++ ){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
    return mayor;
    }
    /**
     * Obtiene el promedio de un array de números.
     * @param numeros Array de números enteros a evaluar.
     * @return Promedio de números.
     */
    public double obtenerPromedio(int[] numeros){
        int suma = 0;
         for(int i = 0;i < numeros.length; i++){
             suma += numeros[i];
         }
        return suma / numeros.length;
    }
    /**
     * Obtiene el número menor de la coleccion de elementos de tipo entero.
     * @param numeros array de números enteros a evaluar.
     * @return retorna el número menor.
     */
    public int obtenerNumeroMenor(int[] numeros){
        int menor = numeros[0];
         for(int i = 0;i < numeros.length; i++ ){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return menor;
    }
}
