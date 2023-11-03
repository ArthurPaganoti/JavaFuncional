// Enunciado:
// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
// Calcule e mostre o valor a ser pago.

package ExerciciosUdemy.ExerciciosSequenciais;

// Passo a Passo:
// 1. Declarar as variáveis
// 2. Ler os valores
// 3. Calcular o valor a ser pago
// 4. Mostrar o resultado

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Variaveis peça 1
        int codigoPeca, numeroPecas;
        double valorPeca;

        // Variaveis peça 2
        int codigoPeca2, numeroPecas2;
        double valorPeca2;

        // Variavel Global
        double valorTotal;

        // Pedindo os valores e armazenando nas variaveis
        System.out.println("Digite o código do produto 1: ");
        codigoPeca = sc.nextInt();
        System.out.println("Digite o número de produtos 1: ");
        numeroPecas = sc.nextInt();
        System.out.println("Digite o valor do produto 1: ");
        valorPeca = sc.nextDouble();
        System.out.println("Digite o código do produto 2: ");
        codigoPeca2 = sc.nextInt();
        System.out.println("Digite o número de produtos 2: ");
        numeroPecas2 = sc.nextInt();
        System.out.println("Digite o valor do produto 2: ");
        valorPeca2 = sc.nextDouble();

        // Conta para descobrir o valor total
        valorTotal = (numeroPecas * valorPeca) + (numeroPecas2 * valorPeca2);

        // Exibindo o valor total na tela
        System.out.println("Valor total a pagar: R$ " + valorTotal);

        sc.close(); // Fechando o objeto sc.
    }
}
