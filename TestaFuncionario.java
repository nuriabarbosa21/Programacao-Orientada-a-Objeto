package Exerc�cios;

public class TestaFuncionario {
	public static void main(String[] args) {
		
	}
	public void Executar() {
		Gerente gerente = new Gerente("N�ria Barbosa", 5450.52);
		Assistente assistente = new Assistente("N�ria Pecanha", 2500.00, 550);
		
		CalcularParticipacao(gerente);
		CalcularParticipacao(assistente);
	}
	
	public void CalcularParticipacao (Funcionario funcionario) {
		funcionario.calcularParticipacao();
		System.out.println(funcionario);
		
		}
	}

