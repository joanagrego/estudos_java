public class DiferencaOperadores {
    
    public static void main(String[] args) {
        int i = 0;
        String palavra = null;

        if (++i == 0 | i++ > 0){ // o simbolo && = and e o simbolo || = or
              System.out.println(i); // só um | ou um & ele só verifica uma das condições, podendo não executar o próximo.
        }
        if (true | palavra.isEmpty()){
            System.out.println(palavra);
        }
    }
}
