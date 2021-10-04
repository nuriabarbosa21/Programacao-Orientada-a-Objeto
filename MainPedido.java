package Exercícios;

import java.time.LocalDate;

public class MainPedido {
	
	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		Pedido pedido1 = new Pedido(1, data, 3, 70.00);
		Pedido pedido2 = new Pedido(2, data, 2, 36.80);
		
		pedido1.finalizar();
		pedido2.finalizar();

		System.out.println(pedido1.getTotal());	
		System.out.println(pedido1.getTotal());
	}

}
