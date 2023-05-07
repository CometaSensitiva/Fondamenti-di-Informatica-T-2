package esempio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PoligonoMainTest {

	// collaudare innanzitutto il
	// funzionamento dei costruttori (anche nei casi "particolari"…)
	@Test
	void testCostruttorePunto1() {
		Punto p1 = new Punto(1, 1);
		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
	}

	@Test
	void testCostruttorePunto2() {
		Punto p2 = new Punto(5, 1);
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
	}

	@Test
	void testCostruttorePunto3() {
		Punto p3 = new Punto(5, 4);
		assertEquals(5, p3.getX());
		assertEquals(4, p3.getY());
	}

	@Test
	void testCostruttorePoligono1() {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p3 = new Punto(5, 4);
		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
		assertEquals(5, p3.getX());
		assertEquals(4, p3.getY());
		Punto[] vertici = { p1, p2, p3 };
		Poligono trg1 = new Poligono("trg1", vertici);
		assertEquals("trg1", trg1.getNome());
		assertEquals(3, trg1.getNumVertici());
		assertArrayEquals(vertici, trg1.getVertici());
	}

	@Test
	void testCostruttorePoligono2() {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p5 = new Punto(5, -2);
		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
		assertEquals(5, p5.getX());
		assertEquals(-2, p5.getY());
		Punto[] vertici = { p1, p2, p5 };
		Poligono trg2 = new Poligono("trg2", vertici);
		assertEquals("trg2", trg2.getNome());
		assertEquals(3, trg2.getNumVertici());
		assertArrayEquals(vertici, trg2.getVertici());
	}

	@Test
	void testCostruttorePoligono3() {
		Punto p4 = new Punto(1, -2);
		Punto p5 = new Punto(5, -2);
		Punto p6 = new Punto(3, -5.46);
		assertEquals(1, p4.getX());
		assertEquals(-2, p4.getY());
		assertEquals(5, p5.getX());
		assertEquals(-2, p5.getY());
		assertEquals(3, p6.getX());
		assertEquals(-5.46, p6.getY());
		Punto[] vertici = { p4, p5, p6 };
		Poligono trg3 = new Poligono("trg3", vertici);
		assertEquals("trg3", trg3.getNome());
		assertEquals(3, trg3.getNumVertici());
		assertArrayEquals(vertici, trg3.getVertici());
	}

	@Test
	void testCostruttorePoligono4() {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p4 = new Punto(1, -2);
		Punto p5 = new Punto(5, -2);

		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
		assertEquals(1, p4.getX());
		assertEquals(-2, p4.getY());
		assertEquals(5, p5.getX());
		assertEquals(-2, p5.getY());
		Punto[] vertici = { p1, p2, p5, p4 };
		Poligono rect = new Poligono("rect", vertici);
		assertEquals("rect", rect.getNome());
		assertEquals(4, rect.getNumVertici());
		assertArrayEquals(vertici, rect.getVertici());
	}

	@Test
	void testCostruttorePoligono5() {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p4 = new Punto(1, -2);
		Punto p5 = new Punto(5, -2);

		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
		assertEquals(1, p4.getX());
		assertEquals(-2, p4.getY());
		assertEquals(5, p5.getX());
		assertEquals(-2, p5.getY());
		Punto[] vertici = { p1, p2, p4, p5 };
		Poligono farfalla1 = new Poligono("farfalla1", vertici);
		assertEquals("farfalla1", farfalla1.getNome());
		assertEquals(4, farfalla1.getNumVertici());
		assertArrayEquals(vertici, farfalla1.getVertici());
	}

	@Test
	void testCostruttorePoligono6() {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p4 = new Punto(1, -2);
		Punto p5 = new Punto(5, -2);

		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
		assertEquals(1, p4.getX());
		assertEquals(-2, p4.getY());
		assertEquals(5, p5.getX());
		assertEquals(-2, p5.getY());
		Punto[] vertici = { p1, p5, p2, p4 };
		Poligono farfalla2 = new Poligono("farfalla2", vertici);
		assertEquals("farfalla2", farfalla2.getNome());
		assertEquals(4, farfalla2.getNumVertici());
		assertArrayEquals(vertici, farfalla2.getVertici());
	}

	@Test
	void testPerimetroPoligono1() {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p3 = new Punto(5, 4);
		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
		assertEquals(5, p3.getX());
		assertEquals(4, p3.getY());
		Punto[] vertici = { p1, p2, p3 };
		Poligono trg1 = new Poligono("trg1", vertici);
		assertEquals("trg1", trg1.getNome());
		assertEquals(3, trg1.getNumVertici());
		assertArrayEquals(vertici, trg1.getVertici());
		assertEquals(12.0, trg1.getPerimetro(), 0.1);
	}

	@Test
	void testPerimetroPoligono2() {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p5 = new Punto(5, -2);
		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
		assertEquals(5, p5.getX());
		assertEquals(-2, p5.getY());
		Punto[] vertici = { p1, p2, p5 };
		Poligono trg2 = new Poligono("trg2", vertici);
		assertEquals("trg2", trg2.getNome());
		assertEquals(3, trg2.getNumVertici());
		assertArrayEquals(vertici, trg2.getVertici());
		assertEquals(12.0, trg2.getPerimetro(), 0.1);
	}

	@Test
	void testPerimetroPoligono3() {
		Punto p4 = new Punto(1, -2);
		Punto p5 = new Punto(5, -2);
		Punto p6 = new Punto(3, -5.46);
		assertEquals(1, p4.getX());
		assertEquals(-2, p4.getY());
		assertEquals(5, p5.getX());
		assertEquals(-2, p5.getY());
		assertEquals(3, p6.getX());
		assertEquals(-5.46, p6.getY());
		Punto[] vertici = { p4, p5, p6 };
		Poligono trg3 = new Poligono("trg3", vertici);
		assertEquals("trg3", trg3.getNome());
		assertEquals(3, trg3.getNumVertici());
		assertArrayEquals(vertici, trg3.getVertici());
		assertEquals(12.0, trg3.getPerimetro(), 0.1);
	}

	@Test
	void testPerimetroPoligono4() {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p4 = new Punto(1, -2);
		Punto p5 = new Punto(5, -2);

		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
		assertEquals(1, p4.getX());
		assertEquals(-2, p4.getY());
		assertEquals(5, p5.getX());
		assertEquals(-2, p5.getY());
		Punto[] vertici = { p1, p2, p5, p4 };
		Poligono rect = new Poligono("rect", vertici);
		assertEquals("rect", rect.getNome());
		assertEquals(4, rect.getNumVertici());
		assertArrayEquals(vertici, rect.getVertici());
		assertEquals(14.0, rect.getPerimetro(), 0.1);
	}

	@Test
	void testPerimetroPoligono5() {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p4 = new Punto(1, -2);
		Punto p5 = new Punto(5, -2);

		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
		assertEquals(1, p4.getX());
		assertEquals(-2, p4.getY());
		assertEquals(5, p5.getX());
		assertEquals(-2, p5.getY());
		Punto[] vertici = { p1, p2, p4, p5 };
		Poligono farfalla1 = new Poligono("farfalla1", vertici);
		assertEquals("farfalla1", farfalla1.getNome());
		assertEquals(4, farfalla1.getNumVertici());
		assertArrayEquals(vertici, farfalla1.getVertici());
		assertEquals(18.0, farfalla1.getPerimetro(), 0.1);
	}

	@Test
	void testPerimetroPoligono6() {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p4 = new Punto(1, -2);
		Punto p5 = new Punto(5, -2);

		assertEquals(1, p1.getX());
		assertEquals(1, p1.getY());
		assertEquals(5, p2.getX());
		assertEquals(1, p2.getY());
		assertEquals(1, p4.getX());
		assertEquals(-2, p4.getY());
		assertEquals(5, p5.getX());
		assertEquals(-2, p5.getY());
		Punto[] vertici = { p1, p5, p2, p4 };
		Poligono farfalla2 = new Poligono("farfalla2", vertici);
		assertEquals("farfalla2", farfalla2.getNome());
		assertEquals(4, farfalla2.getNumVertici());
		assertArrayEquals(vertici, farfalla2.getVertici());
		assertEquals(16.0, farfalla2.getPerimetro(), 0.1);
	}

}
