package Exercicio2;

public class MainBanco{
    public static void main(String[] args){
    	 ContaBancaria conta1 = new
        	ContaBancaria(100011, "Vitória de Paula Zanchet", 0);
         ContaBancaria conta2 = new
         	ContaBancaria(100012, "Angelo Penso Tessaro", 100);
         
         Operacoes menu = new
         	Operacoes();
         
         menu.carregarOperacoes(conta1);
    }
}
