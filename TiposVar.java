public class TiposVar {
  public static void main(String[] args) {
    
    // Variable de tipo entero con inferencia de tipos, var
    // No esta permitido var como variable global
    // Siempre debe inicializarse al principio
    var numEntero = 20;
    System.out.println(numEntero);

    numEntero = 100;
    System.out.println(numEntero);

    permitido();


  }

  public static void permitido(){
    // si esta permitido en este caso uso de var
    // Solo dentro de metodos
    // No se puede volver a reutilizar para otro tipo de dato
    var saludo = "Hola";
    System.out.println(saludo);
  }
}
