package securepass.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import securepass.connections.DAO;

public class jFrameTrocarSenha extends javax.swing.JFrame {

    DAO dao = new DAO();
    
    public jFrameTrocarSenha() {
        ImageIcon ic = new ImageIcon(getClass().getResource("/securepass/images/logo.png"));
        this.setIconImage(ic.getImage());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        SecurePass = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        txtRepeatPass = new javax.swing.JPasswordField();
        txtPass = new javax.swing.JPasswordField();
        txtNewPass = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Trocar Senha");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(51, 51, 51));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(51, 51, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/return.png"))); // NOI18N
        btnBack.setText("Voltar");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        backPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        btnChange.setBackground(new java.awt.Color(51, 51, 255));
        btnChange.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/write.png"))); // NOI18N
        btnChange.setText("Trocar Senha");
        btnChange.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnChange.setFocusPainted(false);
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        backPanel.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));
        backPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 370, 10));

        SecurePass.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        SecurePass.setForeground(new java.awt.Color(255, 255, 255));
        SecurePass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SecurePass.setText("by SecurePass");
        backPanel.add(SecurePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 80, -1));

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        title.setText("Gerenciador de Senhas");
        backPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 140, -1));

        txtRepeatPass.setBackground(new java.awt.Color(51, 51, 51));
        txtRepeatPass.setForeground(new java.awt.Color(255, 255, 255));
        txtRepeatPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Repetir Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtRepeatPass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRepeatPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepeatPassFocusLost(evt);
            }
        });
        txtRepeatPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRepeatPassKeyReleased(evt);
            }
        });
        backPanel.add(txtRepeatPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 180, -1));

        txtPass.setBackground(new java.awt.Color(51, 51, 51));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha Atual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
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
        backPanel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 180, -1));

        txtNewPass.setBackground(new java.awt.Color(51, 51, 51));
        txtNewPass.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nova Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        txtNewPass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNewPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewPassFocusLost(evt);
            }
        });
        txtNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPassKeyReleased(evt);
            }
        });
        backPanel.add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 180, -1));

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 390, 280));

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
        new jFrameMenu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private String getPass(){
        return String.valueOf(txtPass.getPassword());
    }
    
    private String getNewPass(int field){
        switch(field){
            case 1 -> {
                return String.valueOf(txtNewPass.getPassword());
            }
            case 2 -> {
                return String.valueOf(txtRepeatPass.getPassword());
            }
            default -> {
                return String.valueOf(txtNewPass.getPassword());
            }
        }
    }
    
    private void resetarCampos(){
        txtPass.setText("");
        txtNewPass.setText("");
        txtRepeatPass.setText("");
    }
    
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if(!getPass().equals("")&& !getNewPass(1).equals("") && !getNewPass(2).equals("") 
                && getNewPass(1).equals(getNewPass(2)) && !getPass().equals(getNewPass(1))){
            String senha = dao.getSenha();

            if(senha.equals(getPass())){
                dao.setSenha(getNewPass(1));
                dispose();
                new jFrameLogin().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "As senhas não batem.", "ERRO", JOptionPane.ERROR_MESSAGE, null);
                resetarCampos();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "ERRO", JOptionPane.ERROR_MESSAGE, null);
            resetarCampos();
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        while(getPass().length() > 20)
            txtPass.setText(getPass().substring(0,20));
    }//GEN-LAST:event_txtPassKeyReleased

    private void txtNewPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPassKeyReleased
        while(getNewPass(1).length() > 20)
            txtNewPass.setText(getNewPass(1).substring(0,20));
    }//GEN-LAST:event_txtNewPassKeyReleased

    private void txtRepeatPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepeatPassKeyReleased
        while(getNewPass(2).length() > 20)
            txtRepeatPass.setText(getNewPass(2).substring(0,20));
    }//GEN-LAST:event_txtRepeatPassKeyReleased

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if(getPass().length() > 20)
            txtPass.setText(null);
    }//GEN-LAST:event_txtPassFocusLost

    private void txtNewPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPassFocusLost
        if(getNewPass(1).length() > 20)
            txtNewPass.setText(null);
    }//GEN-LAST:event_txtNewPassFocusLost

    private void txtRepeatPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepeatPassFocusLost
        if(getNewPass(2).length() > 20)
            txtRepeatPass.setText(null);
    }//GEN-LAST:event_txtRepeatPassFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SecurePass;
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtRepeatPass;
    // End of variables declaration//GEN-END:variables
}
