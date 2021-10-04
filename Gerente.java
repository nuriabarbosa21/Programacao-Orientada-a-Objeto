package Exercícios;

public class Gerente extends Funcionario {
	private String nivel;

	public Gerente(String nome, double salario) {
		super(nome, salario);
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public void calcularParticipacao() {
		super.calcularParticipacao();
		this.salario += 200;
	}
}
