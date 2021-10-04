package Exerc�cios;

public class Endere�o {
	 private String rua;
	 private String bairro;
	 private String cep;
	 private String cidade;
	 
	 public Endere�o(String rua, String bairro, String cep, String cidade) {
		 super();
		 this.rua = rua;
		 this.bairro = bairro;
		 this.cep = cep;
		 this.cidade = cidade;
	 }
	 
	 public String getRua() {
		 return rua;
	 }
	 
	 public String getBairro() {
		 return bairro;
	 }

	 public String getCep() {
		 return cep;
	 }
	 
	 public String getCidade() {
		 return cidade;
	 }

}