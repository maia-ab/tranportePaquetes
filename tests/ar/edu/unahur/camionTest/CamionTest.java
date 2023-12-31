package ar.edu.unahur.camionTest;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unahur.camion.Camion;
import ar.edu.unahur.ciudad.Ciudad;
import ar.edu.unahur.paquete.Paquete;

public class CamionTest {
	@Test
	public void unCamionPuedeLlevarUnPaqueteConVolumen8PesoDe1000Kg(){
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;

		Paquete paquete = new Paquete(400.0,200.0,100.0,1000, new Ciudad());
		Camion camion = new Camion();

		//
		valorObtenido = camion.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unCamionNoPuedeLlevarUnPaqueteConPesoDe20000Kg(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;

		Paquete paquete = new Paquete(400.0,200.0,100.0,20000, new Ciudad());
		Camion camion = new Camion();

		//
		valorObtenido = camion.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void unCamionNoPuedeLlevarUnPaqueteConVolumen30(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;

		Paquete paquete = new Paquete(400.0,200.0,100.0,20000, new Ciudad());
		Camion camion = new Camion();

		//
		valorObtenido = camion.puedeLlevar(paquete);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void siYaHayUnPaqueteConPeso14000EnElCamionNoPuedoAgregarUnPaqueteDePeso10000(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;

		Paquete paquete1 = new Paquete(400.0,200.0,100.0,14000, new Ciudad());
		Paquete paquete2 = new Paquete(400.0,200.0,100.0,10000, new Ciudad());
		Camion camion = new Camion();
		camion.llevar(paquete1);

		//
		valorObtenido = camion.puedeLlevar(paquete2);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
	@Test
	public void siYaHayUnPaqueteConVolumen8EnElCamionNoPuedoAgregarUnPaqueteConVolumen15(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;

		Paquete paquete1 = new Paquete(400.0,200.0,100.0,10000, new Ciudad());
		Paquete paquete2 = new Paquete(300.0,500.0,100.0,5000, new Ciudad());
		Camion camion = new Camion();
		camion.llevar(paquete1);

		//
		valorObtenido = camion.puedeLlevar(paquete2);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);	
	}
}
