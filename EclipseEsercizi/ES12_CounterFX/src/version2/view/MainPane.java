package version2.view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import version2.controller.Controller;

public class MainPane extends BorderPane {
	Controller controller;

	HBox top, bottom;
	TextField txt;
	Label l;
	ColoredButton inc, dec, reset;

	public MainPane(Controller controller) {
		this.controller = controller;

		top = new HBox();
			l = new Label("Valore attuale : ");
			l.setFont(Font.font("Helvetica Neue",FontWeight.NORMAL,16));
			l.setStyle("-fx-font-weight: bold");
			txt = new TextField(controller.getCounterAsString());
			txt.setPrefWidth(40);
			txt.setEditable(false);
			txt.setFont(Font.font("Helvetica Neue",FontWeight.NORMAL,16));
			top.getChildren().addAll(l, new Label(" "), txt);
			this.setTop(top);

		bottom = new HBox();
			inc = new ColoredButton("Inc", "lightgreen");
			inc.setOnAction(event -> buttonHandle(controller :: incCounter));
			dec = new ColoredButton("Dec", "lightblue");
			dec.setOnAction(event -> buttonHandle(controller :: decCounter));
			reset = new ColoredButton("Reset", "red");
			reset.setOnAction(event -> buttonHandle(controller :: resetCounter));
			bottom.getChildren().addAll(inc, dec, reset);
			this.setBottom(bottom);

	}
	
	public void buttonHandle(Action event) {
		event.doOp();
		txt.setText(controller.getCounterAsString());
	}
}
