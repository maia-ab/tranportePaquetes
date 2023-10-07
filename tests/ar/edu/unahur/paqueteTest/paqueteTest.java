package ar.edu.unahur.paqueteTest;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unahur.ciudad.Ciudad;

public class paqueteTest {

	@Test
	public void unPaqueteCon50CmDeAncho20CmDeAltoY9CmDeProfundoTieneVolumen0009(){
		Double valorEsperado = 0.009;
		Double valorObtenido = 000.0;
		Paquete paquete = new Paquete(50.0,20.0,9.0, "");
		//
		valorObtenido = paquete.volumen();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	
	@Test
	public void unPaqueteConDestinoLobos222TieneEseDestino(){
		String valorEsperado = "Lobos 222";
		String valorObtenido = "";
		Paquete paquete = new Paquete(50.0,20.0,9.0, "Lobos 222");
		//
		valorObtenido = paquete.destino();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	
	@Test
	public void unPaqueteConCiudadDestinoMoronTieneAMoronComoCiudadDeDestino(){
		Ciudad moron = new Ciudad();
		Ciudad valorEsperado = moron;
		Ciudad valorObtenido = new Ciudad();
		Paquete paquete = new Paquete(50.0,20.0,9.0, "Lobos 222", moron);
		//
		valorObtenido = paquete.ciudadDestino();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	
	@Test
	public void elDestinoDelPaqueteConDestinoLobos222EstaEnLaCiudadMoron(){
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Paquete paquete = new Paquete(50.0,20.0,9.0, "Lobos 222");
		//
		Ciudad moron = dadoQueExisteCiudadMoron();
		valorObtenido = moron.existeDestino(paquete.destino());
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	
	@Test
	public void elDestinoDelPaqueteConDestinoLavalle444NoEstaEnLaCiudadMoron(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Paquete paquete = new Paquete(50.0,20.0,9.0, "Lavalle 444");
		//
		Ciudad moron = dadoQueExisteCiudadMoron();
		valorObtenido = moron.existeDestino(paquete.destino());
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	
	public Ciudad dadoQueExisteCiudadMoron() {
		Ciudad moron = new Ciudad();
		moron.aniadirDestino("Lobos 222");
		moron.aniadirDestino("Eslovenia 888");
		return moron;
	}
}