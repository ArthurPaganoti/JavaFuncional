//Enunciado:
//  Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

package ExerciciosInternet;

// Passo a Passo:
// 1 - Importar o Scanner
// 2 - Instanciar o Scanner
// 3 - Criar as variáveis
// 4 - Pedir os valores para o usuário e armazenar nas variáveis
// 5 - Criar a condicional para verificar qual é o maior valor
// 6 - Criar a condicional para verificar qual é o menor valor
// 7 - Criar a condicional para verificar qual é o valor do meio
// 8 - Imprimir na tela os valores em ordem decrescente

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 1 - Importar o Scanner // 2 - Instanciar o Scanner

        int valorA, valorB, valorC; // 3 - Criar as variáveis

        // 4 - Pedindo os valores para o usuário e armazenando nas variáveis
        System.out.println("Digite o valor de A: ");
        valorA = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        valorB = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        valorC = sc.nextInt();

        // 5 - Criar a condicional para verificar qual é o maior valor
        if (valorA > valorB && valorA > valorC) {
            if (valorB > valorC) {
                System.out.println("A ordem decrescente é: " + valorA + " " + valorB + " " + valorC);
            } else {
                System.out.println("A ordem decrescente é: " + valorA + " " + valorC + " " + valorB);
            }
        } else if (valorB > valorA && valorB > valorC) {
            if (valorA > valorC) {
                System.out.println("A ordem decrescente é: " + valorB + " " + valorA + " " + valorC);
            } else {
                System.out.println("A ordem decrescente é: " + valorB + " " + valorC + " " + valorA);
            }
        } else if (valorC > valorA && valorC > valorB) {
            if (valorA > valorB) {
                System.out.println("A ordem decrescente é: " + valorC + " " + valorA + " " + valorB);
            } else {
                System.out.println("A ordem decrescente é: " + valorC + " " + valorB + " " + valorA);
            }
        }
        sc.close(); // Fechando o Scanner
    }
}
