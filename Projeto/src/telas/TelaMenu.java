package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class TelaMenu extends javax.swing.JFrame {

    //construtor da classe
    public TelaMenu() {
        initComponents();
    }

    public TelaMenu(String usuario, String cargo) {
        initComponents();
        pnlProdutos.setVisible(false);
        lblSaudacao.setText("Bem-vindo(a), " + usuario + "(" + cargo + ")");
        if (cargo.equalsIgnoreCase("estagiário") | cargo.equalsIgnoreCase("estagiario")) {
            itmConsultarProdutos.setEnabled(true);
            itmCadastrarProdutos.setEnabled(false);
            
            desativar();
        } else if (cargo.equalsIgnoreCase("vendedor")) {
            itmConsultarProdutos.setEnabled(true);
            itmCadastrarProdutos.setEnabled(true);
           
            desativar();
        } else if (cargo.equalsIgnoreCase("gerente")) {
            itmConsultarProdutos.setEnabled(true);
            itmCadastrarProdutos.setEnabled(true);
            itmAlterarProdutos.setEnabled(true);
            itmExcluirProdutos.setEnabled(true);
           
        } else {
            
        }
    }

    //Desativadas para estagiário e vendedor
    private void desativar() {
        itmAlterarProdutos.setEnabled(false);
        itmExcluirProdutos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        pnlProdutos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvarAlteracoes = new javax.swing.JButton();
        barMenu = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmCadastrarProdutos = new javax.swing.JMenuItem();
        itmAlterarProdutos = new javax.swing.JMenuItem();
        itmConsultarProdutos = new javax.swing.JMenuItem();
        itmExcluirProdutos = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmManual = new javax.swing.JMenuItem();

        setTitle("Menu do sistema");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(440, 0, 250, 40);

        pnlProdutos.setBackground(new java.awt.Color(255, 255, 153));
        pnlProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle de produtos"));
        pnlProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pnlProdutos.setLayout(null);

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigo.setText("Código:");
        pnlProdutos.add(lblCodigo);
        lblCodigo.setBounds(50, 40, 90, 30);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        pnlProdutos.add(txtCodigo);
        txtCodigo.setBounds(150, 40, 160, 30);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("Nome:");
        pnlProdutos.add(lblNome);
        lblNome.setBounds(50, 90, 90, 30);
        pnlProdutos.add(txtNome);
        txtNome.setBounds(150, 90, 420, 30);

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMarca.setText("Marca:");
        pnlProdutos.add(lblMarca);
        lblMarca.setBounds(50, 140, 90, 30);
        pnlProdutos.add(txtMarca);
        txtMarca.setBounds(150, 140, 280, 30);

        lblPreco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPreco.setText("Preço:");
        pnlProdutos.add(lblPreco);
        lblPreco.setBounds(50, 190, 90, 30);
        pnlProdutos.add(txtPreco);
        txtPreco.setBounds(150, 190, 110, 30);

        btnSalvar.setBackground(new java.awt.Color(51, 102, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlProdutos.add(btnSalvar);
        btnSalvar.setBounds(40, 240, 120, 40);

        btnBuscar.setBackground(new java.awt.Color(51, 102, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlProdutos.add(btnBuscar);
        btnBuscar.setBounds(320, 40, 130, 30);

        btnExcluir.setBackground(new java.awt.Color(51, 102, 255));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlProdutos.add(btnExcluir);
        btnExcluir.setBounds(40, 240, 120, 40);

        btnSalvarAlteracoes.setBackground(new java.awt.Color(51, 102, 255));
        btnSalvarAlteracoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvarAlteracoes.setText("Salvar alterações");
        btnSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracoesActionPerformed(evt);
            }
        });
        pnlProdutos.add(btnSalvarAlteracoes);
        btnSalvarAlteracoes.setBounds(20, 240, 170, 40);

        getContentPane().add(pnlProdutos);
        pnlProdutos.setBounds(40, 40, 670, 300);

        mnuProdutos.setMnemonic('P');
        mnuProdutos.setText("Produtos");

        itmCadastrarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarProdutos.setText("Cadastrar");
        itmCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmCadastrarProdutos);

        itmAlterarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarProdutos.setText("Alterar");
        itmAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmAlterarProdutos);

        itmConsultarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmConsultarProdutos.setText("Consultar");
        itmConsultarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmConsultarProdutos);

        itmExcluirProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirProdutos.setText("Excluir");
        itmExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmExcluirProdutos);

        barMenu.add(mnuProdutos);

        mnuAjuda.setMnemonic('u');
        mnuAjuda.setText("Ajuda");

        itmManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmManual.setText("Manual de Instruções");
        mnuAjuda.add(itmManual);

        barMenu.add(mnuAjuda);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(761, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutosActionPerformed
        pnlProdutos.setVisible(true);
        btnBuscar.setVisible(false);
        btnSalvar.setVisible(true);
        btnExcluir.setVisible(false);
        btnSalvarAlteracoes.setVisible(false);
        limpar();
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void limpar() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtMarca.setText("");
        txtPreco.setText("");
        txtCodigo.requestFocus();
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            //Conexão com o BD
            Connection conecta;
            PreparedStatement st;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistema", "root", "36613257");
            //Salva os dados dos campos da tela na tabela produtos do BD
            st = conecta.prepareStatement("INSERT INTO produtos VALUES(?,?,?,?)");
            st.setString(1, txtCodigo.getText());
            st.setString(2, txtNome.getText());
            st.setString(3, txtMarca.getText());
            st.setDouble(4, Double.parseDouble(txtPreco.getText().replace(",", ".")));
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso");
            //Limpar os campos
            limpar();
            //Fecha a conexão com o Banco de dados
            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado na library " + ex.getMessage());
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) { //Tentativa de duplicação de chave primária (código)
                JOptionPane.showMessageDialog(null, "Este código de produto já está cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o código:" + ex.getErrorCode());
            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void itmConsultarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarProdutosActionPerformed
        pnlProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnBuscar.setVisible(true);
        btnExcluir.setVisible(false);
        btnSalvarAlteracoes.setVisible(false);
    }//GEN-LAST:event_itmConsultarProdutosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            //Conexão com o BD
            Connection conecta;
            PreparedStatement st;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistema", "root", "36613257");
            //Buscando o produto pelo código na tabela do BD            
            st = conecta.prepareStatement("SELECT * FROM produtos WHERE codigo = ?");
            st.setString(1, txtCodigo.getText());
            ResultSet rs = st.executeQuery();
            //Verifica se o produto foi encontrato
            if (rs.next()) { //Se encontrou o produto na tabela
                //Exibir os dados nos campos do formulário
                txtNome.setText(rs.getString("nome"));
                txtMarca.setText(rs.getString("marca"));
                txtPreco.setText(rs.getString("preco"));
                btnExcluir.setVisible(true);
                btnSalvarAlteracoes.setVisible(false);
            } else { //Se não encontrou o produto
                JOptionPane.showMessageDialog(null, "Código não encontrado");
                txtCodigo.requestFocus();
            }
            //Desconecta do Banco de Dados
            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado na library " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void itmExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirProdutosActionPerformed
        pnlProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnExcluir.setVisible(true);
        btnBuscar.setVisible(true);
        btnSalvarAlteracoes.setVisible(false);
        limpar();
    }//GEN-LAST:event_itmExcluirProdutosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            //Conexão com o BD
            Connection conecta;
            PreparedStatement st;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistema", "root", "36613257");

            st = conecta.prepareStatement("DELETE FROM produtos WHERE codigo = ?");
            st.setString(1, txtCodigo.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
            btnExcluir.setVisible(false);
            btnSalvarAlteracoes.setVisible(false);

            limpar();

            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado na library " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto " + ex.getMessage());
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void itmAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarProdutosActionPerformed
        pnlProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnExcluir.setVisible(false);
        btnBuscar.setVisible(true);
        btnSalvarAlteracoes.setVisible(true);
        limpar();
    }//GEN-LAST:event_itmAlterarProdutosActionPerformed

    private void btnSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracoesActionPerformed
        try {
            //Conexão com o BD
            Connection conecta;
            PreparedStatement st;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistema", "root", "36613257");

            st = conecta.prepareStatement("UPDATE produtos SET nome = ?, marca = ?, preco = ? WHERE codigo = ?");
            st.setString(1, txtNome.getText());
            st.setString(2, txtMarca.getText());
            st.setDouble(3, Double.parseDouble(txtPreco.getText()));
            st.setString(4, txtCodigo.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
            btnExcluir.setVisible(false);
            btnSalvarAlteracoes.setVisible(false);
            limpar();

            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado na library " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto " + ex.getMessage());
        }

    }//GEN-LAST:event_btnSalvarAlteracoesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarAlteracoes;
    private javax.swing.JMenuItem itmAlterarProdutos;
    private javax.swing.JMenuItem itmCadastrarProdutos;
    private javax.swing.JMenuItem itmConsultarProdutos;
    private javax.swing.JMenuItem itmExcluirProdutos;
    private javax.swing.JMenuItem itmManual;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
