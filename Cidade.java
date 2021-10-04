package Exercícios;

public class Cidade {
	private String nomeCidade;
	private Estado estado;
	
	public Cidade(String nomeCidade, Estado estado) {
		super();
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	
	public Estado getEstado() {
		return estado;
	}
}
