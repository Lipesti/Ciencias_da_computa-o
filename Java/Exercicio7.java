import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        // Entrada de dados
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor real para saber o seu triplo:"));

        // Cálculo do triplo
        int triplo = numero * 3;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "O triplo do valor real informado é: " + triplo);
    }
}
