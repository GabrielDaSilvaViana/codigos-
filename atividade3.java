
import java.util.Scanner;

public class atividade3 {
    public static void main (String[]args){
        double real, conversao;
        double cotadolar = 5.70;
        Scanner teclado = new Scanner(System.in);
        System.out.println("a cota do dolar e :"+ cotadolar );
        System.out.print("digite o valor do real ");
        real = teclado.nextDouble();
        conversao = (real * cotadolar);
        System.out.println("valor da conversao e :" + conversao);
    }
}
