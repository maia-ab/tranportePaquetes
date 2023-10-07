package ar.edu.unahur.paqueteTest;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unahur.ciudad.Ciudad;
import ar.edu.unahur.paquete.Paquete;

public class paqueteTest {

	@Test
	public void unPaqueteCon50CmDeAncho20CmDeAltoY9CmDeProfundoTieneVolumen0009(){
		Double valorEsperado = 0.009;
		Double valorObtenido = 000.0;
		Paquete paquete = dadoQueExisteUnPaquete();
		//
		valorObtenido = paquete.volumen();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unPaqueteConPeso10DevuelveEsePeso(){
		int valorEsperado = 10;
		int valorObtenido = 0;
		Paquete paquete = dadoQueExisteUnPaquete();
		//
		valorObtenido = paquete.peso();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}	

	@Test
	public void unPaqueteConCiudadDestinoMoronTieneAMoronComoCiudadDeDestino(){
		Ciudad moron = new Ciudad();
		Ciudad valorEsperado = moron;
		Ciudad valorObtenido = new Ciudad();
		Paquete paquete = new Paquete(50.0,20.0,9.0,10, moron);
		//
		valorObtenido = paquete.ciudadDestino();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	
	public Paquete dadoQueExisteUnPaquete(){
		return new Paquete(50.0,20.0,9.0,10, new Ciudad());
	}

}
