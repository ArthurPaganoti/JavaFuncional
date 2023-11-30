// Enunciado do exercício:
// Faça um programa para ler dois valores inteiros.
// Depois mostrar na tela a soma desses números com uma mensagem explicativa

package ExerciciosUdemy.ExerciciosSequenciais;

// Passo a Passo:
// Primeiro será necessario importar a classe Scanner do pacote java.util
// Depois será necessario criar um objeto do tipo Scanner para ler os valores
// Depois será necessario declarar as variaveis do tipo int
// Depois será necessario ler os valores e armazenar nas variaveis
// Depois será necessario declarar uma variavel do tipo int para armazenar a soma dos valores
// Depois será necessario atribuir a soma dos valores a variavel soma
// Depois será necessario imprimir a mensagem com o resultado da soma

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando objeto do tipo Scanner

        // Variaveis:
        int valorUm, valorDois, resultadoSoma;

        // Lendo os valores e armazenando nas variaveis:
        System.out.println("Digite o primeiro valor:");
        valorUm = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        valorDois = sc.nextInt();

        // Atribuindo a soma dos valores a variavel soma:
        resultadoSoma = valorUm + valorDois;

        // Imprimindo a mensagem com o resultado da soma:
        System.out.println("O resultado da soma é: " + resultadoSoma);

        // Fechando o objeto sc

        sc.close();
    }
}
