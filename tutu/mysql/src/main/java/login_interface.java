import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 1008005
 */
public class login_interface extends javax.swing.JFrame {

 private banco usuarioDAO;
    /**
     * Creates new form telalo
     */
    public login_interface() {
        initComponents();
        usuarioDAO = new banco(); // Inicializa o DAO
        dados(); // Carrega dados na tabela ao iniciar
    }
    private void dados() {
        List<Usuario> usuarios = usuarioDAO.listar();
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de preencher

        // Define as colunas da tabela (se não estiverem definidas no Design do NetBeans)
        // Se já estiverem definidas no design, pode comentar ou ajustar esta parte
        if (modelo.getColumnCount() == 0 || !modelo.getColumnName(0).equals("ID")) {
             modelo.setColumnIdentifiers(new String[]{"ID", "Login", "Senha"});
        }


        if (usuarios.isEmpty()) {
            // JOptionPane.showMessageDialog(this, "Nenhum usuário cadastrado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            // Não é ideal mostrar um popup toda vez que a tabela estiver vazia,
            // a tabela vazia já é um indicativo.
        } else {
            for (Usuario u : usuarios) {
                modelo.addRow(new Object[]{u.getId(), u.getLogin(), u.getSenha()});
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cadastro = new javax.swing.JToggleButton();
        consulta = new javax.swing.JToggleButton();
        txtLogin = new javax.swing.JTextField();
        alterar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        atualizar = new javax.swing.JToggleButton();
        txtSenha = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();

        jLabel5.setText("Senha");

        jToggleButton2.setText("jToggleButton2");

        jToggleButton3.setText("jToggleButton3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        cadastro.setText("cadastrar");
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 100, -1));

        consulta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        consulta.setText("Consulta");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        getContentPane().add(consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 100, -1));

        txtLogin.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 81, -1));

        alterar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setText("Senha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        atualizar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        atualizar.setText("atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 100, -1));

        txtSenha.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 90, -1));

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelaUsuario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 420, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
   // Idealmente, o texto deste botão na interface seria "Deletar"
        String idStr = JOptionPane.showInputDialog(this, "Digite o ID do usuário a ser DELETADO:", "Deletar Usuário", JOptionPane.QUESTION_MESSAGE);
        if (idStr == null || idStr.trim().isEmpty()) {
            // Usuário cancelou ou não digitou nada
            return;
        }

        try {
            int id = Integer.parseInt(idStr);

            // Confirmação antes de deletar
            int confirm = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja deletar o usuário com ID " + id + "?",
                "Confirmar Exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

            if (confirm == JOptionPane.YES_OPTION) {
                usuarioDAO.deletar(id); // Usa a instância da classe
                JOptionPane.showMessageDialog(this, "Usuário deletado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                dados(); // Atualiza a tabela na interface
                txtLogin.setText(""); // Limpa os campos
                txtSenha.setText("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido. Por favor, digite um número.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_alterarActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
          String login = txtLogin.getText();
        String senha = txtSenha.getText();

        if (login.trim().isEmpty() || senha.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Os campos Login e Senha não podem estar vazios.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);

        usuarioDAO.inserir(usuario); // Usa a instância da classe
       
        
        dados(); // Atualiza a tabela na interface
        txtLogin.setText(""); 
        txtSenha.setText("");
    }//GEN-LAST:event_cadastroActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
String idStr = JOptionPane.showInputDialog(this, "Digite o ID do usuário que deseja atualizar:", "Atualizar Usuário", JOptionPane.QUESTION_MESSAGE);
        if (idStr == null || idStr.trim().isEmpty()) {
            // Usuário cancelou ou não digitou nada
            return;
        }

        try {
            int id = Integer.parseInt(idStr);
            String login = txtLogin.getText();
            String senha = txtSenha.getText();

            if (login.trim().isEmpty() || senha.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Os campos Login e Senha não podem estar vazios para a atualização.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Usuario usuario = new Usuario();
            usuario.setId(id);
            usuario.setLogin(login);
            usuario.setSenha(senha);

            usuarioDAO.atualizar(usuario); // Usa a instância da classe
            JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            dados(); // Atualiza a tabela na interface
            txtLogin.setText(""); // Limpa os campos
            txtSenha.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido. Por favor, digite um número.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_atualizarActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
      dados();
    }//GEN-LAST:event_consultaActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(login_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton alterar;
    private javax.swing.JToggleButton atualizar;
    private javax.swing.JToggleButton cadastro;
    private javax.swing.JToggleButton consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
