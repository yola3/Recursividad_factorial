/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad_factorial;

import java.util.Scanner;

class Recursividad_factorial {

    public static void main(String[] args) {
        int numero; // se declara el tipo de dato de la variable
        Scanner leer = new Scanner(System.in);
        System.out.println("introduzca un dijito"); // se solicita el valor desde el teclado
        numero = leer.nextInt(); // se lee la variable
        System.out.println("el factorial del numero itroducido es:");
        System.out.println(factorial(numero));//se imprime el valor del factorial
    }

    public static int factorial(int Numero) {//metodo recursivo con parametro que nos servira para alamacenar los datos que iran ingresando
        if (Numero == 0)//condicion o caso base
        {
            return 1;
        } else// entonces
        {
            return Numero * factorial(Numero - 1);//se llama asi mismo el metodo multiplicando y creando un bucle el cual terminara cumpliendose la condicion.
        }

    }

}
