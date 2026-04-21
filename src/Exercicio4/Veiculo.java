package Exercicio4;

public abstract sealed class Veiculo 
	implements Fretavel, Tributavel
	permits Caminhao, CarroPasseio{
		protected final String placa;
		protected final String marca;
		protected final String modelo;
		protected double valorLocacaoDiaria;
		protected final int anoFabricacao;
		protected double precoFipe;
		
		public Veiculo(String placa, String marca, String modelo, double valorLocacaoDiaria, int anoFabricacao, double precoFipe){
			if(precoFipe<0 || valorLocacaoDiaria<0){
				throw new IllegalArgumentException("Valor inválido!");
			}
			if(anoFabricacao<0){
				throw new IllegalArgumentException("Ano de fabricação inválido!");
			}
			this.placa = placa;
			this.marca = marca;
			this.modelo = modelo;
			this.valorLocacaoDiaria = valorLocacaoDiaria;
			this.anoFabricacao = anoFabricacao;
			this.precoFipe = precoFipe;
	}
}
