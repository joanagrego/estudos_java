public class ArrayPar {

    // Imprima os números pares dentro de um vetor.
    public static void main(String[] args) {
        
        int varArray[] = {1,2,3,4,5,6};

        for (int v : varArray){
            if(v%2 == 0){
                System.out.println(v);
            }
        }
    }
}
