package version3.view;

import java.util.function.IntConsumer;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import version3.controller.Controller;

public class MainPane extends BorderPane {
	private Controller controller;

	private HBox top, center, bottom;
	private TextField txt;
	private Label l;
	private ColoredButton inc, dec, reset;
	private IndexRadioButton[] buttonsCounters;
	private ToggleGroup tg;

	private int currentCounter;
	private int[] counters;

	public MainPane(Controller controller) {
		this.controller = controller;
		this.buttonsCounters = new IndexRadioButton[controller.getCapcity()];
		counters = new int[controller.getCapcity()];

		top = new HBox();
			tg = new ToggleGroup();
			top.setAlignment(Pos.CENTER);
			for (int i = 0; i < 3; i++) {
				buttonsCounters[i] = new IndexRadioButton("c" + i, i);
				buttonsCounters[i].setFont(Font.font("Helvetica Neue", FontWeight.NORMAL, 14));
				buttonsCounters[i].setToggleGroup(tg);
				counters[i] = controller.newCounter();
				top.getChildren().addAll(new Label(" "), buttonsCounters[i]);
				buttonsCounters[i].setOnAction(this::setCurrentCounter);
			}
			currentCounter = 0;
			tg.selectToggle(buttonsCounters[currentCounter]);
			this.setTop(top);

		center = new HBox();
			l = new Label("Valore attuale : ");
			l.setFont(Font.font("Helvetica Neue", FontWeight.NORMAL, 16));
			l.setStyle("-fx-font-weight: bold");
			txt = new TextField(controller.getCounterAsString(currentCounter));
			txt.setPrefWidth(40);
			txt.setEditable(false);
			txt.setFont(Font.font("Helvetica Neue", FontWeight.NORMAL, 16));
			center.getChildren().addAll(l, new Label(" "), txt);
			this.setCenter(center);

		bottom = new HBox();
			inc = new ColoredButton("Inc", "lightgreen");
			inc.setOnAction(event -> buttonHandle(controller::incCounter));
			dec = new ColoredButton("Dec", "lightblue");
			dec.setOnAction(event -> buttonHandle(controller::decCounter));
			reset = new ColoredButton("Reset", "red");
			reset.setOnAction(event -> buttonHandle(controller::resetCounter));
			bottom.getChildren().addAll(inc, dec, reset);
			this.setBottom(bottom);

	}

	public void buttonHandle(IntConsumer action) {
		action.accept(currentCounter);
		txt.setText(controller.getCounterAsString(currentCounter));
	}

	private void setCurrentCounter(ActionEvent event) {
		if (tg.getSelectedToggle() instanceof IndexRadioButton b) {
			currentCounter = b.getValue();
		}
		txt.setText(controller.getCounterAsString(currentCounter));

	}
}
