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
public class Appello {
    private String data;
    private String idAppello;
    private Disciplina disc;
    private Docente prof; 
    ArrayList <Studente> alunniIsc = new ArrayList();

    public String getIdAppello() {
        return idAppello;
    }

    public void setIdAppello(String idAppello) {
        this.idAppello = idAppello;
    }

    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Disciplina getDisc() {
        return disc;
    }

    public void setDisc(Disciplina disc) {
        this.disc = disc;
    }

    public Docente getProf() {
        return prof;
    }

    public void setProf(Docente prof) {
        this.prof = prof;
    }

    public ArrayList<Studente> getAlunniIsc() {
        return alunniIsc;
    }

    public void setAlunniIsc(ArrayList<Studente> alunniIsc) {
        this.alunniIsc = alunniIsc;
    }
    
    
    
    }
