package ar.edu.unahur.autoTest;

import java.util.ArrayList;

import ar.edu.unahur.ciudad.Ciudad;
import ar.edu.unahur.paqueteTest.Paquete;

public class Automovil {
	private Double maxVolumen;
	private int maxPeso;
	private ArrayList<Paquete> cargo = new ArrayList<Paquete>();
	private ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
	
	public Automovil() {
		this.maxPeso = 500;
		this.maxVolumen = 2.0;
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
	
	private boolean condicionesAdicionalesParaLlevar(Paquete paquete) {
		return ciudades.contains(paquete.ciudadDestino());
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
	
	

	public Boolean puedeLlevar(Paquete paquete) {
		return this.condicionesParaLlevarPaquete(paquete) && this.condicionesAdicionalesParaLlevar(paquete);
	}
	
	public void llevar(Paquete paqueteALlevar){
		if(this.puedeLlevar(paqueteALlevar)) {
			cargo.add(paqueteALlevar);
		}
	}

	public void agregarCiudad(Ciudad ciudad) {
		if(ciudades.size() < 3 && (!(ciudades.contains(ciudad)))) {
			ciudades.add(ciudad);
		}
	}

	public Boolean abarca(Ciudad ciudad) {
		return this.ciudades.contains(ciudad);
	}

	public int cantidadDeCiudades() {
		return this.ciudades.size();
	}

	

}
