package securepass.view;

import java.awt.Color;
import javax.swing.ImageIcon;
import securepass.model.InfoManager;

public class jFrameTelaInicial extends javax.swing.JFrame {

    public jFrameTelaInicial() {
        ImageIcon ic = new ImageIcon(getClass().getResource("/securepass/images/logo.png"));
        this.setIconImage(ic.getImage());
        initComponents();
        ver.setText(new InfoManager().getVersion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        SecurePass = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        ver = new javax.swing.JLabel();
        gotoCreate = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Inicio");
        setBackground(new java.awt.Color(204, 204, 0));
        setForeground(new java.awt.Color(255, 255, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(51, 51, 51));
        backPanel.setForeground(new java.awt.Color(102, 102, 102));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setBackground(new java.awt.Color(51, 51, 255));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/new.png"))); // NOI18N
        btnCreate.setText("Criar uma conta");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.setFocusPainted(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        backPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 214, 164, 41));

        btnEnter.setBackground(new java.awt.Color(51, 51, 255));
        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/login.png"))); // NOI18N
        btnEnter.setText("Acessar a Conta");
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setFocusPainted(false);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        backPanel.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 155, 164, 41));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/logo.png"))); // NOI18N
        logo.setToolTipText("");
        backPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 17, -1, -1));

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        title.setText("Gerenciador de Senhas");
        backPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 140, -1));

        SecurePass.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        SecurePass.setForeground(new java.awt.Color(255, 255, 255));
        SecurePass.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SecurePass.setText("by SecurePass");
        backPanel.add(SecurePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 80, -1));
        backPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 410, 20));

        ver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ver.setForeground(new java.awt.Color(255, 255, 255));
        ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver.setText("VERSION");
        backPanel.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, -1));

        gotoCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gotoCreate.setForeground(new java.awt.Color(255, 255, 255));
        gotoCreate.setText("Trabalhe Conosco");
        gotoCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoCreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotoCreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotoCreateMouseExited(evt);
            }
        });
        backPanel.add(gotoCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 10));

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 430, 330));

        lblWelcome.setBackground(new java.awt.Color(255, 255, 255));
        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Bem-vindo");
        getContentPane().add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Ao melhor aplicativo para se armazenar e fazer a gestão de forma simples e eficaz!");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 410, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/back.jpg"))); // NOI18N
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        dispose();
        new jFrameLogin().setVisible(true);
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        dispose();
        new jFrameCadastro().setVisible(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void gotoCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCreateMouseClicked
        dispose();
        new jFramePrestServico().setVisible(true);
    }//GEN-LAST:event_gotoCreateMouseClicked

    private void gotoCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCreateMouseEntered
        gotoCreate.setForeground(Color.BLUE);
    }//GEN-LAST:event_gotoCreateMouseEntered

    private void gotoCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCreateMouseExited
        gotoCreate.setForeground(Color.WHITE);
    }//GEN-LAST:event_gotoCreateMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SecurePass;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel gotoCreate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel title;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
