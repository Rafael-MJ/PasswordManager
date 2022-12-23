package securepass.view;

import javax.swing.ImageIcon;
import securepass.connections.Connections;
import securepass.model.UserInfo;

public class jFramePrestServico extends javax.swing.JFrame {

    Connections conn;
    
    public jFramePrestServico() {
        ImageIcon ic = new ImageIcon(getClass().getResource("/securepass/images/logo.png"));
        this.setIconImage(ic.getImage());
        initComponents();
        lblDicaTelefone.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        logoHelp = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        separator = new javax.swing.JSeparator();
        backLogo = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        SecurePass = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        txtCurriculo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblDicaTelefone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Inscrição de Funcionário");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(51, 51, 51));
        backPanel.setForeground(new java.awt.Color(51, 51, 51));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/logo.png"))); // NOI18N
        logo.setToolTipText("");
        backPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

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

        logoHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/help.png"))); // NOI18N
        logoHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoHelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoHelpMouseExited(evt);
            }
        });
        backPanel.add(logoHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 20, 30));

        txtTelefone.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Celular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtTelefone.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyReleased(evt);
            }
        });
        backPanel.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 195, 40));
        backPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 380, 10));

        backLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/back.jpg"))); // NOI18N
        backLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backPanel.add(backLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        btnSend.setBackground(new java.awt.Color(51, 51, 255));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/save.png"))); // NOI18N
        btnSend.setText("Enviar");
        btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSend.setFocusPainted(false);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        backPanel.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 110, -1));

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

        SecurePass.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        SecurePass.setForeground(new java.awt.Color(255, 255, 255));
        SecurePass.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SecurePass.setText("by SecurePass");
        backPanel.add(SecurePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 80, -1));

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        title.setText("Gerenciador de Senhas");
        backPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 140, 20));

        txtCurriculo.setBackground(new java.awt.Color(51, 51, 51));
        txtCurriculo.setForeground(new java.awt.Color(255, 255, 255));
        txtCurriculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Curriculo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtCurriculo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCurriculo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCurriculoFocusLost(evt);
            }
        });
        txtCurriculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCurriculoKeyReleased(evt);
            }
        });
        backPanel.add(txtCurriculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 195, 40));

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        backPanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 195, 40));

        lblDicaTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDicaTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/dicaTelefone.png"))); // NOI18N
        backPanel.add(lblDicaTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 70, 50));

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new jFrameTelaInicial().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void resetarCampos(){
        txtNome.setText(null);
        txtTelefone.setText(null);
        txtEmail.setText(null);
        txtCurriculo.setText(null);
    }
    
    private String getNome(){
        return txtNome.getText();
    }
    
    private String getTelefone(){
        return txtTelefone.getText();
    }
    
    private String getEmail(){
        return txtEmail.getText();
    }
    
    private String getCurriculo(){
        return txtCurriculo.getText();
    }
    
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        conn = new Connections();
        conn.cadastroPrestador(getNome(), getTelefone(), getEmail(), getCurriculo());
        resetarCampos();
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        while(getNome().length() > 45)
            txtNome.setText(getNome().substring(0,45));
    }//GEN-LAST:event_txtNomeKeyReleased

    private void txtTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyReleased
        while(getTelefone().length() > 11)
            txtTelefone.setText(getTelefone().substring(0,11));
        if(!UserInfo.isNumeric(evt.getKeyChar())){
            while(getTelefone().contains(String.valueOf(evt.getKeyChar()))){
                txtTelefone.setText(getTelefone().substring(0,getTelefone().length()-1));
            }
        }
    }//GEN-LAST:event_txtTelefoneKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        while(getEmail().length() > 30)
            txtEmail.setText(getEmail().substring(0,30));
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtCurriculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurriculoKeyReleased
        while(getCurriculo().length() > 30)
            txtCurriculo.setText(getCurriculo().substring(0,30));
    }//GEN-LAST:event_txtCurriculoKeyReleased

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if(getNome().length() > 45)
            txtNome.setText(null);
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if(getEmail().length() > 30)
            txtEmail.setText(null);
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCurriculoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCurriculoFocusLost
        if(getCurriculo().length() > 30)
            txtCurriculo.setText(null);
    }//GEN-LAST:event_txtCurriculoFocusLost

    private void logoHelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoHelpMouseEntered
        lblDicaTelefone.setVisible(true);
        logoHelp.setIcon(new ImageIcon(getClass().getResource("/securepass/images/arrow.png")));
    }//GEN-LAST:event_logoHelpMouseEntered

    private void logoHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoHelpMouseExited
        lblDicaTelefone.setVisible(false);
        logoHelp.setIcon(new ImageIcon(getClass().getResource("/securepass/images/help.png")));
    }//GEN-LAST:event_logoHelpMouseExited

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        if(getTelefone().length() != 11){
            txtTelefone.setText(null);
        }else{
            for(int i = 0; i<getTelefone().length(); i++){
                if(!UserInfo.isNumeric(getTelefone().charAt(i)))
                txtTelefone.setText(null);
            }
            if(getTelefone().length() > 0){
                String finalText = "("+getTelefone().substring(0,2)
                +")"+getTelefone().substring(2,7)+"-"+getTelefone().substring(7);
                txtTelefone.setText(finalText);
            }
        }
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        if(getTelefone().contains("-")){
            txtTelefone.setText(getTelefone().replace("(", "").replace(")", "").replace("-", ""));
        }
    }//GEN-LAST:event_txtTelefoneFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SecurePass;
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel lblDicaTelefone;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoHelp;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCurriculo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
