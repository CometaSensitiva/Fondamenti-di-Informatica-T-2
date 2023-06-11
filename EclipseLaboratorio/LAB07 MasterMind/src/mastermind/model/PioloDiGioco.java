package mastermind.model;

/**
 * Enum representing the different game pegs. Each peg has an associated RGB
 * color value.
 * 
 * @author michelemazzaa
 */
public enum PioloDiGioco {
	VUOTO("#808080"), ROSSO("#FF0000"), GIALLO("#FFFF00"), VERDE("#00FF00"), BLU("#00FFFF"), GRIGIO("#C0C0C0"),
	MARRONE("#800000");

	private String rgbColor;

	/**
	 * Constructor for PioloDiGioco.
	 * 
	 * @param rgbColor the RGB color value for the peg
	 */
	private PioloDiGioco(String rgbColor) {
		this.rgbColor = rgbColor;
	}

	/**
	 * Returns the RGB color value for the peg.
	 * 
	 * @return the RGB color value for the peg
	 */
	public String rgb() {
		return rgbColor;
	}
}