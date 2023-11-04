// Enunciado:
// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

package ExerciciosUdemy.ExerciciosCondicionais;

// Passo a Passo:
// 1. Declarar a variável do tipo inteiro
// 2. Ler o número inteiro
// 3. Verificar se o número é par ou ímpar
// 4. Imprimir o resultado

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os valores

        // Variaveis
        int numero;

        // Pedindo para o úsuario digitar o valor é armazanenando
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        if (numero % 2 == 1) { // Se o número que o úsuario digitou tiver o resto da sua divisão igual a 1
            System.out.println("O número: " + numero + " é impar");
        } else { // Se não
            System.out.println("O número: " + numero + " é par");
        }
        sc.close(); // Fechando o objeto Scanner
    }
}