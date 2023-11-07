// Enunciado:
//  Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
//
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

package ExerciciosInternet;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Para o programa aceitar o ponto ao invés da virgula
        Scanner sc = new Scanner(System.in); // Para o usuário digitar os valores

        // Variáveis
        double nota1, nota2, nota3, nota4, media;
        String nomeAluno;

        // Entrada de dados
        System.out.println("Digite o nome do aluno: ");
        nomeAluno = sc.nextLine();
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextDouble();

        // Calculo da média
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Condição para verificar se o calculo da média foi >= 7
        // Saida de dados informando se o aluno foi aprovado ou reprovado, dizendo o seu nome e média
        if (media >= 7) {
            System.out.println("O aluno " + nomeAluno + " foi aprovado com a média: " + media);
        } else {
            System.out.println("O aluno " + nomeAluno + " foi reprovado com a média: " + media);
        }
        sc.close();
    }
}
