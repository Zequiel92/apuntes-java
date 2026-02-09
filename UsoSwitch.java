public class UsoSwitch {
  public static void main(String[] args) {
    
    var dia = "Martes";

    switch (dia) {
      case "Lunes":
        System.out.println("Es lunes");
        break;

      case "Martes":
        System.out.println("Es martes");
        break;

      case "Miercoles":
        System.out.println("Es Miercoles");
      break;

      default:
      System.out.println("No existe");
    }
  }
}
