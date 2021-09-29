package Exercícios;

public class Imovel {
		int codImovel;
		String bairro;
		String tipo;
		double valor;
		
		public void calcularReajuste() {
			if (this.tipo == "casa") {
				this.valor *= 1.05;	
			} else {
				this.valor *= 1.08;
			}
		}
		
		public String verificarCategoria() {
			String categoria;
			if (this.valor < 10000) {
				categoria = "C";
			} else if (this.valor <= 50000) {
			categoria = "B";
			} else {
			categoria = "C";
			}
			return categoria;
		}
	}

