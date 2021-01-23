package lojaVeiculos;

public abstract class Veiculo {
	protected String modelo;
	protected String marca;
	protected Integer ano;
	protected Double valor;
	protected Vendedor vendedor;
	protected Cliente cliente;
	
	public String toString() {
		String idVendedor = vendedor != null ? vendedor.getNome() : "";
		String idCliente = cliente != null ? cliente.getNome() : "";	
		
		return "Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano + ", Valor: R$ " + valor + ", Vendedor: " + idVendedor + ", Comprador: " + idCliente;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}	
}