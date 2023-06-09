package esempio03;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * This class demonstrates the difference between using old-style raw types and
 * modern generic types when working with collections of primitive types in
 * Java. In the old-style approach, values of primitive types are boxed into
 * corresponding wrapper classes before being added to a collection with a raw
 * type. This boxing operation incurs additional overhead and can lead to
 * type-safety issues. In the modern approach, collections are declared with
 * generic types that match the corresponding wrapper classes of the primitive
 * types. This eliminates the need for boxing and improves type-safety.
 * 
 * @author michelemazzaa
 */
public class Esempio25_03 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("- - - - - Old-style collections with raw types - - - - -");
		List list = new ArrayList();
		list.add(23);// Boxing int--> Integer
		list.add(24);// Boxing int--> Integer
		list.add(25);// Boxing int--> Integer
		for (Object obj : list)
			System.out.println(obj);
		int i0 = (int) list.get(0);// Unboxing Integer --> int
		int i1 = (int) list.get(1);// Unboxing Integer --> int
		int i2 = (int) list.get(2);// Unboxing Integer --> int
		System.out.println(i0);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println("- - - - - Modern collections with generic types - - - - -");
		List<Integer> listOfInt = new ArrayList<>();
		listOfInt.add(23);
		listOfInt.add(24);
		listOfInt.add(25);
		for (Number num : listOfInt)
			System.out.println(num);
		int n0 = listOfInt.get(0);
		int n1 = listOfInt.get(1);
		int n2 = listOfInt.get(2);
		System.out.println(n0);
		System.out.println(n1);
		System.out.println(n2);
	}
}
