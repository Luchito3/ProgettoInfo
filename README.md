#  Gestione Corsi Universitari - Progetto Java

##  Obiettivo

Realizzare un'applicazione Java con interfaccia grafica (GUI) sviluppata in **NetBeans**, che consenta di gestire:

- Corsi universitari  
- Studenti  
- Docenti  
- Discipline  
- Appelli d’esame  

I dati devono essere **persistenti** tramite file CSV.

---

##  Specifiche Funzionali

### Gestione dei Corsi

- Creazione, visualizzazione e modifica dei corsi universitari.  
- Ogni corso ha:
  - `codice`
  - `nome`
  - `durata` (in anni)

### Gestione delle Discipline

- Creazione e assegnazione di discipline a un corso.  
- Ogni disciplina ha:
  - `codice`
  - `nome`
  - `CFU`

### Gestione dei Docenti

- Inserimento, modifica e visualizzazione.  
- Ogni docente insegna **una sola disciplina**.  
- Dati richiesti:
  - `matricola docente`
  - `nome`
  - `cognome`
  - `disciplina insegnata`

### Gestione degli Studenti

- Registrazione e gestione degli studenti.  
- Ogni studente è iscritto **a un solo corso**.  
- Dati richiesti:
  - `matricola studente`
  - `nome`
  - `cognome`
  - `corso di iscrizione`

### Gestione degli Appelli d’Esame

- Creazione appelli per una disciplina di un corso.  
- Ogni appello ha:
  - `data esame`
  - `disciplina`
  - `docente`
  - `lista degli studenti iscritti`

### Iscrizione agli Appelli

- Gli studenti **possono iscriversi solo agli appelli delle discipline del proprio corso**.

---

##  Specifiche Tecniche

- **Linguaggio**: Java  
- **IDE**: NetBeans (uso di **Swing** per la GUI)  
- **Persistenza dati**: lettura/scrittura su **file CSV**  
- **Architettura consigliata**: MVC (Model-View-Controller)

---

##  Requisiti Tecnici

-  Schema UML delle classi  
-  Realizzazione delle classi necessarie  
-  Classe Gestore centrale (collegamento fra GUI e logica)

---

##  Requisiti Obbligatori

- Interfaccia grafica intuitiva:
  - Menù principale con sezioni per: Corsi, Discipline, Docenti, Studenti, Appelli
  - Finestra per inserimento/modifica dati
  - Tabelle per visualizzazione degli elenchi
- Validazione dei dati:
  - Es. uno studente non può iscriversi a un esame di un'altra facoltà
- Pulsante **Salva** per memorizzare modifiche nei file CSV
- Caricamento automatico dei dati all’avvio
