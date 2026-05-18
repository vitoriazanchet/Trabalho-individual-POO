package Exercicio1;

import java.util.Scanner;

public class CaixaEletronico{
    public static void main(String[] args){
        Scanner teclado = new
                Scanner(System.in);
        double saldo = 100.00;
        int contadorSaques = 0;
        int opcao;
        do {
            System.out.println("\n***CAIXA ELETRÔNICO***\n" +
                    "\nEscolha a operação que deseja realizar:\n" +
                    "1 - Ver Saldo\n2 - Depositar\n3 - Sacar\n0 - Sair\n" +
                    "\nDigite o número da opção correspondente: ");
                    opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado!");
                    break;
                case 3:
                    if (contadorSaques >= 3) {
                        System.err.println("Erro: Limite de saques diários atingido!");
                    } else {
                        System.out.println("Digite o valor que deseja sacar: ");
                        double saque = teclado.nextDouble();
                        if (saque > 1000) {
                            System.err.println("Erro: Valor máximo por saque é R$ 1.000,00.");
                        } else if (saque > saldo) {
                            System.err.println("Erro: Saldo insuficiente!");
                        } else {
                            saldo -= saque;
                            contadorSaques++;
                            System.out.println("Saque realizado com sucesso!");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.err.println("Opção inválida!");
            }
        } while (opcao != 0);
        teclado.close();
    }
}
