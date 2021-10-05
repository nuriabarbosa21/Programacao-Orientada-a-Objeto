package Exercícios;

public class Atleta implements Olimpiadas {

	private String nome;
	private double peso;
	private String modalidade;
	private static int totalParticipantes;
	private Pais pais;
	
	public Atleta(String nome, double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		totalParticipantes += 1;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	@Override
	public String verificaSituacao() {
		if(this.peso > 90 && this.modalidade == "peso pesado")
			return "Participará";	
		else if(this.peso <= 90 && this.peso >= 60 && this.modalidade == "peso médio")
			return "Participará";
		else
			return "Não participará";
	}
	
}	

