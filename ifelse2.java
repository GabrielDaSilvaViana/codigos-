import java.util.Scanner;
public class ifelse2 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("diga sua idade");
        idade = scanner.nextInt();
        if (idade >= 18 && idade <= 70) {
            System.out.println("deve votar");
        } else if (idade >= 16 && idade < 18 || idade>70){
            System.out.println("voto facultativo");
        } else{
            System.out.println("nao pode votar");
        }
    }
}