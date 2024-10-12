import javax.swing.JOptionPane;

public class exc2 {
    public static void main(String[] args){
        String x = JOptionPane.showInputDialog("Informe o valor de x");

        int xInt = Integer.parseInt(x);
        int y = 3 + 2*xInt;

        JOptionPane.showMessageDialog(null, "O resultado de y = 3 + 2 * x é: " + y);
    }
}
