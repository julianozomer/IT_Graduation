
public class Principal {
    public static void main(String[] args) {
        String[] entrada = {"Juliano Zomer Filho", "Reitz", "Jaragu�"};
        System.out.println(NameGenerator.generateStarWarsName(entrada));
        System.out.println(NameGenerator.generateStarWarsName2(entrada));
        
        String[] entrada2 = {"Maria das Gra�as Candido Abreu", "Leite", "Gaspar"};
        System.out.println(NameGenerator.generateStarWarsName(entrada2));
        System.out.println(NameGenerator.generateStarWarsName2(entrada2));
    }
}