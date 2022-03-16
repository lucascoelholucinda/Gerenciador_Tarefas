package tela;

import dao.CadastroDao;
import dao.CadastroDaoImpl;
import dao.Entrada_UsuarioDao;
import dao.Entrada_UsuarioDaoImpl;
import dao.UsuarioDao;
import dao.UsuarioDaoImpl;
import entidade.Cadastro;
import entidade.Entrada_Usuario;
import entidade.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class CadastrarUsuarioNovo extends javax.swing.JFrame {

    private Cadastro cadastro = new Cadastro();
    private Usuario usuario = new Usuario();
    private Entrada_Usuario entrada_Usuario = new Entrada_Usuario();
    private CadastroDao cadastroDao = new CadastroDaoImpl();
    private UsuarioDao usuarioDao = new UsuarioDaoImpl();
    private Entrada_UsuarioDao entrada_UsuarioDao = new Entrada_UsuarioDaoImpl();

    public CadastrarUsuarioNovo() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        fundo2 = new javax.swing.JPanel();
        lb_nome = new javax.swing.JLabel();
        var_Nome = new javax.swing.JTextField();
        lb_Titulo = new javax.swing.JLabel();
        lb_Sobrenome = new javax.swing.JLabel();
        var_Sobrenome = new javax.swing.JTextField();
        lb_Cpf = new javax.swing.JLabel();
        var_Cpf = new javax.swing.JTextField();
        lb_Telefone = new javax.swing.JLabel();
        var_Telefone = new javax.swing.JTextField();
        lb_Email = new javax.swing.JLabel();
        var_Email = new javax.swing.JTextField();
        lb_Data = new javax.swing.JLabel();
        var_Data_De_Nascimento = new javax.swing.JTextField();
        lb_Nome_De_Usuario = new javax.swing.JLabel();
        var_Nome_De_Usuario = new javax.swing.JTextField();
        lb_Senha = new javax.swing.JLabel();
        var_Senha_Do_Usuario = new javax.swing.JPasswordField();
        bt_Cadastrar_Usuario_Novo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo.setBackground(new java.awt.Color(153, 255, 255));
        fundo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fundo2.setBackground(new java.awt.Color(102, 204, 255));
        fundo2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_nome.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nome.setText("PRIMEIRO NOME:");
        lb_nome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        var_Nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                var_NomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                var_NomeFocusLost(evt);
            }
        });
        var_Nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_NomeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                var_NomeMousePressed(evt);
            }
        });
        var_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_NomeActionPerformed(evt);
            }
        });

        lb_Titulo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lb_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Titulo.setText("  CADASTRAR  NOVO USUARIO:");

        lb_Sobrenome.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Sobrenome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Sobrenome.setText("SOBRENOME:");

        var_Sobrenome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_SobrenomeMouseClicked(evt);
            }
        });

        lb_Cpf.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Cpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Cpf.setText("CPF:");

        var_Cpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_CpfMouseClicked(evt);
            }
        });

        lb_Telefone.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Telefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Telefone.setText("TELEFONE:");

        var_Telefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_TelefoneMouseClicked(evt);
            }
        });
        var_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_TelefoneActionPerformed(evt);
            }
        });

        lb_Email.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Email.setText("EMAIL:");

        var_Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_EmailMouseClicked(evt);
            }
        });

        lb_Data.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Data.setText("DATA DE NASCIMENTO:");

        var_Data_De_Nascimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_Data_De_NascimentoMouseClicked(evt);
            }
        });

        lb_Nome_De_Usuario.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Nome_De_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Nome_De_Usuario.setText("NOME DE USUARIO:");

        var_Nome_De_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_Nome_De_UsuarioMouseClicked(evt);
            }
        });
        var_Nome_De_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_Nome_De_UsuarioActionPerformed(evt);
            }
        });

        lb_Senha.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Senha.setText("SENHA:");

        bt_Cadastrar_Usuario_Novo.setBackground(new java.awt.Color(153, 255, 255));
        bt_Cadastrar_Usuario_Novo.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        bt_Cadastrar_Usuario_Novo.setText("CADASTRAR");
        bt_Cadastrar_Usuario_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cadastrar_Usuario_NovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundo2Layout = new javax.swing.GroupLayout(fundo2);
        fundo2.setLayout(fundo2Layout);
        fundo2Layout.setHorizontalGroup(
            fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo2Layout.createSequentialGroup()
                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lb_Telefone))
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_Data)
                            .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(var_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(var_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(var_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(var_Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(var_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(var_Data_De_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(var_Nome_De_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(var_Senha_Do_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cadastrar_Usuario_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lb_nome))
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lb_Sobrenome))
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lb_Cpf))
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lb_Email)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fundo2Layout.createSequentialGroup()
                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lb_Senha))
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lb_Nome_De_Usuario))
                    .addComponent(lb_Titulo))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        fundo2Layout.setVerticalGroup(
            fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lb_Titulo)
                .addGap(34, 34, 34)
                .addComponent(lb_nome)
                .addGap(18, 18, 18)
                .addComponent(var_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Sobrenome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(var_Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Cpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(var_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Telefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(var_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(var_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(var_Data_De_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Nome_De_Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(var_Nome_De_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(var_Senha_Do_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Cadastrar_Usuario_Novo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void var_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_NomeActionPerformed

    }//GEN-LAST:event_var_NomeActionPerformed

    private void bt_Cadastrar_Usuario_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cadastrar_Usuario_NovoActionPerformed
        cadastro.setNome(var_Nome.getText().trim());
        cadastro.setSobrenome(var_Sobrenome.getText().trim());
        cadastro.setCpf(var_Cpf.getText().trim());
        try {
            if (cadastroDao.BuscarUsuariosCpfDB(cadastro.getCpf())) {
                JOptionPane.showMessageDialog(null, "CPF INVALIDO!\n"
                        + "ESSE CPF JÁ POSSUI UM USUARIO!");
            } else {

            }
        } catch (Exception ex) {
            System.out.println("Erro ao pesquisar cpf na tela" + ex.getMessage());
        }
        cadastro.setTelefone(var_Telefone.getText().trim());
        cadastro.setEmail(var_Email.getText().trim());
        String datanasc = var_Data_De_Nascimento.getText().trim();
        Date datanova;
        try {
            datanova = MostrarDataConvertidade(datanasc);
            cadastro.setData_nac(datanova);
        } catch (ParseException ex) {
            System.out.println("Erro com data de nascimento na tela");
        }
        usuario.setLogin(var_Nome_De_Usuario.getText().trim());
        usuario.setSenha(String.valueOf(var_Senha_Do_Usuario.getPassword()));
        if (limiteDeSenhaELogin(usuario.getLogin(), usuario.getSenha())) {
            JOptionPane.showMessageDialog(null, "LOGIN  OU SENHA INVALIDO!\n"
                    + "LOGIN DEVE POSSUIR NO MAXIMO 20 CARACTERES!\n"
                    + "SENHA DEVE POSSUIR ESPECIFICAMENTE 4 DIGITOS NUMERICOS!");

        } else {
            usuario.setSenha(String.valueOf(var_Senha_Do_Usuario.getPassword()));
            usuario.setIdcadastro(cadastro);
            entrada_Usuario.setLogin_acesso(usuario.getLogin());
            entrada_Usuario.setSenha_acesso(usuario.getSenha());
            entrada_Usuario.setIdusuario(usuario);
            boolean confirma = false;
            try {

                if (usuarioDao.BuscarUsuariosLoginDB(usuario.getLogin())) {
                    confirma = true;

                } else {
                    if (usuarioDao.BuscarSenhasDB(usuario.getSenha())) {
                        confirma = true;
                    }

                }

            } catch (Exception ex) {
                System.out.println("Erro em confirmação de usuario na tela" + ex.getMessage());
            }

            if (confirma == true) {

                JOptionPane.showMessageDialog(null, "CADASTRO INVALIDO!\n"
                        + "NOME DO USUARIO OU SENHA ESCOLHIDO PERTENCE A OUTRO USUARIO!");
            } else {
                try {

                    cadastroDao.salvar(cadastro);
                    usuarioDao.salvar(usuario);
                    entrada_UsuarioDao.salvar(entrada_Usuario);
                    JOptionPane.showMessageDialog(null, "NOVO USUARIO CADASTRADO COM SUCESSO!");
                    dispose();

                } catch (Exception e) {
                    System.out.println("Erro ao tentar Cadastrar usuario novo no banco na tela! " + e.getMessage());
                }

            }

        }


    }//GEN-LAST:event_bt_Cadastrar_Usuario_NovoActionPerformed

    private void var_Nome_De_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_Nome_De_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_var_Nome_De_UsuarioActionPerformed

    private void var_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_var_TelefoneActionPerformed

    private void var_NomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_NomeMouseClicked
        if (var_Nome.getText().equals("")) {
            var_Nome.setText("Ex: Carlos");
        } else {
            if (var_Nome.getText().equals("Ex: Carlos")) {

                var_Nome.setText("");

            }
        }
    }//GEN-LAST:event_var_NomeMouseClicked

    private void var_SobrenomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_SobrenomeMouseClicked
        if (var_Sobrenome.getText().equals("")) {
            var_Sobrenome.setText("Ex: Machado");
        } else {
            if (var_Sobrenome.getText().equals("Ex: Machado")) {
                var_Sobrenome.setText("");
            }
        }
    }//GEN-LAST:event_var_SobrenomeMouseClicked

    private void var_NomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_NomeMousePressed

    }//GEN-LAST:event_var_NomeMousePressed

    private void var_NomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_var_NomeFocusGained

    }//GEN-LAST:event_var_NomeFocusGained

    private void var_NomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_var_NomeFocusLost

    }//GEN-LAST:event_var_NomeFocusLost

    private void var_CpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_CpfMouseClicked
        if (var_Cpf.getText().equals("")) {

            var_Cpf.setText("Ex: 121.022.234-01");
        } else {
            if (var_Cpf.getText().equals("Ex: 121.022.234-01")) {
                var_Cpf.setText("");
            }

        }
    }//GEN-LAST:event_var_CpfMouseClicked

    private void var_TelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_TelefoneMouseClicked
        if (var_Telefone.getText().equals("")) {
            var_Telefone.setText("Ex:(47)993221-456");
        } else {
            if (var_Telefone.getText().equals("Ex:(47)993221-456")) {
                var_Telefone.setText("");
            }

        }
    }//GEN-LAST:event_var_TelefoneMouseClicked

    private void var_EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_EmailMouseClicked
        if (var_Email.getText().equals("")) {
            var_Email.setText("Ex: Carlos201@gmail.com");
        } else {
            if (var_Email.getText().equals("Ex: Carlos201@gmail.com")) {
                var_Email.setText("");
            }

        }
    }//GEN-LAST:event_var_EmailMouseClicked

    private void var_Data_De_NascimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_Data_De_NascimentoMouseClicked
        if (var_Data_De_Nascimento.getText().equals("")) {
            var_Data_De_Nascimento.setText("Ex: 2002-01-12");
        } else {
            if (var_Data_De_Nascimento.getText().equals("Ex: 2002-01-12")) {
                var_Data_De_Nascimento.setText("");
            }

        }
    }//GEN-LAST:event_var_Data_De_NascimentoMouseClicked

    private void var_Nome_De_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_Nome_De_UsuarioMouseClicked
        if (var_Nome_De_Usuario.getText().equals("")) {
            var_Nome_De_Usuario.setText("PLAYER1235");
        } else {
            if (var_Nome_De_Usuario.getText().equals("PLAYER1235")) {
                var_Nome_De_Usuario.setText("");
            }

        }
    }//GEN-LAST:event_var_Nome_De_UsuarioMouseClicked

    public java.sql.Date MostrarDataConvertidade(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date datarecebida = formato.parse(data);
        java.sql.Date dataconvertida = new java.sql.Date(datarecebida.getTime());
        return dataconvertida;
    }

    public boolean limiteDeSenhaELogin(String login, String senha) {

        if (login.length() > 20 || login.equals("")) {
            return true;
        } else {
            if (senha.length() <= 3 || senha.length() > 4 || senha.equals("")) {
                return true;
            }
        }

        return false;

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
            java.util.logging.Logger.getLogger(CadastrarUsuarioNovo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuarioNovo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuarioNovo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuarioNovo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuarioNovo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Cadastrar_Usuario_Novo;
    private javax.swing.JPanel fundo;
    private javax.swing.JPanel fundo2;
    private javax.swing.JLabel lb_Cpf;
    private javax.swing.JLabel lb_Data;
    private javax.swing.JLabel lb_Email;
    private javax.swing.JLabel lb_Nome_De_Usuario;
    private javax.swing.JLabel lb_Senha;
    private javax.swing.JLabel lb_Sobrenome;
    private javax.swing.JLabel lb_Telefone;
    private javax.swing.JLabel lb_Titulo;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JTextField var_Cpf;
    private javax.swing.JTextField var_Data_De_Nascimento;
    private javax.swing.JTextField var_Email;
    private javax.swing.JTextField var_Nome;
    private javax.swing.JTextField var_Nome_De_Usuario;
    private javax.swing.JPasswordField var_Senha_Do_Usuario;
    private javax.swing.JTextField var_Sobrenome;
    private javax.swing.JTextField var_Telefone;
    // End of variables declaration//GEN-END:variables
}
