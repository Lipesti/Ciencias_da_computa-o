import javax.swing.JOptionPane;

public class exc7 {
    public static void main(String[] args) {
        // Pedir ao usuário o raio do cilindro usando JOptionPane
        String raioStr = JOptionPane.showInputDialog("Digite o raio da base do cilindro:");
        double raio = Double.parseDouble(raioStr);  // Converter a entrada para double
        
        // Pedir ao usuário a altura do cilindro usando JOptionPane
        String alturaStr = JOptionPane.showInputDialog("Digite a altura do cilindro:");
        double altura = Double.parseDouble(alturaStr);  // Converter a entrada para double
        
        // Definir a constante Pi
        final double PI = 3.1416;
        
        // Calcular a área da base (área do círculo)
        double areaBase = PI * Math.pow(raio, 2);
        
        // Calcular o volume do cilindro
        double volume = areaBase * altura;
        
        // Exibir os resultados usando JOptionPane
        JOptionPane.showMessageDialog(null, String.format("A área da base do cilindro é: %.2f\nO volume do cilindro é: %.2f", areaBase, volume));
    }
}
