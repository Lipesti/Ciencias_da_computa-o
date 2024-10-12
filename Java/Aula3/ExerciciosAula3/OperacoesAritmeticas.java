import javax.swing.JOptionPane;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número:"));

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int resto = num1 % num2;

        JOptionPane.showMessageDialog(null, "Resultados:\nSoma: " + soma +
                "\nSubtração: " + subtracao +
                "\nMultiplicação: " + multiplicacao +
                "\nDivisão: " + divisao +
                "\nResto da divisão: " + resto);
    }
}
