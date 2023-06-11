package version4.model;

import java.util.Objects;

public class Counter {

	private int counter;

	public Counter() {
		this.counter = 0;
	}

	public Counter(int counter) {
		this.counter = counter;
	}

	public void dec() {
		this.counter--;
	}

	public void dec(int k) {
		this.counter -= k;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		return counter == other.counter;
	}

	public int getCounter() {
		return counter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(counter);
	}

	public void inc() {
		this.counter++;
	}

	public void inc(int k) {
		this.counter += k;
	}

	public void reset() {
		this.counter = 0;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String toString() {
		return "Valore corrente : " + getCounter();
	}
}
