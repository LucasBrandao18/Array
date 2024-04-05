import java.util.Random;

public class MediaVetor {

    public static void main(String[] args) {
        // Criar um vetor com 10 números inteiros aleatórios
        int[] vetor = new int[10];
        preencherVetorAleatorio(vetor);

        // Calcular a média dos elementos do vetor
        double media = calcularMedia(vetor);

        // Mostrar a média
        System.out.println("A média dos elementos do vetor é: " + media);
    }

    // Método para preencher o vetor com números inteiros aleatórios
    public static void preencherVetorAleatorio(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); // Números aleatórios entre 0 e 99
        }
    }

    // Método para calcular a média dos elementos do vetor
    public static double calcularMedia(int[] vetor) {
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        return (double) soma / vetor.length;
    }
}

