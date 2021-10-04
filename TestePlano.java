package Exercícios;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("LifeVita", "Checkup", "9364498/0012");
		Medico medico = new Medico("Unimed", "Marcio Rodrigues", 224569);
		Anestesista anestesista = new Anestesista("Intermédica", "Julia da Silva", 987654, "Local");
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		System.out.println(clinica.toString());
		System.out.println(medico.toString());
		System.out.println(anestesista.toString());

	}

}
