package Exercicio2;

import java.util.Scanner;

public class Operacoes {
	Scanner teclado = new
		Scanner(System.in);
	public void carregarOperacoes(ContaBancaria conta){
		int opcao;
		do {
		    System.out.println("\n***SISTEMA BANCÁRIO***\n" +
                    "\nTitular: "+ conta.titular +
		            "\nEscolha a operação que deseja realizar:\n" +
		            "1 - Ver Saldo\n2 - Depositar\n3 - Sacar\n0 - Sair\n" +
		            "\nDigite o número da opção correspondente: ");
		            opcao = teclado.nextInt();
		    switch (opcao) {
		        case 1:
		            System.out.println("Saldo atual: R$" + conta.saldo);
		            break;
		        case 2:
		            System.out.println("Digite o valor que deseja depositar: ");
		            double deposito = teclado.nextDouble();
		            conta.depositar(deposito);
		            break;
		        case 3:
		            System.out.println("Digite o valor que deseja sacar: ");
		            double saque = teclado.nextDouble();
		            conta.sacar(saque);
		            break;
		        case 0:
		            System.out.println("Sistema encerrado.");
		            break;
		        default:
		            System.err.println("Opção inválida!");
		    }
		} while (opcao != 0);
	}
}