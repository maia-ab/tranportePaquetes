package ar.edu.unahur.autoTest;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unahur.automovil.Automovil;
import ar.edu.unahur.ciudad.Ciudad;
import ar.edu.unahur.paquete.Paquete;

public class autoTest {
	@Test
	public void unAutoPuedeLlevarUnPaqueteConVolumen1coma6PesoDe100KgYCiudadRamos(){
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		//
		Ciudad ramos = new Ciudad();
		Paquete paquete = new Paquete(100.0,200.0,80.0,100, ramos);
		Automovil auto = new Automovil();
		auto.agregarCiudad(ramos);
		//
		valorObtenido = auto.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unaAutoNoPuedeLlevarUnPaqueteConUnaCiudadDestinoQueNoAbarca(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		
		Ciudad moron = new Ciudad();
		Paquete paquete = new Paquete(100.0,200.0,80.0,100, new Ciudad());
		Automovil auto = new Automovil();
		auto.agregarCiudad(moron);
		//
		valorObtenido = auto.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void alIniciarUnAutoNoTieneCiudadesQueAbarca(){
		int valorEsperado = 0;
		int valorObtenido = 1;
		Automovil auto = new Automovil();
		//
		valorObtenido = auto.cantidadDeCiudades();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void siElAutoYaAbarca3CiudadesNoPuedeAgregarUnaMas(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		
		Automovil auto = new Automovil();
		for (int i =0; i < 3; i++) {
			auto.agregarCiudad(new Ciudad());
		}
		
		Ciudad haedo = new Ciudad();
		auto.agregarCiudad(haedo);
		//
		valorObtenido = auto.abarca(haedo);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void siAgrego3VecesLaMismaCiudadSoloSeAgregaUnaVez(){
		int valorEsperado = 1;
		int valorObtenido = 0;
		
		Automovil auto = new Automovil();
		Ciudad haedo = new Ciudad();
		auto.agregarCiudad(haedo);
		auto.agregarCiudad(haedo);
		auto.agregarCiudad(haedo);
		
		//
		valorObtenido = auto.cantidadDeCiudades();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
}
