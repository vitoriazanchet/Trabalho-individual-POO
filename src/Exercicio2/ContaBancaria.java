package Exercicio2;

public class ContaBancaria {
    public int numero;
    public String titular;
    public double saldo;
    public int contadorSaques;

    public ContaBancaria(int numero, String titular, double saldoInicial){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial+50;
        this.contadorSaques = 0;
    }
    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + "realizado com sucesso!");
        }
    }
    public void sacar(double valor){
        if (contadorSaques >= 3) {
            System.err.println("Erro: Limite de saques diários atingido!");
        } else if (valor > 1000) {
            System.err.println("Erro: Valor máximo por saque é R$ 1.000,00.");
        } else if (valor > saldo) {
            System.err.println("Erro: Saldo insuficiente!");
        } else {
            this.saldo -= valor;
            this.contadorSaques++;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: R$ " + this.saldo);
        }
    }
}
