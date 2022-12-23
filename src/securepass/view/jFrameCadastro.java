package securepass.view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import securepass.connections.DAO;

public class jFrameCadastro extends javax.swing.JFrame {

    DAO dao = new DAO();
    
    public jFrameCadastro() {
        ImageIcon ic = new ImageIcon(getClass().getResource("/securepass/images/logo.png"));
        this.setIconImage(ic.getImage());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtConfirmPass = new javax.swing.JPasswordField();
        txtNome = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        lblHaveAccount = new javax.swing.JLabel();
        gotoLogin = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        backLogo = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Cadastro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(51, 51, 51));
        backPanel.setForeground(new java.awt.Color(51, 51, 51));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/logo.png"))); // NOI18N
        logo.setToolTipText("");
        backPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

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
        backPanel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 195, 40));

        txtConfirmPass.setBackground(new java.awt.Color(51, 51, 51));
        txtConfirmPass.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirmar Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtConfirmPass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtConfirmPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmPassFocusLost(evt);
            }
        });
        txtConfirmPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPassKeyReleased(evt);
            }
        });
        backPanel.add(txtConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 195, 40));

        txtNome.setBackground(new java.awt.Color(51, 51, 51));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Completo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtNome.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        backPanel.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 195, 40));

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
        backPanel.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 195, 40));

        lblHaveAccount.setBackground(new java.awt.Color(255, 255, 255));
        lblHaveAccount.setForeground(new java.awt.Color(204, 204, 204));
        lblHaveAccount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHaveAccount.setText("Já tem cadastro?");
        backPanel.add(lblHaveAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 100, -1));

        gotoLogin.setBackground(new java.awt.Color(255, 255, 255));
        gotoLogin.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        gotoLogin.setForeground(new java.awt.Color(255, 255, 255));
        gotoLogin.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        gotoLogin.setText("Realizar login");
        gotoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotoLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotoLoginMouseExited(evt);
            }
        });
        backPanel.add(gotoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 90, -1));
        backPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 380, 10));

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/back.jpg"))); // NOI18N
        backLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backPanel.add(backLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        btnCreate.setBackground(new java.awt.Color(51, 51, 255));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/save.png"))); // NOI18N
        btnCreate.setText("Cadastrar");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.setFocusPainted(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        backPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 110, -1));

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
        backPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new jFrameTelaInicial().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void gotoLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoLoginMouseEntered
        gotoLogin.setForeground(Color.BLUE);
    }//GEN-LAST:event_gotoLoginMouseEntered

    private void gotoLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoLoginMouseExited
        gotoLogin.setForeground(Color.WHITE);
    }//GEN-LAST:event_gotoLoginMouseExited

    private void gotoLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoLoginMouseClicked
        dispose();
        new jFrameLogin().setVisible(true);
    }//GEN-LAST:event_gotoLoginMouseClicked

    private void resetarCampos(){
        txtNome.setText(null);
        txtUser.setText(null);
        txtPass.setText(null);
        txtConfirmPass.setText(null);
    }
    
    private String getNome(){
        return txtNome.getText();
    }
    
    private String getUser(){
        return txtUser.getText();
    }
    
    private String getPass(){
        return String.valueOf(txtPass.getPassword());
    }
    
    private String getPassConfirm(){
        return String.valueOf(txtConfirmPass.getPassword());
    }
    
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if(!getNome().equals("") && !getUser().equals("") && !getPass().equals("") 
                && !getPassConfirm().equals("")){    
            if(getPass().equals(getPassConfirm())){
                String pass = getPass();
                if(dao.cadastro(getNome(), getUser(), pass)){
                    dispose();
                    new jFrameLogin().setVisible(true);
                }else{
                    resetarCampos();
                }
            }
            }else{
                JOptionPane.showMessageDialog(null, "Preencha os campos corretamente.", "ERRO", JOptionPane.ERROR_MESSAGE, null);
                resetarCampos();
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private String getPass(int pass){
        String password;
        
        switch(pass){
            case 1 -> {
                password = getPass();
                break;
            }
            case 2 -> {
                password = getPassConfirm();
                break;
            }
            default -> {
                password = getPass();
                break;
            }
        }
        return password;
    }
    
    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        while(getNome().length() > 45)
            txtNome.setText(getNome().substring(0,45));
    }//GEN-LAST:event_txtNomeKeyReleased

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        while(getUser().length() > 15)
            txtUser.setText(getUser().substring(0,15));
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        while(getPass(1).length() > 20)
            txtPass.setText(getPass(1).substring(0,20));
    }//GEN-LAST:event_txtPassKeyReleased

    private void txtConfirmPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPassKeyReleased
        while(getPass(2).length() > 20)
            txtConfirmPass.setText(getPass(2).substring(0,20));
    }//GEN-LAST:event_txtConfirmPassKeyReleased

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if(getNome().length() > 45)
            txtNome.setText(null);
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if(getUser().length() > 15)
            txtUser.setText(null);
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if(getPass(1).length() > 20)
            txtPass.setText(null);
    }//GEN-LAST:event_txtPassFocusLost

    private void txtConfirmPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPassFocusLost
        if(getPass(2).length() > 20)
            txtConfirmPass.setText(null);
    }//GEN-LAST:event_txtConfirmPassFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel gotoLogin;
    private javax.swing.JLabel lblHaveAccount;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator separator;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
