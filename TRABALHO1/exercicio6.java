import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Insira seu salario bruto: ");
        float salarioBruto = sc.nextFloat();
        double salarioLiquido = 0;
         
        if(salarioBruto <= 1518){

            salarioLiquido = salarioBruto * (1 - 0.075);
        }
        else if(salarioBruto <= 2793.88){

            salarioLiquido = salarioBruto * 0.91;
        }
         else if(salarioBruto <= 4190.83){

            salarioLiquido = salarioBruto * 0.88;
        }
         else{

            salarioLiquido = salarioBruto * 0.86;
        }     
        System.out.printf("Salario Liquido %.2f", salarioLiquido);
        sc.close();
    }
}