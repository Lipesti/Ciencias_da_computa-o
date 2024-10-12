import javax.swing.JOptionPane;

public class exc4 {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Informe a primeira nota");
        String n2 = JOptionPane.showInputDialog("Informe a segunda nota");
        String n3 = JOptionPane.showInputDialog("Informe a terceira nota");
        String n4 = JOptionPane.showInputDialog("Informe a quarta nota");

        //Converte a String para numeros reais 
        double media = (Double.parseDouble(n1) + Double.parseDouble(n2) + Double.parseDouble(n3) + Double.parseDouble(n4)) / 4;
        
        JOptionPane.showMessageDialog(null, "Média das notas: " + media);
    }
}
