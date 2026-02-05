public class FormateoCadenas {
  public static void main(String[] args) {
    var nombre = "Alan";
    var edad = 24;
    var salario = 1200.50;

    // String.format
    var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f",nombre,edad,salario);
    System.out.println(mensaje);

    // Metodo printf
    System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f",nombre,edad,salario);
  }
}
