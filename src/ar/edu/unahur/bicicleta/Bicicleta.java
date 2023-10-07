package ar.edu.unahur.bicicleta;


import ar.edu.unahur.ciudad.Ciudad;
import ar.edu.unahur.paquete.Paquete;
import ar.edu.unahur.transporte.Transporte;

public class Bicicleta extends Transporte{
	private Ciudad ciudad;
	
	public Bicicleta() {
		this.maxPeso = 15;
		this.maxVolumen = 0.125;
	}
	

	@Override
	public Boolean puedeLlevar(Paquete paquete) {
		return super.puedeLlevar(paquete) && condicionesAdicionalesParaLlevar(paquete);
	}


	private boolean condicionesAdicionalesParaLlevar(Paquete paquete) {
		return cargo.size() < 2 && paquete.ciudadDestino() == this.ciudad;
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
