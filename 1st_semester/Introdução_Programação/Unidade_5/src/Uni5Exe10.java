public class Uni5Exe10 {
    public static void main(String[] args) {
        
        int soma;
        int quadrado;
        int numero1;
        int numero2;

        for (int i = 1000; i <= 9999; i++) {
            numero1 = i / 100;
            numero2 = (i % 100);
            soma = numero1 + numero2;
            quadrado = soma * soma;
            if (quadrado == i) {
                System.out.println(i);
            }
        }
    }
}
