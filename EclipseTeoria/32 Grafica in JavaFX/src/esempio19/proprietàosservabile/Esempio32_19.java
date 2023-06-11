package esempio19.proprietàosservabile;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * 
 * This class demonstrates the usage of StringProperty and SimpleStringProperty
 * in JavaFX.
 * 
 * It creates three StringProperties to represent different teachers and
 * demonstrates how to set their values,
 * 
 * retrieve their names and values, and bind them together using concatenation.
 * 
 * The class also shows how to add a listener to one of the properties to detect
 * changes and print the old and new values.
 * 
 * @author michelemazzaa
 */
public class Esempio32_19 {
	public static void main(String[] args) {
		// Create the first teacher property
		StringProperty docente1 = new SimpleStringProperty(null, "docente 1");
		docente1.set("AM");
		System.out.println("Property 1: " + docente1.getName());
		System.out.println("Value 1: " + docente1.getValue());

		// Create the second teacher property
		StringProperty docente2 = new SimpleStringProperty(null, "docente 2");
		docente2.set("RC");
		System.out.println("Property 2: " + docente2.getName());
		System.out.println("Value 2: " + docente2.getValue());

		// Create the third property by binding the first two properties together
		StringProperty docenti = new SimpleStringProperty(null, "docenti");
		docenti.bind(Bindings.concat(docente1, " & ", docente2));
		System.out.println("Property 3: " + docenti.getName());
		System.out.println("Value 3: " + docenti.getValue());

		// Add a listener to the second teacher property to detect changes
		docente2.addListener((obs, oldValue, newValue) -> System.out
				.println("Change:" + obs + " from " + oldValue + " to " + newValue));

		// Change the value of the second teacher property
		docente2.set("Roberta Calegari");
		System.out.println("Property 3: " + docenti.getName());
		System.out.println("Value 3: " + docenti.getValue());
	}
}