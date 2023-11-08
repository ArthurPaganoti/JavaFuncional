// Enunciado:
// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

package ExerciciosUdemy.EstruturaWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // Criando um objeto Scanner para ler os dados

        int eixoX, eixoY; // Variaveis para as coordenadas

        // Pedindo para o úsuario digitar as coordenadas e armazenando na variavel
        System.out.println("Digite o valor da coordenada X: ");
        eixoX = sc.nextInt();
        System.out.println("Digite o valor da coordenada Y: ");
        eixoY = sc.nextInt();

        while ((eixoX & eixoY) != 0) { // Enquanto as coordenadas forem diferentes de 0

            // Se as coordenadas forem maiores que 0
            if (eixoX > 0 & eixoY > 0) {
                System.out.println("Primeiro Quadrante");
                break;
            } else if (eixoX < 0 & eixoY > 0) {
                System.out.println("Segundo Quadrante");
                break;
            } else if (eixoX < 0 & eixoY < 0) {
                System.out.println("Terceiro Quadrante");
                break;
            } else if (eixoX > 0 & eixoY < 0) {
                System.out.println("Quarto Quadrante");
                break;
            } else {
                System.out.println("Origem");
                break;
            }
        }
        sc.close(); // Fechando o objeto Scanner
    }
}
