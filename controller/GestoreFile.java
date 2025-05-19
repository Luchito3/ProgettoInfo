/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.*;

/**
 *
 * @author leporatil
 */
public class GestoreFile {

    public static GestAppelli leggiAppelliCSV(GestDiscipline GD) {
        GestAppelli GA = new GestAppelli();
        String ch = ";";
        String filename = "appelli.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            // Salta la riga di intestazione
            br.readLine();

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue; // salta righe vuote
                }
                String[] tokens = line.split(ch);

                if (tokens.length >= 3) {
                    String codice = tokens[0];
                    String data = tokens[1];
                    String cdisc = tokens[2];

                    Disciplina disc = GD.cercaDisciplina(cdisc);

                    Appello a = new Appello(data, codice, disc);
                    GA.addAppello(a);
                }
            }

        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file: " + e.getMessage());
        }

        return GA;

    }
//docs

    public static GestDocenti leggiDocentiCSV(GestDiscipline GDisc) {
        GestDocenti GD = new GestDocenti();
        String ch = ";";
        String filename = "docenti.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            // Salta la riga di intestazione
            br.readLine();

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue; // salta righe vuote
                }
                String[] tokens = line.split(ch);

                if (tokens.length >= 4) {
                    String matricola = tokens[0];
                    String nome = tokens[1];
                    String cognome = tokens[2];

                    String cdisc = tokens[3];

                    Disciplina disc = GDisc.cercaDisciplina(cdisc);

                    Docente d = new Docente(matricola, nome, cognome, disc);
                    GD.addDocente(d);
                }
            }

        } catch (IOException e) {
            System.err.println("Errore: " + e.getMessage());
        }

        return GD;

    }

    //corsi
    public static GestCorsi leggiCorsiCSV() {
        GestCorsi GD = new GestCorsi();
        String ch = ";";
        String filename = "corsi.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            // Salta la riga di intestazione
            br.readLine();

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue; // salta righe vuote
                }
                String[] tokens = line.split(ch);

                if (tokens.length >= 3) {
                    String codice = tokens[0];
                    String nome = tokens[1];
                    int durata = Integer.parseInt(tokens[2]);

                    Corso d = new Corso(codice, nome, durata);
                    GD.addCorso(d);
                }
            }

        } catch (IOException e) {
            System.err.println("Errore: " + e.getMessage());
        }

        return GD;

    }

    public static GestDiscipline leggiDisciplineCSV(GestCorsi GC) {
        GestDiscipline GD = new GestDiscipline();
        String ch = ";";
        String filename = "discipline.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            // Salta la riga di intestazione
            br.readLine();

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue; // salta righe vuote
                }
                String[] tokens = line.split(ch);

                if (tokens.length >= 4) {
                    String codice = tokens[0];
                    String nome = tokens[1];
                    int cfu = Integer.parseInt(tokens[2]);

                    String codCorso = tokens[3];

                    Disciplina d = new Disciplina(codice, nome, cfu);

                    Corso c = GC.cercaCorso(codCorso);

                    if (c != null) {
                        GD.addDisciplina(d, c);
                    } else {
                        System.err.println("Corso non trovato per codice: " + codCorso);
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Errore: " + e.getMessage());
        }

        return GD;

    }

    public static GestStudenti leggiStudentiCSV(GestCorsi GC) {
        GestStudenti GS = new GestStudenti();
        String ch = ";";
        String filename = "studenti.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;

            // Salta la riga di intestazione
            br.readLine();

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue; // salta righe vuote
                }
                String[] tokens = line.split(ch);

                if (tokens.length >= 4) {
                    String matricola = tokens[0];
                    String nome = tokens[1];
                    String cognome = tokens[2];
                    String codiceCorso = tokens[3];

                    Corso c = GC.cercaCorso(codiceCorso);
                    Studente s = new Studente(matricola, nome, cognome, c);
                    GS.addStudente(s);
                }
            }

        } catch (IOException e) {
            System.err.println("Errore: " + e.getMessage());
        }

        return GS;

    }

    public static void scriviAppelli(GestAppelli GA) {
        
        String filename="appelli.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            
        
            writer.write(GA.toString());

        } catch (IOException e) {

            System.err.println("Errore: " + e.getMessage());
        }

    }

}
