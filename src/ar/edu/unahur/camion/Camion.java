package ar.edu.unahur.camion;

import java.util.ArrayList;

import ar.edu.unahur.paqueteTest.Paquete;

public class Camion {

	private Double maxVolumen;
	private int maxPeso;
	private ArrayList<Paquete> cargo = new ArrayList<Paquete>();
	
	public Camion() {
		this.maxVolumen = 20.0;
		this.maxPeso = 16000;
	}

	public Boolean puedeLlevar(Paquete paquete) {
		return this.condicionesParaLlevarPaquete(paquete);
	}

	private boolean condicionesParaLlevarPaquete(Paquete paquete) {
		Boolean ret = Boolean.FALSE;
		
		if (paquete.volumen() <= maxVolumen - this.volumenACargo() 
			&& paquete.peso() <= maxPeso - this.pesoACargo() 
			) {
			ret = Boolean.TRUE;
		}
		return ret;
	
	}
	
	private int pesoACargo() {
		int ret = 0;
		if (!(cargo.isEmpty())) {
			for (int i = 0; i < cargo.size(); i++) {
				ret += cargo.get(i).peso();
			}
		}
		return ret;
	}

	private Double volumenACargo() {
		Double ret = 0.0;
		if (!(cargo.isEmpty())) {
			for (int i = 0; i < cargo.size(); i++) {
				ret += cargo.get(i).volumen();
			}
		}
		return ret;
	}

}
