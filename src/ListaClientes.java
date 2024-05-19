import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
	public static void main(String[] args) throws ClienteNaoEncontradoException {
		ListaClientes listaClientes = new ListaClientes();
		listaClientes.adicionarCliente("João Silva", "12345678900", 1981);
		listaClientes.adicionarCliente("Maria Rosa", "00976543211", 1993);
		listaClientes.adicionarCliente("Jota Quest", "11234567999", 1979);
		listaClientes.adicionarCliente("Janete Barbosa", "55678904321", 1999);
		System.out.println("### Lista de Clientes ###");
		listaClientes.exibirClientes();
		
		System.out.println("### Pesquisar Por CPF ###");
		System.out.println(listaClientes.pesquisarPorCpf("12345678900"));
		System.out.println(listaClientes.pesquisarPorCpf("55678904321"));
		System.out.println(listaClientes.pesquisarPorCpf("00976543211"));
		System.out.println(listaClientes.pesquisarPorCpf("11234567999"));
		System.out.println(listaClientes.pesquisarPorCpf("1234678900"));
		System.out.println(listaClientes.pesquisarPorCpf("1234567800"));
	}

	private List<Cliente> clienteList;

	public ListaClientes() {
		this.clienteList = new ArrayList<>();
	}

	public void adicionarCliente(String nome, String cpf, int anoNascimento) {
		clienteList.add(new Cliente(nome, cpf, anoNascimento));
	}

	public Cliente pesquisarPorCpf(String cpf) throws ClienteNaoEncontradoException {
		Cliente clientePorCpf = null;
		if (!clienteList.isEmpty()) {
			for (Cliente c : clienteList) {
				if (c.getCpf().equalsIgnoreCase(cpf)) {
					clientePorCpf = c;
					break;
				}
			}
		}
		if (clientePorCpf == null) {
			throw new ClienteNaoEncontradoException(cpf);
		}
		return clientePorCpf;
	}

	public void exibirClientes() {
		System.out.println(clienteList);
	}

}
