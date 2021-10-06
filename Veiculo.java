package Exercício_Oficina;

import java.time.LocalDate;

public class Veiculo {
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	
	@Override
	public String toString() {
		return String.format("Modelo: %s, Valor cobrado: %.2f, Data do conserto: %s %s", 
				this.modelo, this.valorCobrado, this.dataConserto, this.proprietario);
	}
	
	public double getValorCobrado() {
		return this.valorCobrado;
	}
}

