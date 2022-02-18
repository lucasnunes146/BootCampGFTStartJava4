import java.util.Random;

public class ExibeMatrizes {
    public static void main(String[] args) {
        // Define as dimensões (linhas e colunas) da matriz
		final int TAMANHO = 5;

		// Cria a matriz
		int[][] matriz = new int[TAMANHO][TAMANHO]; 
        Random generator = new Random();

		for (int linha = 0; linha < TAMANHO; linha++)
		{
			for (int coluna = 0; coluna < TAMANHO; coluna++)
			{
				matriz[linha][coluna] = generator.nextInt(10); // Atribui um valor aleatório à posição da matriz
				
				System.out.print("["+matriz[linha][coluna]+"]"+ " ");// Exibe o valor contido na posição da matriz
			}
            System.out.println("\n");
		}
    }
}
