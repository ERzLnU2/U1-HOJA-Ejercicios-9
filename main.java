/**
 * PAGINA 19 
   EJERCICIO 9. 
 
 * Escribir un programa que pida un número al usuario y muestre su valor absoluto.
   @author Daw120
   
 */
package com.solomongo.ejercicio9_daw120;
import java.util.Scanner;
public class Ejercicio9_DAW120 {
    public static void main(String[] args) {
   
    String numero; // Declara variables
    double resultado;
    float resultadoAUX;
    Scanner teclado = new Scanner(System.in); // Crear objeto teclado 
      
    // ENTRADA 
    System.out.println("\nEscribe un numero: ");
    numero=teclado.nextLine();
    resultadoAUX= Integer.parseInt(numero); // conversion del valor variable
    resultado=(float)resultadoAUX*(-1); // se pasa a -negativo (el valor absoluto....)
      
    // SALIDA
    System.out.println("El valor absoluto del "+numero+" es: "+resultado+"\n");
    }
}
