package ar.edu.unahur.automovil;

import java.util.ArrayList;

import ar.edu.unahur.ciudad.Ciudad;
import ar.edu.unahur.paquete.Paquete;
import ar.edu.unahur.transporte.Transporte;

public class Automovil extends Transporte{
	private ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
	
	public Automovil() {
		this.maxPeso = 500;
		this.maxVolumen = 2.0;
	}
		
	private boolean condicionesAdicionalesParaLlevar(Paquete paquete) {
		return ciudades.contains(paquete.ciudadDestino());
	}
	
	@Override
	public Boolean puedeLlevar(Paquete paquete) {
		return super.puedeLlevar(paquete) && condicionesAdicionalesParaLlevar(paquete);
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

