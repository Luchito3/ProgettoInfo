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
    private String nome, cognome;
    private Corso corso;

    public Studente(String nome, String cognome, Corso corso) {
        this.nome = nome;
        this.cognome = cognome;
        this.corso = corso;
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
    
    
    
}
