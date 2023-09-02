/* Entrar com um vetor randômico de 50 posições
✓ Implementar o método de ordenação da Bolha – Bubble Sort
✓ Realizar a rotina de busca de um elemento no vetor – método
de pesquisa Binária */

package Q2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[50];

        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(999);
        }

        System.out.println("Vetor randômico original:");
        System.out.println(Arrays.toString(vetor));

        bubbleSort(vetor);

        System.out.println("Vetor randômico ordenado:");
        System.out.println(Arrays.toString(vetor));

        System.out.println("Digite um valor para buscar:");
        int valorBuscado = sc.nextInt();

        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (valorBuscado == vetor[i]) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O valor " + valorBuscado + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O valor " + valorBuscado + " não foi encontrado");
        }
    }

    private static void bubbleSort(int[] vetor) {
        for (int i = vetor.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
}
