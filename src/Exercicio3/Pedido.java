package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	public Cliente cliente;
	public List<ItemPedido> itens = new ArrayList<>();
	
	public void fecharPedido(){
		double valorItens = 0;
		for(ItemPedido item: itens){
			valorItens += (item.preco*item.quantidade);
		}
		double frete;
		if(valorItens<=250.00){
			frete=25.00;
		} else {
			frete=0;
		}
		System.out.print("\n***RECIBO DETALHADO***\nCliente: " + this.cliente.nome +
				"\nCPF do Cliente: " + cliente.getCpf() +
				"\nValor total dos itens: R$ " + valorItens +
				"\nEndereço de entrega: " + this.cliente.endereco +
				"\nFrete: R$ " + frete +
				"\nTotal Geral: R$ " + (valorItens + frete));
	}
}
