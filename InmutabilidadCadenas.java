public class InmutabilidadCadenas {
  public static void main(String[] args) {
    
    var cadena1 = "Hola";
    System.out.println(cadena1);

    var cadena2 = cadena1;
    cadena1 = "Adios";
    System.out.println(cadena2);

    System.out.println("Modificado: "+cadena1);
    System.out.println(cadena2);

    // Comparar contenido usamos el metodo equal
    System.out.println(cadena1.equals(cadena2));

  }
}
