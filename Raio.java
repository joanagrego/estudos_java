import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        double raio = r.nextDouble();
        double area = 3.14159*raio*raio;
        // Math.pow(r, 2) * 3.14159 
        if (raio>3.5){
            double circunferencia = 2 * 3.14159 * raio;
            System.out.printf("A circunferência é: %.4f", circunferencia);
            System.out.printf("\nO raio é: %.4f", area);
        }else{
            System.out.printf("O raio é: %.4f", area);
        }
    }
}
