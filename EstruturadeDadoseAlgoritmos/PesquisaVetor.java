import java.util.Scanner;

public class PesquisaVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = { 1, 3, 5, 7, 9};  // Cria o vetor com valores pré-definidos
		boolean achou = false;  // Variável para armazenar o resultado da procura

		System.out.println("Qual número deseja procurar? ");
		int numero = entrada.nextInt();

		for (int posicao = 0; posicao < 5; posicao++)
		{
			if (vetor[posicao] == numero)
			{
				System.out.println("Encontrado na posição: "+ posicao+ "\n");
				achou = true;  
			}
		}	
        if (!achou) 
            {
			System.out.println("O número não está no vetor\n");
		    }	
		entrada.close();
    }
}
