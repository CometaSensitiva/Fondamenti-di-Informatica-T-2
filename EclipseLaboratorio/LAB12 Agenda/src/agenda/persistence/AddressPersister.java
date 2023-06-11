package agenda.persistence;

import java.util.StringTokenizer;

import agenda.model.Address;
import agenda.model.Detail;
import agenda.model.DetailFactory;

public class AddressPersister implements DetailPersister {
	private final static String SEPARATOR = ";";

	@Override
	public Detail load(StringTokenizer source) throws BadFileFormatException {
		Address address = (Address) DetailFactory.of("Address");
		if (source.countTokens() != 6) {
			throw new BadFileFormatException("Address: not enough tokens");
		}
		address.setDescription(source.nextToken(SEPARATOR));
		address.setStreet(source.nextToken(SEPARATOR));
		address.setNumber(source.nextToken(SEPARATOR));
		address.setZipCode(source.nextToken(SEPARATOR));
		address.setCity(source.nextToken(SEPARATOR));
		address.setState(source.nextToken());
		return address;
	}

	@Override
	public void save(Detail d, StringBuilder sb) {
		Address address = (Address) d;
		sb.append(address.getDescription());
		sb.append(SEPARATOR);
		sb.append(address.getStreet());
		sb.append(SEPARATOR);
		sb.append(address.getNumber());
		sb.append(SEPARATOR);
		sb.append(address.getZipCode());
		sb.append(SEPARATOR);
		sb.append(address.getCity());
		sb.append(SEPARATOR);
		sb.append(address.getState());
		sb.append(FileUtils.NEWLINE);

	}

}
