package Exercício_Oficina;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {

private String categoria;
	
	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	@Override
	public double lavarVeiculo() {
		super.valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double trocarOleo() {
		double valorTrocaOleo = TipoServico.OLEO.getValorPorServico();
		
		if (this.dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			valorTrocaOleo -= 50;
		}
		
		super.valorCobrado += valorTrocaOleo;
		return super.valorCobrado;
	}

	@Override
	public double revisao() {
		double valorRevisao = TipoServico.REVISAO.getValorPorServico();
		
		if (this.dataConserto.getMonth().equals(Month.AUGUST)) {
			valorRevisao -= valorRevisao * 0.1;
		}
		
		this.valorCobrado += valorRevisao;
		return this.valorCobrado;
	}
	
	@Override
	public String toString() {
		return String.format("categoria: %s %s", 
				this.categoria, super.toString());
	}
}


