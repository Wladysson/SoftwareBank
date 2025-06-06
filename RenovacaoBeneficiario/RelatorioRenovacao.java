/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bank.RenovacaoBeneficiario;
import com.mycompany.bank.CadastroBeneficiario.Pessoal;
import com.mycompany.bank.CadastroBeneficiario.Bancario;
import com.mycompany.bank.CadastroBeneficiario.Conexao;
import java.sql.Connection;// Banco DE DADOS
import java.sql.PreparedStatement;// BANCO DE DADOS 
import java.sql.ResultSet;
import java.sql.SQLException;// BANCO DE DADOS
import javax.swing.JOptionPane;
/**
 *
 * @author wladyson
 */
public class RelatorioRenovacao extends javax.swing.JFrame {
            private RenovaçaoCliente RenovaçaoCliente;
    /**
     * Creates new form RelatorioRenovacao
     */
    public RelatorioRenovacao() {
        
        this.RenovaçaoCliente = RenovaçaoCliente;
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnGerarRelatorio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpbProgresso = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jcbEstiloPDF = new javax.swing.JCheckBox();
        jcbEstiloWord = new javax.swing.JCheckBox();
        jcbEstiloXlsx = new javax.swing.JCheckBox();
        cboTipoRelatorio = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jcbDependencia = new javax.swing.JCheckBox();
        BtnPesqBeneficiario = new javax.swing.JButton();
        txtNomeparaRelatorio = new javax.swing.JTextField();
        txtMaeparaRelatorio = new javax.swing.JTextField();
        txtCPFRelatorio = new javax.swing.JTextField();
        lblNumConta = new javax.swing.JLabel();
        btnexit = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatorio de Beneficiario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        BtnGerarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folha de papel pequena.png"))); // NOI18N
        BtnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGerarRelatorioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("APOS CONFERIR OS DADOS APERTE PARA GERAR O RELATORIO:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setText("Nome:");

        jLabel3.setText("Nome da Mae:");

        jLabel6.setText("CPF:");

        jLabel8.setText("Numero Da Conta:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estilo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jcbEstiloPDF.setText("PDF");

        jcbEstiloWord.setText("Word");

        jcbEstiloXlsx.setText("Xlsx");

        cboTipoRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Financeiro", "Pessoal", "Emprestimo", "Renovaçao", " " }));

        jLabel10.setText("Tipo de Relatorio:");

        jcbDependencia.setText("Incluir Dependencias");
        jcbDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDependenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbEstiloXlsx, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEstiloWord, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEstiloPDF))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cboTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jcbDependencia))
                            .addComponent(jLabel10))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEstiloPDF)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEstiloWord)
                    .addComponent(cboTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbDependencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbEstiloXlsx)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        BtnPesqBeneficiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_pesquisa.png"))); // NOI18N
        BtnPesqBeneficiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesqBeneficiarioActionPerformed(evt);
            }
        });

        txtNomeparaRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeparaRelatorioActionPerformed(evt);
            }
        });

        lblNumConta.setBackground(new java.awt.Color(153, 153, 153));
        lblNumConta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNumConta.setForeground(new java.awt.Color(0, 0, 0));
        lblNumConta.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpbProgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCPFRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(BtnPesqBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMaeparaRelatorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                                .addComponent(txtNomeparaRelatorio, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeparaRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(txtMaeparaRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPFRelatorio)
                            .addComponent(lblNumConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnPesqBeneficiario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jpbProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGerarRelatorio)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );

        btnexit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnexit.setLabel("X");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerarRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGerarRelatorioActionPerformed

    private void jcbDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDependenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDependenciaActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void BtnPesqBeneficiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesqBeneficiarioActionPerformed
              String cpf = txtCPFRelatorio.getText();

    if (cpf.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, insira o CPF para pesquisa.");
    return;
}

    Pessoal cliente = BuscarClienteporCPF(cpf);
    Bancario dadosbancarios = buscarContaPorCPF(cpf); // <-- só busca depois de validar CPF

    if (cliente != null) {
        txtNomeparaRelatorio.setText(cliente.getNomeCompleto());
        txtMaeparaRelatorio.setText(cliente.getNomedaMae());
        txtCPFRelatorio.setText(cliente.getCPF());

    if (dadosbancarios != null) {
        lblNumConta.setText(dadosbancarios.getNumConta());
    } else {
        lblNumConta.setText("Conta não encontrada");
    }

         JOptionPane.showMessageDialog(this, "Cliente encontrado!");
    } else {
         JOptionPane.showMessageDialog(this, "Cliente não encontrado no sistema.");
}
    }//GEN-LAST:event_BtnPesqBeneficiarioActionPerformed

    private void txtNomeparaRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeparaRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeparaRelatorioActionPerformed
    
    //busca nos dados pessoal
    public Pessoal BuscarClienteporCPF(String CPF){
        Pessoal cliente = null;
        String sql = "SELECT * FROM Cadastro_pessoal WHERE cpf = ?";

        try (Connection conexao = Conexao.conectar();
         PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setString(1, CPF);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                cliente = new Pessoal();
                cliente.setNomeCompleto(rs.getString("nome_completo"));
                cliente.setCPF(rs.getString("cpf"));
                cliente.setNomedaMae(rs.getString("nome_mae"));
                
                // Preencha outros campos, se necessário
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar cliente: " + e.getMessage());
    }

    return cliente;
    }
    
    //busca nos dados bancarios
    public Bancario buscarContaPorCPF(String cpf) {
    Bancario dados = null;

    String sql = "SELECT db.numero_conta " +
                 "FROM dados_bancarios db " +
                 "JOIN cadastro_pessoal cp ON db.pessoal_id = cp.id " +
                 "WHERE cp.cpf = ?";

    try (Connection conexao = Conexao.conectar();
         PreparedStatement stmt = conexao.prepareStatement(sql)) {

        stmt.setString(1, cpf);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                dados = new Bancario();
                dados.setNumConta(rs.getString("numero_conta"));
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar dados bancários: " + e.getMessage());
    }

    return dados;
}
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioRenovacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioRenovacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioRenovacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioRenovacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioRenovacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGerarRelatorio;
    private javax.swing.JButton BtnPesqBeneficiario;
    private java.awt.Button btnexit;
    private javax.swing.JComboBox<String> cboTipoRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox jcbDependencia;
    private javax.swing.JCheckBox jcbEstiloPDF;
    private javax.swing.JCheckBox jcbEstiloWord;
    private javax.swing.JCheckBox jcbEstiloXlsx;
    private javax.swing.JProgressBar jpbProgresso;
    private javax.swing.JLabel lblNumConta;
    private javax.swing.JTextField txtCPFRelatorio;
    private javax.swing.JTextField txtMaeparaRelatorio;
    private javax.swing.JTextField txtNomeparaRelatorio;
    // End of variables declaration//GEN-END:variables
}
