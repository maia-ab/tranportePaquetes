package ar.edu.unahur.ciudad;

import java.util.ArrayList;

public class Ciudad {
	private ArrayList<String> destinos = new ArrayList<String>();
	

	public void aniadirDestino(String destinoNuevo) {
		destinos.add(destinoNuevo);
	}
	
	public int totalDestinos() {
		return destinos.size();
	}

	public Boolean existeDestino(String destino) {
		return destinos.contains(destino);
	}
}
