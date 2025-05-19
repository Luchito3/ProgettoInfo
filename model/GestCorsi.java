/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author leporatil
 */
public class GestCorsi {

    private ArrayList<Corso> corsi = new ArrayList();
    
    

    public void addCorso(Corso c) {

        corsi.add(c);

    }

    public void addCorso(String codice, String nome, int durata) {

        Corso c = new Corso(codice, nome, durata);

        corsi.add(c);

    }

    
    public void editCorso(int i, String codice, String nome, int durata) {

        Corso c = new Corso(codice, nome, durata);

        corsi.set(i, c);

    }

    public void editCorso(int i, Corso c) {

        corsi.set(i, c);

    }
    
    public void removeCorso(int i){
        corsi.remove(i);
    }
             
    
    

    public ArrayList<Corso> getCorsi() {
        return corsi;
    }

    public Corso getCorso(int i) {

        return corsi.get(i);

    }

    public void setCorsi(ArrayList<Corso> corsi) {
        this.corsi = corsi;
    }

}
