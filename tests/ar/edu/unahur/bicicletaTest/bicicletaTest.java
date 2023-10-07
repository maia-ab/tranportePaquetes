package ar.edu.unahur.bicicletaTest;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unahur.bicicleta.Bicicleta;
import ar.edu.unahur.ciudad.Ciudad;
import ar.edu.unahur.paqueteTest.Paquete;

public class bicicletaTest {
	@Test
	public void unaBicicletaPuedeLlevarUnPaqueteConVolumen0009PesoDe5KgYCiudadMoron(){
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Ciudad moron = new Ciudad();
		Paquete paquete = new Paquete(50.0,20.0,9.0,5,"Lobos 222", moron);
		Bicicleta bicicleta = new Bicicleta(moron);
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
		Paquete paquete = new Paquete(100.0,200.0,80.0,5,"", moron);
		Bicicleta bicicleta = new Bicicleta(moron);
		//
		valorObtenido = bicicleta.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unaBicicletaDeLaCiudadDeMoronNoPuedeLlevarPaqueteConCiudadDestinoItuzaingo(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Ciudad moron = new Ciudad();
		Ciudad ituzaingo = new Ciudad();
		Paquete paquete = new Paquete(50.0,20.0,9.0,5,"", ituzaingo);
		Bicicleta bicicleta = new Bicicleta(moron);
		//
		valorObtenido = bicicleta.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
}
