// Enunciado:
// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package ExerciciosUdemy.ExerciciosCondicionais;

// Passo a Passo:
// 1. Declarar a variável do tipo inteiro
// 2. Ler o número inteiro
// 3. Verificar se o número é negativo
// 4. Imprimir o resultado

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner

        // Variaveis
        int numero;

        // Pedindo para o usuario digitar o número e armazenando na váriavel
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        // Condicionais
        if (numero < 0) { // Sse o número for menor (<) que 0
            System.out.println("O número: " + numero + " é negativo"); // Manda a mensagem dizendo que o número é negativo
        } else { // Se não
            System.out.println("O número : " +numero + " é postivo"); // Manda mensagem dizendo que o número é positivo
        }
        sc.close(); // Fechando o objeto sc.
    }
}