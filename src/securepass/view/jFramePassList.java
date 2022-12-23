package securepass.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import securepass.connections.Connections;
import securepass.model.InfoManager;
import securepass.model.SenhasCadastradas;

public class jFramePassList extends javax.swing.JFrame {

    Connections cons = new Connections();
    
    public jFramePassList() {
        ImageIcon ic = new ImageIcon(getClass().getResource("/securepass/images/logo.png"));
        this.setIconImage(ic.getImage());
        ImageIcon back = new ImageIcon(getClass().getResource("/securepass/images/back.jpg"));
        initComponents();
        readSenhas();
        back.setImage(back.getImage().getScaledInstance(back.getIconWidth() + 100, back.getIconHeight() + 100, 1));
        backLogo.setIcon(back);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        SecurePass = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        btnCreate = new javax.swing.JButton();
        scrollSenhas = new javax.swing.JScrollPane();
        tableSenhas = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Itens Cadastrados");
        setBackground(new java.awt.Color(204, 204, 0));
        setForeground(new java.awt.Color(255, 255, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(51, 51, 51));
        backPanel.setForeground(new java.awt.Color(102, 102, 102));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEdit.setBackground(new java.awt.Color(51, 51, 255));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/write.png"))); // NOI18N
        btnEdit.setText("EDITAR");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setFocusPainted(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        backPanel.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 130, 41));

        btnRemove.setBackground(new java.awt.Color(153, 0, 0));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/delete.png"))); // NOI18N
        btnRemove.setText("REMOVER");
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.setFocusPainted(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        backPanel.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 130, 41));

        SecurePass.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        SecurePass.setForeground(new java.awt.Color(255, 255, 255));
        SecurePass.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SecurePass.setText("by SecurePass");
        backPanel.add(SecurePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 80, -1));

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Gerenciador de Senhas");
        backPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

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
        backPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));
        backPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 530, 10));

        btnCreate.setBackground(new java.awt.Color(0, 204, 0));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/add.png"))); // NOI18N
        btnCreate.setText("CRIAR");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.setFocusPainted(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        backPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, 41));

        tableSenhas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "TITULO", "TIPO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSenhas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSenhas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSenhas.getTableHeader().setResizingAllowed(false);
        tableSenhas.getTableHeader().setReorderingAllowed(false);
        tableSenhas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSenhasMouseClicked(evt);
            }
        });
        scrollSenhas.setViewportView(tableSenhas);

        backPanel.add(scrollSenhas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 320));

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 550, 450));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("O melhor aplicativo para armazenar e fazer a gestão de senhas de forma simples e eficaz!");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 530, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/logo.png"))); // NOI18N
        logo.setToolTipText("");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        backLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(backLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String getSelectedType(){
        return String.valueOf(tableSenhas.getModel().getValueAt(tableSenhas.getSelectedRow(), 2));
    }
    
    private String getSelectedTitle(){
        return String.valueOf(tableSenhas.getModel().getValueAt(tableSenhas.getSelectedRow(), 1));
    }
    
    private String getSelectedData(){
        return String.valueOf(tableSenhas.getModel().getValueAt(tableSenhas.getSelectedRow(), 0));
    }
    
    public int getSelectedID(){
        int id = -1;
        
        if(tableSenhas.getSelectedRow() >= 0 && tableSenhas.getSelectedColumn() >= 0){
            for(SenhasCadastradas a: cons.getSenhas()){
                if(a.getData().equals(getSelectedData()) && a.getTipo().equals(getSelectedType())
                        && a.getTitulo().equals(getSelectedTitle())){
                    id = a.getID();
                    break;
                }
            }
        }
        return id;
    }
    
    private void readSenhas(){
        DefaultTableModel models = (DefaultTableModel) tableSenhas.getModel();
        
        for(SenhasCadastradas a: cons.getSenhas()){
            models.addRow(new Object[]{
                String.valueOf(a.getData()),
                String.valueOf(a.getTitulo()),
                String.valueOf(a.getTipo())
            });
        tableSenhas.setModel(models);
        }
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new jFrameMenu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        dispose();
        new jFrameConfirmIdent(0).setVisible(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(getSelectedID() != -1){
            InfoManager.setSelectedType(getSelectedType());
            InfoManager.setSelectedPassID(getSelectedID());
            InfoManager.setSelectedTitle(getSelectedTitle());
            dispose();
            new jFrameConfirmIdent(1).setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Item Selecionado!" , "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(getSelectedID() != -1){
            cons.deletePass(getSelectedID());
            JOptionPane.showMessageDialog(null, "Informações Removidas!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/securepass/images/Logo.png")));
            dispose();
            new jFramePassList().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Item Selecionado!" , "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tableSenhasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSenhasMouseClicked
        if(evt.getClickCount() == 2 && getSelectedID() != -1){
            InfoManager.setSelectedType(getSelectedType());
            InfoManager.setSelectedPassID(getSelectedID());
            dispose();
            new jFrameConfirmIdent(2).setVisible(true);
        }
    }//GEN-LAST:event_tableSenhasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SecurePass;
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel logo;
    private javax.swing.JScrollPane scrollSenhas;
    private javax.swing.JSeparator separator;
    private javax.swing.JTable tableSenhas;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
