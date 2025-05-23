/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import Controller.GestoreFile;
import Controller.GestoreGenerale;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import model.Corso;
import model.Studente;

/**
 *
 * @author admin
 */
public class StudentiDialog extends javax.swing.JDialog {

    public StudentiDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inizializzaDati();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabellaDoc = new javax.swing.JTable();
        Matricolatx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nometx = new javax.swing.JTextField();
        Cognometx = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CDisctx = new javax.swing.JTextField();
        Aggiungibt = new javax.swing.JButton();
        Modificabt = new javax.swing.JButton();
        Rimuovibt = new javax.swing.JButton();
        modPan = new javax.swing.JPanel();
        oldMatric = new javax.swing.JTextField();
        confModif = new javax.swing.JButton();
        Annullabt = new javax.swing.JButton();
        remPan = new javax.swing.JPanel();
        matricRem = new javax.swing.JTextField();
        confRem = new javax.swing.JButton();
        AnnullabtR = new javax.swing.JButton();
        errLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Matricola");

        TabellaDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Matricola", "Nome", "Cognome", "CodCorso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TabellaDoc);

        Matricolatx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatricolatxActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        Nometx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NometxActionPerformed(evt);
            }
        });

        Cognometx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CognometxActionPerformed(evt);
            }
        });

        jLabel3.setText("Cognome");

        jLabel4.setText("CodCorso");

        CDisctx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDisctxActionPerformed(evt);
            }
        });

        Aggiungibt.setText("Aggiungi");
        Aggiungibt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AggiungibtActionPerformed(evt);
            }
        });

        Modificabt.setText("Modifica");
        Modificabt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificabtActionPerformed(evt);
            }
        });

        Rimuovibt.setText("Rimuovi");
        Rimuovibt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RimuovibtActionPerformed(evt);
            }
        });

        modPan.setBackground(new java.awt.Color(153, 153, 153));

        oldMatric.setText("matricola da modificare");
        oldMatric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldMatricActionPerformed(evt);
            }
        });

        confModif.setText("Ok");
        confModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confModifActionPerformed(evt);
            }
        });

        Annullabt.setText("Annulla");
        Annullabt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnullabtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modPanLayout = new javax.swing.GroupLayout(modPan);
        modPan.setLayout(modPanLayout);
        modPanLayout.setHorizontalGroup(
            modPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modPanLayout.createSequentialGroup()
                .addGroup(modPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modPanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Annullabt)
                        .addGap(28, 28, 28)
                        .addComponent(confModif))
                    .addGroup(modPanLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(oldMatric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        modPanLayout.setVerticalGroup(
            modPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modPanLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(oldMatric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(modPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Annullabt)
                    .addComponent(confModif))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        remPan.setBackground(new java.awt.Color(153, 153, 153));

        matricRem.setText("matricola da rimuovere");
        matricRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricRemActionPerformed(evt);
            }
        });

        confRem.setText("Ok");
        confRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confRemActionPerformed(evt);
            }
        });

        AnnullabtR.setText("Annulla");
        AnnullabtR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnullabtRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout remPanLayout = new javax.swing.GroupLayout(remPan);
        remPan.setLayout(remPanLayout);
        remPanLayout.setHorizontalGroup(
            remPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AnnullabtR)
                .addGap(28, 28, 28)
                .addComponent(confRem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, remPanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(matricRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        remPanLayout.setVerticalGroup(
            remPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remPanLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(matricRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(remPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnnullabtR)
                    .addComponent(confRem))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        errLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        errLabel.setForeground(new java.awt.Color(204, 0, 51));
        errLabel.setText("x");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Gestione degli Studenti");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Cognometx, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Nometx, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(Matricolatx, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CDisctx, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(Aggiungibt)
                                .addGap(18, 18, 18)
                                .addComponent(Modificabt)
                                .addGap(18, 18, 18)
                                .addComponent(Rimuovibt)))
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(modPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(remPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Matricolatx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nometx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Cognometx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CDisctx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aggiungibt)
                    .addComponent(Modificabt)
                    .addComponent(Rimuovibt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(remPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatricolatxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatricolatxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatricolatxActionPerformed

    private void NometxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NometxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NometxActionPerformed

    private void CognometxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CognometxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CognometxActionPerformed

    private void CDisctxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDisctxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CDisctxActionPerformed


    private void ModificabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificabtActionPerformed

        modPan.setVisible(true);

    }//GEN-LAST:event_ModificabtActionPerformed

    private void oldMatricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldMatricActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldMatricActionPerformed

    private void AnnullabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnullabtActionPerformed
        // TODO add your handling code here:
        modPan.setVisible(false);
    }//GEN-LAST:event_AnnullabtActionPerformed

    private void confModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confModifActionPerformed
        // TODO add your handling code here:

        GestoreGenerale gg = GestoreGenerale.getInstance();

        Studente stud = getFormStudente(gg);
        System.out.println("oldMatric contiene: '" + oldMatric.getText() + "'");
        if (gg.gestStudenti.cercaStudente(oldMatric.getText()) != null) {

            if (!gg.gestIscrizioni.isIscritto(oldMatric.getText())) {
                gg.gestStudenti.cercaStudente(oldMatric.getText()).setAll(stud);

                popolaTabella(gg);
                GestoreFile.scriviStudenti(gg.gestStudenti);
            }
            oldMatric.setText("matricola da modificare");
        } else {

            mostraErrore("lo studente " + oldMatric.getText() + " non è stato trovato");
            oldMatric.setText("matricola da modificare");
        }

    }//GEN-LAST:event_confModifActionPerformed

    private void RimuovibtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RimuovibtActionPerformed
        // TODO add your handling code here:
        remPan.setVisible(true);


    }//GEN-LAST:event_RimuovibtActionPerformed

    private void matricRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricRemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matricRemActionPerformed

    private void confRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confRemActionPerformed
        // TODO add your handling code here:

        GestoreGenerale gg = GestoreGenerale.getInstance();
        String matricola = matricRem.getText().trim();

        if (gg.gestStudenti.cercaStudente(matricola) != null) {

            if (!gg.gestIscrizioni.isIscritto(matricola)) {

                gg.gestStudenti.rimuoviStudente(matricola);
                popolaTabella(gg);
                GestoreFile.scriviStudenti(gg.gestStudenti);
                matricRem.setText("matricola da rimuovere");
                remPan.setVisible(false);
            } else {

                mostraErrore("lo studente " + matricola + " è iscritto ad un appello");
                matricRem.setText("matricola da rimuovere");
            }
        } else {
            mostraErrore("lo studente " + matricola + " non è stato trovato");
            matricRem.setText("matricola da rimuovere");

        }


    }//GEN-LAST:event_confRemActionPerformed

    private void AnnullabtRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnullabtRActionPerformed
        // TODO add your handling code here:

        remPan.setVisible(false);

    }//GEN-LAST:event_AnnullabtRActionPerformed

    private void AggiungibtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AggiungibtActionPerformed
        // TODO add your handling code here:

        GestoreGenerale gg = GestoreGenerale.getInstance();
        Studente stud = getFormStudente(gg);
        if (stud != null) {
            if (gg.gestStudenti.cercaStudente(stud.getMatricola()) != null) {

                mostraErrore("studente già presente");
            } else {

                gg.gestStudenti.addStudente(stud);
                popolaTabella(gg);
                GestoreFile.scriviStudenti(gg.gestStudenti);
            }
        } else {
            mostraErrore("Tutti i campi sono obbligatori ed i codici esigono essere validi");

        }


    }//GEN-LAST:event_AggiungibtActionPerformed

    /**
     * @param args the command line arguments
     */
    public void popolaTabella(GestoreGenerale gg) {

        DefaultTableModel modello = (DefaultTableModel) TabellaDoc.getModel();

        modello.setRowCount(0);

        for (Studente d : gg.gestStudenti.getStudenti()) {
            Object[] riga = {
                d.getMatricola(),
                d.getNome(),
                d.getCognome(),
                d.getCorso().getCodice()
            };
            modello.addRow(riga);
        }

    }

    public Studente getFormStudente(GestoreGenerale gg) {
        String matricola = Matricolatx.getText().trim();
        String nome = Nometx.getText().trim();
        String cognome = Cognometx.getText().trim();
        String codiceCorso = CDisctx.getText().trim();

        if (matricola.isEmpty() || nome.isEmpty() || cognome.isEmpty() || codiceCorso.isEmpty()) {
            mostraErrore("Tutti i campi sono obbligatori ed i codici esigono essere validi");
            return null; // ← aggiunto return!
        }

        Corso corso = gg.gestCorsi.cercaCorso(codiceCorso);
        if (corso == null) {
            mostraErrore("Codice corso non valido");
            return null;
        }

        return new Studente(matricola, nome, cognome, corso);
    }

    private Timer timerErrore;

    public void mostraErrore(String testo) {
        errLabel.setText(testo);
        errLabel.setVisible(true);

        if (timerErrore != null && timerErrore.isRunning()) {
            timerErrore.stop();
        }

        timerErrore = new Timer(3000, e -> {
            errLabel.setVisible(false);
            timerErrore.stop();
        });
        timerErrore.setRepeats(false);
        timerErrore.start();
    }

    public void inizializzaDati() {

        GestoreGenerale gg = GestoreGenerale.getInstance();
        popolaTabella(gg);

        modPan.setVisible(false);
        remPan.setVisible(false);
        errLabel.setVisible(false);

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentiDialog dialog = new StudentiDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aggiungibt;
    private javax.swing.JButton Annullabt;
    private javax.swing.JButton AnnullabtR;
    private javax.swing.JTextField CDisctx;
    private javax.swing.JTextField Cognometx;
    private javax.swing.JTextField Matricolatx;
    private javax.swing.JButton Modificabt;
    private javax.swing.JTextField Nometx;
    private javax.swing.JButton Rimuovibt;
    private javax.swing.JTable TabellaDoc;
    private javax.swing.JButton confModif;
    private javax.swing.JButton confRem;
    private javax.swing.JLabel errLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField matricRem;
    private javax.swing.JPanel modPan;
    private javax.swing.JTextField oldMatric;
    private javax.swing.JPanel remPan;
    // End of variables declaration//GEN-END:variables
}
