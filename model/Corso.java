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
public class Corso {

    private String codice;
    private String nome;
    private int durata;
    private ArrayList<Disciplina> discipline = new ArrayList();

    public Corso(String codice, String nome, int durata) {
        this.codice = codice;
        this.nome = nome;
        this.durata = durata;
    }
    
      public Corso(String codice, String nome, int durata, ArrayList<Disciplina> discipline) {
        this.codice = codice;
        this.nome = nome;
        this.durata = durata;
        this.discipline = discipline;
    }
    
    public void addDisciplina(String codice, String nome, int cfu){
        Disciplina d = new Disciplina(codice, nome, cfu);
        discipline.add(d);
        d.setCorso(this);
    }
    
        public void addDisciplina(Disciplina d){
        discipline.add(d);
        d.setCorso(this);
    }
    
    
    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Corso{" + "codice=" + codice + ", nome=" + nome + ", durata=" + durata + '}';
    }
    
    

}
