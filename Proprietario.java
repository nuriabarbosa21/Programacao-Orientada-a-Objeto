package Exerc�cio_Oficina;

public class Proprietario {
	public String nome;
	
	public Proprietario(String nome) {
		this.nome = nome;	
	}
	
	@Override
	public String toString() {
		return String.format("Nome do propriet�rio: %s", this.nome);
	}

	public String getnome() {
		return this.nome;
		
	}

}