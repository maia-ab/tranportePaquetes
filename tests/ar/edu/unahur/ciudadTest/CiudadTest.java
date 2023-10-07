package ar.edu.unahur.ciudadTest;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unahur.ciudad.Ciudad;


public class CiudadTest {
	@Test
	public void unaCiudadCon2DestinosTieneTotalDeDestinos2(){
		int valorEsperado = 2;
		int valorObtenido = 0;
		Ciudad moron = dadoQueExisteCiudadMoron();
		//
		valorObtenido = moron.totalDestinos();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void cuandoAgregoItalia333ALosDestinosQuedaAgregado(){
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Ciudad moron = dadoQueExisteCiudadMoron();
		//
		moron.aniadirDestino("Italia 333");
		valorObtenido = moron.existeDestino("Italia 333");
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void lavalle444NoEstaEnLosDestinosQueQuedanEnMoron(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Ciudad moron = dadoQueExisteCiudadMoron();
		//
		valorObtenido = moron.existeDestino("Lavalle 444");
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
