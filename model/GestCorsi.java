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

    public GestCorsi() {

    }

    public GestCorsi(GestCorsi other) {
        this.corsi = other.getCorsi();

    }

    public void addCorso(String codice, String nome, int durata) {

        Corso c = new Corso(codice, nome, durata);

        corsi.add(c);

    }

    public Corso cercaCorso(String cod) {
        for (Corso i : corsi) {
            if (i.getCodice().equals(cod)) {
                return i;
            }
        }
        return null;

    }
    
    public void estinguiDisciplina(Disciplina d){
        
        for(Corso c: corsi){
            
            c.rimuoviDisciplina(d);
            
        }
        
        
    }

    public void editCorso(int i, String codice, String nome, int durata) {

        Corso c = new Corso(codice, nome, durata);

        corsi.set(i, c);

    }

    public void editCorso(int i, Corso c) {

        corsi.set(i, c);

    }

    public void removeCorso(int i) {
        corsi.remove(i);
    }

    public ArrayList<Corso> getCorsi() {
        return corsi;
    }

    public Corso getCorso(int i) {

        return corsi.get(i);

    }

    public boolean removeCorso(String cod) {
        for (int i = 0; i < corsi.size(); i++) {
            if (corsi.get(i).getCodice().equals(cod)) {
                corsi.remove(i);
                return true;
            }
        }
        return false;
    }

    public void setCorsi(ArrayList<Corso> corsi) {
        this.corsi = corsi;
    }
      @Override
    public String toString() {
        String s="";
        s+= "codiceCorso;nomeCorso;durataAnni\n";
        
        for(Corso i : corsi){
            
            s+=i + "\n";
            
        }
        
        
        return s;
    }
}
