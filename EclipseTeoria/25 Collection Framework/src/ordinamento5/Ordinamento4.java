package ordinamento5;

import java.util.*;


public class Ordinamento4 {

    public static void main(String args[]) {


        List<Persona> immutableList = List.of(
                new Persona("Eugenio", "Bennato"),
                new Persona("Roberto", "Benigni"),
                new Persona("Edoardo", "Bennato"),
                new Persona("Bruno", "Vespa")
        );

     
       Persona[] persone = immutableList.toArray(new Persona[0]);

        
        Arrays.sort(persone);


        System.out.println(Arrays.toString(persone));
    }
}