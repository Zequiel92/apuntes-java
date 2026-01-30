public class TiendaProducto {
  public static void main(String[] args) {
    
    String nombreProducto = "Vino";
    double precio = 12.50;
    int cantDisponible = 20;
    boolean isDisponibleVenta = true;

    System.out.println("Producto: "+nombreProducto);
    System.out.println("Precio: "+precio);
    System.out.println("Cantidad Disponible: "+cantDisponible);
    System.out.println("Disponible en Venta: "+isDisponibleVenta);

    // variables modificadas
    nombreProducto = "Celular Samsung";
    precio = 15.20D;
    cantDisponible = 0;
    isDisponibleVenta = false;

    System.out.println("Producto: "+nombreProducto);
    System.out.println("Precio: "+precio);
    System.out.println("Cantidad Disponible: "+cantDisponible);
    System.out.println("Disponible en Venta:"+isDisponibleVenta);
  }
}
