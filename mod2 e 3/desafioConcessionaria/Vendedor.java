package lojaVeiculos;

public class Vendedor extends Pessoa {
	protected Integer matricula;
	
	public String toString() {
		return "Nome: " + nome + ", Matrícula: " + matricula + ", CPF: " + cpf;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}	
}
