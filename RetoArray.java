import java.util.Scanner;

public class RetoArray {
  public static void main(String[] args) {
    
    Scanner consola = new Scanner(System.in);

    // indicar cuanto va a ser la longitud de los datos a introducir
    System.out.println("Cantidad de numeros:");
    int numero = Integer.parseInt(consola.nextLine());

    // Array dinamico
    var arreglo = new int[numero];
    
    // introducir datos al array de manera dinamica
    for (int i = 0; i < numero; i++) {
      System.out.println("Introduzca el nuevo dato:");
      arreglo[i] = Integer.parseInt(consola.nextLine());
      
    }

    // Mostrar los datos del array dinamico
    for (int i = 0; i < arreglo.length; i++) {
      System.out.println(i + " ---> " + arreglo[i]);
    }
  }
  
}
