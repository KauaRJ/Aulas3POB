import java.util.Scanner;

public class Main{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Insira a base do retangulo: ");
        float base = sc.nextFloat();
        System.out.print("Insira a altura do retangulo: ");
        float altura = sc.nextFloat();
         
        double area = base * altura;
        double perimetro = 2 * (base + altura);
         
        System.out.printf("Area = %.2f", area);
        System.out.printf("\nPerimetro = %.2f", perimetro);

        sc.close();
    }
}