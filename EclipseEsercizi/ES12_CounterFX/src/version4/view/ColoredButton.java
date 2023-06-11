package version4.view;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ColoredButton extends Button {

	public ColoredButton(String txt, String color) {
		super(txt);
		this.setStyle("-fx-font-weight: bold");
		this.setPrefWidth(100);
		this.setFont(Font.font("Helvetica Neue",FontWeight.NORMAL,16));
		this.setStyle("-fx-background-color: " + color);

	}
}
