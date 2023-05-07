package counter.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import counter.Counter;

class CounterTest {

	@Test
	void testCostruttore0() {
		Counter c = new Counter();
		assertEquals(1, c.getValue());

	}

	@Test
	void testCostruttore1() {
		Counter c = new Counter(12);
		assertEquals(12, c.getValue());

	}

	@Test
	void testCostruttore2() {
		Counter c = new Counter(15);
		assertEquals(15, c.getValue());

	}

	@Test
	void testReset0() {
		Counter c = new Counter();
		assertEquals(1, c.getValue());
		c.reset();
		assertEquals(0, c.getValue());
	}

	@Test
	void testReset1() {
		Counter c = new Counter(12);
		assertEquals(12, c.getValue());
		c.reset();
		assertEquals(0, c.getValue());
	}

	@Test
	void testReset2() {
		Counter c = new Counter(15);
		assertEquals(15, c.getValue());
		c.reset();
		assertEquals(0, c.getValue());
	}

	@Test
	void testInc0() {
		Counter c = new Counter();
		assertEquals(1, c.getValue());
		c.inc();
		;
		assertEquals(2, c.getValue());
	}

	@Test
	void testInc1() {
		Counter c = new Counter(12);
		assertEquals(12, c.getValue());
		c.inc();
		;
		assertEquals(13, c.getValue());
	}

	@Test
	void testInc2() {
		Counter c = new Counter(15);
		assertEquals(15, c.getValue());
		c.inc();
		;
		assertEquals(16, c.getValue());
	}

	@Test
	void testInck0() {
		Counter c = new Counter();
		assertEquals(1, c.getValue());
		c.inc(10);
		;
		assertEquals(11, c.getValue());
	}

	@Test
	void testInck1() {
		Counter c = new Counter(12);
		assertEquals(12, c.getValue());
		c.inc(10);
		;
		assertEquals(22, c.getValue());
	}

	@Test
	void testInck2() {
		Counter c = new Counter(15);
		assertEquals(15, c.getValue());
		c.inc(10);
		;
		assertEquals(25, c.getValue());
	}

	@Test
	void testEquals() {
		Counter c1 = new Counter(12);
		assertEquals(12, c1);
		Counter c2 = new Counter(12);
		assertEquals(12, c2);
		assertTrue(c1.equals(c2));
		assertTrue(c2.equals(c1));
		assertTrue(c1.equals(c1));

	}

	@Test
	void testEqualsAndSame() {
		Counter c1 = new Counter(12);
		assertEquals(12, c1);
		Counter c2 = new Counter(12);
		assertEquals(12, c2);
		Counter c3 = c1;
		assertEquals(12, c3);
		assertTrue(c1.equals(c2));
		assertTrue(c2.equals(c1));
		assertTrue(c1.equals(c3));
		assertTrue(c2.equals(c3));
		assertTrue(c1.equals(c1));
		assertSame(c1, c3);

	}

	@Test
	void testEqualsAndSameAndFail() {
		Counter c1 = new Counter(12);
		assertEquals(12, c1);
		Counter c2 = new Counter(12);
		assertEquals(12, c2);
		Counter c3 = c1;
		assertEquals(12, c3);
		assertTrue(c1.equals(c2));
		assertTrue(c2.equals(c1));
		assertTrue(c1.equals(c3));
		assertTrue(c2.equals(c3));
		assertTrue(c1.equals(c1));
		assertSame(c1, c3);

	}

}
