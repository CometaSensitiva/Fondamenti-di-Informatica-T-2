
package fondt2.tlc;

import java.util.Arrays;

/**
 * 
 * @author michelemazza Questa classe rappresenta un piano telefonico con
 *         diverse tariffe.
 */
public class PhonePlan {
	private String name;
	private Rate[] rates;

	/**
	 * Costruttore della classe PhonePlan.
	 *
	 * @param name  il nome del piano telefonico
	 * @param rates le tariffe associate al piano telefonico
	 */
	public PhonePlan(String name, Rate[] rates) {
		this.name = name;
		this.rates = Arrays.copyOf(rates, rates.length);
	}

	/**
	 * Restituisce il nome del piano telefonico.
	 *
	 * @return il nome del piano telefonico
	 */
	public String getName() {
		return name;
	}

	/**
	 * Restituisce la tariffa applicabile a una chiamata telefonica specificata.
	 *
	 * @param phoneCall la chiamata telefonica da valutare
	 * @return la tariffa applicabile alla chiamata telefonica specificata
	 */
	private Rate getRate(PhoneCall phoneCall) {
		for (Rate x : rates) {
			if (x.isApplicableTo(phoneCall.getDestNumber()))
				return x;
		}
		return null;

	}

	/**
	 * Calcola il costo di una chiamata telefonica.
	 *
	 * @param call la chiamata telefonica da valutare
	 * @return il costo della chiamata telefonica
	 */
	public double getCallCost(PhoneCall call) {
		Rate selected = getRate(call);
		if (selected == null) {
			return -1;
		}
		return selected.getCallCost(call);
	}

	/**
     * Verifica se il piano telefonico è valido.
     *
     * @return true se il piano telefonico è valido, altrimenti false
     */
    public boolean isValid() {
        boolean isValid = true;
        int i = 0;
        while (i < rates.length && isValid) {
            isValid = rates[i].isValid();
            i++;
        }
        return isValid;

    }

}