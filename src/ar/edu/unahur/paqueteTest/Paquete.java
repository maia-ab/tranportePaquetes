package ar.edu.unahur.paqueteTest;

public class Paquete {
	private Double ancho;
	private Double alto;
	private Double profundo;
	private String destino;

	public Paquete(Double ancho, Double alto, Double profundo, String destino) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
		this.destino = destino;
	}

	public Double volumen() {
		// TODO Auto-generated method stub
		return (ancho*alto*profundo) / 1000000;
	}

	public String destino() {
		return destino;
	}

}
