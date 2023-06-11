package flights.ui;

import java.time.LocalDate;
import java.util.List;

import flights.controller.Controller;
import flights.model.Airport;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainPane extends BorderPane {
	private Controller controller;

	private VBox leftPanel;
	private Label l1, l2, l3;
	private ComboBox<Airport> box1, box2;
	private DatePicker datepicker1;
	private Button b1;

	private FlightScheduleListPanel rightPanel;

	public MainPane(Controller controller) {
		if (controller == null) {
			throw new IllegalArgumentException("Controller null");
		}
		this.controller = controller;
		initPane();
	}

	private void initPane() {
		rightPanel = new FlightScheduleListPanel();
		setCenter(rightPanel);

		leftPanel = new VBox();

		{
			leftPanel.setSpacing(10);
			leftPanel.setPadding(new Insets(0, 20, 10, 20));

			l1 = new Label("Departure Airport");
			l2 = new Label("Arrival Airport");
			l3 = new Label("Departure date");

			box1 = new ComboBox<>();
			box1.setPrefWidth(250);
			List<Airport> airports = controller.getSortedAirports();
			ObservableList<Airport> observableAirports = FXCollections.observableArrayList(airports);
			box1.setItems(observableAirports);
			box1.setEditable(false);
			box1.setValue(observableAirports.get(0));

			box2 = new ComboBox<>();
			box2.setPrefWidth(250);
			box2.setItems(observableAirports);
			box2.setEditable(false);
			box2.setValue(observableAirports.get(1));

			datepicker1 = new DatePicker(LocalDate.now());

			b1 = new Button("Find");
			b1.setPrefWidth(100);
			b1.setOnAction(this::buttonHandle);
		}
		leftPanel.getChildren().addAll(l1, box1, l2, box2, l3, datepicker1, b1);
		leftPanel.setAlignment(Pos.BASELINE_RIGHT);
		BorderPane.setMargin(leftPanel, new Insets(15, 0, 0, 10));
		setLeft(leftPanel);

	}

	private void buttonHandle(ActionEvent event) {
		Airport departureAirport = box1.getValue();
		Airport arrivalAirport = box2.getValue();
		LocalDate date = datepicker1.getValue();
		rightPanel.setFlightSchedules(controller.searchFlights(departureAirport, arrivalAirport, date));
	}

}
