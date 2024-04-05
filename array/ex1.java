public class Main {
  public static void main(String[] args) {

            // Criar vetor para armazenar os números
            int[] vetor = new int[10];

            // Preencher o vetor com números fornecidos pelo usuário
            System.out.println("Digite 10 números inteiros:");
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            // Verificar e imprimir os números primos e suas posições
            System.out.println("Números primos e suas posições:");
            for (int i = 0; i < 10; i++) {
                if (isPrimo(vetor[i])) {
                    System.out.println("Número primo: " + vetor[i] + ", Posição: " + i);
                }
            }
        }

        // Método para verificar se um número é primo
        public static boolean isPrimo(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

  }