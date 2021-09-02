import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int num = f.nextInt();
        
        int fat = 1;
      for(int i = 1; i <= num; i++ ) {
         fat *= i;
        }
        System.out.println(fat);
    }
}
