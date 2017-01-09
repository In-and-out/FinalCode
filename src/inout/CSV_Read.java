/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inout;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSV_Read {

    public void carica(){        
        String csvFile = "def.csv";
        String line = "";
        String cvsSplitBy = ";";
        String cvsSplitBy2 = ":";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                String[] dat = country[4].split(cvsSplitBy2);
                Classe clas = new Classe(Integer.parseInt(country[0]), country[1].charAt(0), country[2]);
                Circolare circ = new Circolare(clas, country[1].charAt(0), new Data(Integer.parseInt(dat[0]),Integer.parseInt(dat[1]),Integer.parseInt(dat[2]),Integer.parseInt(dat[3])),country[5],country[6],Integer.parseInt(country[7]));
                Globale.archivio.aggiungiCircolare(circ);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public CSV_Read(){
    }
    
    public static void main(String[] args) { 
        CSV_Read cr=new CSV_Read();
        cr.carica();
    }

}
