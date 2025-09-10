import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Insira o valor do raio: ");
        float raio = sc.nextFloat();
        
        double area =  3.14159 * (raio*raio);
         
        System.out.printf("Area = %.2f", area);
        sc.close();
    }
}