package ar.edu.unahur.bicicleta;

import java.util.ArrayList;

import ar.edu.unahur.ciudad.Ciudad;
import ar.edu.unahur.paqueteTest.Paquete;

public class Bicicleta {

	private Ciudad ciudad;
	private Double maxVolumen = 0.125;
	ArrayList<Paquete> cargo = new ArrayList<Paquete>();
	private int maxPeso = 15;

	

	public Boolean puedeLlevar(Paquete paquete) {
		return this.condicionesParaLlevarPaquete(paquete) && this.condicionesAdicionalesParaLlevar(paquete);
	}


	private boolean condicionesAdicionalesParaLlevar(Paquete paquete) {
		return cargo.size() < 2 && paquete.ciudadDestino() == this.ciudad;
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

	public Ciudad ciudad() {
		return this.ciudad;
	};

	public void llevar(Paquete paqueteALlevar){
		if(cargo.isEmpty() && this.condicionesParaLlevarPaquete(paqueteALlevar)) {
			this.ciudad = paqueteALlevar.ciudadDestino();
		}

		if(this.puedeLlevar(paqueteALlevar)) {
			cargo.add(paqueteALlevar);
		}
	}
	
}
