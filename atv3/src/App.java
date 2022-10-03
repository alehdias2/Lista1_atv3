import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça dois números e imprima a soma.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        System.out.println("Digite um número: ");
        int num2 = sc.nextInt();
        int result = num + num2;
        System.out.println("A soma dos numeros é"+ result);
    }
}
