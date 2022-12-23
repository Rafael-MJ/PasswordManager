package securepass.view;

import java.awt.Color;
import javax.swing.ImageIcon;
import securepass.connections.DAO;
import securepass.model.RememberLogin;

public class jFrameLogin extends javax.swing.JFrame {

    DAO dao = new DAO();
    RememberLogin rl = new RememberLogin();
    
    public jFrameLogin() {
        ImageIcon ic = new ImageIcon(getClass().getResource("/securepass/images/logo.png"));
        this.setIconImage(ic.getImage());
        initComponents();
        
        if(rl.isRemembered()){
            txtUser.setText(rl.getUsername());
            txtPass.setText(rl.getSenha());
            boxRemember.setSelected(true);
        }else{
            rl.clear();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        lblHaveAccount = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        boxRemember = new javax.swing.JCheckBox();
        btnBack = new javax.swing.JButton();
        gotoCreate = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(51, 51, 51));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHaveAccount.setForeground(new java.awt.Color(204, 204, 204));
        lblHaveAccount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHaveAccount.setText(" Não tem uma conta?");
        backPanel.add(lblHaveAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 240, -1, -1));

        txtUser.setBackground(new java.awt.Color(51, 51, 51));
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtUser.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });
        backPanel.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 45, 180, 38));

        boxRemember.setBackground(new java.awt.Color(51, 51, 51));
        boxRemember.setForeground(new java.awt.Color(255, 255, 255));
        boxRemember.setText("Lembrar senha");
        boxRemember.setFocusPainted(false);
        boxRemember.setOpaque(true);
        boxRemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRememberActionPerformed(evt);
            }
        });
        backPanel.add(boxRemember, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 142, 130, -1));

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
        backPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 243, -1, -1));

        gotoCreate.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        gotoCreate.setForeground(new java.awt.Color(255, 255, 255));
        gotoCreate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        gotoCreate.setText("Criar conta");
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
        backPanel.add(gotoCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 110, 10));

        btnEnter.setBackground(new java.awt.Color(51, 51, 255));
        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/enter.png"))); // NOI18N
        btnEnter.setText("Entrar");
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setFocusPainted(false);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        backPanel.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 90, -1));
        backPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 370, 10));

        txtPass.setBackground(new java.awt.Color(51, 51, 51));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtPass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });
        backPanel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, -1));

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 390, 290));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/logo.png"))); // NOI18N
        logo.setToolTipText("");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/back.jpg"))); // NOI18N
        backLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(backLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 140));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new jFrameTelaInicial().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void gotoCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCreateMouseEntered
        gotoCreate.setForeground(Color.BLUE);
    }//GEN-LAST:event_gotoCreateMouseEntered

    private void gotoCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCreateMouseExited
        gotoCreate.setForeground(Color.WHITE);
    }//GEN-LAST:event_gotoCreateMouseExited

    private void gotoCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoCreateMouseClicked
        dispose();
        new jFrameCadastro().setVisible(true);
    }//GEN-LAST:event_gotoCreateMouseClicked

    private String getUser(){
        return txtUser.getText();
    }
    
    private String getPass(){
        return String.valueOf(txtPass.getPassword());
    }
    
    private void resetarCampos(){
        txtUser.setText(null);
        txtPass.setText(null);
    }
    
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        if(String.valueOf(getUser()) != null && getPass() != null){
            String pass = String.valueOf(getPass());
            if(dao.login(getUser(), pass)){
                if(rl.isRemembered()){
                rl.setLogin(getUser(), getPass());
                }
                dispose();
                new jFrameMenu().setVisible(true);
            }else{
                resetarCampos();
            }
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void boxRememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRememberActionPerformed
        if(!boxRemember.isSelected()){
            rl.clear();
        }else{
            rl.setLogin(getUser(), getPass());
        }
    }//GEN-LAST:event_boxRememberActionPerformed

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        while(getUser().length() > 15)
            txtUser.setText(getUser().substring(0,15));
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        while(getPass().length() > 20)
            txtPass.setText(getPass().substring(0,20));
    }//GEN-LAST:event_txtPassKeyReleased

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if(getUser().length() > 15)
            txtUser.setText(null);
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if(getPass().length() > 20)
            txtPass.setText(null);
    }//GEN-LAST:event_txtPassFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JCheckBox boxRemember;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel gotoCreate;
    private javax.swing.JLabel lblHaveAccount;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator separator;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
