package ar.edu.unahur.automovil;

import java.util.ArrayList;

import ar.edu.unahur.ciudad.Ciudad;
import ar.edu.unahur.paquete.Paquete;
import ar.edu.unahur.transporte.Transporte;

public class Automovil extends Transporte{
	protected ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
	protected int maximoCiudad;
	
	public Automovil() {
		this.maxPeso = 500;
		this.maxVolumen = 2.0;
		this.maximoCiudad = 3;
	}
	
	@Override
	public Boolean puedeLlevar(Paquete paquete) {
		return super.puedeLlevar(paquete) && condicionesAdicionalesParaLlevar(paquete);
	}
	
	public void agregarCiudad(Ciudad ciudad) {
		if(ciudades.size() < this.maximoCiudad && (!(ciudades.contains(ciudad)))) {
			ciudades.add(ciudad);
		}
	}
	
	public boolean condicionesAdicionalesParaLlevar(Paquete paquete) {
		return this.ciudades.contains(paquete.ciudadDestino());
	}

	public Boolean abarca(Ciudad ciudad) {
		return this.ciudades.contains(ciudad);
	}

	public int cantidadDeCiudades() {
		return this.ciudades.size();
	}

}

