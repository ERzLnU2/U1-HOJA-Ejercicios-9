# U1-HOJA-Ejercicios-9
Programa en JAVA que pida un número y muestre su valor absoluto (+o-).

![9](https://user-images.githubusercontent.com/80227002/193455743-663f27ac-fbaf-465a-87bc-8486c41663be.png)


```java
/**
 * PAGINA 19 
   EJERCICIO 9. 
 */
import java.util.Scanner;
public class Ejercicio9_DAW120 {
    public static void main(String[] args) {
    String numero;
    double resultado;
    float resultadoAUX;
    Scanner teclado = new Scanner(System.in);  
    System.out.println("\nEscribe un numero: ");
    numero=teclado.nextLine();
    resultadoAUX= Integer.parseInt(numero); 
    resultado=(float)resultadoAUX*(-1);
    System.out.println("El valor absoluto del "+numero+" es: "+resultado+"\n");
    }
}
```
