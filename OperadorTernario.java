public class OperadorTernario {
  public static void main(String[] args) {
    
    // Determinar si un numer es par o impar
    var numero1 = 4;
    var resultado = (numero1 % 2 == 0) ? "Es par" : "Es Impar";
    System.out.println("El numero "+numero1+" "+resultado);
  }
}
