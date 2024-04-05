import java.util.Scanner;

public class IntercalacaoDeVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar vetores para armazenar os números
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        // Preencher o primeiro vetor com números fornecidos pelo usuário
        System.out.println("Digite 10 números inteiros para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scanner.nextInt();
        }

        // Preencher o segundo vetor com números fornecidos pelo usuário
        System.out.println("Digite 10 números inteiros para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = scanner.nextInt();
        }

        // Criar o vetor resultante da intercalação
        int[] vetorIntercalado = new int[20];

        // Intercalar os elementos dos dois vetores
        int indiceVetor1 = 0;
        int indiceVetor2 = 0;
        for (int i = 0; i < 20; i += 2) {
            vetorIntercalado[i] = vetor1[indiceVetor1];
            vetorIntercalado[i + 1] = vetor2[indiceVetor2];
            indiceVetor1++;
            indiceVetor2++;
        }

        // Mostrar o vetor resultante da intercalação
        System.out.println("Vetor resultante da intercalação:");
        for (int num : vetorIntercalado) {
            System.out.print(num + " ");
        }
    }
}
