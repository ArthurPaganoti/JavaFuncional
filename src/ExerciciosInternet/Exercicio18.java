// Enunciado:
// Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
// Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Sara.

package ExerciciosInternet;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Criando o objeto Locale para utilizar o ponto
        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner para lermos os valores

        // Variaveis
        double alturaFrancisco = 1.50, alturaSara = 1.10;

        // Calculo para saber quantos anos serão necessários para que Sara seja maior que Francisco
        int anos = 0;
        while (alturaSara <= alturaFrancisco) {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos++;
        }

// Exibindo o resultado na tela
        System.out.println("Serão necessários " + anos + " anos para que Sara seja maior que Francisco");

        sc.close(); // Fechando o objeto Scanner
    }
}
