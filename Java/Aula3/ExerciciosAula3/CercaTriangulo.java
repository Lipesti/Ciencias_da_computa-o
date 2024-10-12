import javax.swing.JOptionPane;

public class CercaTriangulo {
    public static void main(String[] args) {
        double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do lado A:"));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do lado B:"));
        double ladoC = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do lado C (lado a ser cercado):"));

        // Calcula a quantidade total de cerca necessária para cercar o triângulo
        double cercaNecessaria = ladoA + ladoB + ladoC;

        JOptionPane.showMessageDialog(null, "Quantidade de cerca necessária para fechar o triângulo: " + cercaNecessaria + " metros.");
    }
}
