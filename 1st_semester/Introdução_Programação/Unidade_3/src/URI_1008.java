import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1008 {
    public static void main(String[] args) {
        //Leitura
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");


        int codFuncionario = teclado.nextInt(); //Codigo funcionario
        int horasTrab = teclado.nextInt(); // Horas trabalhadas
        double valorHora = teclado.nextDouble(); //Valor por hora
        double salario = horasTrab * valorHora; //Salario
       
    
        System.out.println("NUMBER = " + codFuncionario + "\n" + "SALARY = U$ " + df_2.format(salario));
        teclado.close();
    }

}