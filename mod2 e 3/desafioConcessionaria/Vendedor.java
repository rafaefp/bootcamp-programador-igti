package lojaVeiculos;

public class Vendedor extends Pessoa {
	protected Integer matricula;
	
	public String toString() {
		return "Nome: " + nome + ", Matr�cula: " + matricula + ", CPF: " + cpf;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}	
}
