package packk;

public class Cliente {

			private String nomeCliente;
			private String idadeCliente;
			private String telefoneCliente;
			
			public Cliente (String nome, String idade, String telefone)
			{
				nomeCliente=nome;
				idadeCliente=idade;
				telefoneCliente=telefone;
						
			}
			public String getCadastro()
			{
				String cadastro = nomeCliente+" "+idadeCliente+" "+telefoneCliente;
				return cadastro;
			}

	}