package Exercicio4;

public final class CarroPasseio 
	extends Veiculo{
		public Caminhao(String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe){
		super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
	}
	public double alugarVeiculo(double pesoCarga, int dias){
		return valorLocacaoDiaria * dias;
	}
	public double calcularIpva(){
		int anoAtual = 2026;
		if((anoAtual - this.anoFabricacao)>=20){
			return 0;
		} else {
			return this.precoFipe*0.04;
		}
	}			
}
