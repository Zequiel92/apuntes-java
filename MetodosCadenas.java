public class MetodosCadenas {
  public static void main(String[] args) {
    
    var cadena1 = "Hola Mundo";

    // Obtener el largo de una cadena 
    System.out.println("Longitud "+cadena1.length());

    // reemplazar caracter
    System.out.println(cadena1.replace('o','a'));

    // convertir a mayusculas
    System.out.println(cadena1.toUpperCase());

    // convertir a minusculas
    System.out.println(cadena1.toLowerCase());

    // eliminar espacios al inicio y al final
    var cadena2=" Adios Mundo   ";
    System.out.println(cadena2.trim());
    
    // busqueda de subcadena
    System.out.println(cadena1.indexOf("Hola"));
  }
}
