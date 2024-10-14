import java.util.Scanner;

public class Contarnegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double contP = 0; 
        double contN = 0; 
        double menorValor = Double.MAX_VALUE; 
        double numInformado = 0; 

        System.out.print("Digite um número positivo ou negativo (0 para sair): ");
        numInformado = sc.nextDouble(); 

        while (numInformado != 0) {
            if (numInformado < 0) {
                contN++; 
                if (numInformado < menorValor) {
                    menorValor = numInformado; 
                }
            } else {
                contP++; 
            }

            System.out.print("Digite outro número positivo ou negativo (0 para sair): ");
            numInformado = sc.nextDouble(); 
        }

        System.out.println("\n");

        System.out.println("Quantidade de números positivos: " + contP);
        System.out.println("Quantidade de números negativos: " + contN);

        if (contN > 0) {
            System.out.println("O menor valor negativo informado foi: " + menorValor);
        } else {
            System.out.println("Nenhum valor negativo foi informado.");
        }

        sc.close(); 
    }
}
