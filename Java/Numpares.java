import java.util.Scanner;

public class Numpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Algoritmo que imprimi os numeros pares entre 0 e 100 \n");
        for(int numero = 0; numero <= 100; numero++) {
            if(numero % 2 == 0) {
                System.out.print(numero + " | ");

                
            } 

        }
        sc.close();

    }
}