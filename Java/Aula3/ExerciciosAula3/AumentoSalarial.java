package Atividades;

import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do cargo (1-5): ");
        int codigoCargo = scanner.nextInt();

        System.out.print("Digite o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        String cargo = "";
        double percentualAumento = 0;

        switch (codigoCargo) {
            case 1:
                cargo = "Escriturário";
                percentualAumento = 50;
                break;
            case 2:
                cargo = "Secretário";
                percentualAumento = 35;
                break;
            case 3:
                cargo = "Caixa";
                percentualAumento = 20;
                break;
            case 4:
                cargo = "Gerente";
                percentualAumento = 10;
                break;
            case 5:
                cargo = "Diretor";
                percentualAumento = 0;
                break;
            default:
                System.out.println("Código de cargo inválido");
                scanner.close();
                return;
        }

        double aumento = salarioAtual * percentualAumento / 100;
        double novoSalario = salarioAtual + aumento;

        System.out.println("Cargo: " + cargo);
        System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);

        scanner.close();
    }
}
