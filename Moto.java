package Exercício_Oficina;

import java.time.LocalDate;

public class Moto extends Veiculo {

private int cilindrada;
	
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindrada = cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		super.valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return super.valorCobrado;
	}

	@Override
	public double trocarOleo() {
		super.valorCobrado += TipoServico.OLEO.getValorPorServico();
		return super.valorCobrado;
	}

	@Override
	public double revisao() {
		super.valorCobrado += TipoServico.REVISAO.getValorPorServico();
		return super.valorCobrado;
	}
	
	@Override
	public String toString() {
		return String.format("cilindrada: %d %s", 
				this.cilindrada, super.toString());
	}
}


