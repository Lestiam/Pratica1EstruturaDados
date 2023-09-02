/* Busca Sequencial: Fazer um programa que insira 10 valores inteiros randômicos
em um vetor, mostre o vetor e busque um determinado elemento (mostrar a
posição que encontrou). Caso não exista imprimir mensagem de não localizado.
*/

package Q1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];

        Random random = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(100);
        }

        System.out.println("Seu vetor ficou assim: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        System.out.println("Digite um valor para buscar: ");
        int buscar = sc.nextInt();

        int posicao = -1;
        for (int i = 0; i < vet.length; i++) {
            if (buscar == vet[i]) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O valor " + buscar + " foi localizado na posição " + posicao);
        } else {
            System.out.println("O valor " + buscar + " não foi localizado");
        }
    }
}