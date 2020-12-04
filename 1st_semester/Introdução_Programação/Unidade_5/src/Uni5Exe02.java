public class Uni5Exe02 {
    public static void main(String[] args) {
  
      int somaPar = 0;
      int somaImpar = 0;
    for(int inc = 1; inc <= 100;inc++) {
        if (inc % 2 == 0) {
          somaPar = somaPar + inc;
        }
        else {
          somaImpar += inc;
        }
      }
      System.out.println("somaPar: "+somaPar);
      System.out.println("somaImpar: "+somaImpar);
    }
  }
  