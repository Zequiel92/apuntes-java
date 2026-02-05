import java.util.Scanner;

public class LeerTipos {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    /* introducir edad
    System.out.println("introduzca su edad: ");
    var edad = entrada.nextInt();
    System.out.println("Tu edad: "+edad);*/
    
    
    // Conversion de datos
    System.out.println("Proporciona un valor entero");
    var enteroString = entrada.nextLine();
    var entero = Integer.parseInt(enteroString);
    System.out.println(entero);

    // Conversion de datos flotantes
    System.out.println("introduzca un numero F");
    var flotanteString = entrada.nextLine();
    var numFlotante = Float.parseFloat(flotanteString);
    System.out.println(numFlotante);
  }
}
