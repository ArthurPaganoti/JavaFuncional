// Enunciado:
// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.
package ExerciciosUdemy.EstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Definindo o local como US para utilizar o ponto ao invés da vírgula
        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para ler os dados

        // Variaveis
        int numero;
        double valorUm, valorDois, valorTres, media;

        // Pedindo para o úsuario digitar um número e armazenando na variavel
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        for (int i = 0; i < numero; i++) { // Loop para deixar que o úsuario digite os valores para calcular a média de acordo com os números digitados anteriormente

            System.out.println("Digite três valores: "); // Pedindo para o úsuario digitar três valores
            valorUm = sc.nextDouble();
            valorDois = sc.nextDouble();
            valorTres = sc.nextDouble();

            media = ((valorUm * 2) + (valorDois * 3) + (valorTres * 5)) / 10; // Calculando a média ponderada

            System.out.printf("Média: %.1f%n", media); // Exibindo a média
        }
        sc.close(); // Fechando o objeto Scanner
    }
}
