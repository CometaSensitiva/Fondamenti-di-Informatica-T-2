package frazione.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import frazione.Frazione;

class FrazioneTest {

	@Test
	void testCostruttore1() {
		Frazione f1 = new Frazione(1, 2);
		assertEquals(1, f1.getNum());
		assertEquals(2, f1.getDen());
		assertFalse(f1.isNegativo());
	}

	@Test
	void testCostruttore2() {
		Frazione f2 = new Frazione(-1, 2);
		assertEquals(-1, f2.getNum());
		assertEquals(2, f2.getDen());
		assertTrue(f2.isNegativo());
	}

	@Test
	void testCostruttore3() {
		Frazione f3 = new Frazione(1, -2);
		assertEquals(-1, f3.getNum());
		assertEquals(2, f3.getDen());
		assertTrue(f3.isNegativo());
	}

	@Test
	void testCostruttore4() {
		Frazione f4 = new Frazione(3);
		assertEquals(3, f4.getNum());
		assertEquals(1, f4.getDen());
		assertFalse(f4.isNegativo());
	}

	@Test
	void testCostruttore5() {
		Frazione f5 = new Frazione(-3);
		assertEquals(-3, f5.getNum());
		assertEquals(1, f5.getDen());
		assertTrue(f5.isNegativo());
	}

	@Test
	void testCostruttore6() {
		Frazione f6 = new Frazione(0);
		assertEquals(0, f6.getNum());
		assertEquals(1, f6.getDen());
		assertFalse(f6.isNegativo());
	}

	@Test
	void testEquals1() {
		Frazione f1 = new Frazione(-1, 2);
		Frazione f2 = new Frazione(-1, 2);
		Frazione f3 = f1;
		assertTrue(f1.equals(f2));
		assertTrue(f2.equals(f1));
		assertTrue(f1.equals(f3));
	}

	void testEquals2() {
		Frazione f1 = new Frazione(-1, 2);
		Frazione f2 = new Frazione(-1, 2);
		Frazione f3 = f1;
		Frazione f4 = new Frazione(1, -2);
		Frazione f5 = new Frazione(1, 1);
		assertTrue(f1.equals(f2));
		assertTrue(f2.equals(f1));
		assertTrue(f1.equals(f3));
		assertTrue(f1.equals(f4));
		assertFalse(f1.equals(f5));
	}

	@Test
	void testEquals3() {
		Frazione f1 = new Frazione(-1);
		Frazione f2 = new Frazione(1, -1);
		Frazione f3 = f1;
		assertTrue(f1.equals(f2));
		assertTrue(f2.equals(f1));
		assertTrue(f1.equals(f3));
	}

	@Test
	void testEquals4() {
		Frazione f1 = new Frazione(0);
		Frazione f2 = new Frazione(0);
		Frazione f3 = f1;
		assertTrue(f1.equals(f2));
		assertTrue(f2.equals(f1));
		assertTrue(f1.equals(f3));
	}

	@Test
	void testSum1() {
		Frazione f1 = new Frazione(1, 1);
		Frazione f2 = new Frazione(1, 1);
		Frazione f3 = new Frazione(2, 1);
		assertTrue(f3.equals(f1.sum(f2)));
	}

	@Test
	void testSum2() {
		Frazione f1 = new Frazione(1, -1);
		Frazione f2 = new Frazione(1, 1);
		Frazione f3 = new Frazione(0, 0);
		assertTrue(f3.equals(f1.sum(f2)));
	}

	@Test
	void testSum3() {
		Frazione f1 = new Frazione(1, 2);
		Frazione f2 = new Frazione(1, 2);
		Frazione f3 = new Frazione(1, 1);
		assertTrue(f3.equals(f1.sum(f2)));
	}

	@Test
	void testSum4() {
		Frazione f1 = new Frazione(-1, 2);
		Frazione f2 = new Frazione(1, 2);
		Frazione f3 = new Frazione(0, 0);
		assertTrue(f3.equals(f1.sum(f2)));
	}

	@Test
	void testSum5() {
		Frazione f1 = new Frazione(3, 2);
		Frazione f2 = new Frazione(1, 2);
		Frazione f3 = new Frazione(2, 1);
		assertTrue(f3.equals(f1.sum(f2)));
	}

