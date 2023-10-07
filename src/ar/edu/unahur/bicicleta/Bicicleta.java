package ar.edu.unahur.bicicleta;

import ar.edu.unahur.automovil.Automovil;
import ar.edu.unahur.paquete.Paquete;


public class Bicicleta extends Automovil{
	
	public Bicicleta() {
		this.maxPeso = 15;
		this.maxVolumen = 0.125;
		this.maximoCiudad = 1;
	}
	
	@Override
	public boolean condicionesAdicionalesParaLlevar(Paquete paquete) {
		return super.condicionesAdicionalesParaLlevar(paquete) && cargo.size() < 2;
	}
	 
	@Override
	public void llevar(Paquete paqueteALlevar){
		if(cargo.isEmpty() && super.condicionesParaLlevarPaquete(paqueteALlevar)) {
			super.agregarCiudad(paqueteALlevar.ciudadDestino());
		}
		super.llevar(paqueteALlevar); 
	}
	
}
