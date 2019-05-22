package br.com.example1.model;

public class Aluguel {
	
	private Cliente cliente;
	private Carro carro;
	private int dias;
	private double valor;
	private boolean entregue;
	
	public Aluguel(Cliente cliente, Carro carro, int dias, double valor, boolean entregue) {
		this.cliente = cliente;
		this.carro = carro;
		this.dias = dias;
		this.valor = valor;
		this.entregue = entregue;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isEntregue() {
		return entregue;
	}

	public void setEntregue(boolean entregue) {
		this.entregue = entregue;
	}
	
	
}
