import java.util.Scanner;

public class Mediaaltura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double contAltM = 0; 
        double contAltF = 0; 
        double somaAltM = 0; 
        double somaAltF = 0; 

        System.out.print("Informe a quantidade de pessoas: ");
        int qtdPessoas = sc.nextInt();

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.print("Informe seu gênero (M/F): ");
            char genero = sc.next().toUpperCase().charAt(0); 

            System.out.print("Informe sua altura: ");
            double altura = sc.nextDouble();

            if (genero == 'M') {
                contAltM++;
                somaAltM += altura;
            } else if (genero == 'F') {
                contAltF++;
                somaAltF += altura;
            } else {
                System.out.println("Gênero inválido. Por favor, informe 'M' para masculino ou 'F' para feminino.");
            }
        }

        if (contAltM > 0) {
            System.out.println("Altura média dos homens: " + (somaAltM / contAltM));
        } else {
            System.out.println("Nenhum homem foi informado.");
        }

        if (contAltF > 0) {
            System.out.println("Altura média das mulheres: " + (somaAltF / contAltF));
        } else {
            System.out.println("Nenhuma mulher foi informada.");
        }

        sc.close(); 
    }
}
