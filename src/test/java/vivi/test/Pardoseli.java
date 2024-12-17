/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vivi.test;
import vivi.AparatCuratatPardoseli;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.StringTokenizer;



/**
 *
 * @author Viv
 */
public class Pardoseli extends javax.swing.JFrame {

    /**
     * Creates new form Pardoseli
     */
    public Pardoseli() {
        initComponents();
        //initVectorASP();
        initVectorFisierASP("src/test/java/vivi/test/pardoseli.txt");
        afisareVectorFisier();
        Buton.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            afisareButonActionPerformed(evt);
        }
    });
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
        Buton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        baterieMaxim = new javax.swing.JTextField();
        rezervorApa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        Afisare = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nivel baterie maxim:");

        jLabel2.setText("Capacitate rezervor apa:");

        Buton.setText("Afisare");

        jLabel3.setText("Afisare Aparat Curatat Pardoseli");

        Text.setColumns(20);
        Text.setRows(5);
        jScrollPane1.setViewportView(Text);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        Afisare.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(227, 227, 227)
                            .addComponent(Buton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(199, 199, 199)
                                .addComponent(baterieMaxim, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rezervorApa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(Afisare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(baterieMaxim, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(rezervorApa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(Buton)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Afisare)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void afisareButonActionPerformed(java.awt.event.ActionEvent evt){
        try{
        String h = "";
        float baterie = Float.parseFloat(baterieMaxim.getText());
        float rezervor = Float.parseFloat(rezervorApa.getText());
        for( int i = 0; i < 10; i++){
            if(pardoseli[i].getCapacitateBaterie() <= baterie && pardoseli[i].getCapacitateRezervorApa() <= rezervor)
                h = h + pardoseli[i] + '\n';
        }
        if (h.isEmpty()) {
            h = "Nu există aparate care să corespundă criteriilor.";
        }
        Text.setText(h);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Eroare la campurile editate", "Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("eroare la input");
        }
    }
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
            java.util.logging.Logger.getLogger(Pardoseli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pardoseli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pardoseli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pardoseli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pardoseli().setVisible(true);
            }
        });
    }
private void initVectorASP(){
    pardoseli[0] = new AparatCuratatPardoseli("Dyson", "FloorExpert", 2500.99f, "Negru", 10.2f, "Dyson", "FE2025", 6000, 2.0f, (byte) 250);
        pardoseli[1] = new AparatCuratatPardoseli("Samsung", "CleanMaster", 1800.0f, "Gri", 9.1f, "Samsung", "CM2022", 4500, 1.8f, (byte) 180);
        pardoseli[2] = new AparatCuratatPardoseli("LG", "FloorBot", 2000.0f, "Argintiu", 7.8f, "LG", "FB2030", 5200, 2.5f, (byte) 220);
        pardoseli[3] = new AparatCuratatPardoseli("iRobot", "Roomba", 3000.0f, "Alb", 6.5f, "iRobot", "RB2031", 7000, 3.0f, (byte) 300);
        pardoseli[4] = new AparatCuratatPardoseli("Bissell", "CrossWave", 1500.0f, "Albastru", 8.0f, "Bissell", "CW2028", 4800, 1.7f, (byte) 170);
        pardoseli[5] = new AparatCuratatPardoseli("Philips", "AquaClean", 2300.0f, "Negru", 8.5f, "Philips", "AC2032", 5500, 2.3f, (byte) 200);
        pardoseli[6] = new AparatCuratatPardoseli("Hoover", "SmartWash", 2100.0f, "Roșu", 8.2f, "Hoover", "SW2027", 5100, 2.2f, (byte) 190);
        pardoseli[7] = new AparatCuratatPardoseli("Shark", "SteamMop", 1900.0f, "Alb", 7.0f, "Shark", "SM2026", 4700, 1.9f, (byte) 180);
        pardoseli[8] = new AparatCuratatPardoseli("Vax", "PlatinumSmart", 2200.0f, "Gri", 7.5f, "Vax", "PS2030", 5300, 2.1f, (byte) 210);
        pardoseli[9] = new AparatCuratatPardoseli("Rowenta", "CleanPro", 2400.0f, "Albastru", 7.9f, "Rowenta", "CP2035", 5600, 2.4f, (byte) 230);

    }
    
private void afisareVectorFisier(){
     String h = " ";
        for(int i = 0; i < 10; i++ ){
            h = h + pardoseli[i]+'\n';    
        }
        jTextArea2.setText(h);
}
    
private void initVectorFisierASP(String caleaFisierului){
     FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        StringTokenizer st = null;
        try{
            fr = new FileReader(caleaFisierului);
            br = new BufferedReader(fr);
            line = br.readLine();
            N = Integer.parseInt(line);
            pardoseli = new AparatCuratatPardoseli[N];
            for(int i = 0 ; i < N ; i++){
                line = br.readLine();
                st = new StringTokenizer(line,",");
                if(st.countTokens() == 10){
                    pardoseli[i] = new AparatCuratatPardoseli();
                    pardoseli[i].setProducator(st.nextToken());
                    pardoseli[i].setModel(st.nextToken());
                    pardoseli[i].setPret(Float.parseFloat(st.nextToken()));
                    pardoseli[i].setCuloare(st.nextToken());
                    pardoseli[i].setGreutate(Float.parseFloat(st.nextToken()));
                    pardoseli[i].setMarca(st.nextToken());
                    pardoseli[i].setModelSpecific(st.nextToken());
                    pardoseli[i].setCapacitateBaterie(Float.parseFloat(st.nextToken()));
                    pardoseli[i].setCapacitateRezervorApa(Float.parseFloat(st.nextToken()));
                    pardoseli[i].setPutere(Byte.parseByte(st.nextToken()));
                }else{
                    System.out.println("Problema la formatul continutului din fisier pt aparate");
                }
        }
            br.close();
            fr.close();
}catch(Exception e){
            System.out.println("Eroare la deschiderea/citirea din fisier");
}
}
    
        AparatCuratatPardoseli[] pardoseli;
        int N;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Afisare;
    private javax.swing.JButton Buton;
    private javax.swing.JTextArea Text;
    private javax.swing.JTextField baterieMaxim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField rezervorApa;
    // End of variables declaration//GEN-END:variables
}
