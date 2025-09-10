import java.until.scanner;

public class Main{
    public static void main(Striing[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor da soma: ");
        int val1 = sc.nextInt();
        System.out.print("Insira o segundo valor da soma: ");
        int val2 = sc.nextInt();
         
        int total = val1 + val2;
         
        System.out.print("Soma total: " + total);
        sc.close();
    }
}