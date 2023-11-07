// Enunciado:
// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

package ExerciciosInternet;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // System.in é a entrada de dados via teclado

        int numero, antecessor, sucessor; // Variáveis do tipo inteiro

        // Entrada de dados
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        // Processamento de dados
        antecessor = numero -1;
        sucessor = numero + 1;

        // Saída de dados
        System.out.println("O seu número foi: " + numero);
        System.out.println("O seu sucessor é: " + sucessor);
        System.out.println("O seu antecessor é: " + antecessor);

        sc.close(); // Fechando o Scanner
    }
}
