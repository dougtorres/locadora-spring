package br.com.example1.model;

import java.util.ArrayList;

public class Locadora {

	private String nome;
	private ArrayList<Carro> carros = new ArrayList<Carro>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();

	public Locadora(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Carro> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void addCarro(Carro carro) {
		this.carros.add(carro);
	}
	
	public void addAluguel(Aluguel aluguel) {
		this.alugueis.add(aluguel);
	}

	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public ArrayList<Aluguel> getAlugueis() {
		return alugueis;
	}

	public void setAlugueis(ArrayList<Aluguel> alugueis) {
		this.alugueis = alugueis;
	}
	
	public Cliente getCliente(String cpf) {
		for(int i = 0; i < this.clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if(cliente.getCpf().equals(cpf))
			{
				return cliente;
			}
		}
		return null;
	}
	
	public Carro getCarro(String placa) {
		for(int i = 0; i < this.carros.size(); i++) {
			Carro carro = carros.get(i);
			if(carro.getPlaca().equals(placa) )
			{
				return carro;
			}
		}
		return null;
	}
	
	

}
