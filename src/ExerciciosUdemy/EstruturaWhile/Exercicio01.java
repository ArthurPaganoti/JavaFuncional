// Enunciado:
// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002

//OBS: Fiz alguns implementos, coloquei um gerador de número aleatorio, e coloquei um contador para contar quantas vezes o úsuario digitou a senha errada

package ExerciciosUdemy.EstruturaWhile;

import java.util.Random;
import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando um objeto Scanner para ler os dados
        Random aleatorio = new Random(); // Criando um objeto Random para gerar números aleatórios

        int senha, senhaDigitada, contador = 1; // Variaveis com os valores

        senha = aleatorio.nextInt(50) + 1; // Gerando um número aleatório de 1 até 50

        // Pedindo para o úsuario digitar a senha e armazenando essa senha
        System.out.println("Digite uma senha: ");
        senhaDigitada = sc.nextInt();

        // Enquanto a senhaDigitada for diferente que a senha que colocamos
        while (senhaDigitada != senha) {

            // Se a senhaDigitada for menor que a senha
            if (senhaDigitada < senha) {
                System.out.println("O número é maior");
            } else {
                System.out.println("O número é menor");
            }

            // Pedindo para o úsuario digitar uma senha novamente e armazenando essa senha
            System.out.println("Senha errada");
            System.out.println("Digite uma senha novamente: ");
            senhaDigitada = sc.nextInt();
            contador++; // Contador para contar quantas vezes o úsuario digitou a senha errada
        }
        // Exibindo a mensagem de senha correta e quantas vezes o úsuario digitou a senha
        System.out.println("Senha correta! Você ussou: " + contador + " tentativas");

        sc.close(); // Fechando o objeto Scanner
    }
}