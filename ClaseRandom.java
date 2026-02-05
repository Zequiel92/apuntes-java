import java.util.Random;

public class ClaseRandom {
  public static void main(String[] args) {
    
    Random randomNumero = new Random();

    // genera un numero entre 0 y 9
    var numeroEntre0y9 = randomNumero.nextInt(10);
    System.out.println("Numero entre 0 y 9: "+numeroEntre0y9);

    // Generar un numero entre 0 y 10
    var numeroEntre0y10 = randomNumero.nextInt(10)+1;
    System.out.println("Numero entre 0 y 10: "+numeroEntre0y10);
  }
}
