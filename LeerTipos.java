import java.util.Scanner;

public class LeerTipos {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    // introducir edad
    System.out.println("introduzca su edad");
    var edad = entrada.nextInt();
    System.out.println("Tu edad: "+edad);
  }
}
