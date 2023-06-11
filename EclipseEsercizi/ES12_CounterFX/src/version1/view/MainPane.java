package version1.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import version1.controller.Controller;

public class MainPane extends BorderPane {
	Controller controller;

	HBox top, bottom;
	TextField txt;
	Label l;
	Button inc, dec, reset;

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
			inc = new Button("Inc");
			inc.setPrefWidth(100);
			inc.setFont(Font.font("Helvetica Neue",FontWeight.NORMAL,16));
			inc.setStyle("-fx-font-weight: bold");
			inc.setOnAction(event -> {
				controller.incCounter();
				txt.setText(controller.getCounterAsString());
			});
			dec = new Button("Dec");
			dec.setPrefWidth(100);
			dec.setFont(Font.font("Helvetica Neue",FontWeight.NORMAL,16));
			dec.setStyle("-fx-font-weight: bold");
			dec.setOnAction(event -> {
			controller.decCounter();
			txt.setText(controller.getCounterAsString());
		});
			reset = new Button("Reset");
			reset.setPrefWidth(100);
			reset.setFont(Font.font("Helvetica Neue",FontWeight.NORMAL,16));
			reset.setStyle("-fx-font-weight: bold");
			reset.setOnAction(event -> {
			controller.resetCounter();
			txt.setText(controller.getCounterAsString());
		});
			bottom.getChildren().addAll(inc, dec, reset);
			this.setBottom(bottom);

	}
}
