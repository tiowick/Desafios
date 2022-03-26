package Direct_8;

/*
Entrada
A primeira linha da entrada contém um inteiro L (1 ≤ L ≤ 1000) indicando o número de linhas do tabuleiro.
A segunda linha da entrada contém um inteiro C (1 ≤ C ≤ 1000) representando o número de colunas.

Saída
Imprima uma linha na saída. A linha deve conter um inteiro, representando a cor da casa no canto inferior direito do tabuleiro.
E para identificar, considere o inteiro 1 para a cor branca e 0 para a cor preta.
 */
import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if ((L + C) % 2 == 0) {
            System.out.println(" 1  ");
        } else {                            //complete o código nos espaços em branco
            System.out.println("  0 ");
            sc.close();
        }

    }
}