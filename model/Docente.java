/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leporatil
 */
public class Docente {
    
    private String nome, cognome;
    private Disciplina disc;

    public Docente(String nome, String cognome, Disciplina disc) {
        this.nome = nome;
        this.cognome = cognome;
        this.disc = disc;
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

    public Disciplina getDisc() {
        return disc;
    }

    public void setDisc(Disciplina disc) {
        this.disc = disc;
    }
    
    
    
    
    
}
