/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package roxana.test;
import comun.Aparat;
import roxana.AspiratorUmed;
import roxana.AspiratorUscat;
import javax.swing.JOptionPane;

/**
 *
 * @author rd173
 */
public class RoxanaGUI extends javax.swing.JFrame {

    /**
     * Creates new form RoxanaGUI
     */
    public RoxanaGUI() {
        initVectorAparate();
        initVectorAspiratorUmed();
        initVectorAspiratorUscat();
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
        inputnivelZgomot = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputlungimeFurtun = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputcapacitateSac = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputdurataBateriei = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        afisareText = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        afisareText2 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputPretAparat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputGreutateAparat = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        afisareText1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selectare Aspiratoare umede");

        jLabel2.setText("Introduceti nivelul de zgomot:");

        jLabel3.setText("Introduceti lungimea furtunului:");

        jButton1.setText("Afiseaza aspiratoarele");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel4.setText("Selectare Aspiratoare uscate");

        jLabel5.setText("Introduceti capacitatea sacului:");

        jLabel6.setText("Introduceti durata bateriei:");

        jButton2.setText("Afiseaza aspiratoare");
        jButton2.setToolTipText("");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(afisareText);

        jScrollPane2.setViewportView(afisareText2);

        jLabel7.setText("Selectare Aparate");

        jLabel8.setText("Introduceti pret:");

        jLabel9.setText("Introduceti greutate:");

        jButton3.setText("Afiseaza aparatele");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(afisareText1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addComponent(inputGreutateAparat)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputPretAparat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputnivelZgomot, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputlungimeFurtun, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputcapacitateSac, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputdurataBateriei, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputnivelZgomot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputcapacitateSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputPretAparat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputlungimeFurtun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputdurataBateriei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputGreutateAparat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try{
            String s = "";
            int nivelzg = Integer.parseInt(inputnivelZgomot.getText());
            float lungfurtun = Float.parseFloat(inputlungimeFurtun.getText());
            for (int i=0 ; i<10 ; i++){
                if(v[i].getnivelZgomot() <= nivelzg && v[i].getlungimeFurtun() <= lungfurtun)
                    s=s+v[i]+'\n';
            }
            afisareText.setText(s);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Eroare campuri editate aspiratoare umede", "Error",JOptionPane.ERROR_MESSAGE);
            
           
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       
    // TODO add your handling code here:
        try{
        String s = "";
        float capsac = Float.parseFloat(inputcapacitateSac.getText());
        int durbaterie = Integer.parseInt(inputdurataBateriei.getText());
        for(int i = 0 ; i<10 ; i++){
            if(u[i].getcapacitateSac() <= capsac && u[i].getdurataBateriei() <= durbaterie)
                s=s+u[i]+'\n';
        }
        afisareText2.setText(s);
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, "Eroare campuri editate aspiratoare uscate", "Error",JOptionPane.ERROR_MESSAGE);
            
    
        
    }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        try{
        String s = "";
        float pret = Float.parseFloat(inputPretAparat.getText());
        float greutate = Float.parseFloat(inputGreutateAparat.getText());
        for(int i = 0 ; i < 10 ; i++){
            if(a[i].getGreutate() <= greutate && a[i].getPret() <= pret)
                s=s+a[i]+'\n';
        }
        afisareText1.setText(s);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Eroare campuri editate aparate", "Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RoxanaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoxanaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoxanaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoxanaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoxanaGUI().setVisible(true);
            }
        });
    }
    private void initVectorAparate(){
        a[0] = new Aparat("Rowenta", "HRX2VKA", 2500, "Albastru", 42);
        a[1] = new Aparat("Bosch", "Rotak 4", 400, "Rosu", 6.8f);
        a[2] = new Aparat("Beko", "LC 33", 3900, "Negru", 26);
        a[3] = new Aparat("Samsung", "DLM", 2400, "Verde", 15);
        a[4] = new Aparat("Bosch", "RMA 4", 1300, "Mov", 21);
        a[5] = new Aparat("Dyson", "GGX1", 1500, "Roz", 18);
        a[6] = new Aparat("Samsung", "Classic 4.66", 2700, "Portocaliu", 27);
        a[7] = new Aparat("Beko", "GE-CM 36/47", 1000, "Roșu", 25);
        a[8] = new Aparat("Rowenta", "Hover", 1600, "Verde", 5.5f);
        a[9] = new Aparat("Bosch", "A 120", 2000, "Negru", 35);
    }
    private void initVectorAspiratorUmed(){
        v[0] = new AspiratorUmed("Karcher", "fara sac", 360f, "Galben", 6, 6.7f, 80, 5.5f, 4f, false);
        v[1] = new AspiratorUmed("Ryer", "cu sac", 400f, "Gri", 5, 8.3f, 90, 5f, 5.5f, false);
        v[2] = new AspiratorUmed("Heinner", "cu sac", 500f, "Albastru", 6, 8.5f, 50, 6f, 5f, true);
        v[3] = new AspiratorUmed("Yanx", "fara sac ", 450f, "Rosu", 7, 9.2f,55, 7f,5.3f, true);
        v[4] = new AspiratorUmed("amXea", "cu sac", 500f, "Negru", 4, 6.7f, 60, 7.2f, 6.2f, false);
        v[5] = new AspiratorUmed("Ryer", "fara sac", 550f, "Roz", 5, 7.3f, 70, 6.9f, 6.1f, true);
        v[6] = new AspiratorUmed("Yanx", "cu sac", 600f, "Alb", 8, 6.4f, 90, 7f, 6.2f, true );
        v[7] = new AspiratorUmed("Karcher", "cu sac", 570f, "Portocaliu", 5, 6.5f, 75, 4.5f, 3f, true);
        v[8] = new AspiratorUmed("amXea", "cu sac", 600f, "Mov", 7, 7.2f, 95, 5.5f, 5f, false);
        v[9] = new AspiratorUmed("Ryer", "fara sac", 650f, "Rosu", 5, 7.7f, 85, 6.2f, 6f, true);
}
    private void initVectorAspiratorUscat(){
        u[0] = new AspiratorUscat("Rowenta", "compact", 700, "rosu", 6.2f, 4.2f, "HERA", 210, 50, "plastic");
        u[1] = new AspiratorUscat("Philips", "vertical", 600, "albastru", 6.5f, 4.5f, "carbon activ", 220, 60, "metal");
        u[2] = new AspiratorUscat("Beko","compact", 650,"negru", 6.3f, 4.7f, "ciclonic", 200, 65, " plastic");
        u[3] = new AspiratorUscat("Bosh","compact", 700, "verde", 6.5f, 5f, "HEPA", 190, 70, "plastic");
        u[4] = new AspiratorUscat("Samsung", "vertical", 550, " roz", 6.8f, 4.7f, "ciclonic", 180, 100, "metal");
        u[5] = new AspiratorUscat("Philips","compact",620, "mov", 7.3f, 5.4f, "carbon activ", 230, 120,"plastic");
        u[6] = new AspiratorUscat("Beko","vertical", 650, "alb", 6.3f, 5.6f, "ciclonic", 180, 45, "metal");
        u[7] = new AspiratorUscat("Bosh","compact", 750, "portocaliu", 7.1f,5.7f, "HEPA", 200, 60, "metal");
        u[8] = new AspiratorUscat("Rowenta","vertcal", 560, "albastru", 6.7f, 4.8f, "HEPA", 210, 70, "plastic");
        u[9] = new AspiratorUscat("Samsung","compact", 575, "negru", 6.3f, 5.2f, "ciclonic", 220, 80,"metal");
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane afisareText;
    private javax.swing.JTextPane afisareText1;
    private javax.swing.JTextPane afisareText2;
    private javax.swing.JTextField inputGreutateAparat;
    private javax.swing.JTextField inputPretAparat;
    private javax.swing.JTextField inputcapacitateSac;
    private javax.swing.JTextField inputdurataBateriei;
    private javax.swing.JTextField inputlungimeFurtun;
    private javax.swing.JTextField inputnivelZgomot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
 Aparat[] a = new Aparat[10];
 AspiratorUmed[] v = new AspiratorUmed[10];
 AspiratorUscat[] u = new AspiratorUscat[10];

}
