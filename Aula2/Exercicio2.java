import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        // Entrada de dados
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Cálculo da soma
        int soma = num1 + num2;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "A soma dos números " + num1 + " + " + num2 + " é igual a: " + soma);
    }
}
