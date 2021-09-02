public class ArrayAula {
    public static void main(String[] args) {

        int varArray[] = {12,20,30,40};
        // funcao lenght = len do Phyton (retorna tamanho do array)
        for (int i = 0; i < varArray.length; i++){
            varArray[i] = varArray[i]*2;
            System.out.println(varArray[i]);
        }
    }
}
