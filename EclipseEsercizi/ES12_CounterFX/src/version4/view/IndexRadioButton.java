package version4.view;

import javafx.scene.control.RadioButton;

public class IndexRadioButton extends RadioButton {
	private int value;

	public IndexRadioButton(String txt, int value) {
		super(txt);
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}
