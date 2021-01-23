package lojaVeiculos;

public class Moto extends Veiculo {
	
	public Moto(String modelo, String marca, Integer ano, Double valor, Vendedor vendedor) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.valor = valor;
		this.vendedor = vendedor;
	}
}
