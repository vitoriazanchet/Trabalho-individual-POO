package Exercicio2;

public class MainBanco{
    public static void main(String[] args){
    	 ContaBancaria conta1 = new
        	ContaBancaria(100011, "Marcus Burnett", 0);
         ContaBancaria conta2 = new
         	ContaBancaria(100012, "Mike Lowrey", 100);
         
         Operacoes menu = new
         	Operacoes();
         
         menu.carregarOperacoes(conta1);
    }
}
