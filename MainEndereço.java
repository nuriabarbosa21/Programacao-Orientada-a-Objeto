package Exercícios;

public class MainEndereço {

	public static void main(String[] args) {
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Estado estado2 = new Estado("São Paulo", "SP");
		Cidade cidade1 = new Cidade("Nova Iguaçu", estado1);
		Cidade cidade2 = new Cidade("Campinas", estado2);
		
		Endereço endereco1 = new Endereco("Rua Luiz Guimarães", "Centro", "28140-930", cidade1);
		Endereço endereco2 = new Endereco("Avenida 1", "Centro", "27690-720", cidade2);
		
		Telefone telefone1 = new Telefone("3845-9733");
		Telefone telefone2 = new Telefone("9853-7932");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		
		Contato contato1 = new Contato("Fabiano", endereco1);
		Contato contato2 = new Contato("Luisa", endereco2);
		contato1.setTelefones(telefones);
		
		System.out.println("Nome:" + contato1.getNome() + " " + contato1.getEndereco().getRua() + " "
				+ contato1.getEndereco().getbairro() + " " + contato1.getEndereco().getCidade().getNomeCidade + " "
				+ contato1.getEndereco().getCidade().getEstado().getNomeEstado());
		contato1.mostrarTelefones();
					
	}

}
