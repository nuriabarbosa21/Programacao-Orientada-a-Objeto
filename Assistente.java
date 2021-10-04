package Exercícios;

public class Assistente extends Funcionario {
	private double adicional;

	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.nome = nome;
		this.salario = salario;
		this.adicional = adicional;
	}
	
	@Override
	public void calcularParticipacao() {
		super.calcularParticipacao();
		this.salario += adicional;
	}
	
}
