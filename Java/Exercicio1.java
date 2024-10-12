import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        // Entrada de dados usando JOptionPane
        String nome = JOptionPane.showInputDialog("Por gentileza, digite o seu nome:");
        String cargo = JOptionPane.showInputDialog("Informe o seu cargo atual:");
        String qtdeDependenteString = JOptionPane.showInputDialog("Qual a quantidade de dependentes que possui?");
        
        // Conversão de string para inteiro
        int qtdeDependente = Integer.parseInt(qtdeDependenteString);

        // Exibição dos dados
        String mensagem = "Nome do funcionário é: " + nome + "\n"
                        + "Cargo ocupado atualmente é: " + cargo + "\n"
                        + "Quantidade de dependentes informada: " + qtdeDependente;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
