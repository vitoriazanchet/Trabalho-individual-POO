package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	public Cliente cliente;
	public List<ItemPedido> itens = new ArrayList<>();
	
	public void fecharPedido(){
		double totalItens = 0;
		for(ItemPedido item: itens){
			totalItens += (item.preco*item.quantidade);
		}
	}
}
