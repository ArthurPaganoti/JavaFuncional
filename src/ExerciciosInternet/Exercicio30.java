package ExerciciosInternet;

// Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código. Os códigos utilizados são:
//
//1, 2, 3, 4	Votos para os respectivos candidatos
//5	Voto nulo
//6	Voto em branco
//Faça um programa que calcule e mostre:
//
//O total de votos para cada candidato;
//O total de votos nulos:
//O total de votos em branco;
//A percentagem de votos nulos sobre o total de votos;
//A percentagem de votos em branco sobre o total de votos.
//Para finalizar o conjunto de votos, tem-se o valor zero.

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = -1, votoArthur = 0, votoAyna = 0, votoBernardo = 0, votoKarla = 0,
                votoNulo = 0, votoBranco = 0, totalVotos = 0;

        while (opcao != 0) {

            System.out.println("Bem-Vindo. Digite em quem será o seu voto!");
            System.out.println("1-) Presidente Arthur");
            System.out.println("2-) Presidenta Ayna");
            System.out.println("3-) Presidente Bernardo");
            System.out.println("4-) Presidenta Karla");
            System.out.println("5-) Nulo");
            System.out.println("6-) Branco");
            System.out.println("0-) Sair");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Voto Confirmado!");
                    votoArthur++;
                    totalVotos++;
                    break;

                case 2:
                    System.out.println("Voto Confirmado!");
                    votoAyna++;
                    totalVotos++;
                    break;

                case 3:
                    System.out.println("Voto Confirmado!");
                    votoBernardo++;
                    totalVotos++;
                    break;

                case 4:
                    System.out.println("Voto Confirmado!");
                    votoKarla++;
                    totalVotos++;
                    break;

                case 5:
                    System.out.println("Voto Confirmado!");
                    votoNulo++;
                    totalVotos++;

                case 6:
                    System.out.println("Voto Confirmado!");
                    votoBranco++;
                    totalVotos++;
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Selecione uma opção valida!");
                    break;
            }
        }

        if (totalVotos > 0) {
            System.out.println("Total votos: " + totalVotos);
            System.out.println("Total votos Arthur: " + votoArthur);
            System.out.println("Total votos Ayna: " + votoAyna);
            System.out.println("Total votos Bernardo: " + votoBernardo);
            System.out.println("Total votos Karla: " + votoKarla);
            System.out.println("Total votos Nulo: " + votoNulo);
            System.out.println("Total votos Branco: " + votoBranco);
            System.out.println("Percentual de votos nulos: " + ((double) votoNulo / totalVotos) * 100 + "%");
            System.out.println("Percentual de votos brancos: " + ((double) votoBranco / totalVotos) * 100 + "%");
        }
    }
}