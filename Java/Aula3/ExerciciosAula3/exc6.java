import javax.swing.JOptionPane;

public class exc6 {
    public static void main(String[] args) {
        String graus = JOptionPane.showInputDialog("Informe um valor em graus: ");

        double converterGraus = Double.parseDouble(graus);
        double radianos = Math.toRadians(converterGraus);
        double seno = Math.sin(radianos);
        double cos = Math.cos(radianos);
        double tan = Math.tan(radianos);

        JOptionPane.showMessageDialog(null, "Seno: " + seno + "\nCosseno: " + cos + "\nTangente: " + tan);
        
    }
}
