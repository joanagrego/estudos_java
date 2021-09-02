import java.util.Scanner;

public class RepeticaoWhile {

    public static void main(String[] args) {
        // Enquanto usuário não inserir 'SAIR' continue operação
        
        Scanner sc = new Scanner(System.in);
        String frase = "";
        // toUpperCase() -> transformar em letras maíusculas
        // toLowerCase() -> transformar em letras minúsculas
        while(!frase.toUpperCase().equals("SAIR")){ // enquanto a string for diferente de "SAIR"

            System.out.println("Somos CESAR!");

            frase = sc.nextLine();
        }
        //do{

       // }while
    }
}
