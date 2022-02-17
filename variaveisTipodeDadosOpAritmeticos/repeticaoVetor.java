

public class RepeticaoVetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        vetor[0] = 1; 
        vetor[1] = 2; 
        vetor[2] = 8; 
        vetor[3] = 8; 
        vetor[4] = 5; 
        vetor[5] = 6; 
        vetor[6] = 8; 
        vetor[7] = 8; 
        vetor[8] = 9; 
        vetor[9] = 10; 

        boolean temValoresRepetidos = false;

        for (int i = 0; i < 8; i++){
            for (int j = 9; j > i; j--){
                if (vetor[i] == vetor[j]){
                    temValoresRepetidos = true;
                }
            }
        }
        System.out.println(temValoresRepetidos);
    }
}
