package Exercícios;

public class TesteAtleta {

	public static void main(String[] args) {
		Pais Inglaterra = new Pais("Inglaterra");
		Pais Brasil = new Pais("Brasil");
		
		Atleta atleta1 = new Atleta("Michael", 77, "Inglaterra");
		Atleta atleta2 = new Atleta("David", 95, "Brasil");
		
		System.out.println(getTotalParticipantes());
		System.out.println("Nome: %s, Peso: %d, Modalidade: %s, País: %s",
				this.nome, this.peso, this.modalidade, this.pais);
	}

}
