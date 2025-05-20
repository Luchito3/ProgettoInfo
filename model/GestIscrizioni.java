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

    public GestIscrizioni(GestIscrizioni other) {
        this.iscrizioni = new ArrayList<>(other.getIscrizioni());
    }

    public void addIscrizione(Appello a, Studente s) {
        iscrizioni.add(new SimpleEntry<>(a.getIdAppello(), s.getMatricola()));
        a.addIsc(s);
    }

    public void addIscrizione(SimpleEntry<String, String> s) {
        iscrizioni.add(new SimpleEntry<>(s.getKey(), s.getValue()));
    }

    public boolean removeIscrizione(String idAppello, String matricola) {
        for (int i = 0; i < iscrizioni.size(); i++) {
            SimpleEntry<String, String> e = iscrizioni.get(i);
            if (e.getKey().equals(idAppello) && e.getValue().equals(matricola)) {
                iscrizioni.remove(i);
                return true;
            }
        }
        return false;
    }
    
public boolean removeIscrizione(SimpleEntry<String, String> s) {
    for (int i = 0; i < iscrizioni.size(); i++) {
        SimpleEntry<String, String> e = iscrizioni.get(i);
        if (e.getKey().equals(s.getKey()) && e.getValue().equals(s.getValue())) {
            iscrizioni.remove(i);
            return true;
        }
    }
    return false;
}

    public boolean replaceIscrizione(SimpleEntry<String, String> vecchia, SimpleEntry<String, String> nuova) {
        for (int i = 0; i < iscrizioni.size(); i++) {
            SimpleEntry<String, String> iscr = iscrizioni.get(i);
            if (iscr.getKey().equals(vecchia.getKey()) && iscr.getValue().equals(vecchia.getValue())) {
                iscrizioni.set(i, nuova);
                return true;
            }
        }
        return false;
    }

    public SimpleEntry<String, String> cercaIscrizione(String s, String s1) {
        for (SimpleEntry<String, String> e : iscrizioni) {
            if (e.getKey().equals(s) && e.getValue().equals(s1)) {

                return e;
            }
        }
        return null;
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

    public boolean containsIscrizione(SimpleEntry<String, String> pair) {
        for (int i = 0; i < iscrizioni.size(); i++) {
            SimpleEntry<String, String> current = iscrizioni.get(i);
            if (current.getKey().equals(pair.getKey())
                    && current.getValue().equals(pair.getValue())) {
                return true;
            }
        }
        return false;
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
