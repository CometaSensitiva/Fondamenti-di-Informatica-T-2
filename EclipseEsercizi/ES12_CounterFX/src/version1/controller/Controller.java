package version1.controller;

import version1.model.Counter;

public class Controller {
	private Counter counter;

	public Controller() {
		this.counter = new Counter();
	}

	public void incCounter() {
		this.counter.inc();
	}

	public void decCounter() {
		this.counter.dec();
	}

	public void resetCounter() {
		this.counter.reset();
	}

	public String getCounterAsString() {
		return String.valueOf(this.counter.getCounter());
	}

}
