package Atividades;

import java.util.Scanner;

public class PrecoPassagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do destino (1-4): ");
        int destino = scanner.nextInt();

        System.out.print("A viagem inclui retorno? (s/n): ");
        char retorno = scanner.next().charAt(0);

        double preco = 0;

        switch (destino) {
            case 1:
                preco = (retorno == 's') ? 900 : 500;
                break;
            case 2:
                preco = (retorno == 's') ? 650 : 350;
                break;
            case 3:
                preco = (retorno == 's') ? 600 : 350;
                break;
            case 4:
                preco = (retorno == 's') ? 550 : 600;
                break;
            default:
                System.out.println("Código de destino inválido");
                scanner.close();
                return;
        }

        System.out.printf("Preço da passagem: R$ %.2f\n", preco);

        scanner.close();
    }
}
