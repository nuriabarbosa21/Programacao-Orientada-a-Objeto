package aula;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario[] vetor = new Funcionario[] {
				new Funcionario("Alex", "gerente", 2000),
				new Funcionario(" Maria", "assitente", 1500),
		};
		
		for (Funcionario f : vetor) {
			f.abonoSalario(500);
		System.out.println(f);

		}
	}	
}		


