

import java.util.ArrayList;
import java.util.HashMap;

public class Sinonimos {

    private HashMap<String, ArrayList<String>> diccsinonimos;

    public Sinonimos() {
        diccsinonimos = new HashMap<>();

        ArrayList<String> listsinonimos1 = new ArrayList<>();
        listsinonimos1.add("gracioso");
        listsinonimos1.add("ocurrente");
        listsinonimos1.add("chistoso");

        ArrayList<String> listsinonimos2 = new ArrayList<>();
        listsinonimos2.add("prefacio");
        listsinonimos2.add("preludio");
        listsinonimos2.add("entrada.");

        ArrayList<String> listsinonimos3 = new ArrayList<>();
        listsinonimos3.add("camino");
        listsinonimos3.add("vereda");
        listsinonimos3.add("sendero");

        ArrayList<String> listsinonimos4 = new ArrayList<>();
        listsinonimos4.add("enigma");
        listsinonimos4.add("adivinanza");
        listsinonimos4.add("acertijo");

        diccsinonimos.put("donoso", listsinonimos1);
        diccsinonimos.put("proemio", listsinonimos2);
        diccsinonimos.put("trocha", listsinonimos3);
        diccsinonimos.put("logogrifo", listsinonimos4);
    }

    public void mostrarSinonimos() {
        for (String palabra : diccsinonimos.keySet()) {
            //System.out.println("Sinonimos de " + palabra + ": " + diccsinonimos.get(palabra));
            System.out.println("Sinonimos de " + palabra );
        }
    }

    public void buscarSinonimos(String palabra) {
        if (diccsinonimos.containsKey(palabra)) {
            System.out.println("Sinonimos de " + palabra + ": " + diccsinonimos.get(palabra));
        } else {
            System.out.println("AVISO: No está en el diccionario.");
        }
    }

    public void obtenerSinonimoAleatorio(String palabra) {
        if (diccsinonimos.containsKey(palabra)) {
            int posicion = (int)(Math.random()*diccsinonimos.get(palabra).size());
            System.out.println("Un sinonimo de " + palabra + ": " + diccsinonimos.get(palabra).get(posicion));
        } else {
            System.out.println("AVISO: No está en el diccionario.");
        }
    }
}


