/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inout;

/**
 *
 * @author enrico
 */
public class Classe {

    private int annoClasse;
    private char sezione;
    private String articolazione;

    /**
     * getter e setter degli attributi della classe "Classe"
     *
     * @return
     */
    public int getAnnoClasse() {
        return annoClasse;
    }

    public void setAnnoClasse(int annoClasse) {
        this.annoClasse = annoClasse;
    }

    public char getSezione() {
        return sezione;
    }

    public void setSezione(char sezione) {
        this.sezione = sezione;
    }

    public String getArticolazione() {
        return articolazione;
    }

    public void setArticolazione(String articolazione) {
        this.articolazione = articolazione;
    }

    /**
     * costruttore di default della classe "Classe"
     */
    public Classe() {
        this.setAnnoClasse(0);
        this.setArticolazione("");
        this.setSezione(' ');
    }

    /**
     * costruttore con parametri della classe "Classe"
     *
     * @param classe
     * @param articolazione
     * @param sezione
     */
    public Classe(int classe, String articolazione, char sezione) {
        this.setAnnoClasse(classe);
        this.setArticolazione(articolazione);
        this.setSezione(sezione);
    }

    /**
     * metodo equals della classe "Classe"
     *
     * @param clas
     * @return
     */
    public boolean equals(Classe clas) {
        if (this.getAnnoClasse() == clas.getAnnoClasse() && this.getSezione() == clas.getSezione() && this.getArticolazione().equals(clas.getArticolazione())) {
            return true;
        }
        return false;
    }

}
