
public class ClienteNaoEncontradoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClienteNaoEncontradoException(String cpf) {
		super("Cliente com CPF " + cpf + " não encontrado.");
	}
}
