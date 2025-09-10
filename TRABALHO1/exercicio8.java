import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Insira o raio da esfera: ");
        float raio = sc.nextFloat();
        
        double volume = (4.0/3.0) * 3.14159 * Math.pow(raio,3);
         
        System.out.printf("Volume = %.2f", volume);
         

        sc.close();
    }
}