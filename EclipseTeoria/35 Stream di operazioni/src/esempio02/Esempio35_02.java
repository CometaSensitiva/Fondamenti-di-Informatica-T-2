package esempio02;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Esempio35_02 {

	public static void main(String[] args) {
		long t0 = System.currentTimeMillis(); 
		List<Integer> list1 = new Random().ints(1,100).parallel().limit(500)
				.mapToObj(i->i*i).collect(Collectors.toList());
		long t1= System.currentTimeMillis(); 
		System.out.println(t1-t0);

	}

}
