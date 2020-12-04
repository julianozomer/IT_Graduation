public class Uni5Exe11 {
    public static void main(String[] args) {
        
        int quebradosInicio = 0;
        int quebradosApos = 1;
        int quebradosTotal = 0;

        for (int hora = 1; hora <= 16; hora++) {
            if (hora == 1) {
                quebradosInicio = 1;
            } else {
               quebradosApos *= 3;
            }
        }
        quebradosTotal = quebradosInicio + quebradosApos;
        System.out.println("Total de biscoitos quebrados: " + quebradosTotal);
    }
}