	@Test
	void testSum6() {
		Frazione f1 = new Frazione(1);
		Frazione f2 = new Frazione(1, 2);
		Frazione f3 = new Frazione(3, 2);
		assertTrue(f3.equals(f1.sum(f2)));
	}

	@Test
	void testSub1() {
		Frazione f1 = new Frazione(1, 1);
		Frazione f2 = new Frazione(1, 1);
		Frazione f3 = new Frazione(0, 0);
		assertTrue(f3.equals(f1.sub(f2)));
	}

	@Test
	void testSub2() {
		Frazione f1 = new Frazione(1, 2);
		Frazione f2 = new Frazione(-1, 2);
		Frazione f3 = new Frazione(1, 1);
		assertTrue(f3.equals(f1.sub(f2)));
	}

	@Test
	void testSub3() {
		Frazione f1 = new Frazione(1);
		Frazione f2 = new Frazione(1, 2);
		Frazione f3 = new Frazione(1, 2);
		assertTrue(f3.equals(f1.sub(f2)));
	}

	// mul
	@Test
	void testMul1() {
		Frazione f1 = new Frazione(1, 1);
		Frazione f2 = new Frazione(1, 1);
		Frazione f3 = new Frazione(1, 1);
		assertTrue(f3.equals(f1.mul(f2)));
	}

	@Test
	void testMul2() {
		Frazione f1 = new Frazione(1, 2);
		Frazione f2 = new Frazione(1, 2);
		Frazione f3 = new Frazione(1, 4);
		assertTrue(f3.equals(f1.mul(f2)));
	}

	@Test
	void testMul3() {
		Frazione f1 = new Frazione(1, -2);
		Frazione f2 = new Frazione(1, 2);
		Frazione f3 = new Frazione(-1, 4);
		assertTrue(f3.equals(f1.mul(f2)));
	}

	@Test
	void testMul4() {
		Frazione f1 = new Frazione(1, -2);
		Frazione f2 = new Frazione(0, 0);
		Frazione f3 = new Frazione(0, 0);
		assertTrue(f3.equals(f1.mul(f2)));
	}
	
	// div
	@Test
	void testDiv1() {
		Frazione f1 = new Frazione(1, 1);
		Frazione f2 = new Frazione(1, 1);
		Frazione f3 = new Frazione(1, 1);
		assertTrue(f3.equals(f1.div(f2)));
	}

	@Test
	void testDiv2() {
		Frazione f1 = new Frazione(1, 2);
		Frazione f2 = new Frazione(1, 2);
		Frazione f3 = new Frazione(1, 1);
		assertTrue(f3.equals(f1.div(f2)));
	}
	
	@Test
	void testDiv3() {
		Frazione f1 = new Frazione(1, -2);
		Frazione f2 = new Frazione(1, 2);
		Frazione f3 = new Frazione(-1, 1);
		assertTrue(f3.equals(f1.div(f2)));
	}
	
	@Test
	void testDiv4() {
		Frazione f1 = new Frazione(1, -2);
		Frazione f2 = new Frazione(0, 0);
		Frazione f3 = new Frazione(0, 0);
		assertTrue(f3.equals(f1.mul(f2)));
	}
	
	// reciprocal
	
	@Test 
	void testReciprocal1() {
		Frazione f1 = new Frazione(1, 2);
		Frazione f2 = new Frazione(2, 1);
		assertTrue(f1.equals(f2.reciprocal()));
	}

	@Test 
	void testReciprocal2() {
		Frazione f1 = new Frazione(-1, 2);
		Frazione f2 = new Frazione(-2, 1);
		assertTrue(f1.equals(f2.reciprocal()));
	}
	
	//compareTo
	void testCompareTo() {
		Frazione f1 = new Frazione(1, 2);
		Frazione f2 = new Frazione(1, 2);
		Frazione f3 = new Frazione(-1,2);
		Frazione f4 = new Frazione(2,1);
		assertEquals(0,f1.compareTo(f2));
		assertEquals(1,f1.compareTo(f3));
		assertEquals(-1,f1.compareTo(f4));
	}
}
