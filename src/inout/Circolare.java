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
public class Circolare {

    private Classe classe;
    private char tipo;
    private Data data;
    private String motivazione;
    private String annotazioni;
    private int numeroCircolare;

    /**
     * getter e setter della classe circolare
     *
     * @return
     */
    public Classe getClasse() {
        return classe;
    }

    private void setClasse(Classe classe) {
        this.classe = classe;
    }

    public char getTipo() {
        return tipo;
    }

    private void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public Data getData() {
        return data;
    }

    private void setData(Data data) {
        this.data = data;
    }

    public String getMotivazione() {
        return motivazione;
    }

    private void setMotivazione(String motivazione) {
        this.motivazione = motivazione;
    }

    public String getAnnotazioni() {
        return annotazioni;
    }

    private void setAnnotazioni(String annotazioni) {
        this.annotazioni = annotazioni;
    }

    public int getNumeroCircolare() {
        return numeroCircolare;
    }

    private void setNumeroCircolare(int numeroCircolare) {
        this.numeroCircolare = numeroCircolare;
    }

    /**
     * costruttore di default della classe circolare
     */
    public Circolare() {
        this.setClasse(new Classe());
        this.setTipo(' ');
        this.setData(new Data());
        this.setMotivazione("");
        this.setAnnotazioni("");
        this.setNumeroCircolare(0);
    }

    /**
     * costruttore con parametri della classe circolare
     *
     * @param clas
     * @param tipo
     * @param data
     * @param motivazione
     * @param annotazioni
     * @param numeroCircolare
     */
    public Circolare(Classe clas, char tipo, Data data, String motivazione, String annotazioni, int numeroCircolare) {
        this.setClasse(clas);
        this.setTipo(tipo);
        this.setData(data);
        this.setMotivazione(motivazione);
        this.setAnnotazioni(annotazioni);
        this.setNumeroCircolare(numeroCircolare);
    }

    /**
     * costruttore di copia della classe circolare
     *
     * @param circolare
     */
    public Circolare(Circolare circolare) {
        this.setClasse(circolare.getClasse());
        this.setTipo(circolare.getTipo());
        this.setData(circolare.getData());
        this.setMotivazione(circolare.getMotivazione());
        this.setAnnotazioni(circolare.getAnnotazioni());
        this.setNumeroCircolare(circolare.getNumeroCircolare());
    }

    /**
     * metodo per modificare una circolare se i parametri all'interno della
     * circolare non sono vuoti
     *
     * @param clas
     * @param tipo
     * @param data
     * @param motivazione
     * @param annotazioni
     */
    public void modificaCircolare(Classe clas, char tipo, Data data, String motivazione, String annotazioni) {
        if (clas != null) {
            this.setClasse(clas);
        }
        if (data != null) {
            this.setData(data);
        }
        if (!motivazione.equals(null)) {
            this.setMotivazione(motivazione);
        }
        if (!annotazioni.equals(null)) {
            this.setAnnotazioni(annotazioni);
        }
        if (tipo != ' ') {
            this.setTipo(tipo);
        }

    }

    /**
     * metodo equals della classe circolare
     *
     * @param circolare
     * @return
     */
    public boolean equals(Circolare circolare) {
        if (this.getTipo() != circolare.getTipo()) {
            return false;
        }
        if (!this.getMotivazione().equals(circolare.getMotivazione())) {
            return false;
        }
        if (!this.getData().equals(circolare.getData())) {
            return false;
        }
        if (!this.getAnnotazioni().equals(circolare.getAnnotazioni())) {
            return false;
        }
        if (!this.getClasse().equals(circolare.getClasse())) {
            return false;
        }
        return this.getNumeroCircolare() == circolare.getNumeroCircolare();
    }

    //Lo avrei fatto a mano ma non ci tengo molto al fatto che funzioni bene, voglio solo vedere se stampa la prova -
    public String toString() {
        return "Circolare{" + "classe=" + classe + ", tipo=" + tipo + ", data=" + data + ", motivazione=" + motivazione + ", annotazioni=" + annotazioni + ", numeroCircolare=" + numeroCircolare + '}';
    }
}
