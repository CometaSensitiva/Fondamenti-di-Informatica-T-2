package version3.controller;

import version3.model.Counter;

public class Controller {
	private Counter[] counters;
	private int index, max;

	public Controller(int max) {
		this.counters = new Counter[max];
		this.max = max;
		this.index = 0;
	}

	public int newCounter() {
		if (index > max) {
			throw new IllegalArgumentException("Capacità massima superata : " + max);
		}
		this.counters[index++] = new Counter();
		return index - 1;
	}

	public void incCounter(int i) {
		if (i > max || i < 0) {
			throw new IllegalArgumentException("Indice non accettabile :" + i);
		}
		this.counters[i].inc();
	}

	public void decCounter(int i) {
		if (i > max || i < 0) {
			throw new IllegalArgumentException("Indice non accettabile :" + i);
		}
		this.counters[i].dec();
	}

	public void resetCounter(int i) {
		if (i > max || i < 0) {
			throw new IllegalArgumentException("Indice non accettabile :" + i);
		}
		this.counters[i].reset();
	}
	
	public int getCapcity() {
		return this.max;
	}

	public String getCounterAsString(int i) {
		if (i > max || i < 0) {
			throw new IllegalArgumentException("Indice non accettabile :" + i);
		}
		return String.valueOf(this.counters[i].getCounter());
	}

}
