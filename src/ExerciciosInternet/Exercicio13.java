// Enunciado:
// Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

package ExerciciosInternet;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Para ler o que o usuário digitar

        // Variáveis
        String nome;
        int idade;

        // Pedindo para digitar o nome e idade e armazenando nas variáveis
        System.out.println("Digite o seu nome: ");
        nome = sc.next();
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        // Verificando se a idade é maior ou menor que 18 e exibindo na tela a mensagem com o nome
        if (idade >= 18) {
            System.out.println("Parabéns " + nome + " , você é maior de idade");
        } else {
            System.out.println("Infezlimente " + nome +" , você ainda é menor de idade");
        }
        sc.close(); // Fechando o Scanner
    }
}
