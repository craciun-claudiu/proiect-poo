/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package claudiu.test;

import claudiu.MasinaTunsIarba;
import claudiu.Motosapa;
import comun.Aparat;
import javax.swing.JOptionPane;

/**
 *
 * @author cc642
 */
public class ClaudiuGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClaudiuGUI
     */
    public ClaudiuGUI() {
        initVectorAparate();
        initVectorMasinaTunsIarba();
        initVectorMotosapa();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputTipAlimentareMTI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputVolumCosColector = new javax.swing.JTextField();
        buttonMTI = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        afisareText = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputGreutateMotosapa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputTipPornireMotosapa = new javax.swing.JTextField();
        buttonMotosapa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        afisareText2 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputGreutateAparat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputPretAparat = new javax.swing.JTextField();
        buttonAparat = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        afisareText3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selectare masini tuns iarba");

        jLabel2.setText("Introduceti tipul de alimentare:");

        inputTipAlimentareMTI.setToolTipText("ex:Benzina");

        jLabel3.setText("Introduceti volumul cosului colector:");

        inputVolumCosColector.setToolTipText("ex:60");

        buttonMTI.setText("Afiseaza masinile");
        buttonMTI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonMTI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMTIMouseClicked(evt);
            }
        });

        afisareText.setColumns(20);
        afisareText.setRows(5);
        jScrollPane1.setViewportView(afisareText);

        jLabel4.setText("Selectare motosape");

        jLabel5.setText("Introduceti greutatea:");

        inputGreutateMotosapa.setToolTipText("ex:30");

        jLabel6.setText("Introduceti tipul de pornire:");
        jLabel6.setToolTipText("");

        inputTipPornireMotosapa.setToolTipText("ex:Manuala");

        buttonMotosapa.setText("Afiseaza motosapele");
        buttonMotosapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMotosapaMouseClicked(evt);
            }
        });

        afisareText2.setColumns(20);
        afisareText2.setRows(5);
        jScrollPane2.setViewportView(afisareText2);

        jLabel7.setText("Selectare aparate");

        jLabel8.setText("Introduceti greutatea:");

        inputGreutateAparat.setToolTipText("ex:15");

        jLabel9.setText("Introduceti pretul");
        jLabel9.setToolTipText("");

        inputPretAparat.setToolTipText("ex2500");

        buttonAparat.setText("Afiseaza aparatele");
        buttonAparat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAparatMouseClicked(evt);
            }
        });

        afisareText3.setColumns(20);
        afisareText3.setRows(5);
        jScrollPane3.setViewportView(afisareText3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(inputTipAlimentareMTI, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(inputVolumCosColector, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMTI)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(buttonMotosapa)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputGreutateMotosapa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTipPornireMotosapa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(inputGreutateAparat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(inputPretAparat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAparat))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTipAlimentareMTI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputGreutateMotosapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputGreutateAparat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputVolumCosColector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTipPornireMotosapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPretAparat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMTI)
                    .addComponent(buttonMotosapa)
                    .addComponent(buttonAparat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMTIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMTIMouseClicked
        // TODO add your handling code here:
        try{
        String s = "";
        String tipAlimen = inputTipAlimentareMTI.getText();
        float volumCC = Float.parseFloat(inputVolumCosColector.getText());
        for(int i = 0 ; i < 10 ; i++){
            if(v[i].getTipAlimentare().compareTo(tipAlimen) == 0 && v[i].getVolumCosColector() <= volumCC)
                s=s+v[i]+'\n';
        }
        afisareText.setText(s);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Eroare campuri editate masina de tuns iarba", "Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("eroare la input masina tuns iarba");
        }
    }//GEN-LAST:event_buttonMTIMouseClicked

    private void buttonMotosapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMotosapaMouseClicked
        // TODO add your handling code here:
        try{
        String s = "";
        String tipPornire = inputTipPornireMotosapa.getText();
        float greutate = Float.parseFloat(inputGreutateMotosapa.getText());
        for(int i = 0 ; i < 10 ; i++){
            if(u[i].getGreutate() <= greutate && u[i].getTipPornire().compareTo(tipPornire) == 0)
                s=s+u[i]+'\n';
        }
        afisareText2.setText(s);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Eroare campuri editate motosapa", "Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("eroare la input motosapa");
        }
    }//GEN-LAST:event_buttonMotosapaMouseClicked

    private void buttonAparatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAparatMouseClicked
        // TODO add your handling code here:
        try{
        String s = "";
        float pret = Float.parseFloat(inputPretAparat.getText());
        float greutate = Float.parseFloat(inputGreutateAparat.getText());
        for(int i = 0 ; i < 10 ; i++){
            if(aparate[i].getGreutate() <= greutate && aparate[i].getPret() <= pret)
                s=s+aparate[i]+'\n';
        }
        afisareText3.setText(s);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Eroare campuri editate motosapa", "Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("eroare la input motosapa");
        }
    }//GEN-LAST:event_buttonAparatMouseClicked

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
            java.util.logging.Logger.getLogger(ClaudiuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaudiuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaudiuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaudiuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaudiuGUI().setVisible(true);
            }
        });
    }
    
    private void initVectorAparate(){
        aparate[0] = new Aparat("Honda", "HRX2VKA", 2500, "Verde", 42);
        aparate[1] = new Aparat("Bosch", "Rotak 4", 400, "Verde", 6.8f);
        aparate[2] = new Aparat("Husqvarna", "LC 33", 3900, "Portocaliu", 26);
        aparate[3] = new Aparat("Makita", "DLM", 2400, "Albastru", 15);
        aparate[4] = new Aparat("Stihl", "RMA 4", 1300, "Alb cu portocaliu", 21);
        aparate[5] = new Aparat("Greenworks", "GGX1", 1500, "Verde", 18);
        aparate[6] = new Aparat("AL-KO", "Classic 4.66", 2700, "Roșu cu negru", 27);
        aparate[7] = new Aparat("Einhell", "GE-CM 36/47", 1000, "Roșu cu negru", 25);
        aparate[8] = new Aparat("Flymo", "Hover", 1600, "Portocaliu cu gri", 5.5f);
        aparate[9] = new Aparat("Wolf-Garten", "A 120", 2000, "Roșu cu galben", 35);
    }
    
    private void initVectorMasinaTunsIarba(){
        v[0] = new MasinaTunsIarba("Honda", "HRX217VKA", 3500, "Rosu", 42, "Benzina", "Otel inoxidabil", 5.5f, 53, 7, 70  );
        v[1] = new MasinaTunsIarba("Bosch", "Rotak 32", 800, "Verde", 6.8f, "Electrica", "Otel calit", 1200, 32, 3, 31);
        v[2] = new MasinaTunsIarba("Husqvarna", "LC 140S", 1900, "Portocaliu", 26, "Benzina", "Otel carbon", 2.5f, 40, 6, 50 );
        v[3] = new MasinaTunsIarba("Makita", "DLM380Z", 1300, "Albastru", 15, "Baterie", "Otel inoxidabil", 36, 38, 5, 40);
        v[4] = new MasinaTunsIarba("Stihl", "RMA 443 C", 2500, "Alb cu portocaliu", 21, "Baterie", "Otel calit", 36, 41, 6, 55 );
        v[5] = new MasinaTunsIarba("Greenworks", "G40LM41", 1400, "Verde", 18, "Baterie", "Aluminiu", 40, 41, 5, 50);
        v[6] = new MasinaTunsIarba("AL-KO", "Classic 4.66 P-A", 1200, "Rosu cu negru", 27, "Benzina", "Otel", 2.7f, 46, 7, 65);
        v[7] = new MasinaTunsIarba("Einhell", "GE-CM 36/47 S HW Li", 2000, "Rosu cu negru", 25, "Baterie", "Otel inoxidabil", 36, 47, 6, 75);
        v[8] = new MasinaTunsIarba("Flymo", "Hover Vac 250", 600, "Portocaliu cu gri", 5.5f, "Electrica", "Plastic durabil", 1400, 25, 4, 15 );
        v[9] = new MasinaTunsIarba("Wolf-Garten", "A 460 A SP HW", 2200, "Rosu cu galben", 35, "Benzina", "Otel inoxidabil", 3.2f, 46, 6, 60 );
    }
    
    private void initVectorMotosapa(){
        u[0] = new Motosapa("Honda", "FG110", 2200, "Roșu", 14, "Benzina", "Manuala", "Freze rotative", "Ergonomic", 3, 100);
        u[1] = new Motosapa("Stihl", "MH 445", 3200, "Portocaliu", 40, "Benzina", "Demaror", "Freze rotative", "Reglabil", 4, 120);
        u[2] = new Motosapa("Makita", "ELM3311", 1900, "Albastru", 12, "Electrică", "Buton electric", "Freze cu lame", "Fix", 3, 105);
        u[3] = new Motosapa("Einhell", "GC-MT 1636/1", 1500, "Roșu", 29, "Benzină", "Manuala", "Freze cu disc", "Pliabil", 3, 115);
        u[4] = new Motosapa("Husqvarna", "TF 230", 4000, "Portocaliu", 66, "Benzină", "Demaror", "Freze grele", "Ergonomic", 5, 140);
        u[5] = new Motosapa("Greenworks", "G-MT40", 2800, "Verde", 17, "Electrică", "Buton electric", "Freze rotative", "Fix", 4, 110);
        u[6] = new Motosapa("Alpina", "A405", 1700, "Alb cu negru", 30, "Benzină", "Manuala", "Freze cu lame", "Reglabil", 3, 125);
        u[7] = new Motosapa("Viking", "HB 560", 4500, "Verde", 48, "Benzină", "Demaror", "Freze grele", "Ergonomic", 4, 135);
        u[8] = new Motosapa("Texas", "Fusion 10TG", 3300, "Negru", 85, "Benzină", "Manuala", "Freze industriale", "Reglabil", 5, 150);
        u[9] = new Motosapa("AgroPro", "MTX 80", 2500, "Albastru", 50, "Diesel", "Demaror", "Freze cu lame", "Pliabil", 4, 130);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea afisareText;
    private javax.swing.JTextArea afisareText2;
    private javax.swing.JTextArea afisareText3;
    private javax.swing.JButton buttonAparat;
    private javax.swing.JButton buttonMTI;
    private javax.swing.JButton buttonMotosapa;
    private javax.swing.JTextField inputGreutateAparat;
    private javax.swing.JTextField inputGreutateMotosapa;
    private javax.swing.JTextField inputPretAparat;
    private javax.swing.JTextField inputTipAlimentareMTI;
    private javax.swing.JTextField inputTipPornireMotosapa;
    private javax.swing.JTextField inputVolumCosColector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    Aparat[] aparate = new Aparat[10];
    MasinaTunsIarba[] v = new MasinaTunsIarba[10];
    Motosapa[] u = new Motosapa[10];

}
