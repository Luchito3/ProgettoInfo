/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author leporatil
 */
public class Disciplina {

    private String codice;
    private String nome;
    private int cfu;
    private Corso corso;

    public Disciplina(String codice, String nome, int cfu) {
        this.codice = codice;
        this.nome = nome;
        this.cfu = cfu;
    }
    
    
    
    public Disciplina(String codice, String nome, int cfu, Corso c) {
        this.codice = codice;
        this.nome = nome;
        this.cfu = cfu;
        this.corso = c;
    }

    public Corso getCorso() {
        return corso;
    }

    public void setCorso(Corso corso) {
        this.corso = corso;
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

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }
    //real
    public boolean equals(Disciplina d) {
 
        return (this.codice.equals(d.codice));
    }
    
    public void setAll(Disciplina other){
        
         this.codice = other.codice;
        this.nome = other.nome;
        this.cfu = other.cfu;
        this.corso = other.corso;
    }
    

    @Override
    public String toString() {
        return codice +";" + nome+";"+cfu+";"+corso.getCodice() ;
    }
    
    

}
