import javax.swing.JOptionPane;

public class RestoDivisao {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número:"));

        int resto = num1 % num2;

        JOptionPane.showMessageDialog(null, "O resto da divisão de " + num1 + " por " + num2 + " é: " + resto);
    }
}
