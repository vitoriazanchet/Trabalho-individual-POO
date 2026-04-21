package Exercicio4;

public final class Caminhao 
	extends Veiculo{
	final double capacidadeCargaTonelada;
	public Caminhao(String placa, String marca, String modelo, double valorLocacaoDiaria, int anoFabricacao, double precoFipe, double capacidadeCargaTonelada){
		super(placa, marca, modelo, valorLocacaoDiaria, anoFabricacao, precoFipe);
		if(capacidadeCargaTonelada<0){
			throw new IllegalArgumentException("Capacidade de carga inválida!");
		}
			this.capacidadeCargaTonelada = capacidadeCargaTonelada;
	}
	public double alugarVeiculo(double pesoCarga, int dias){
		double totalAluguel = valorLocacaoDiaria * dias;
		if(pesoCarga>this.capacidadeCargaTonelada){
			totalAluguel += totalAluguel * 0.1;
		}
		return totalAluguel;
	}
	public double calcularIpva(){
		int anoAtual = 2026;
		if((anoAtual - this.anoFabricacao)>=20){
			return 0;
		} else {
			return this.precoFipe*0.015;
		}
	}			
}
