import javax.swing.JOptionPane;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Informe o coeficiente a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Informe o coeficiente b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Informe o coeficiente c:"));

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta >= 0) {
            // Calcula as raízes apenas se delta for maior ou igual a zero
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Raízes da equação: \nRaiz 1: " + raiz1 + "\nRaiz 2: " + raiz2);
        } else {
            // Se delta for negativo, informa que não há raízes reais
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais.");
        }
    }
}
