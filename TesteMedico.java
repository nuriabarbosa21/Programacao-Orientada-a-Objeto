package Aulas;

public class TesteMedico { 

	public static void main(String[] args) {
		Medico medico1 = new Medico(54321, "Livia", 0, 250);
		Medico medico2 = new Medico(67890, "Gilberto", 0, 300);
		
		medico1.pagamentoDinheiro();
		medico2.pagamentoDinheiro();
		
		medico1.pagamentoPlano();
		medico2.pagamentoPlano();
		
		MostrarMedico(medico1); 
		MostrarMedico(medico2);
		
		System.out.ptintln(Medico.TotalDeMedicos); 
		
		private void MostrarMedico(Medico medico) {
		System.out.println(
				String.format("Medico - Crm: %d, nome: %s, salario: %2f, consulta: %2f");
		return medico.getCrm(), medico.getnome(), medico.getSalario(), medico.getConsulta;		
		}	
}	
