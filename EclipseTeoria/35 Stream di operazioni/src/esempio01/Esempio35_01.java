package esempio01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Esempio35_01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("Marco", "Simone"));
		Stream<String> stream = list.stream();
		long numParole = stream.filter(p -> p.length() > 8).count();
		List<String> paroleMaiuscole = stream.map(p -> p.toUpperCase()).collect(Collectors.toList());
	}

}
