/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cheesecakecafe;

import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class LOADING extends javax.swing.JFrame {
    

    /**
     * Creates new form LOADING
     */
    public LOADING() {
        initComponents();
        init();
    }
     public void init(){
        setImage();
    }
    public void setImage(){
        ImageIcon iconloads  = new ImageIcon(getClass().getResource("/ICON_Loading/Load.jpg"));
        //----------------------------------------------------------------------------
        Image img = iconloads.getImage().getScaledInstance(jImgChds.getWidth(), jImgChds.getHeight(), Image.SCALE_SMOOTH);
        //----------------------------------------------------------------------------
        jImgChds.setIcon(new ImageIcon(img));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jImgChds = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        jLoading = new javax.swing.JLabel();
        jPercent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 240, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 228, 167), 5));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jImgChds.setForeground(new java.awt.Color(255, 255, 255));
        jImgChds.setOpaque(true);
        jImgChds.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jImgChdsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jProgressBar.setBackground(new java.awt.Color(51, 51, 51));
        jProgressBar.setForeground(new java.awt.Color(255, 240, 206));
        jProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 228, 167), 2));
        jProgressBar.setOpaque(true);
        jProgressBar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jProgressBarAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLoading.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLoading.setForeground(new java.awt.Color(0, 0, 0));
        jLoading.setText("LOADING");

        jPercent.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jPercent.setForeground(new java.awt.Color(0, 0, 0));
        jPercent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPercent.setText("0%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jImgChds, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253)
                        .addComponent(jPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jImgChds, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLoading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPercent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jImgChdsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jImgChdsAncestorAdded
        
    }//GEN-LAST:event_jImgChdsAncestorAdded

    private void jProgressBarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jProgressBarAncestorAdded
        
        
    }//GEN-LAST:event_jProgressBarAncestorAdded

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx  = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    int xx,xy;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for(double i = 0.0;i <= 1.0 ; i += 0.1){
            String s = i + "";
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try{
                Thread.sleep(30);
            }catch(InterruptedException ex){
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened
  
    
    
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
            java.util.logging.Logger.getLogger(LOADING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOADING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOADING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOADING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        LOADING Load = new LOADING();
        Load.setVisible(true);
        try{
           for(int i = 0;i <= 100;i++){
               Thread.sleep(100);
              Load.jPercent.setText(i + "%");
              if(i == 0){
                  Load.jLoading.setText("L");
              }else if(i == 10){
                   Load.jLoading.setText("LO");
              }else if(i == 20){
                   Load.jLoading.setText("LOA");
              }else if(i == 30){
                   Load.jLoading.setText("LOAD");
              }else if(i == 40){
                   Load.jLoading.setText("LOADI");
              }else if(i == 50){
                   Load.jLoading.setText("LOADIN");
              }else if(i == 60){
                   Load.jLoading.setText("LOADING");
              }else if(i == 70){
                   Load.jLoading.setText("LOADING.");
              }else if(i == 80){
                   Load.jLoading.setText("LOADING..");
              }else if(i == 90){
                   Load.jLoading.setText("LOADING...");
              }else if(i == 100){
                   Load.jLoading.setText("SUCCESS LOADER");
              }
              Load.jProgressBar.setValue(i);
           } 
           
        }catch(InterruptedException e){
            JOptionPane.showMessageDialog(Load, "InterruptedException Error");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               
                 Load.setVisible(false);
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jImgChds;
    private javax.swing.JLabel jLoading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPercent;
    private javax.swing.JProgressBar jProgressBar;
    // End of variables declaration//GEN-END:variables
}
