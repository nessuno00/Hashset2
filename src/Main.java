import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> Vl = new HashSet<String>(Arrays.asList("Cuore", "Picche", "Fiori", "Quadri"));

        Vl.add("Re");

        Iterator<String> iterator = Vl.iterator();

        while (iterator.hasNext()) {

            String Vb = iterator.next();

            if (Vb == "Fiori" || Vb == "Picche") {

                iterator.remove();
            }
            System.out.println(Vl);
        }

        Vl.clear();

        if (Vl.isEmpty()) {
            System.out.println("L'HashSet è vuoto dopo averlo svuotato.");
        } else {
            System.out.println("L'HashSet non è vuoto dopo averlo svuotato.");
        }
        System.out.println(Vl);

    }

}