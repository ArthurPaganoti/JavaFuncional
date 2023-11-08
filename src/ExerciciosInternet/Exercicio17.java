// Enunciado:
// Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)

package ExerciciosInternet;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Criando o objeto Locale que serve para utilizarmos ponto no lugar da virgula
        Scanner sc = new Scanner(System.in); // Criando o objeto scanner para lermos os dados

        // Variaveis para temperatura
        double temperaturaFahrenheit, conversaoCelsius;

        // Pedindo para o úsuario digitar a temperatura em Fahrenheit e armazenando o valor na variavel
        System.out.println("Digite a temperatura em Fahrenheit: ");
        temperaturaFahrenheit = sc.nextDouble();

        // Calculo para conversão de temperatura
        conversaoCelsius = (5 * (temperaturaFahrenheit - 32) / 9);

        // Exibindo o resultado na tela
        System.out.println("O resultado da conversão é: " + conversaoCelsius);

        sc.close(); // Fechando o objeto Scanner
    }
}
