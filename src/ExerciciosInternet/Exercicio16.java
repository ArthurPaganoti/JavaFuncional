// Enunciado:
// Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//
//equilátero, isósceles ou escaleno

package ExerciciosInternet;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando o objeto Scanner

        // Váriaveis dos lados
        int ladoA, ladoB, ladoC;

        // Exibindo, pedindo e armazenando os valores nas váriaveis
        System.out.println("Digite o lado A: ");
        ladoA = sc.nextInt();
        System.out.println("Digite o lado B: ");
        ladoB = sc.nextInt();
        System.out.println("Digite o lado C: ");
        ladoC = sc.nextInt();

        // Fazendo as dévidas comparações para verificarmos que tipo de triângulo é
        if (ladoB == ladoA && ladoC == ladoB ) { // Se ladoB for igual ao ladoA e se ladoC for igual ao ladoB
            System.out.println("O triângulo é isósceles");
        } else if (ladoA != ladoB && ladoB != ladoC) { // Se ladoA for diferente do ladoB e se ladoB for diferente do ladoC
            System.out.println("O triãngulo é escaleno");
        } else if (ladoA + ladoB + ladoC == 180) { // Se a soma dos tr~es lados forem iguais a 180
            System.out.println("O triãngulo é equilátero");
        }
            sc.close(); // Fechando o objeto Scanner
    }
}
