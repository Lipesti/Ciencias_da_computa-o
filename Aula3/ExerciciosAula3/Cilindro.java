import javax.swing.JOptionPane;

public class Cilindro {
    public static void main(String[] args) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da base do cilindro:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do cilindro:"));
        double areaBase = Math.PI * Math.pow(raio, 2);
        double volume = altura * Math.PI * Math.pow(raio, 2);

        JOptionPane.showMessageDialog(null, "Área da base do cilindro: " + areaBase + "\nVolume do cilindro: " + volume);
    }
}
