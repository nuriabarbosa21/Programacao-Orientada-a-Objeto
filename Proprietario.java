package Exercício_Oficina;

public class Proprietario {
	public String nome;
	
	public Proprietario(String nome) {
		this.nome = nome;	
	}
	
	@Override
	public String toString() {
		return String.format("Nome do proprietário: %s", this.nome);
	}

	public String getnome() {
		return this.nome;
		
	}

}