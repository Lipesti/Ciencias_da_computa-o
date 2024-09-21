import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        // Entrada de dados
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas:"));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos:"));

        // Conversão para minutos
        int minutosPassados = (hora * 60) + minutos;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "Os minutos passados desde o início do dia são: " + minutosPassados);
    }
}
