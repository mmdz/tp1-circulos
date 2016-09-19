package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	@Test
	public void crearUnCirculoConRadio2() {
		Double esperado = 2.0;
		Circulo MiCirculo = new Circulo();
		
		MiCirculo.setRadio(esperado);
		assertEquals(esperado, MiCirculo.getRadio(),0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Double esperado = 3.7;
		Circulo MiCirculo = new Circulo(esperado);
		
		assertEquals(esperado, MiCirculo.getRadio(),0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Double esperado = 5.0;
		Circulo MiCirculo = new Circulo();
		
		MiCirculo.setRadio(esperado);
		assertEquals(esperado,MiCirculo.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Double esperado = 10.9;
		Circulo MiCirculo = new Circulo();
		
		MiCirculo.setRadio(esperado);
		assertEquals(esperado, MiCirculo.getRadio(), 0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Double esperado=61.57;
		Circulo MiCirculo = new Circulo(9.8);
		
		assertEquals(esperado, MiCirculo.getPerimetro(),0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Double esperado=104.3;
		Circulo MiCirculo= new Circulo(16.6);
		
		assertEquals(esperado, MiCirculo.getPerimetro(),0.01);
	
		
	}
	
}
