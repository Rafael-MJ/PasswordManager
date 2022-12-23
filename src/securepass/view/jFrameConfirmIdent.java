package securepass.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import securepass.connections.Connections;
import securepass.model.InfoManager;

public class jFrameConfirmIdent extends javax.swing.JFrame {

    InfoManager im;
    Connections cons = new Connections();
    int ns;
    
    public jFrameConfirmIdent(int nextScreen) {
        ns = nextScreen;
        ImageIcon ic = new ImageIcon(getClass().getResource("/securepass/images/logo.png"));
        this.setIconImage(ic.getImage());
        ImageIcon back = new ImageIcon(getClass().getResource("/securepass/images/back.jpg"));
        initComponents();
        back.setImage(back.getImage().getScaledInstance(back.getIconWidth() + 100, back.getIconHeight() + 100, 1));
        backLogo.setIcon(back);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        SecurePass = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Confirmar Identidade");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(51, 51, 51));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(51, 51, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/return.png"))); // NOI18N
        btnBack.setText("Voltar");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        backPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnEnter.setBackground(new java.awt.Color(51, 51, 255));
        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/update.png"))); // NOI18N
        btnEnter.setText("Confirmar");
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setFocusPainted(false);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        backPanel.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 110, -1));
        backPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 380, 10));

        SecurePass.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        SecurePass.setForeground(new java.awt.Color(255, 255, 255));
        SecurePass.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SecurePass.setText("by SecurePass");
        backPanel.add(SecurePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 80, -1));

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Gerenciador de Senhas");
        backPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        txtPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        backPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 170, 40));

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 400, 200));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/logo.png"))); // NOI18N
        logo.setToolTipText("");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Verifique sua identidade para ter acesso as informações");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/back.jpg"))); // NOI18N
        backLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(backLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 210));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String getPass(){
        return String.valueOf(txtPassword.getPassword());
    }
    
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        im = new InfoManager();
        if(im.passVerify(getPass())){
            switch(ns){
                case 0 -> {
                    dispose();
                    new jFrameCriarSenha().setVisible(true);
                    break;
                }
                case 1 -> {
                    dispose();
                    new jFrameEditarSenha().setVisible(true);
                    break;
                }
                case 2 -> {
                    dispose();
                    new jFramePassList().setVisible(true);
                    JOptionPane.showMessageDialog(null, cons.getInfos(InfoManager.getSelectedPassID()), "INFORMAÇÕES", JOptionPane.PLAIN_MESSAGE);
                    break;
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Erro Desconhecido!" , "ERRO", JOptionPane.ERROR_MESSAGE, null);
                    dispose();
                    new jFramePassList().setVisible(true);
                    break;
                }
            }
        }else{
           txtPassword.setText(null);
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new jFramePassList().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        while(getPass().length() > 20)
            txtPassword.setText(getPass().substring(0,20));
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if(getPass().length() > 20)
            txtPassword.setText(null);
    }//GEN-LAST:event_txtPasswordFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SecurePass;
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
