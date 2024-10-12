import javax.swing.JOptionPane;

public class exc5 {
    public static void main(String[] args){
        String peso1 = JOptionPane.showInputDialog("Informe a primeira nota: ");
        String peso2 = JOptionPane.showInputDialog("Informe a segunda nota: ");
        String peso4 = JOptionPane.showInputDialog("Informe a terceira nota: ");

        int p1 = Integer.parseInt(peso1) * 1;
        int p2 = Integer.parseInt(peso2) * 2;
        int p4 = Integer.parseInt(peso4) * 4;

        double media = (p1 + p2 + p4) / 7.0;
        String mediaFormatado = String.format("%.2f", media);

        JOptionPane.showMessageDialog(null, "Média das notas: " + mediaFormatado);
        
    }
}
