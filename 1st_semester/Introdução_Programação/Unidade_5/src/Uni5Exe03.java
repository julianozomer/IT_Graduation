public class Uni5Exe03 {
	public static void main(String[] args) {
		double soma = 0;
		for (int count = 1; count <= 100; count++) {
			soma += (1.0/count);
		}
		System.out.println("A soma é: "+ soma);
	}
}