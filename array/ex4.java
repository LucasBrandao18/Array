import java.util.Random;

public class VerificarNumero {

    public static void main(String[] args) {
        // Criando um vetor com 20 números inteiros
        int[] vetor = new int[20];

        // Preenchendo o vetor com números aleatórios entre 1 e 30
        preencherVetor(vetor);

        // Verificando se o número 25 existe no vetor
        boolean encontrado = verificarNumero(vetor, 25);

        // Exibindo o resultado
        if(encontrado) {
            System.out.println("O número 25 foi encontrado no vetor.");
        } else {
            System.out.println("O número 25 não foi encontrado no vetor.");
        }
    }

    // Função para preencher o vetor com números aleatórios entre 1 e 30
    public static void preencherVetor(int[] vetor) {
        Random random = new Random();
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(30) + 1;
        }
    }

    // Função para verificar se um número existe no vetor
    public static boolean verificarNumero(int[] vetor, int numero) {
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
}

