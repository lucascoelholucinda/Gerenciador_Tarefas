package tela;

import dao.Entrada_UsuarioDao;
import dao.Entrada_UsuarioDaoImpl;
import entidade.Entrada_Usuario;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    private Entrada_Usuario entrada_Usuario;

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        fundo2 = new javax.swing.JPanel();
        tela = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        lb_login = new javax.swing.JLabel();
        var_login = new javax.swing.JTextField();
        lb_senha = new javax.swing.JLabel();
        var_senha = new javax.swing.JPasswordField();
        bt_logar = new javax.swing.JButton();
        bt_Cadastrar_Novo_Usuario = new javax.swing.JButton();
        lb_mensagem = new javax.swing.JLabel();
        barra_Menu = new javax.swing.JMenuBar();
        sair_Menu = new javax.swing.JMenu();
        sair_Sistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela De Login");

        fundo.setBackground(new java.awt.Color(153, 255, 255));
        fundo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fundo2.setBackground(new java.awt.Color(102, 204, 255));
        fundo2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fundo2.setForeground(new java.awt.Color(255, 255, 255));

        tela.setBackground(new java.awt.Color(153, 255, 255));
        tela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Titulo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Gerenciador De Tarefas");

        lb_login.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_login.setText("Login: ");

        var_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_loginActionPerformed(evt);
            }
        });

        lb_senha.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_senha.setText("Senha:");

        var_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_senhaActionPerformed(evt);
            }
        });

        bt_logar.setBackground(new java.awt.Color(102, 204, 255));
        bt_logar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        bt_logar.setText("Logar");
        bt_logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logarActionPerformed(evt);
            }
        });

        bt_Cadastrar_Novo_Usuario.setBackground(new java.awt.Color(102, 204, 255));
        bt_Cadastrar_Novo_Usuario.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        bt_Cadastrar_Novo_Usuario.setText("Cadastrar novo Usuario");
        bt_Cadastrar_Novo_Usuario.setBorderPainted(false);
        bt_Cadastrar_Novo_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cadastrar_Novo_UsuarioActionPerformed(evt);
            }
        });

        lb_mensagem.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lb_mensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensagem.setText("Entre com seus dados corretamente para acessar o sistema ");

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_login)
                .addGap(203, 203, 203))
            .addGroup(telaLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(lb_senha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(telaLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                        .addComponent(var_login, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 145, Short.MAX_VALUE))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt_logar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(var_senha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cadastrar_Novo_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(lb_mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(var_login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(var_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_logar)
                .addGap(18, 18, 18)
                .addComponent(bt_Cadastrar_Novo_Usuario)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout fundo2Layout = new javax.swing.GroupLayout(fundo2);
        fundo2.setLayout(fundo2Layout);
        fundo2Layout.setHorizontalGroup(
            fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo2Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        fundo2Layout.setVerticalGroup(
            fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sair_Menu.setText("Finalizar Sistema");

        sair_Sistema.setText("   Sair do sistema");
        sair_Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_SistemaActionPerformed(evt);
            }
        });
        sair_Menu.add(sair_Sistema);

        barra_Menu.add(sair_Menu);

        setJMenuBar(barra_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logarActionPerformed
        Entrada_UsuarioDao entrada_UsuarioDao = new Entrada_UsuarioDaoImpl();
        try {
            entrada_Usuario = entrada_UsuarioDao.logarNoSistema(var_login.getText(), String.valueOf(var_senha.getPassword()));
            if (var_login.getText().equals("") && String.valueOf(var_senha.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERRO! LOGIN OU SENHA  NÃO DIGITADO, POR FAVOR PREENCHA OS CAMPOS!");
            }else{
                
            if (limitesDeSenhaELogin(var_login.getText(), String.valueOf(var_senha.getPassword()))) {
                JOptionPane.showMessageDialog(null, "LOGIN OU SENHA NÃO ESTÃO DE ACORDO COM AS ESPECIFICAÇOES DO SISTEMA!\n"
                        + "\n"
                        + "LOGIN DEVE CONTER NO MAXIMO 20 CARACTERES!\n"
                        + "\n"
                        + "SENHA DEVE CONTER ESPECIFICAMENTE 4 DIGITOS NUMERICOS!"
                        + "\n");
            } else {
                if (entrada_Usuario == null) {
                    JOptionPane.showMessageDialog(null, "LOGIN OU SENHA NÃO EXISTENTES NO SISTEMA!");
                } else {

                    new GerenciamentodeAtividades(entrada_Usuario).setVisible(true);
                    dispose();

                }

            }
            }

        } catch (Exception e) {
            System.out.println("Erro ao logar na tela" + e.getMessage());
        }


    }//GEN-LAST:event_bt_logarActionPerformed

    private void bt_Cadastrar_Novo_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cadastrar_Novo_UsuarioActionPerformed
        new CadastrarUsuarioNovo().setVisible(true);

    }//GEN-LAST:event_bt_Cadastrar_Novo_UsuarioActionPerformed

    private void var_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_var_loginActionPerformed

    private void var_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_var_senhaActionPerformed

    private void sair_SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_SistemaActionPerformed
       dispose();
    }//GEN-LAST:event_sair_SistemaActionPerformed

    public boolean limitesDeSenhaELogin(String login, String senha) {

        if (login.length() > 20) {
            return true;
        } else {
            if (senha.length() <= 3 || senha.length() > 4) {
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
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JMenuBar barra_Menu;
    private javax.swing.JButton bt_Cadastrar_Novo_Usuario;
    private javax.swing.JButton bt_logar;
    private javax.swing.JPanel fundo;
    private javax.swing.JPanel fundo2;
    private javax.swing.JLabel lb_login;
    private javax.swing.JLabel lb_mensagem;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JMenu sair_Menu;
    private javax.swing.JMenuItem sair_Sistema;
    private javax.swing.JPanel tela;
    private javax.swing.JTextField var_login;
    private javax.swing.JPasswordField var_senha;
    // End of variables declaration//GEN-END:variables
}
