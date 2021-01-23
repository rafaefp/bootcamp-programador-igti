package lojaVeiculos;

public class Cliente extends Pessoa {
	protected String endereco;
		
	public String toString() {
		return "Nome: " + nome + ", Endereço: " + endereco + ", CPF: " + cpf;
	}	

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
}
