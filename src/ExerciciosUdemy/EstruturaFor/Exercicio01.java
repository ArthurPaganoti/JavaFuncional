// Enunciado:
// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso
package ExerciciosUdemy.EstruturaFor;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os dados

        int numero; // Variavel para armazenar o número digitado pelo úsuario

        // Pedindo para o úsuario digitar um número e armazenando na variavel
        System.out.println("Digite um número inteiro entre 1 e 1000: ");
        numero = sc.nextInt();

        // Exibindo os números ímpares de 1 até o número digitado pelo úsuario
        for (int i = 1; i <= numero; i++) { // Loop para imprimir os números ímpares de 1 até o número digitado pelo úsuario

            if (i % 2 == 1) { // Condição para verificar se o número é ímpar
                System.out.println("Número: " + i); // Exibindo o número ímpar
            }
        }
        sc.close(); // Fechando o objeto Scanner
    }
}