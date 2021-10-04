package Exerc�cios;

public class PessoaJuridica extends ImpostoDeRenda {

	private String cnpj;
	private String inscricaoEstadual;
	

	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscricaoEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	@Override
	public void calculoImpostoDeRenda() {
		this.rendimentos =  this.rendimentos - this.rendimentos * 0.15;
	}
	
	@Override
	public String toString() {
		return String.format("Pessoa juridica - nome: %s, rendimentos: %.2f, cnpj: %s, inscricao estadual: %s", 
				this.nome, this.rendimentos, this.cnpj, this.inscricaoEstadual);
	}
}
