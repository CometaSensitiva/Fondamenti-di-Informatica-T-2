package esempio31.datepicker;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Esempio32_31 extends Application {
	private DatePicker datePicker1, datePicker2;
	private TextField txt1;
	private DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.ITALY);

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 31");
		FlowPane panel = new FlowPane();
		datePicker1 = new DatePicker();
		datePicker2 = new DatePicker();
		txt1 = new TextField();
		txt1.setPrefWidth(250);;
		datePicker1.setOnAction(event -> {
			datePicker2.setValue(datePicker1.getValue().plusDays(1));
			txt1.setText("Data selezionata : " + formatter.format(datePicker1.getValue()));
		});
		datePicker2.setOnAction(event -> {
			if (datePicker1.getValue() == null)
				return;
			datePicker2.setTooltip(new Tooltip("Durata soggiorno : "
					+ ChronoUnit.DAYS.between(datePicker1.getValue(), datePicker2.getValue()) + " notti"));
		});
		panel.getChildren().addAll(datePicker1, datePicker2, txt1);
		panel.setPrefHeight(50);
		Scene scene = new Scene(panel, Color.BLACK);
		
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
