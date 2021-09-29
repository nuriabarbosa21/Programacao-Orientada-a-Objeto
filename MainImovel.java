package Exercícios;


public class MainImovel {
	public static void main(String[] args) {
		Imovel im1 = new Imovel();
		im1.codImovel = 1;
		im1.bairro = "Centro";
		im1.tipo = "casa";
		im1.valor = 25000;
		
		System.out.println(im1.bairro = " " + im1.valor);
		im1.calcularReajuste();
		System.out.println("Valor Reajustado: "+im1.valor);
		System.out.println(im1.verificarCategoria() + "\n");
		
		Imovel im2 = new Imovel();
		im2.codImovel = 1;
		im2.bairro = "Quitandinha";
		im2.tipo = "apto";
		im2.valor = 98900;
		
		System.out.println(im2.bairro + " " + im2.valor);
		im2.calcularReajuste();
		System.out.println("Valor Reajustado: " + im2.valor);
		System.out.println(im2.verificarCategoria() + "\n");
	}
}


