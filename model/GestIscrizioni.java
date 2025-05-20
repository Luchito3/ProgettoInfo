/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.AbstractMap.SimpleEntry;


/**
 *
 * @author leporatil
 */

public class GestIscrizioni {

    private ArrayList<SimpleEntry<String, String>> iscrizioni;

    public GestIscrizioni() {
        iscrizioni = new ArrayList<>();
    }

    public GestIscrizioni(ArrayList<SimpleEntry<String, String>> list) {
        this.iscrizioni = list;
    }

    public GestIscrizioni(GestIscrizioni other) {
        this.iscrizioni = new ArrayList<>(other.getIscrizioni());
    }

    public void addIscrizione(Appello a, Studente s) {
        iscrizioni.add(new SimpleEntry<>(a.getIdAppello(), s.getMatricola()));
        a.addIsc(s);
    }

    public boolean removeIscrizione(String idAppello, String matricola) {
        return iscrizioni.removeIf(e -> e.getKey().equals(idAppello) && e.getValue().equals(matricola));
    }

    public boolean containsIscrizione(String idAppello, String matricola) {
        for (SimpleEntry<String, String> e : iscrizioni) {
            if (e.getKey().equals(idAppello) && e.getValue().equals(matricola)) {
                return true;
            }
        }
        return false;
    }
    
     public boolean isAttivo(String idAppello) {
    for (SimpleEntry<String, String> e : iscrizioni) {
        if (e.getKey().equalsIgnoreCase(idAppello)) {
            return true; 
        }
    }
    return false;
}
    
    
    public boolean isIscritto(String matricola) {
    for (SimpleEntry<String, String> e : iscrizioni) {
        if (e.getValue().equalsIgnoreCase(matricola)) {
            return true; 
        }
    }
    return false;
}

    public ArrayList<SimpleEntry<String, String>> getIscrizioni() {
        return iscrizioni;
    }

    public void setIscrizioni(ArrayList<SimpleEntry<String, String>> iscrizioni) {
        this.iscrizioni = iscrizioni;
    }

    @Override
    public String toString() {
        String s = "idAppello;matricolaStudente\n";
        for (SimpleEntry<String, String> iscrizione : iscrizioni) {
            s += iscrizione.getKey() + ";" + iscrizione.getValue() + "\n";
        }
        return s;
    }
}

