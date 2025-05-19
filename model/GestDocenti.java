/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class GestDocenti {

    private ArrayList<Docente> listaDocenti;

    public GestDocenti() {
        this.listaDocenti = new ArrayList<>();
    }

    public GestDocenti(ArrayList<Docente> listaDocenti) {
        this.listaDocenti = listaDocenti;
    }

    public GestDocenti(GestDocenti g) {
        this.listaDocenti = g.getListaDocenti();

    }

    public void addDocente(Docente docente) {
        listaDocenti.add(docente);
    }

    public Docente cercaDocente(String matricola) {
        for (Docente d : listaDocenti) {
            if (d.getMatricola().equalsIgnoreCase(matricola)) {
                return d;
            }
        }
        return null; // non trovato
    }

    public ArrayList<Docente> getListaDocenti() {
        return listaDocenti;
    }

    @Override
    public String toString() {
        String s = "";
        s += "matricolaDocente;nome;cognome;codiceDisciplina\n";

        for (Docente i : listaDocenti) {

            s += i + "\n";

        }

        return s;
    }
}
