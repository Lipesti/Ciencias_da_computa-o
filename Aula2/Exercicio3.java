import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        // Entrada de dados
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a (base do primeiro retângulo):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b (base do segundo retângulo):"));
        double d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de d (altura dos retângulos):"));

        // Cálculo das áreas
        double A1 = a * d;
        double A2 = b * d;
        double AT = A1 + A2;

        // Exibição dos resultados
        String mensagem = "A área do retângulo superior (A1) é: " + A1 + "\n"
                        + "A área do retângulo inferior (A2) é: " + A2 + "\n"
                        + "A área total (AT) dos dois retângulos é: " + AT;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
