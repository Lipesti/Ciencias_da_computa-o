import java.util.Scanner;

public class Mediaalunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contAprovados = 0;
        int contReprovados = 0;
        float somaNotas = 0;
        float nota = 0;
        float mediaAp = 0;
        float mediaRep = 0;
        float mediaTotal = 0;

        for(int i = 0; i < 80; i++) {
            System.out.print("Informe a " + (i+1) + "º nota: ");
            nota = sc.nextFloat();
        System.out.print("\n");


            if(nota >= 6) {
                contAprovados++;
                somaNotas += nota;
                
                mediaAp = somaNotas / contAprovados;
            } else if(nota < 6){
                contReprovados++;
                somaNotas += nota;
                mediaRep = somaNotas / contReprovados;

            }
        }

        mediaTotal = somaNotas / 80;
        System.out.println("Quantidade de alunos aprovados: " + contAprovados);
        System.out.println("Média das notas: " + mediaAp);
        System.out.print("\n");
        System.out.println("Quantiade de alunos reprovados: " + contReprovados);
        System.out.println("Média das notas: " + mediaRep);
        System.out.print("\n");
        System.out.println("Média geral das notas: " + mediaTotal);

    }
}
