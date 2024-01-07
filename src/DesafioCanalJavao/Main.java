package DesafioCanalJavao;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldoConta;
        double valorSaque;
        String nome;

        System.out.println("Olá. Seja bem-vindo(a) ao nosso caixa!");

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite o saldo presente na sua conta: ");
        saldoConta = sc.nextDouble();
        // Gera um valor aleatorio para o saldo: double saldo = Math.random() * número que máximo que deseja

        System.out.println("Digite o valor que deseja sacar: ");
        valorSaque = sc.nextDouble();

        if (valorSaque > 1000) {
            System.out.println("Olá " + nome + ".O saque de: R$ " + valorSaque + " pois o limite máximo de saque é R$1000,00");
        } else if (valorSaque < 10) {
            System.out.println("Olá " + nome + ".O saque de: R$ " + valorSaque + " pois o limite mínimo de saque é R$10,00");
        } else if (valorSaque % 10 != 0 ) {
            System.out.println("Olá " + nome + ".O saque de: R$ " + valorSaque + " pois o caixa não possui essas cédulas");
        } else if (valorSaque > saldoConta) {
            System.out.println("Olá " + nome + ".O saque de: R$ " + valorSaque + " pois o valor que deseja sacar é maior do que o saldo da conta");
        } else {
            double realizarSaque = saldoConta - valorSaque;
            System.out.println("Olá " + nome + ". O saque de: R$ " + valorSaque + " foi realizado com sucesso.");
            System.out.println("Saldo atual: R$ " + realizarSaque);
        }
    }
}
