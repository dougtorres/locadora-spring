package br.com.example1.model;

import java.io.IOException;
import java.util.regex.Pattern;

public class Carro {

	private String modelo;
	private Marca marca;
	private String placa;
	private boolean alugado;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Marca getMarca() { 
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getPlaca() {

		return placa;
	}

	public void setPlaca(String placa) throws IOException {
		Pattern pattern = Pattern.compile("[A-Z]{3}\\d{4}");

		if (!pattern.matcher(placa).matches()) {
			throw new IllegalArgumentException("Placa Inválida");
		}
		this.placa = placa;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

}
