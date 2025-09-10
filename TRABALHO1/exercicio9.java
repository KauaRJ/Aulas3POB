import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Insira o valor em reais (R$): ");
        double real = sc.nextFloat();
        System.out.print("Insira o a cotacao do dolar hoje: ");
        double cotacao = sc.nextFloat();
        
        
        double dolar = real/cotacao;
         
        System.out.printf("Valor convertido = %.2f$", dolar);
         

        sc.close();
    }
}