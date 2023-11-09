// Enunciado:
// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

package ExerciciosUdemy.EstruturaFor;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os dados

        int numero, fatorial = 1; // Variaveis

        // Pedindo para o úsuario digitar um número e armazenando na variavel
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) { // Loop para calcular o fatorial do número digitado pelo úsuario

            fatorial *= i; // Calculando o fatorial
        }
        // Exibindo o resultado
        System.out.println("Fatorial: " + fatorial);

        sc.close(); // Fechando o objeto Scanner
    }
}
