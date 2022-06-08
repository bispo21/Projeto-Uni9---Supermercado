
package telas;
//Classe que conecta ao banco de dados
import java.sql.Connection;
//Classe que permite a ecxecução de comandos SQL
import java.sql.PreparedStatement;
//Classe para a qual deverei passar o nome do BD, usuario, senha e porta
import java.sql.DriverManager;
//Classe que vai guardar informações de erros de SQL (nome do BD, tabela, usuario, senha do BD)
import java.sql.SQLException;
//Classe que recebe o resultado de uma busca (SELECT) na tabela do BD
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {


    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso ao sistema");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(20, 20, 90, 40);

        txtUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtUsuario.setForeground(new java.awt.Color(255, 51, 51));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(90, 30, 260, 30);

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(20, 70, 70, 30);

        pswSenha.setBackground(new java.awt.Color(204, 204, 255));
        pswSenha.setForeground(new java.awt.Color(255, 51, 51));
        pswSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(pswSenha);
        pswSenha.setBounds(90, 70, 180, 30);

        btnEntrar.setBackground(new java.awt.Color(204, 204, 255));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(20, 120, 130, 40);

        setSize(new java.awt.Dimension(493, 227));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            // 1) Conectar no Banco de dados bdsistema
            Connection conecta;
            PreparedStatement st;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistema","root","36613257");
           // 2) Verificar se o usuário está cadastrado na tabela usuarios
            st = conecta.prepareStatement("SELECT * FROM usuarios WHERE usuario=? AND senha=?");
            st.setString(1, txtUsuario.getText());
            st.setString(2, pswSenha.getText());
            ResultSet rs = st.executeQuery(); //executa o SELECT

            // 3) Se não estiver cadastrado, impedir o acesso e informar
            //    Se cadastrado, abrir a classe TelaMenu.java
            if(!rs.next()){ //Verifica se a variável rs está vazia 
                JOptionPane.showMessageDialog(null,"Usuário e/ou senha inválidos");
            }else { //verifica se o rs contém os dados retornados na consulta na tabela
                txtUsuario.setText(""); // Limpa o campo txtUsuario
                pswSenha.setText("");  // Limpa o campo senha
                TelaMenu tela;
                tela = new TelaMenu(rs.getString("usuario"),rs.getString("cargo"));
                tela.setVisible(true);
            }
            // 4) Desconectar do banco de dados
            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado na library " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            pswSenha.requestFocus(); //Passa para o campo pswSenha
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void pswSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswSenhaKeyPressed
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
           btnEntrar.doClick(); //Executa o botã Entrar automaticamente
        }
    }//GEN-LAST:event_pswSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
