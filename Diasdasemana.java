import java.util.Scanner;

public class Diasdasemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia = "";
        dia = sc.nextLine();

        switch(dia.toLowerCase()){

            case "d":
                System.out.println("Domingo");
                break;
            case "s":
                System.out.println("Segunda, sábado e sexta.");
                break;
            case "t":
                System.out.println("Terça");
                break;
            case "q":
                System.out.println("Quarta e quinta");
                break;
            default:
                System.out.println("Dia não encontrado. Tente novamente.");
                break;

        }
    }
}
