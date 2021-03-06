/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inout;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author g.corrado
 */
public class Ricerca extends javax.swing.JFrame {
    

    /**
     * Creates new form prova1
     */
    
    
    public Ricerca() throws IOException {
        initComponents();
        setResizable(false);

            cmdLogin.setVisible(true);
            cmdLogOut.setVisible(false);
            cmdIns.setVisible(false);
            cmdModifica.setVisible(false);
            cmdSave.setVisible(false);
            
            ArrayList <Circolare> list = new ArrayList<Circolare>();
            
            CSV_Read cr=new CSV_Read();
            cr.carica();
            
            for(int i = 0; i < Globale.archivio.getLenght(); i++){
                list.add(Globale.archivio.getCircolare(i));
            }
            DefaultTableModel model = (DefaultTableModel)tblTabella.getModel();
            Object rowData[] = new Object[7];
            for(int i = 0; i < Globale.archivio.getLenght(); i++){
                if(Globale.archivio.getCircolare(i)!=null){
                    rowData[0] = list.get(i).getNumeroCircolare();
                    rowData[1] = ""+list.get(i).getClasse().getAnnoClasse() + list.get(i).getClasse().getSezione() + list.get(i).getClasse().getArticolazione();
                    rowData[2] = ""+list.get(i).getData().getGg() +"-"+ list.get(i).getData().getMm() +"-"+ list.get(i).getData().getYy();
                    rowData[3] = list.get(i).getData().getHh();
                    rowData[4] = list.get(i).getTipo();
                    rowData[5] = list.get(i).getMotivazione();
                    rowData[6] = list.get(i).getAnnotazioni();
                    model.addRow(rowData);
                }
                
            }
        
    }
    public Ricerca(Boolean accesso) throws IOException {
        initComponents();
        setResizable(false);
            if(accesso){
                cmdLogin.setVisible(false);
            cmdLogOut.setVisible(true);
            cmdIns.setVisible(true);
            cmdModifica.setVisible(true);
            cmdSave.setVisible(true);
            }else{
                cmdLogin.setVisible(true);
            cmdLogOut.setVisible(false);
            cmdIns.setVisible(false);
            cmdModifica.setVisible(false);
            cmdSave.setVisible(false);
            }
            ArrayList <Circolare> list = new ArrayList<Circolare>();
            for(int i = 0; i < Globale.archivio.getLenght(); i++){
                list.add(Globale.archivio.getCircolare(i));
            }
            DefaultTableModel model = (DefaultTableModel)tblTabella.getModel();
            Object rowData[] = new Object[7];
            for(int i = 0; i < Globale.archivio.getLenght(); i++){
                if(Globale.archivio.getCircolare(i)!=null){
                    rowData[0] = list.get(i).getNumeroCircolare();
                    rowData[1] = ""+list.get(i).getClasse().getAnnoClasse() + list.get(i).getClasse().getSezione() + list.get(i).getClasse().getArticolazione();
                    rowData[2] = ""+list.get(i).getData().getGg() +"-"+ list.get(i).getData().getMm() +"-"+ list.get(i).getData().getYy();
                    rowData[3] = list.get(i).getData().getHh();
                    rowData[4] = list.get(i).getTipo();
                    rowData[5] = list.get(i).getMotivazione();
                    rowData[6] = list.get(i).getAnnotazioni();
                model.addRow(rowData);
                }
                
            }
            
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmdLogin = new javax.swing.JButton();
        cmdLogOut = new javax.swing.JButton();
        cmdIns = new javax.swing.JButton();
        rdbEntrata = new javax.swing.JRadioButton();
        rdbUscita = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cmbClasse = new javax.swing.JComboBox();
        cmdCerca = new javax.swing.JButton();
        cmdEsci = new javax.swing.JButton();
        cmdModifica = new javax.swing.JButton();
        cmbClasse1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbClasse2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmdSave = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTabella = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cmdLogin.setText("Login");
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });

        cmdLogOut.setText("Logout");
        cmdLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogOutActionPerformed(evt);
            }
        });

        cmdIns.setText("Inserisci");
        cmdIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInsActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbEntrata);
        rdbEntrata.setText("Entrata");

        buttonGroup1.add(rdbUscita);
        rdbUscita.setText("Uscita");

        jLabel2.setText("Classi");

        cmbClasse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClasseActionPerformed(evt);
            }
        });

        cmdCerca.setText("Cerca");

        cmdEsci.setText("Esci");
        cmdEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEsciActionPerformed(evt);
            }
        });

        cmdModifica.setText("modifica");
        cmdModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdModificaActionPerformed(evt);
            }
        });

        cmbClasse1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "3 meccanica", "4 meccanica", "5 meccanica", "3 energia", "4 energia", "5 energia", "3 elettrotecnica", "4 elettrotecnica", "5 elettrotecnica", "3 elettronica", "4 elettronica", "5 elettronica", "3 automazione", "4 automazione", "5 automazione", "3 informatica", "4 informatica", "5 informatica", "3 chimica", "4 chimica", "5 chimica", "3 telecomunicazioni", "4 telecomunicazioni", "5 telecomunicazioni" }));
        cmbClasse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClasse1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Classi");

        cmbClasse2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I" }));
        cmbClasse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClasse2ActionPerformed(evt);
            }
        });

        jLabel4.setText("N° circolare");

        jLabel5.setText("Data");

        cmdSave.setText("SALVA BK");
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdModifica)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmdCerca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdEsci))
                    .addComponent(cmbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbEntrata)
                    .addComponent(jLabel2)
                    .addComponent(rdbUscita)
                    .addComponent(jLabel3)
                    .addComponent(cmbClasse1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbClasse2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(cmdIns)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmdLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdLogOut)))
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cmdSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdLogin)
                    .addComponent(cmdLogOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdIns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbEntrata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbUscita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbClasse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbClasse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCerca)
                    .addComponent(cmdEsci))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdModifica)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 102, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(493, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(305, 305, 305))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tblTabella.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N. Circolare", "Classe", "Data", "Ora", "Tipo", "Motivazione", "Annotazioni"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblTabella);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEsciActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdEsciActionPerformed

    private void cmbClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClasseActionPerformed

    private void cmdLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLogOutActionPerformed
        this.setVisible(false);

        try {
            Ricerca prova=new Ricerca (false);
            prova.setVisible(true);// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Ricerca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdLogOutActionPerformed

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
        try {
            
            Login login=new Login();
            login.setVisible(true);

        } catch (IOException ex) {
            Logger.getLogger(Ricerca.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.setVisible(false);
    }//GEN-LAST:event_cmdLoginActionPerformed

    private void cmdInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInsActionPerformed
        Inserimento inserimento=new Inserimento();
        inserimento.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cmdInsActionPerformed

    private void cmdModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdModificaActionPerformed
        
        Modifica modifica=new Modifica();
        modifica.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_cmdModificaActionPerformed

    private void cmbClasse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClasse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClasse1ActionPerformed

    private void cmbClasse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClasse2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClasse2ActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        List<String> list2 = new ArrayList();

        for (int i = 0; i < Globale.archivio.getLenght();i++) {
            list2.add(Globale.archivio.getArrayCircolari()[i].toString());
        }

        String csvFile2 = "def.csv";
        try (FileWriter writer = new FileWriter(csvFile2)) {
            CSV.writeLine(writer, list2, '\n', ' ');
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Ricerca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdSaveActionPerformed
          
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ricerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ricerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ricerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ricerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ricerca().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Ricerca.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public JButton getCmdIns() {
        return cmdIns;
    }

    public JButton getCmdLogOut() {
        return cmdLogOut;
    }

    public JButton getCmdLogin() {
        return cmdLogin;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbClasse;
    private javax.swing.JComboBox cmbClasse1;
    private javax.swing.JComboBox cmbClasse2;
    private javax.swing.JButton cmdCerca;
    private javax.swing.JButton cmdEsci;
    private javax.swing.JButton cmdIns;
    private javax.swing.JButton cmdLogOut;
    private javax.swing.JButton cmdLogin;
    private javax.swing.JButton cmdModifica;
    private javax.swing.JButton cmdSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton rdbEntrata;
    private javax.swing.JRadioButton rdbUscita;
    private javax.swing.JTable tblTabella;
    // End of variables declaration//GEN-END:variables
}

