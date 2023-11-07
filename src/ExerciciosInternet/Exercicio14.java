// Enunciado:
// Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores

package ExerciciosInternet;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Para ler o que o usuário digitar

        // Variáveis
        int valorA, valorB;

        // Pedindo para o úsuario digitar o valor e armazenando na variável
        System.out.println("Digite o valor de A: ");
        valorA = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        valorB = sc.nextInt();

        // Atribuindo o valor de A em B e B em A
        valorA = valorB;
        valorB = valorA;

        // Imprimindo os valores
        System.out.println("O valor de A: " + valorA);
        System.out.println("O valor de B: " + valorB);

        sc.close(); // Fechando o Scanner
    }
}
