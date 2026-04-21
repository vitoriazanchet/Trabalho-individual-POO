package Exercicio3;

public class MainCompra {
	public static void main(String[] args){
		Cliente cliente1 = new
			Cliente("Vitória Zanchet", "11122233344", "249930****7", "vitoria.zanchet@hotmail.com", "Rua Domingos Zanchet, 2, Cascatinha");
		
		ItemPedido item1 = new
			ItemPedido("Multímetro Digital", 49.90, 1);
		ItemPedido item2 = new
			ItemPedido("Filtro de linha", 69.90, 3);
		ItemPedido item3 = new
			ItemPedido("Pasta térmica", 79.90, 1);
		
		Pedido pedido1 = new
			Pedido();
			pedido1.cliente = cliente1;
			pedido1.itens.add(item1);
			pedido1.itens.add(item2);
			pedido1.itens.add(item3);
		
		pedido1.fecharPedido();
	}		
}
