package Atividades;

import java.util.Scanner;

public class RestricaoCirculacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dígito final da placa: ");
        int digitoFinal = scanner.nextInt();

        switch (digitoFinal) {
            case 1:
            case 2:
                System.out.println("Rodízio na segunda-feira");
                break;
            case 3:
            case 4:
                System.out.println("Rodízio na terça-feira");
                break;
            case 5:
            case 6:
                System.out.println("Rodízio na quarta-feira");
                break;
            case 7:
            case 8:
                System.out.println("Rodízio na quinta-feira");
                break;
            case 9:
            case 0:
                System.out.println("Rodízio na sexta-feira");
                break;
            default:
                System.out.println("Dígito inválido");
                break;
        }

        scanner.close();
    }
}
