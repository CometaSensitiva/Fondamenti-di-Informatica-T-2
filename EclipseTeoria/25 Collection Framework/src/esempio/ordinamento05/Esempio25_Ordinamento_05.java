package esempio.ordinamento05;

import java.util.*;


public class Esempio25_Ordinamento_05 {

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