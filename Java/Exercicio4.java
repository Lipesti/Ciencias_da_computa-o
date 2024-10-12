import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        // Entrada de dados
        double cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação em dólares:"));
        double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólar US$:"));

        // Conversão
        double conversao = cotacao * dolar;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "A conversão feita de dólar para reais: R$ " + conversao);
    }
}
