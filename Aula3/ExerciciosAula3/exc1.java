import javax.swing.JOptionPane;

public class exc1 {
    public static void main(String[] args) {
        String peso = JOptionPane.showInputDialog("Informe o seu peso:  ");
        String altura = JOptionPane.showInputDialog("Informe a sua altura:  ");

        double p = Double.parseDouble(peso);
        double a = Double.parseDouble(altura);
        double imc = p / (a * a);
        
        // Formata o IMC para duas casas decimais
        String imcFormatado = String.format("%.2f", imc);

        // Exibe o IMC formatado
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imcFormatado);
    }
}
