import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Insira o valor da primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Insira o valor da segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.print("Insira o valor da terceira nota: ");
        float nota3 = sc.nextFloat();
        
        float media = (nota1 + nota2 + nota3) / 3;
         
        System.out.printf("Média aritmética simples = %.2f", media);
        sc.close();
    }
}