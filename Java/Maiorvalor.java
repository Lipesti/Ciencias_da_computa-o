import java.util.Scanner;

public class Maiorvalor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaValores = 0;
        int count = 0;
        int maiorValor = Integer.MIN_VALUE; 
        int num;

        System.out.print("Digite um número (0 para sair): ");
        num = sc.nextInt();

        while (num != 0) {
            somaValores += num;
            count++;

            if (num > maiorValor) {
                maiorValor = num;
            }

            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
        }

        
        if (count > 0) {
            
            double media = (double) somaValores / count;

            
            System.out.println("A média dos valores: " + media);
            System.out.println("O maior valor encontrado: " + maiorValor);
        } else {
            System.out.println("Nenhum valor foi digitado.");
        }

        sc.close(); 
    }
}
