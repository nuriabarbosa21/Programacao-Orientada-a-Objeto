package Exercício_Oficina;

public class TestaOficina {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("Núria");
		
		Carro carro = new Carro("Polo", LocalDate.of(2021, 10, 5), proprietario, "GTS");
		
		carro.trocarOleo();
		carro.revisao();
		
		System.out.println(carro);
	}


}

