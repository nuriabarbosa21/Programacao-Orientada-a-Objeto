package Exercícios;

public class TestaIR {	
	public void Executar() {
		PessoaFisica fisica = new PessoaFisica("Núria", 100.00, "123456", "8765432");
		PessoaJuridica juridica = new PessoaJuridica("Barbosa", 50.00, "654321", "987654"); 
	
			fisica.calculoImpostoDeRenda();
			juridica.calculoImpostoDeRenda();
	
			System.out.println(fisica);
			System.out.println(juridica);
	}
	
	
}
