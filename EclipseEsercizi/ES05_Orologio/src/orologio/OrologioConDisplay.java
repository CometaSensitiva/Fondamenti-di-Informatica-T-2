package orologio;

import java.time.LocalTime;
import sevensegmentdisplay.Display;

public class OrologioConDisplay {
	Orologio clock;
	Display display;

	public OrologioConDisplay(LocalTime t) {
		clock = new Orologio(t);
		display = new Display(6,"Orologio a 7 Segmenti di Michele");
		display.setValue(t.getHour() * 10000 + t.getMinute() * 100 + t.getSecond());
	}

	public void tic() {
		clock.tic();
		display.setValue(clock.getHours() * 10000 + clock.getMinutes() * 100 + clock.getSeconds());
	}
	
	public String toString() {
		return clock.toString();
	}
	
	public static void main(String[] args) {
		OrologioConDisplay orologio=new OrologioConDisplay(LocalTime.now());
		while(true) {
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {}
			orologio.tic();
		}
	}
}
