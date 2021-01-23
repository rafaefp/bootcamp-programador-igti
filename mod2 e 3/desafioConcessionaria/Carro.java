package lojaVeiculos;

public class Carro extends Veiculo {	
	
	public Carro(String modelo, String marca, Integer ano, Double valor, Vendedor vendedor) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.valor = valor;
		this.vendedor = vendedor;
	}			
}
