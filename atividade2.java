import java.util.Scanner;

public class atividade2 {
    public static void main(String[]args){
    double trapezio, Nmaior, Nmenor, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a area maior ");
        Nmaior = teclado.nextDouble();
        System.out.println("digite a area menor ");
        Nmenor = teclado.nextDouble();
        System.out.println("digite a altura ");
        altura = teclado.nextDouble();
        trapezio = (Nmaior + Nmenor) * altura/2;
        System.out.printf("o trapezio é: %.2f", trapezio);

    }
}