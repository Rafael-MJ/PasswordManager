package securepass.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import securepass.model.InfoManager;

public class jFrameSplashScreen extends javax.swing.JFrame {

    public jFrameSplashScreen() {
        ImageIcon ic = new ImageIcon(getClass().getResource("/securepass/images/logo.png"));
        this.setIconImage(ic.getImage());
        
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(jFrameSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ImageIcon back = new ImageIcon(getClass().getResource("/securepass/images/back.jpg"));
        initComponents();
        ver.setText(new InfoManager().getVersion());
        back.setImage(back.getImage().getScaledInstance(back.getIconWidth() + 100, back.getIconHeight() + 100, 1));
        backLogo.setIcon(back);
        loadingBar();
    }
    
    private void loadingBar(){
        new Thread(){
            @Override
            public void run() {
               for(int i=0; i < 101; i++) {
                   pbLogin.setValue(i);
                   try {
                       sleep(25);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(jFrameSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
               dispose();
               new jFrameTelaInicial().setVisible(true);
            } 
        }.start();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new jFrameSplashScreen().setVisible(true);
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pbLogin = new javax.swing.JProgressBar();
        logo = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        SecurePass = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Iniciando");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pbLogin.setBackground(new java.awt.Color(204, 204, 204));
        pbLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pbLogin.setForeground(new java.awt.Color(0, 102, 255));
        pbLogin.setBorder(null);
        pbLogin.setBorderPainted(false);
        pbLogin.setStringPainted(true);
        background.add(pbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 430, 47));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/logo.png"))); // NOI18N
        logo.setToolTipText("");
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        ver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ver.setForeground(new java.awt.Color(255, 255, 255));
        ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver.setText("VERSION");
        background.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 110, -1));

        SecurePass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SecurePass.setForeground(new java.awt.Color(255, 255, 255));
        SecurePass.setText("by SecurePass");
        background.add(SecurePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Gerenciador de Senhas");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        backLogo.setText("\n");
        backLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.add(backLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 150));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 335));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SecurePass;
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel background;
    private javax.swing.JLabel logo;
    private javax.swing.JProgressBar pbLogin;
    private javax.swing.JLabel title;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
