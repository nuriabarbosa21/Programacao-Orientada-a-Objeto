package Exercícios;

public class Empregado {

	private String nome;
	private String sobrenome;
	private Double salario;

	public Empregado(String nome, String sobrenome, Double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	public void setNome(String nomje) {
		this.nome = nome;
		
	}	
		
	
	public String getNome() {
		return this.nome;
		
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	
	public Double getSalario() {
		return this.salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
		
	}	
	

	public double calcularImpostoRenda (double valor) {
		
		if (this.salario >= 1903.98 && this.salario <= 2826.65) {	
			this.salario = descontarImpostoRenda(0.075);
		}
		
		else if (this.salario >= 2826.66 && valor < 3751.05) {
			this.salario = descontarImpostoRenda(0.15);
		
		}
		
		else if (this.salario >= 3751.06 && valor < 4663.68) {
			this.salario = descontarImpostoRenda(0.225);
		}
		
		else if(this.salario > 4664.68) {
			this.salario = descontarImpostoRenda(0.275);
		}
		
		
		return valor;
	}

	private Double descontarImpostoRenda(Double porcentagem) {
		return this.salario - this.salario * porcentagem;
	}
	
	@Override
	public String toString() {
		return String.format("Empregado - nome: %s, sobrenome: %s, salario: %.2f",
			this.nome, this.sobrenome, this.salario);
	}
	
}

