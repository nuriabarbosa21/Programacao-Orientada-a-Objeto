package Exercícios;

public class TesteEmpregado {
	public static void main(String[] args) {
					
		Empregado empregado1 = new Empregado ("Núria","Peçanha",4500.00);
		Empregado empregado2 = new Empregado("Núria","Barbosa",4000.00);

		empregado1.calcularImpostoRenda(empregado1.getSalario());
		empregado2.calcularImpostoRenda(empregado1.getSalario());
				
		System.out.println(empregado1);
		System.out.println(empregado2);
		
	}

}


