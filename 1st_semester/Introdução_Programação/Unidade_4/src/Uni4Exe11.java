import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ano de nascimento irmão 1:");
        int anoIrmao1 = teclado.nextInt();
        System.out.println("Ano de nascimento irmão 2:");
        int anoIrmao2 = teclado.nextInt();
        System.out.println("Ano de nascimento irmão 3:");
        int anoIrmao3 = teclado.nextInt();

        if ((anoIrmao1 == anoIrmao2) && (anoIrmao1 == anoIrmao3)) {
            System.out.println("TRIGÊMEOS");
        }
        else {
            if ((anoIrmao1 != anoIrmao2) && (anoIrmao1 != anoIrmao3) && (anoIrmao2 != anoIrmao3)){
                System.out.println("IRMÃOS");
        }
         else {
         System.out.println("GÊMEOS E UM IRMÃO");
         }
        }
    
        
        teclado.close();
    }
    
}
