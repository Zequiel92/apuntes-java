public class Arreglos {
  public static void main(String[] args) {
   
    // FORMAS DE DECLARAR ARREGLOS
    
    int[] enteros = new int[5];

    var numeros = new int[3];
    
    String [] frutas = {"Pera","Manzana","Banana","Sandia"};
    System.out.println(frutas[0]);

    var nums = new int[]{100,200,300};
    System.out.println(nums[1]);
    
    enteros [4] = 4;
    enteros [3] = 340;
    enteros [2] = 2;
    enteros [1] = 1;
    enteros [0] = 0;
    System.out.println(enteros[3]);

    numeros[0] = 110;
    numeros[1] = 200;
    numeros[2] = 50;
    System.out.println(numeros[2]);
  }
}
