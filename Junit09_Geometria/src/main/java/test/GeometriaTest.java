package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api
import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	Geometria geometria;
	Geometria geo;
	int id = 1;

	@BeforeEach
	public void beforeEach() {
		geometria = new Geometria(id);
		geo = new Geometria();
	}

	@Test
	void testAreacuadrado() {
		int resultado = geometria.areacuadrado(5);
		int esperado = 25;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreaCirculo() {
		double resultado = geometria.areaCirculo(5);
		double esperado = 79;
		double delta = 1;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	void testAreatriangulo() {
		int resultado = geometria.areatriangulo(10, 10);
		int esperado = 50;
		assertEquals(resultado, esperado);
	}

	@Test
	void testArearectangulo() {
		int resultado = geometria.arearectangulo(5, 5);
		int esperado = 25;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreapentagono() {
		int resultado = geometria.areapentagono(10, 10);
		int esperado = 50;
		assertEquals(resultado, esperado);
	}

	@Test
	void testArearombo() {
		int resultado = geometria.arearombo(10, 10);
		int esperado = 50;
		assertEquals(resultado, esperado);
	}

	@Test
	void testArearomboide() {
		int resultado = geometria.arearomboide(5, 5);
		int esperado = 25;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreatrapecio() {
		int resultado = geometria.areatrapecio(5, 5, 6);
		int esperado = 30;
		assertEquals(resultado, esperado);
	}

	@Test
	void testFigura() {
		String resultado = geometria.figura(1);
		String esperado = "cuadrado";
		assertEquals(resultado, esperado);

		String resultado2 = geometria.figura(2);
		String esperado2 = "Circulo";
		assertEquals(resultado2, esperado2);

		String resultado3 = geometria.figura(3);
		String esperado3 = "Triangulo";
		assertEquals(resultado3, esperado3);

		String resultado4 = geometria.figura(4);
		String esperado4 = "Rectangulo";
		assertEquals(resultado4, esperado4);

		String resultado5 = geometria.figura(5);
		String esperado5 = "Pentagono";
		assertEquals(resultado5, esperado5);

		String resultado6 = geometria.figura(6);
		String esperado6 = "Rombo";
		assertEquals(resultado6, esperado6);

		String resultado7 = geometria.figura(7);
		String esperado7 = "Romboide";
		assertEquals(resultado7, esperado7);

		String resultado8 = geometria.figura(8);
		String esperado8 = "Trapecio";
		assertEquals(resultado8, esperado8);

		String resultado9 = geometria.figura(9);
		String esperado9 = "Default";
		assertEquals(resultado9, esperado9);

	}

	@Test
	void testGetId() {
		int resultado = geometria.getId();
		int esperado = 1;
		assertEquals(resultado, esperado);
	}

	@Test
	void testSetId() {
		geometria.setId(5);
		int resultado = 5;
		int esperado = 5;
		assertEquals(resultado, esperado);
	}

	@Test
	void testGetNom() {
		String resultado = geometria.getNom();
		String esperado = "cuadrado";
		assertEquals(resultado, esperado);
	}

	@Test
	void testSetNom() {
		geometria.setNom("Triangulo");
		String resultado = "Triangulo";
		String esperado = "Triangulo";
		assertEquals(resultado, esperado);
	}

	@Test
	void testGetArea() {
		geometria.setArea(10);
		double resultado = geometria.getArea();
		double esperado = 10;
		double delta = 1;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	void testSetArea() {
		geometria.setArea(10);
		double resultado = geometria.getArea();
		double esperado = 10;
		double delta = 1;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	void testToString() {
		String resultado = geometria.toString();
		String esperado = "Geometria [id=1, nom=cuadrado, area=0.0]";
		assertEquals(resultado, esperado);
	}
}
