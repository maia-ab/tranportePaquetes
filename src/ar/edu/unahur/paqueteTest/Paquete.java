package ar.edu.unahur.paqueteTest;

import ar.edu.unahur.ciudad.Ciudad;

public class Paquete {
	private Double ancho;
	private Double alto;
	private Double profundo;
	private String destino;
	private Ciudad ciudadDestino;
	private int peso;

	public Paquete(Double ancho, Double alto, Double profundo, int peso, 
		String destino, Ciudad ciudadDestino) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
		this.destino = destino;
		this.ciudadDestino = ciudadDestino;
		this.peso = peso;
	}

	public Double volumen() {
		// TODO Auto-generated method stub
		return (this.ancho*this.alto*this.profundo) / 1000000;
	}

	public String destino() {
		return this.destino;
	}

	public Ciudad ciudadDestino() {
		return this.ciudadDestino;
	}

	public int peso() {
		return this.peso;
	}

}
