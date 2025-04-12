package Arrays;
import java.util.Scanner;

public class ListaCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] estoque = new int[3][5];

        System.out.println("Digite o nome dos 5 itens que você deseja comprar no Supermercado: ");
        for (int i = 0; i < 1; i++) {
            System.out.println("Mercado " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Produto " + (j + 1) + ": ");
                estoque[i][j] = scanner.nextInt();


                    }
                }
            }
        }
