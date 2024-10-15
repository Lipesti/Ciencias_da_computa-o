import java.util.Scanner;

public class Mediamf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeTotal = 0;
        int contIdade = 0;
        double salarioTotalH = 0;
        int contH = 0;
        int contMulherSalarioBaixo = 0;
        int idade;
        do { 
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();

            if(idade < 0){
                System.out.print("Idade inválida! Programa encerrado");
                break;
            }

            System.out.print("Digite seu sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.print("Informe seu salario: ");
            double salario = sc.nextDouble();
             
            idadeTotal += idade;
            contIdade++;

            if(sexo == 'M' || sexo == 'm'){
                salarioTotalH += salario;
                contH++;
            } else if(sexo == 'F' || sexo == 'f' && salario < 600){
                contMulherSalarioBaixo++;
            }
        } while (idade >= 0);

        double mediaIdade = (double) idadeTotal / contIdade;
        double mediaSalarioHomens = salarioTotalH / contH;
        System.out.println("\n");
        System.out.println("Média de idade: " + mediaIdade);
        System.out.println("Média de salário dos homens: " + mediaSalarioHomens);
        System.out.println("Quantidade de mulheres com salário abaixo de R$ 600: " + contMulherSalarioBaixo);
        sc.close();
        
    }
}