package Aulas;

public class Medico {
	private int crm;
	private String nome;
	private double salario;
	private double consulta;
	public static int TotalDeMedicos;
	
	public Medico()  {
		TotalDeMedicos += 1;
	}
		
	public Medico (int crm, String nome, double salario, double consulta) {
		this();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.consulta = consulta;
    }
	
	public void pagamentoDinheiro() {
		this.salario += this.consulta * 0.7; 
	}
	public void pagamentoPlano() {
		this.salario += this.consulta * 0.7; 
	}
	
}