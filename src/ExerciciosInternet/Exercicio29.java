package ExerciciosInternet;

// Faça um programa que receba a idade e a altura de várias pessoas e que calcule e mostre a média das alturas das pessoas com mais de 50 anos.
// Para encerrar a entrada de dados digite idade menor ou igual a zero

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade, contadorDeIdadeMais50 = 0;
        double altura, somatorioAltura = 0, mediaAltura;

        do {

            System.out.println("Informe a idade: ");
            idade = sc.nextInt();

            if (idade > 50) {
                System.out.println("Informe a sua altura: ");
                altura = sc.nextDouble();
                somatorioAltura += altura;
                contadorDeIdadeMais50++;
            }
        } while (idade > 0);
        if (contadorDeIdadeMais50 > 0) {
            mediaAltura = somatorioAltura / contadorDeIdadeMais50;
            System.out.println("Média da altura das pessoas com mais de 50: " + mediaAltura);
        } else {
            System.out.println("Não existem pessoas com mais de 50 anos");
        }

    }
}