package securepass.view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import securepass.connections.DAO;
import securepass.model.Acessos;

public class jFrameAcesso extends javax.swing.JFrame {

    DAO dao = new DAO();
    
    public jFrameAcesso() {
        ImageIcon back = new ImageIcon(getClass().getResource("/securepass/images/back.jpg"));
        ImageIcon ic = new ImageIcon(getClass().getResource("/securepass/images/logo.png"));
        this.setIconImage(ic.getImage());
        initComponents();
        back.setImage(back.getImage().getScaledInstance(back.getIconWidth() + 130, back.getIconHeight() + 130, 1));
        backLogo.setIcon(back);
        readAcess();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackFuncoes = new javax.swing.JPanel();
        gotoMenu = new javax.swing.JLabel();
        scrollAcessos = new javax.swing.JScrollPane();
        tableAcessos = new javax.swing.JTable();
        btnChangePass = new javax.swing.JButton();
        backPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurePass - Acessos");
        setMinimumSize(new java.awt.Dimension(591, 603));
        setResizable(false);
        setSize(new java.awt.Dimension(591, 603));

        panelBackFuncoes.setBackground(new java.awt.Color(51, 51, 51));

        gotoMenu.setForeground(new java.awt.Color(153, 153, 153));
        gotoMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gotoMenu.setText("Voltar ao Menu");
        gotoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gotoMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gotoMenuMouseExited(evt);
            }
        });

        tableAcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAcessos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableAcessos.getTableHeader().setResizingAllowed(false);
        tableAcessos.getTableHeader().setReorderingAllowed(false);
        scrollAcessos.setViewportView(tableAcessos);

        btnChangePass.setBackground(new java.awt.Color(0, 51, 255));
        btnChangePass.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/write.png"))); // NOI18N
        btnChangePass.setText("Trocar Senha");
        btnChangePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBackFuncoesLayout = new javax.swing.GroupLayout(panelBackFuncoes);
        panelBackFuncoes.setLayout(panelBackFuncoesLayout);
        panelBackFuncoesLayout.setHorizontalGroup(
            panelBackFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackFuncoesLayout.createSequentialGroup()
                .addGroup(panelBackFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackFuncoesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scrollAcessos, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackFuncoesLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(gotoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackFuncoesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBackFuncoesLayout.setVerticalGroup(
            panelBackFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackFuncoesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(scrollAcessos, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChangePass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gotoMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securepass/images/logo.png"))); // NOI18N
        logo.setToolTipText("");
        backPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 120, 120));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Estão listados todos os acessos à sua conta, se encontrar algo suspeito troque sua senha.");
        backPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 560, -1));
        backPanel.add(backLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBackFuncoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBackFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotoMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoMenuMouseEntered
        gotoMenu.setForeground(Color.BLUE);
    }//GEN-LAST:event_gotoMenuMouseEntered

    private void readAcess(){
        DefaultTableModel models = (DefaultTableModel)tableAcessos.getModel();
        
        for(Acessos a: dao.getAcessos()){
            models.addRow(new Object[]{
                String.valueOf(a.getID()),
                String.valueOf(a.getData()),
            });
        tableAcessos.setModel(models);
        }
    }
    
    private void gotoMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoMenuMouseExited
        gotoMenu.setForeground(Color.GRAY);
    }//GEN-LAST:event_gotoMenuMouseExited

    private void gotoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoMenuMouseClicked
        dispose();
        new jFrameMenu().setVisible(true);
    }//GEN-LAST:event_gotoMenuMouseClicked

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        dispose();
        new jFrameTrocarSenha().setVisible(true);
    }//GEN-LAST:event_btnChangePassActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnChangePass;
    private javax.swing.JLabel gotoMenu;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelBackFuncoes;
    private javax.swing.JScrollPane scrollAcessos;
    private javax.swing.JTable tableAcessos;
    // End of variables declaration//GEN-END:variables
}
