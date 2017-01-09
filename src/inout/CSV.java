/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inout;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 *
 * @author n.de pascalis
 */
public class CSV {

    private static final char SEPARATORE_BASE = ',';

    public static void writeLine(Writer w, List<String> valori) throws IOException {
        writeLine(w, valori, SEPARATORE_BASE, ' ');
    }

    public static void writeLine(Writer w, List<String> valori, char separatore)
            throws IOException {
        writeLine(w, valori, separatore, ' ');
    }

    public static void writeLine(Writer w, List<String> valori, char separatore, char quota)
            throws IOException {

        boolean primoValore = true;

        if (separatore == ' ') {
            separatore = SEPARATORE_BASE;
        }

        StringBuilder sb = new StringBuilder();
        for (String valore : valori) {
            if (!primoValore) {
                sb.append(separatore);
            }
            if (quota == ' ') {
                sb.append(aggiustaVirgolette(valore));
            } else {
                sb.append(quota).append(aggiustaVirgolette(valore)).append(quota);
            }
            primoValore = false;
        }
        sb.append("\n");
        w.append(sb.toString());
    }

    private static String aggiustaVirgolette(String valoreIniziale) {
        String valoreFinale = valoreIniziale;
        if (valoreFinale.contains("\"")) {
            valoreFinale = valoreFinale.replace("\"", "\"\"");
        }
        return valoreFinale;
    }
    
    

}
