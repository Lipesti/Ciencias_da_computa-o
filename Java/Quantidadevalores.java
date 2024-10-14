
import java.util.Scanner;

public class Quantidadevalores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o a quantidade de valores para realizar a soma: ");
        int qtdValores = sc.nextInt();
        int soma = 0;
        float media= 0;

        for (int i = 0; i < qtdValores; i++) {
            System.out.println("Informe o numero para adiconar a soma: ");
            int numero = sc.nextInt();
            soma += numero;
            media = soma / qtdValores;
        }

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média dos valores é: " + media);

    }
}
