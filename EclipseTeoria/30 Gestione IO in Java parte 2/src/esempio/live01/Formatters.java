package esempio.live01;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatters {
	public static final NumberFormat priceFormatter = NumberFormat.getCurrencyInstance(Locale.ITALY);
	public static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");

}
