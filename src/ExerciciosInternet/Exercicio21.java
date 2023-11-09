// Enunciado:
// Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

package ExerciciosInternet;

import java.util.Random;

public class Exercicio21 {
    public static void main(String[] args) {


        Random aleatorio = new Random(); // Passando o objeto random para gerar números aleatorios

        // Variaveis
        int numeroAleatorio;

        numeroAleatorio = aleatorio.nextInt(100) + 1; // Pedindo para gerar um número aleatorio entre 1 e 100

        System.out.println("O número aleátorio é: " + numeroAleatorio); // Imprimindo o número aleátorio
    }
}
