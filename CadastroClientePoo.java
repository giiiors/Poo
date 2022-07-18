package packk;

public class CadastroClientePoo {

	public static void main(String[] args) {
		{
			Cliente cliente1 = new Cliente("  Nome: Giovana\n ", "Idade: 26 anos\n ", "Telefone: 8199999999\n ", "Estado civil: casada");
			System.out.println(cliente1.getCadastro());
						
		}
	}

}
