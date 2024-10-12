import javax.swing.JOptionPane;

public class exc3 {
    public static void main(String[] args) {
        // Receber dados do usuário
        String larguraStr = JOptionPane.showInputDialog("Informe a largura da área (em metros):");
        String comprimentoStr = JOptionPane.showInputDialog("Informe o comprimento da área (em metros):");
        String valorUnitarioStr = JOptionPane.showInputDialog("Informe o valor unitário da caixa (em reais):");

        double largura = Double.parseDouble(larguraStr);
        double comprimento = Double.parseDouble(comprimentoStr);
        double valorUnitario = Double.parseDouble(valorUnitarioStr);

        // Calcular a área total
        double area = largura * comprimento;

        // Cobertura de uma caixa em metros quadrados
        double coberturaPorCaixa = 2.5;

        // Calcular o número de caixas necessárias e arredondar para cima
        double numeroDeCaixas = area / coberturaPorCaixa;
        int totalCaixas = (int) Math.ceil(numeroDeCaixas);

        // Calcular o custo total
        double totalValor = totalCaixas * valorUnitario;

        // Exibir os resultados
        JOptionPane.showMessageDialog(null, "Total de caixas necessárias: " + totalCaixas + "\nTotal valor: R$ " + String.format("%.2f", totalValor));
    }
}
