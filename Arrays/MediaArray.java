package Arrays;
import java.util.Scanner;

    public class MediaArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Definindo o tamanho do array
            System.out.print("Quantos números você quer inserir? ");
            int tamanho = scanner.nextInt();

            // Criando o array
            double[] numeros = new double[tamanho];

// Lendo os números
            double soma = 0;
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = scanner.nextDouble();
                soma += numeros[i];
            }

            // Calculando a média
            double media = soma / tamanho;
            System.out.println("A média é: " + media);

            scanner.close();
        }
    }
