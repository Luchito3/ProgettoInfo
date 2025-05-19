/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leporatil
 */

public class Studente {
    private String matricola;
    private String nome;
    private String cognome;
    private Corso corso;

    public Studente(String matricola, String nome, String cognome, Corso corso) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.corso = corso;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Corso getCorso() {
        return corso;
    }

    public void setCorso(Corso corso) {
        this.corso = corso;
    }

    @Override
    public String toString() {
        return matricola + ";"+nome+";"+cognome+";"+corso.getCodice();
    }
    
    
}

