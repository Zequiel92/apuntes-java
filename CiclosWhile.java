public class CiclosWhile {
  public static void main(String[] args) {
   
   
    /*var contador = 1;
    while (contador <= 5) {
      System.out.println(contador);
      contador++;
    }*/

    /*var par = 1;
    while (par <= 20) {
      if (par % 2 == 0) {
        System.out.println(par);
      }
      par++;
      
    }
    */

    // ciclo DO While
    var contador = 1;
    do {
      if (contador % 2 ==1) {
        System.out.println(contador); 
      }

      contador++;
      
    } while (contador <= 20);
  }
}
