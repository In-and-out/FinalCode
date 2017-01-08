/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inout;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author f.bonetti
 */
public class Html {

    private File template;
    private String finale;
    public Circolare dati;

    public Html(Circolare dati) throws IOException {
        template = new File("src/template/template.html");
        finale = new String(Files.readAllBytes(template.toPath()));
        this.dati = new Circolare(dati);
    }

    public File getTemplate() {
        return template;
    }

    public void setTemplate(File template) {
        this.template = template;
    }

    public String getFinale() {
        return finale;
    }

    public void setFinale(String finale) {
        this.finale = finale;
    }

    public Circolare getDati() {
        return dati;
    }

    public void setDati(Circolare dati) {
        this.dati = dati;
    }

    public void sostituisciData() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.now();
        finale = finale.replace("$dataCorrente", dtf.format(localDate));
        finale = finale.replace("$dataCircolare", dati.getData().toString());
    }

    public void sostituisciNumero() {
        finale = finale.replace("$numeroCircolare", Integer.toString(dati.getNumeroCircolare()));
    }

    public void sostituisciClasse() {
        finale = finale.replace("$classe", Integer.toString(dati.getClasse().getAnnoClasse())
                + dati.getClasse().getSezione());
    }

    public void sostituisciMotivo() {
        finale = finale.replace("$motivazione", dati.getMotivazione());
    }

    public void sostituisciOre() {
        finale = finale.replace("$ore", Integer.toString(dati.getData().getHh()));
    }

    public void sostituisciTipo() {
        if (dati.getTipo() == 'E' || dati.getTipo() == 'e') {
            finale = finale.replace("$tipo", "Entrata");
        } else if (dati.getTipo() == 'U' || dati.getTipo() == 'u') {
            finale = finale.replace("$tipo", "Uscita");
        }
    }

    public void creaFile(String nome) {
        File risultato = new File("src/fineDati/" + nome + ".html");
        try {
            FileWriter fw = new FileWriter(risultato);
            fw.write(finale);
            fw.close();
        } catch (IOException exception) {
        }
    }

    public static void main(String[] args) throws IOException {
        Classe classe = new Classe(4, "cipollania", 'f');
        Data data = new Data(12, 05, 2016, 13);
        Circolare test = new Circolare(classe, 'e', data, "mi piacciono i piedi", "nah m8", 3954);
        Html grigio = new Html(test);

        grigio.sostituisciClasse();
        grigio.sostituisciData();
        grigio.sostituisciMotivo();
        grigio.sostituisciNumero();
        grigio.sostituisciOre();
        grigio.sostituisciTipo();

        grigio.creaFile("joy");

    }
}
