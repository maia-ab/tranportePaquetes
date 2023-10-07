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
		
		Ciudad moron = new Ciudad();
		Paquete paquete = new Paquete(50.0,20.0,9.0,5, moron);
		Bicicleta bicicleta = new Bicicleta();
		bicicleta.agregarCiudad(moron);
		//
		valorObtenido = bicicleta.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unaBicicletaNoPuedeLlevarUnPaqueteConVolumen1Coma6(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		
		Ciudad moron = new Ciudad();
		Paquete paquete = new Paquete(100.0,200.0,80.0,5, moron);
		Bicicleta bicicleta = new Bicicleta();
		bicicleta.agregarCiudad(moron);
		//
		valorObtenido = bicicleta.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unaBicicletaNoPuedeLlevarUnPaqueteConPeso20(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		
		Ciudad moron = new Ciudad();
		Paquete paquete = new Paquete(50.0,20.0,9.0,20, moron);
		Bicicleta bicicleta = new Bicicleta();
		bicicleta.agregarCiudad(moron);
		//
		valorObtenido = bicicleta.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void alIniciarUnaBicicletaNoTieneCiudadDestino(){
		int valorEsperado = 0;
		int valorObtenido = 1;
		Bicicleta bicicleta = new Bicicleta();
		//
		valorObtenido = bicicleta.cantidadDeCiudades();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void alLlevarUnPrimerPaqueteConDestinoMoronLaCiudadQueAbarcaLaBicicletaAhoraEsMoron(){
		Ciudad moron = new Ciudad();
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Bicicleta bicicleta = new Bicicleta();
		//
		Paquete paquete = new Paquete(50.0,20.0,9.0,5, moron);
		bicicleta.llevar(paquete);
		valorObtenido = bicicleta.abarca(moron);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unaBicicletaDeLaCiudadDeMoronNoPuedeLlevarPaqueteConCiudadDestinoItuzaingo(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Ciudad moron = new Ciudad();
		Ciudad ituzaingo = new Ciudad();
		
		Paquete paquete1 = new Paquete(50.0,20.0,9.0,5, moron);
		Paquete paquete2 = new Paquete(50.0,20.0,9.0,5, ituzaingo);
		
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

		
		Paquete paquete1 = new Paquete(50.0,20.0,9.0,5, moron);
		Paquete paquete2 = new Paquete(50.0,20.0,9.0,5, moron);
		Paquete paquete3 = new Paquete(50.0,20.0,9.0,1, moron);
		
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

		
		Paquete paquete1 = new Paquete(50.0,20.0,9.0,10, moron);
		Paquete paquete2 = new Paquete(50.0,20.0,9.0,7, moron);
		
		Bicicleta bicicleta = new Bicicleta();
		//
		bicicleta.llevar(paquete1);
		valorObtenido = bicicleta.puedeLlevar(paquete2);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void siYaHayUnPaqueteConVolumen0096NoPuedoAgregarOtroDeEseMismoVolumenPorqueSuperaElMaximoPermitido(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Ciudad moron = new Ciudad();

		
		Paquete paquete1 = new Paquete(40.0,60.0,40.0,10, moron);
		Paquete paquete2 = new Paquete(40.0,60.0,40.0,2, moron);
		
		Bicicleta bicicleta = new Bicicleta();
		//
		bicicleta.llevar(paquete1);
		valorObtenido = bicicleta.puedeLlevar(paquete2);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	
	@Test
	public void siLaBicicletaYaTieneUnaCiudadAsignadaNoSeLePuedeAgregarOtra(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		//
		Bicicleta bicicleta = new Bicicleta();
		Ciudad haedo = new Ciudad();
		bicicleta.agregarCiudad(new Ciudad());
		bicicleta.agregarCiudad(haedo);
		//
		valorObtenido = bicicleta.abarca(haedo);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}

}
