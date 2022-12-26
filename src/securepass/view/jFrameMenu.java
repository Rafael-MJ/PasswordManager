package securepass.view;

import javax.swing.ImageIcon;
import securepass.model.InfoManager;
import securepass.model.UserInfo;

public class jFrameMenu extends javax.swing.JFrame {

    public jFrameMenu() {
        ImageIcon ic = new ImageIcon(getClass().getResource("/securepass/images/logo.png"));
        this.setIconImage(ic.getImage());
        initComponents();
        ver.setText(new InfoManager().getVersion());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        SecurePass = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        btnExit = new javax.swing.JButton();
        btnAcess = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(51, 51, 51));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/logo.png"))); // NOI18N
        logo.setToolTipText("");
        backPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        ver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ver.setForeground(new java.awt.Color(255, 255, 255));
        ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver.setText("VERSION");
        backPanel.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, -1));

        SecurePass.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        SecurePass.setForeground(new java.awt.Color(255, 255, 255));
        SecurePass.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SecurePass.setText("by SecurePass");
        backPanel.add(SecurePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 90, -1));

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        title.setText("Gerenciador de Senhas");
        backPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 150, -1));

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/back.jpg"))); // NOI18N
        backLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backPanel.add(backLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 150));
        backPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 400, 20));

        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/exit.png"))); // NOI18N
        btnExit.setText("Sair");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        backPanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 80, -1));

        btnAcess.setBackground(new java.awt.Color(51, 51, 255));
        btnAcess.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAcess.setForeground(new java.awt.Color(255, 255, 255));
        btnAcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/binoculars.png"))); // NOI18N
        btnAcess.setText("Acessos");
        btnAcess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcess.setFocusPainted(false);
        btnAcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessActionPerformed(evt);
            }
        });
        backPanel.add(btnAcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 200, 30));

        btnChangePass.setBackground(new java.awt.Color(51, 51, 255));
        btnChangePass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChangePass.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/write.png"))); // NOI18N
        btnChangePass.setText("Trocar Senha");
        btnChangePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangePass.setFocusPainted(false);
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        backPanel.add(btnChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 200, 30));

        btnCreate.setBackground(new java.awt.Color(51, 51, 255));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/list.png"))); // NOI18N
        btnCreate.setText("Informações Cadastradas");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.setFocusPainted(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        backPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 200, 30));

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        dispose();
        new jFramePassList().setVisible(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnAcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessActionPerformed
        dispose();
        new jFrameAcesso().setVisible(true);
    }//GEN-LAST:event_btnAcessActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        dispose();
        new jFrameTrocarSenha().setVisible(true);
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        UserInfo.leftAccount();
        dispose();
        new jFrameTelaInicial().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SecurePass;
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnAcess;
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel title;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
