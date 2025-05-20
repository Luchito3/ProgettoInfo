/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import model.*;

/**
 *
 * @author leporatil
 */
public class GestoreGenerale {

    
    private static GestoreGenerale instance;

    public final GestStudenti gestStudenti;
    public final GestDocenti gestDocenti;
    public final GestDiscipline gestDiscipline;
    public final GestCorsi gestCorsi;
    public final GestAppelli gestAppelli;
    public final GestIscrizioni gestIscrizioni;
   
    private GestoreGenerale() {
    gestCorsi = new GestCorsi(GestoreFile.leggiCorsiCSV());
    gestStudenti = new GestStudenti(GestoreFile.leggiStudentiCSV(gestCorsi));
    gestDiscipline = new GestDiscipline(GestoreFile.leggiDisciplineCSV(gestCorsi));
    gestDocenti = new GestDocenti(GestoreFile.leggiDocentiCSV(gestDiscipline));
    gestAppelli = new GestAppelli(GestoreFile.leggiAppelliCSV(gestDiscipline));
    gestIscrizioni = new GestIscrizioni(GestoreFile.leggiIscrizioniCSV(gestStudenti, gestAppelli));
    }

    public static GestoreGenerale getInstance() {
        if (instance == null) {
            instance = new GestoreGenerale();
        }
        return instance;
    }
}