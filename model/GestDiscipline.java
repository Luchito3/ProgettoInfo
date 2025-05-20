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
public class GestDiscipline {

    private ArrayList<Disciplina> discipline = new ArrayList();

    public void addDisciplina(String codice, String nome, int cfu, Corso c) {
        Disciplina d = new Disciplina(codice, nome, cfu);
        d.setCorso(c);
        discipline.add(d);
    }

    public void addDisciplina(Disciplina d, Corso c) {

        d.setCorso(c);
        discipline.add(d);
    }

    public GestDiscipline() {
    }

    public GestDiscipline(GestDiscipline gd) {

        this.discipline = gd.getDiscipline();

    }

    public void editDisciplina(int i, String codice, String nome, int cfu, Corso c) {

        Disciplina d = new Disciplina(codice, nome, cfu);
        d.setCorso(c);
        discipline.set(i, d);

    }

    public Disciplina cercaDisciplina(String c) {

        for (Disciplina i : discipline) {

            if (i.getCodice().equals(c)) {

                return i;

            }

        }

        return null;
    }

    public ArrayList<Disciplina> cercaDisciplinaPerCorso(String c) {
        ArrayList<Disciplina> d = new ArrayList();
        for (Disciplina i : discipline) {

            if (i.getCorso().getCodice().equals(c)) {

                d.add(i);

            }

        }

        return d;
    }

    public void removeCorso(int i) {

        discipline.remove(i);
    }

    public void rimuoviDisciplina(String codice) {
        for (int i = 0; i < discipline.size(); i++) {
            if (discipline.get(i).getCodice().equalsIgnoreCase(codice)) {
                discipline.remove(i);
                break;
            }
        }

    }

    public ArrayList<Disciplina> getDiscipline() {
        return discipline;
    }

    @Override
    public String toString() {
        String s = "";
        s += "codiceDisciplina;nomeDisciplina;cfu;codiceCorso\n";

        for (Disciplina i : discipline) {

            s += i + "\n";

        }

        return s;
    }

}
