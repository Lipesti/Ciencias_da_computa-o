import javax.swing.JOptionPane;

public class AreaTriangulo {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do triângulo:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triângulo:"));

        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}
