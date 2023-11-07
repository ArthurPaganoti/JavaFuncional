// Enunciado:
// Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//
//imprimir seu valor na tela.

package ExerciciosInternet;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 1 - Importar o Scanner // 2 - Instanciar o Scanner

        double valorA, valorB, resultado; // 3 - Criar as variáveis

        // 4 - Pedindo os valores para o usuário e armazenando nas variáveis
        System.out.println("Digite o valor de A: ");
        valorA = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        valorB = sc.nextDouble();

        // Condicional para verificar se os valores são iguais, e se for igual soma, se não multiplica
        if (valorA == valorB) {
            resultado = valorA + valorB;
            System.out.println("O resultado da soma é: " + resultado);
        } else {
            resultado = valorA * valorB;
            System.out.println("O resultado da multiplicação é: " + resultado);
        }
        sc.close(); // 5 - Fechar o Scanner
    }
}