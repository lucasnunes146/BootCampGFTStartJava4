import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor = entrada.nextInt();
        int aux = 0;

        for (int i = 0; i <= valor; i ++){
            if(aux % 2 == 0 && aux != 0){
                System.out.println(aux);
                
            }  
            aux++;
        }
        entrada.close();
    }
}
