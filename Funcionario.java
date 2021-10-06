package aula;

public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}	
		
	public void abonoSalario (double abono) {
			this.salario += abono;
		
	}
	
	@Override
	public String toString() {
		return String.format("funcionario - Nome: %s, Cargo: %s, Salario: %.2f");
	}
	
}
