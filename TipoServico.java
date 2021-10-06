package Exercício_Oficina;

public enum TipoServico {

	OLEO(100),
	LAVAGEM(50),
	REVISAO(200);
	
	private final double valorPorServico;
	
	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}
	
	public double getValorPorServico() {
		return this.valorPorServico;
	}
}

