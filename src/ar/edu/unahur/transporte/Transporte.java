package ar.edu.unahur.transporte;

import java.util.ArrayList;

import ar.edu.unahur.paquete.Paquete;

public abstract class Transporte {
	protected Double maxVolumen;
	protected int maxPeso;
	protected ArrayList<Paquete> cargo = new ArrayList<Paquete>();
	
	public Boolean puedeLlevar(Paquete paquete) {
		return this.condicionesParaLlevarPaquete(paquete);
	}
	
	public void llevar(Paquete paqueteALlevar){
		if(this.puedeLlevar(paqueteALlevar)) {
			cargo.add(paqueteALlevar);
		}
	}

	protected boolean condicionesParaLlevarPaquete(Paquete paquete) {
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
