import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os dias que deseja ficar hospedado: ");
        int qtDia = sc.nextInt();
        System.out.println("Informe o tipo de diária\n Simples(S) \n Duplo(D) \n Triplo(T): ");
        String tipoDiaria = sc.next().toUpperCase();

        double S = 255.50;
        double D = 305.50;
        double T = 360.50;

        double valorTotal = 0;

        switch (tipoDiaria) {
            case "S":
                valorTotal = qtDia * S;
                break;
            case "D":
                valorTotal = qtDia * D;
                break;
            case "T":
                valorTotal = qtDia * T;
                break;
            default:
                System.out.println("Tipo de diária inválido.");
                return; 
        }

        System.out.printf("O valor total da hospedagem é: R$ %.2f%n", valorTotal);
    }
}
