/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarrays;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PruebaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declara un array de enteros de tamaño 5. Inicializa el array con los
         * valores 1, 2, 3, 4 y 5. Imprime todos los elementos del array en una
         * sola línea separados por espacios.
         */

        int[] numerosPositivos = new int[5];
        numerosPositivos[0] = 1;
        numerosPositivos[1] = 8;
        numerosPositivos[2] = 9;
        numerosPositivos[3] = 10;
        numerosPositivos[4] = 11;

        for (int i = 0; i < numerosPositivos.length; i++) {

            System.out.print(numerosPositivos[i] + " ");
        }
        for (int lista : numerosPositivos) {
            System.out.print(lista + " ");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Digite el numero de personas a ingresar");
        int numMaximo = in.nextInt();

        String[] name = new String[numMaximo];
        String[] lastName = new String[numMaximo];
        int[] edad = new int[numMaximo];

        for (int i = 0; i < numMaximo; i++) {
            System.out.println("Ingrese el nombre");
            name[i] = in.next();
            System.out.println("Ingrese el apellido");
            lastName[i] = in.next();
            System.out.println("Ingrese la edad");
            edad[i] = in.nextInt();

            }
        
        System.out.println("Lstado de peronas \n" );
        for (int i = 0; i < numMaximo; i++) {
            System.out.println("Persona Nº" + (i+1));
            System.out.print("Nombre: " + name[i] + " || ");
            System.out.print("Apellido: "+ lastName[i] + " || ");
            System.out.println("Edad: " +edad[i]);
            System.out.println("-------------------------------------------");
        }

        }
    }

