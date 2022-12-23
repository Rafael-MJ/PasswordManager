package securepass.view;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import securepass.connections.Connections;
import securepass.model.UserInfo;

public class jFrameCriarSenha extends javax.swing.JFrame {

    Connections cons = new Connections();
    
    public jFrameCriarSenha() {
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
        SecurePass = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        btnCreate = new javax.swing.JButton();
        txtSenha = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtLink = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        boxTipo = new javax.swing.JComboBox<>();
        backLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Cadastrar");
        setBackground(new java.awt.Color(204, 204, 0));
        setForeground(new java.awt.Color(255, 255, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(51, 51, 51));
        backPanel.setForeground(new java.awt.Color(102, 102, 102));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SecurePass.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        SecurePass.setForeground(new java.awt.Color(255, 255, 255));
        SecurePass.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SecurePass.setText("by SecurePass");
        backPanel.add(SecurePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 130, -1));

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(204, 204, 204));
        title.setText("Gerenciador de Senhas");
        backPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        btnBack.setBackground(new java.awt.Color(51, 51, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/return.png"))); // NOI18N
        btnBack.setText("Voltar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        backPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        backPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 370, 10));

        btnCreate.setBackground(new java.awt.Color(0, 204, 0));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/save.png"))); // NOI18N
        btnCreate.setText("CRIAR");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.setEnabled(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        backPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 130, 41));

        txtSenha.setBackground(new java.awt.Color(51, 51, 51));
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setText("---");
        txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSenha.setDisabledTextColor(java.awt.Color.red);
        txtSenha.setEnabled(false);
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });
        backPanel.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 195, 50));

        txtUser.setBackground(new java.awt.Color(51, 51, 51));
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("---");
        txtUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "@User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtUser.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUser.setDisabledTextColor(java.awt.Color.red);
        txtUser.setEnabled(false);
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
        backPanel.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 195, 50));

        txtLink.setBackground(new java.awt.Color(51, 51, 51));
        txtLink.setForeground(new java.awt.Color(255, 255, 255));
        txtLink.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLink.setText("---");
        txtLink.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Link", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtLink.setCaretColor(new java.awt.Color(255, 255, 255));
        txtLink.setDisabledTextColor(java.awt.Color.red);
        txtLink.setEnabled(false);
        txtLink.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLinkFocusLost(evt);
            }
        });
        txtLink.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLinkKeyReleased(evt);
            }
        });
        backPanel.add(txtLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 195, 50));

        txtTitulo.setBackground(new java.awt.Color(51, 51, 51));
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitulo.setText("---");
        txtTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Titulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtTitulo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTitulo.setDisabledTextColor(java.awt.Color.red);
        txtTitulo.setEnabled(false);
        txtTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTituloFocusLost(evt);
            }
        });
        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTituloKeyReleased(evt);
            }
        });
        backPanel.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 195, 50));

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 390, 360));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/logo.png"))); // NOI18N
        logo.setToolTipText("");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        boxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Simples", "Rede Social" }));
        boxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoActionPerformed(evt);
            }
        });
        getContentPane().add(boxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, -1));

        backLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(backLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setTipo(int i){
        switch(i){
            case 1 -> {
                txtLink.setEnabled(true);
                txtUser.setEnabled(true);
                txtTitulo.setEnabled(true);
                txtSenha.setEnabled(true);
                txtTitulo.setText("");
                txtSenha.setText("");
                txtLink.setText("");
                txtUser.setText("");
                txtTitulo.setHorizontalAlignment(JTextField.LEADING);
                txtSenha.setHorizontalAlignment(JTextField.LEADING);
                txtLink.setHorizontalAlignment(JTextField.LEADING);
                txtUser.setHorizontalAlignment(JTextField.LEADING);
                btnCreate.setEnabled(true);
                break;
            }
            case 2 -> {
                txtLink.setEnabled(false);
                txtUser.setEnabled(false);
                txtTitulo.setEnabled(true);
                txtSenha.setEnabled(true);
                txtTitulo.setText("");
                txtSenha.setText("");
                txtLink.setText("---");
                txtUser.setText("---");
                txtTitulo.setHorizontalAlignment(JTextField.LEADING);
                txtSenha.setHorizontalAlignment(JTextField.LEADING);
                txtLink.setHorizontalAlignment(JTextField.CENTER);
                txtUser.setHorizontalAlignment(JTextField.CENTER);
                btnCreate.setEnabled(true);
                break;
            }
            default -> {
                txtLink.setEnabled(false);
                txtUser.setEnabled(false);
                txtTitulo.setEnabled(false);
                txtSenha.setEnabled(false);
                txtLink.setText("---");
                txtUser.setText("---");
                txtTitulo.setText("---");
                txtSenha.setText("---");
                txtTitulo.setHorizontalAlignment(JTextField.CENTER);
                txtSenha.setHorizontalAlignment(JTextField.CENTER);
                txtLink.setHorizontalAlignment(JTextField.CENTER);
                txtUser.setHorizontalAlignment(JTextField.CENTER);
                btnCreate.setEnabled(false);
                break;
            }
        }
    }
    
    private void boxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoActionPerformed
        switch(String.valueOf(boxTipo.getSelectedItem())){
            case "Simples" -> { 
                setTipo(2);
                break;
            }
            case "Rede Social" -> { 
                setTipo(1);
                break;
            }
            default -> { 
                setTipo(0);
                break;
            }
        }
    }//GEN-LAST:event_boxTipoActionPerformed

    private String getUser(){
        return txtUser.getText();
    }
    
    private String getPass(){
        return txtSenha.getText();
    }
    
    private String getLink(){
        return txtLink.getText();
    }
    
    private String getTitulo(){
        return txtTitulo.getText();
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new jFramePassList().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        cons.setSenha(String.valueOf(boxTipo.getSelectedItem()), getTitulo(), 
                getPass(), getUser(), getLink(), UserInfo.getUserID());
        dispose();
        new jFramePassList().setVisible(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtTituloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyReleased
        while(getTitulo().length() > 20)
            txtTitulo.setText(getTitulo().substring(0,20));
    }//GEN-LAST:event_txtTituloKeyReleased

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        while(getPass().length() > 30)
            txtSenha.setText(getPass().substring(0,30));
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        while(getUser().length() > 20)
            txtUser.setText(getUser().substring(0,20));
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtLinkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLinkKeyReleased
        while(getLink().length() > 60)
            txtLink.setText(getLink().substring(0,60));
    }//GEN-LAST:event_txtLinkKeyReleased

    private void txtTituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusLost
        if(getTitulo().length() > 20)
            txtTitulo.setText(null);
    }//GEN-LAST:event_txtTituloFocusLost

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if(getPass().length() > 30)
            txtSenha.setText(null);
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if(getUser().length() > 20)
            txtUser.setText(null);
    }//GEN-LAST:event_txtUserFocusLost

    private void txtLinkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLinkFocusLost
        if(getLink().length() > 60)
            txtLink.setText(null);
    }//GEN-LAST:event_txtLinkFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SecurePass;
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtLink;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
