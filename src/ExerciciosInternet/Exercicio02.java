// Enunciado:
//  Faça um algoritmo para receber um número qualquer
//  e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

package ExerciciosInternet;

// Passo a Passo:
// 1 - Importar o Scanner
// 2 - Instanciar o Scanner
// 3 - Criar as variáveis
// 4 - Criar o algoritmo
// 5 - Fechar o Scanner

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 1 - Importar o Scanner // 2 - Instanciar o Scanner

        int numero; // 3 - Criar as variáveis

        // 4 - Pedindo os valores para o usuário e armazenando nas variáveis
        System.out.println("Digite qualquer número inteiro: ");
        numero = sc.nextInt();

        // Condicional para verificar se o número é par ou impar, positivo ou negativo
        if (numero % 2 == 1) {
            System.out.println("O número: " + numero + " é impar");
        } else if (numero > 0) {
            System.out.println("O número: " + numero + " é positivo");
        } else if (numero < 0) {
            System.out.println("O número: " + numero + " é negativo");
        } else {
            System.out.println("O número: " + numero + " é par");
        }
            sc.close(); // 5 - Fechar o Scanner
    }
}