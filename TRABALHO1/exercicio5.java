import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Insira sua idade em anos: ");
        int anos = sc.nextInt();
        
        int dias = anos * 365;
         
        System.out.print("Voce viveu aproximadamente " + dias + " dias !");
        sc.close();
    }
}