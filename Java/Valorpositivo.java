import java.util.Scanner;

public class Valorpositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float soma = 0; 
        System.out.println("Informe um numero inteiro positivo: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("O número é positivo.");

            for (int i = 1; i <= num; i++) {
                
                soma += 1.0 / i;
            }

            
            System.out.println("A soma dos números de 1 a " + num + " é: " + soma);
        } else {
            System.out.println("O número não é positivo. Por favor, informe um número positivo.");
        }

        sc.close(); 
    }
}
