package packk;

public class Cliente {

			private String nomeCliente;
			private String idadeCliente;
			private String telefoneCliente;
			private String estadoCivil;
			
			public Cliente (String nome, String idade, String telefone, String civil)
			{
				nomeCliente=nome;
				idadeCliente=idade;
				telefoneCliente=telefone;
				estadoCivil=civil;
						
			}
			public String getCadastro()
			{
				String cadastro = nomeCliente+" "+idadeCliente+" "+telefoneCliente+" "+estadoCivil;
				return cadastro;
			}

	}