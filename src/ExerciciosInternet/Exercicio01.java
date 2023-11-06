// Enunciado:
// Faça um algoritmo que leia os valores de A, B, C
// e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

package ExerciciosInternet;

// Passo a Passo:
// 1 - Importar o Scanner
// 2 - Instanciar o Scanner
// 3 - Criar as variáveis
// 4 - Criar o algoritmo
// 5 - Fechar o Scanner


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 1 - Importar o Scanner // 2 - Instanciar o Scanner

        double valorA, valorB, valorC, soma; // 3 - Criar as variáveis

        // 4 - Pedindo os valores para o usuário e armazenando nas variáveis
        System.out.println("Digite o valor de A: ");
        valorA = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        valorB = sc.nextDouble();
        System.out.println("Digite um valor para C: ");
        valorC = sc.nextDouble();

        // Somando os valores de A e B
        soma = valorA + valorB;

        // Condicional para verificar se a soma é menor que C
        if (soma < valorC) {
            System.out.println("O resultado da soma é menor que o valor de C");
        } else {
            System.out.println("O resultado da soma é maior que o valor de C");
        }
        sc.close(); // 5 - Fechar o Scanner
    }
}