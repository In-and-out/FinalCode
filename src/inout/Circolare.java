/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inout;

import java.text.SimpleDateFormat;
/**
 *
 * @author enrico
 */
public class Circolare {
    private Classe classe;
    private char tipo;
    private SimpleDateFormat data;
    private String motivazione;
    private String annotazioni;
    char getTipo;
    Classe getClasse;
    SimpleDateFormat getData;

    public Classe getClasse() {
        return classe;
    }
    private void setClasse(Classe classe) {
        this.classe = classe;
    }
    public char getTipo(){
        return tipo;
    }
    private void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public SimpleDateFormat getData() {
        return data;
    }
    private void setData(SimpleDateFormat data) {
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
    
    public Circolare(){
        this.setClasse(new Classe());
        this.setTipo(' ');
        this.setData(new SimpleDateFormat());
        this.setMotivazione("");
        this.setAnnotazioni("");
    }
    public Circolare(Classe clas, char tipo, SimpleDateFormat data, String motivazione, String annotazioni){
        this.setClasse(clas);
        this.setTipo(tipo);
        this.setData(data);
        this.setMotivazione(motivazione);
        this.setAnnotazioni(annotazioni);
    }
    public Circolare(Circolare circolare){
        this.setClasse(circolare.getClasse());
        this.setTipo(circolare.getTipo());
        this.setData(circolare.getData());
        this.setMotivazione(circolare.getMotivazione());
        this.setAnnotazioni(circolare.getAnnotazioni());
    }
    
    
    public void modificaMotivazione(String motivazione){
        this.setMotivazione(motivazione);
    }
    public void modificaAnnotazioni(String annotazione){
        this.setAnnotazioni(annotazioni);
    }
    public void modificaCircolare(Classe clas, char tipo, SimpleDateFormat data, String motivazione, String annotazioni){
        if(clas==null)
        {
            setClasse(classe);
        }
        if(data==null)
        {
            setData(data);
        }
        if(motivazione.equals(null))
        {
            setMotivazione(motivazione);
        }
        if(annotazioni.equals(null))
        {
            setAnnotazioni(annotazioni);
        }
        if(tipo == ' ')
        {
            setTipo(tipo);
        }
        
    }

    public boolean equals(Circolare circolare) {
        if(this.getTipo()!=circolare.getTipo())
            return false;
        if(!this.getMotivazione().equals(circolare.getMotivazione()))
            return false;
        if(this.getData()!=circolare.getData())
            return false;
        if(!this.getAnnotazioni().equals(circolare.getAnnotazioni()))
            return false;
        if(!this.getClasse().equals(circolare.getClasse()))
            return false;
        return true;
    }
    
    
}
