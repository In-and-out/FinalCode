/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inout;

import java.text.SimpleDateFormat;

/**
 *
 * @author Matteo Gagliardi
 */
public class archivioCircolari {
    private Circolare [] arrayCircolari;
    private int MAX_ARRAY;
    
    public Circolare[] ricercaCircolare(SimpleDateFormat data){
        Circolare [] a;
        a = new Circolare[MAX_ARRAY];
        int j=0;
        for(int i=0;i<arrayCircolari.length-1;i++)
        {
            if(arrayCircolari[i].getData == data)
                a[j++]=new Circolare(arrayCircolari[i]);   
        }
        return a;
    }
    public Circolare[] ricercaCircolare(char tipo){
        Circolare [] a;
        a = new Circolare[MAX_ARRAY];
        int j=0;
        for(int i=0;i<arrayCircolari.length-1;i++)
        {
            if(arrayCircolari[i].getTipo == tipo)
                a[j++]=new Circolare(arrayCircolari[i]);   
        }
        return a;
    }
    public Circolare[] ricercaCircolare(Classe classe){
        Circolare [] a;
        a = new Circolare[MAX_ARRAY];
        int j=0;
        for(int i=0;i<arrayCircolari.length-1;i++)
        {
            if(arrayCircolari[i].getClasse == classe)
                a[j++]=new Circolare(arrayCircolari[i]);   
        }
        return a;
    }
    public Circolare[] ricercaCircolare(Circolare circolare){
        Circolare[] a;
        a=new Circolare[MAX_ARRAY];
        int j=0;
        for(int i=0;i<arrayCircolari.length-1;i++)
        {
            if(arrayCircolari[i].equals(circolare))
                a[j++]=new Circolare(arrayCircolari[i]);                
        }
        return a;
    }
    public boolean eliminaCircolare(int pos){
        if(arrayCircolari[pos]==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
