// Fazer um programa para ler quatro valores inteiros A, B, C e D.
// A seguir, calcule e mostre a diferença do produto
// De A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package ExerciciosUdemy.ExerciciosSequenciais;

// Passo a Passo:
// Primeiro será necessario importar a classe Scanner do pacote java.util
// Depois será necessario criar um objeto do tipo Scanner para ler os valores
// Depois será necessario declarar as variaveis do tipo int
// Depois será necessario ler os valores e armazenar nas variaveis
// Depois será necessario declarar uma variavel do tipo int para armazenar a diferença dos produtos
// Depois será necessario atribuir a diferença dos produtos a variavel diferenca
// Depois será necessario imprimir a mensagem com o resultado da diferença dos produtos


import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto do tipo Scanner

        int valorA, valorB, valorC, valorD, diferenca; // Declarando as variaveis

        // Lendo os valores e armazenando nas variaveis:
        System.out.println("Digite o primeiro valor: ");
        valorA = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        valorB = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        valorC = sc.nextInt();
        System.out.println("Digite o quarto valor: ");
        valorD = sc.nextInt();

        // Atribuindo a diferença dos produtos a variavel diferenca:
        diferenca = (valorA * valorB) - (valorC * valorD);

        // Imprimindo a mensagem com o resultado da diferença dos produtos:
        System.out.println("A diferença é: " + diferenca);

        // Fechando o objeto sc:
        sc.close();
    }
}