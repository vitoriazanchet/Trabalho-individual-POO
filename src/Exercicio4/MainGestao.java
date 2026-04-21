package Exercicio4;

public class MainGestao {
	public static void main(String[] args){
		try{
			Caminhao caminhao1 = new Caminhao("AEA-9001", "Volvo", "FH 540", 1000.00, 2018, 390000.00, 74);
				System.out.println("IPVA do veículo " + caminhao1.modelo + " é: R$ " + caminhao1.calcularIpva() +
						"\nE o valor da locação para a carga de 10 toneladas para 5 dias é: R$ " + caminhao1.alugarVeiculo(10.0, 5) +
						"\nE o valor da locação para a carga de 7 toneladas para 6 dias é: R$ " + caminhao1.alugarVeiculo(7, 6));
			CarroPasseio carro1 = new CarroPasseio("BBD-6011", "Ford", "Fusion",220.00, 2013, 61800.00);
				System.out.println("IPVA do veículo " + carro1.modelo + " é: R$ " + carro1.calcularIpva() + "\nE seu valor de locação para 5 dias é: R$ " + carro1.alugarVeiculo(0, 5));
			CarroPasseio carro2 = new CarroPasseio("BBE-5012", "Honda", "Civic", 130.00, 2010, 47000.00);
				System.out.println("IPVA do veículo " + carro2.modelo + " é: R$ " + carro1.calcularIpva() + "\nE seu valor de locação para 3 dias é: R$ " + carro2.alugarVeiculo(0, 3));
			CarroPasseio carro3 = new CarroPasseio("BBD-6013", "Ford", "Edge", 300.00, -2020, 189000.00);
			CarroPasseio carro4 = new CarroPasseio("BBF-4014", "Fiat", "Palio", 65.00, 2008, -18000.00);
			CarroPasseio carro5 = new CarroPasseio("BBC-7015", "Volkswagen", "Gol", -80.00, 2020, 57000.00);
			CarroPasseio carro6 = new CarroPasseio("BBD-6016", "Ford", "Ka Sedan", -90.00, 2019, 44000.00);
			CarroPasseio carro7 = new CarroPasseio("BBA-9017", "Volvo", "EX90", 1500.00, 2026, -659000.00);
			CarroPasseio carro8 = new CarroPasseio("BBB-8018", "Mercedes-Benz", "Maybach", 15000.00, -2024, 49000000.00);
			Caminhao caminhao2 = new Caminhao("AEB-8002", "Mercedes-Benz", "Actros 2546", -700.00, 2009, 170000.00, 53);
			Caminhao caminhao3 = new Caminhao("ACC-7003", "Volkswagen", "Worker 15-180", 700.00, -2003, 87000.00, 9);
			Caminhao caminhao4 = new Caminhao("ACD-6004", "Ford", "Cargo 1519", 400.00, 2014, 220000.00, -15);
		} catch(IllegalArgumentException e){
			System.err.println("Erro ao criar veículo: " + e.getMessage());
		}
	}
}
