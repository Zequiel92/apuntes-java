public class RetoReservaHotel {
  public static void main(String[] args) {
    
    // Nombre del cliente
    var nombreCliente = "Francisco";
    // Dias de estancia
    var diasEstancia = 7;
    // Tarifa
    var tarifaDiaria = 250.90; 
    // indicar si la habitacion cuenta con vista al mar
    var hasVistasAlMar = true;

    System.out.println("Nombre del cliente: "+nombreCliente);
    System.out.println("Dias de estancia: "+diasEstancia);
    System.out.println("Tarifa diaria: "+tarifaDiaria);
    System.out.println("Tiene vistas al Mar?: "+hasVistasAlMar);
    System.out.println("");

    nombreCliente = "Oscar";
    diasEstancia = 10;
    tarifaDiaria = 500.20;
    hasVistasAlMar = false;

    System.out.println("Nombre del cliente: "+nombreCliente);
    System.out.println("Dias de estancia: "+diasEstancia);
    System.out.println("Tarifa diaria: "+tarifaDiaria);
    System.out.println("Tiene viastas al mar?: "+hasVistasAlMar);

  }
}
