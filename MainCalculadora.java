package Exerc�cios;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
		
	        Calculadora c = new Calculadora();  
	           
	        int opcao = 5;  
	        int num1;  
	        int num2;  
	          
			Scanner input = new Scanner(System.in);
	        System.out.println("-Escolha uma op��o-");  
	        System.out.println("1. Soma");    
	        System.out.println("2. Subtracao");    
	        System.out.println("3. Multiplicacao");    
	        System.out.println("4. Divisao");    
	        System.out.println("5. Sair");    
	        System.out.println("Opera��o: ");    
	          
	        opcao = input.nextInt();  
	          
	        while (opcao != 0) {
				Scanner input1 = new Scanner(System.in);    
				
				System.out.println("Qual o primeiro numero: ");  
				num1 = input1.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				num2 = input1.nextInt();
				
				if ( opcao == 1 ) {
					double operacao = c.somar(num1, num2);
	                System.out.printf("\nO resultado da soma �: %d\n", operacao);  
	                break;  
	            }  
	            else if (opcao == 2) { 
					double operacao = c.subtrair(num1, num2);
					System.out.printf("\nO resultado da subtra��o �: %d\n", operacao);  
					break;  
				}  
				else if (opcao == 3) {
					double operacao = c.multiplicar(num1, num2); 
					System.out.printf("\nO resultado da multiplica��o �: %d\n", operacao);    
					break;  
				}  
				else if (opcao == 4) {  
					double operacao = c.dividir(num1, num2);  
					System.out.printf("\nO resultado da divis�o �: %d\n", operacao);   
					break;  
				}  
				else{  
					System.out.println("?");  
					break;  
				}      
	        } 
	    }  
	}  