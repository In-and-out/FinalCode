/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inout;

/**
 *
 * @author Matteo Gagliardi
 */
/**
 * Attributi dell'array che contiene tutte le circolari.
 *
 * @author m.gagliardi
 */
public class archivioCircolari {

    private Circolare[] arrayCircolari;
    private int MAX_ARRAY;
    private int dim;

    /**
     * costruttore di deafult dell'array di circolari con dimensione
     * prestabilita
     */
    public archivioCircolari() {
        MAX_ARRAY = 100000;
        arrayCircolari = new Circolare[MAX_ARRAY];
    }

    /**
     * costruttore con parametri dell'array di circolari con dimensione
     * variabile
     *
     * @param dimensione
     */
    public archivioCircolari(int dimensione) {
        MAX_ARRAY = dimensione;
        arrayCircolari = new Circolare[MAX_ARRAY];
    }

    /**
     * metodo per aggiungere una circolare nella prima posizione dell'array
     * vuota
     *
     * @param circ
     * @return
     */
    public boolean aggiungiCircolare(Circolare circ) {
        for (int i = 0; i < MAX_ARRAY; i++) {
            if (arrayCircolari[i] == null) {
                arrayCircolari[i] = new Circolare(circ);
                this.setDim(this.getDim() + 1);
                return true;
            }
        }
        return false;
    }

    /**
     * metodo di ricerca di una circolare data un tipo di dato "Data"
     *
     * @param data
     * @return
     */
    public Circolare[] ricercaCircolare(Data data) {
        Circolare[] a;
        a = new Circolare[MAX_ARRAY];
        int j = 0;
        for (int i = 0; i < arrayCircolari.length - 1; i++) {
            if (arrayCircolari[i].getData().equals(data)) {
                a[j++] = new Circolare(arrayCircolari[i]);
            }
        }
        return a;
    }

    /**
     * metodo di ricerca di una circolare data un tipo di dato char che indica
     * se una circolare è di entrata o di uscita
     *
     * @param tipo
     * @return
     */
    public Circolare[] ricercaCircolare(char tipo) {
        Circolare[] a;
        a = new Circolare[MAX_ARRAY];
        int j = 0;
        for (int i = 0; i < arrayCircolari.length - 1; i++) {
            if (arrayCircolari[i].getTipo() == tipo) {
                a[j++] = new Circolare(arrayCircolari[i]);
            }
        }
        return a;
    }

    /**
     * metodo di ricerca di una circolare data un tipo di dato "Classe"
     *
     * @return
     */
    public Circolare[] ricercaCircolare(Classe classe) {
        Circolare[] a;
        a = new Circolare[MAX_ARRAY];
        int j = 0;
        for (int i = 0; i < arrayCircolari.length - 1; i++) {
            if (arrayCircolari[i].getClasse().equals(classe)) {
                a[j++] = new Circolare(arrayCircolari[i]);
            }
        }
        return a;
    }

    /**
     * metodo di ricerca di una circolare data un tipo di dato "Circolare"
     */
    public Circolare[] ricercaCircolare(Circolare circolare) {
        Circolare[] a;
        a = new Circolare[MAX_ARRAY];
        int j = 0;
        for (int i = 0; i < arrayCircolari.length - 1; i++) {
            if (arrayCircolari[i].equals(circolare)) {
                a[j++] = new Circolare(arrayCircolari[i]);
            }
        }
        return a;
    }

    public void modificaCircolare(int i, Classe clas, char tipo, Data data, String motivazione, String annotazioni, int numero) {
        if (arrayCircolari[i] != null) {
            arrayCircolari[i].modificaCircolare(clas, tipo, data, motivazione, annotazioni, numero);
        }

    }

    /**
     * metodo per l'eliminazione della circolare data una
     *
     * @param pos
     * @return
     */
    public void eliminaCircolare(int pos) {
        if (arrayCircolari[pos] != null)
            arrayCircolari[pos]=null;
    }

    public Circolare[] getArrayCircolari() {
        return arrayCircolari;
    }

    public int getLenght() {
        return dim;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public Circolare getCircolare(int i) {
        return arrayCircolari[i];
    }
}
