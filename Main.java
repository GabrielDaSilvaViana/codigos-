import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int numero, antecessor, sucessor;
       Scanner lerTeclado = new Scanner(System.in);
        System.out.println("informe um numero:");
        numero = lerTeclado.nextInt();
        antecessor = -1;
        sucessor = +1;
        System.out.println("o numero informado foi: " + numero);
        System.out.printf("o numero antecessor é: %d \n", antecessor);
        System.out.printf("o numero sucessor é: %d \n " + sucessor);
        lerTeclado.close();
        }
    }
