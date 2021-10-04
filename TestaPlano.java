package Exercícios;

public class TestaPlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("LifeVita", "Checkup", "9364498/0012");
		Medico medico = new Medico("Unimed", "Marcio Rodrigues", 224569);
		Anestesista anestesista = new Anestesista("Intermédica", "Julia da Silva", 987654, "Local");
		ControlePagamento cp = new ControlePagamento();
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		cp.calcularTotalPago(clinica);
		cp.calcularTotalPago(medico);
		cp.calcularTotalPago(anestesista);
		
		System.out.println(clinica.toString());
		System.out.println(medico.toString());
		System.out.println(anestesista.toString());
		
		System.out.println("Valor total pago pelo plano: " + String.format("%.2f", cp.getTotalPago()));
	}

}
