public class Cliente {

	private String nome;
	private String cpf;
	private int anoNascimento;

	public Cliente(String nome, String cpf, int anoNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	@Override
	public String toString() {
		return "Cliente " + nome + ", cpf=" + cpf + ", anoNascimento=" + anoNascimento + "]";
	}	

}
