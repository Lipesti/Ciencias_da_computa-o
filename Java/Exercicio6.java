import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        // Entrada de dados
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

        // Cálculos
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        // Exibição dos resultados
        String mensagem = "A soma dos valores informados é: " + soma + "\n"
                        + "A subtração dos valores informados é: " + subtracao + "\n"
                        + "A multiplicação dos valores informados é: " + multiplicacao;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
