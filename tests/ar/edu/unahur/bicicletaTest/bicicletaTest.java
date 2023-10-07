package ar.edu.unahur.bicicletaTest;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unahur.bicicleta.Bicicleta;
import ar.edu.unahur.ciudad.Ciudad;
import ar.edu.unahur.paquete.Paquete;

public class bicicletaTest {
	@Test
	public void unaBicicletaPuedeLlevarUnPaqueteConVolumen0009PesoDe5KgYCiudadMoron(){
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
	
		Paquete paquete = new Paquete(50.0,20.0,9.0,5,"Lobos 222", null);
		Bicicleta bicicleta = new Bicicleta();
		//
		valorObtenido = bicicleta.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unaBicicletaNoPuedeLlevarUnPaqueteConVolumen1Coma6(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		
		Paquete paquete = new Paquete(100.0,200.0,80.0,5,"", null);
		Bicicleta bicicleta = new Bicicleta();
		//
		valorObtenido = bicicleta.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unAlIniciarUnaBicicletaNoTieneCiudadDestino(){
		Ciudad valorEsperado = null;
		Ciudad valorObtenido = new Ciudad();
		Bicicleta bicicleta = new Bicicleta();
		//
		valorObtenido = bicicleta.ciudad();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void alLlevarUnPrimerPaqueteConDestinoMoronLaCiudadDeLaBicicletaEsMoron(){
		Ciudad moron = new Ciudad();
		Ciudad valorEsperado = moron;
		Ciudad valorObtenido = new Ciudad();
		Bicicleta bicicleta = new Bicicleta();
		//
		Paquete paquete = new Paquete(50.0,20.0,9.0,5,"", moron);
		bicicleta.llevar(paquete);
		valorObtenido = bicicleta.ciudad();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unaBicicletaDeLaCiudadDeMoronNoPuedeLlevarPaqueteConCiudadDestinoItuzaingo(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Ciudad moron = new Ciudad();
		Ciudad ituzaingo = new Ciudad();
		
		Paquete paquete1 = new Paquete(50.0,20.0,9.0,5,"", moron);
		Paquete paquete2 = new Paquete(50.0,20.0,9.0,5,"", ituzaingo);
		
		Bicicleta bicicleta = new Bicicleta();
		//
		bicicleta.llevar(paquete1);
		valorObtenido = bicicleta.puedeLlevar(paquete2);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void siYaHayDosPaquetesEnLaBiciNoSePuedeLlevarUnTercero(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Ciudad moron = new Ciudad();

		
		Paquete paquete1 = new Paquete(50.0,20.0,9.0,5,"", moron);
		Paquete paquete2 = new Paquete(50.0,20.0,9.0,5,"", moron);
		Paquete paquete3 = new Paquete(50.0,20.0,9.0,1,"", moron);
		
		Bicicleta bicicleta = new Bicicleta();
		//
		bicicleta.llevar(paquete1);
		bicicleta.llevar(paquete2);
		valorObtenido = bicicleta.puedeLlevar(paquete3);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	
	@Test
	public void siYaHayUnPaqueteConPeso10NoPuedoAgregarOtroConPeso7(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Ciudad moron = new Ciudad();

		
		Paquete paquete1 = new Paquete(50.0,20.0,9.0,10,"", moron);
		Paquete paquete2 = new Paquete(50.0,20.0,9.0,7,"", moron);
		
		Bicicleta bicicleta = new Bicicleta();
		//
		bicicleta.llevar(paquete1);
		valorObtenido = bicicleta.puedeLlevar(paquete2);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}

	/*
	@Test
	public void unPaqueteSinCiudadDestinoTomaElDestinoDelPrimerPaqueteQueLleva(){
		int valorEsperado = 10;
		int valorObtenido = 0;
		Paquete paquete = dadoQueExisteUnPaquete();
		//
		valorObtenido = paquete.peso();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}*/
}
