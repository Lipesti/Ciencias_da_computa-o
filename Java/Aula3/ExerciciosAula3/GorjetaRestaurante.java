import javax.swing.JOptionPane;

public class GorjetaRestaurante {
    public static void main(String[] args) {
        double gasto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do gasto do cliente:"));
        double total = gasto * 1.10; // Inclui os 10% do garçom

        JOptionPane.showMessageDialog(null, "O valor total a ser pago, incluindo a gorjeta, é: " + total);
    }
}
