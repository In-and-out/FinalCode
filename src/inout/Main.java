/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inout;

/**
 *
 * @author n.de pascalis
 */
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    //Avevo molto tempo libero, questo è sempre solo per l'esempio, e mi servivano delle stringhe a caso
    public static String generateRandomChars(String candidateChars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {

//Esempio di funzionamento con valori casuali
        Random r = new Random();
        List<String> list = new ArrayList();

        for (int i = 0; i < 100; i++) {
            list.add(Integer.toString(r.nextInt(i + 1)));
        }

        String csvFile = "abc.csv";
        try (FileWriter writer = new FileWriter(csvFile)) {
            CSV.writeLine(writer, list, '\n');
            writer.flush();
            writer.close();
        }

        //Esempio di aggiunta dati della classe usando un archivio
        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtsuvwxyz"; //random chars for the funzies

        Circolare circ = new Circolare();
        Classe shish = new Classe();
        Data data = new Data();

        archivioCircolari archivio = new archivioCircolari(100);

        for (int i = 0; i < 100; i++) //sarebbe simpatico avere direttamente un get dell'array però non lo avete quindi rip enhanced for loop :C
        {
            shish.setAnnoClasse(1 + r.nextInt(4));
            shish.setArticolazione(generateRandomChars(candidateChars, 1));
            shish.setSezione(candidateChars.charAt(r.nextInt(candidateChars.length() / 2)));

            if (r.nextInt(1) == 1) {
                circ.modificaCircolare(shish, 'u', data, generateRandomChars(candidateChars, 10), generateRandomChars(candidateChars, 10), r.nextInt());
            } else {
                circ.modificaCircolare(shish, 'e', data, generateRandomChars(candidateChars, 10), generateRandomChars(candidateChars, 10), r.nextInt());
            }
            archivio.aggiungiCircolare(circ);
        }

        List<String> list2 = new ArrayList();

        for (Circolare giacomo : archivio.getArrayCircolari()) {
            list2.add(giacomo.toString());
        }

        String csvFile2 = "def.csv";
        try (FileWriter writer = new FileWriter(csvFile2)) {
            CSV.writeLine(writer, list2, '\n', '☺');
            writer.flush();
            writer.close();
        }
    }
}
