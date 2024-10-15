
public class Tabuada {
    public static void main(String[] args) {
        
        for(int tab= 0; tab <= 10; tab++){
            System.out.println("\nTabuada do " + tab);
            for(int i=1; i<=10; i++){
                System.out.println(tab + " x " + i + " = " + (tab*i));
            }
        }
    }
}
