/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leporatil
 */

import java.util.ArrayList;

public class GestStudenti {
    private ArrayList<Studente> studenti;

    public GestStudenti() {
        this.studenti = new ArrayList();
    }
    
        public GestStudenti(GestStudenti gs) {
        this.studenti = gs.getStudenti();
        
    }

    public GestStudenti(ArrayList<Studente> listaStudenti) {
        this.studenti = listaStudenti;
    }

    public void addStudente(Studente s) {
        studenti.add(s);
    }

    public Studente cercaStudente(String matricola) {
        for (Studente s : studenti) {
            if (s.getMatricola().equalsIgnoreCase(matricola)) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

     @Override
    public String toString() {
        String s="";
        s+= "matricolaStudente;nome;cognome;codiceCorso\n";
        
        for(Studente i : studenti){
            
            s+=i + "\n";
            
        }
        
        
        return s;
    }
    
    
}
