package Atividades;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;
        boolean erro = false;

        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case '*':
                resultado = valor1 * valor2;
                break;
            case '/':
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    erro = true;
                }
                break;
            default:
                System.out.println("Operação inválida");
                erro = true;
                break;
        }

        if (!erro) {
            System.out.printf("Resultado: %.2f\n", resultado);
        }

        scanner.close();
    }
}
