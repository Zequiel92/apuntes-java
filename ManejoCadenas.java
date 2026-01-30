public class ManejoCadenas {
  public static void main(String[] args) {
    
    // En java las cadenas son objetos (instancias) de la clase String

    var cadena1 = "Hola";
    var cadena2 = new String("Mundo");
    var cadena3 = cadena1 + " " + cadena2;
    System.out.println(cadena3);

    var cadena4 = """
      Este
      es una
      Multilinea
      """;
    // Texto en bloque
    System.out.println(cadena4);
  }
}
