import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        double media, mediafinal;
        double notas = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite as 3 notas");
        for (int i=1; i<=3; i++){
        System.out.println("digite a nota"+i+":");
        notas = notas + scanner.nextDouble();
        }
        media = notas /3;
        if (media > 5 ){
            System.out.println("a media e maior que 5 Aprovado");
        }else {
            System.out.println("a media e menor que 5 reprovado");
        }
        scanner.close();
    }
}
