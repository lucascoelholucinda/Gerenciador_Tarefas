package tela;

import dao.AgendamentoDao;
import dao.AgendamentoDaoImpl;
import dao.TarefaDao;
import dao.TarefaDaoImpl;
import entidade.Agendamento;
import entidade.Entrada_Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciamentodeAtividades extends javax.swing.JFrame {

    private Entrada_Usuario entrada_Usuario;
    private Agendamento agendamento;
    private AgendamentoDao agendamentoDao = new AgendamentoDaoImpl();
    private List<Agendamento> agendamentos;
    private DefaultTableModel tabelaModelo;
    private TarefaDao tarefaDao = new TarefaDaoImpl();

    public GerenciamentodeAtividades() {
        initComponents();

    }

    public GerenciamentodeAtividades(Entrada_Usuario entrada_Usuario) {
        initComponents();
        this.entrada_Usuario = entrada_Usuario;
        carregarComboPrioridade();
        carregarComboStatus();

    }

    private void carregarComboPrioridade() {
        var_Combo_Prioridade.addItem("Selecione o nivel de prioridade...");
        var_Combo_Prioridade.addItem("Dificil");
        var_Combo_Prioridade.addItem("Medio");
        var_Combo_Prioridade.addItem("Facil");

    }

    private void carregarComboStatus() {
        var_Combo_Status.addItem("Selecione o status da tarefa...");
        var_Combo_Status.addItem("FINALIZADA");
        var_Combo_Status.addItem("EM ANDAMENTO");
        var_Combo_Status.addItem("NÃO CONCLUIDA");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        fundo2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Agendamento = new javax.swing.JTable();
        lb_Titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        var_Pesquisar_Tarefa_Nome = new javax.swing.JTextField();
        bt_Pesquisar = new javax.swing.JButton();
        lb_prioridade = new javax.swing.JLabel();
        var_Combo_Prioridade = new javax.swing.JComboBox<>();
        lb_status = new javax.swing.JLabel();
        var_Combo_Status = new javax.swing.JComboBox<>();
        bt_Alterar_Tabela_Do_Agendamento = new javax.swing.JButton();
        bt_Excluir_Tarefa_Do_Agendamento = new javax.swing.JButton();
        bt_Cadastrar_Tarefa_No_Agendamento = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        opcoes = new javax.swing.JMenu();
        voltar_tela_login = new javax.swing.JMenuItem();
        sair_Sistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Atividades");

        fundo.setBackground(new java.awt.Color(153, 255, 255));
        fundo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fundo2.setBackground(new java.awt.Color(102, 204, 255));
        fundo2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabela_Agendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarefa:", "Prioridade:", "Status:", "Horario de Entrega:", "Data de Entrega:"
            }
        ));
        jScrollPane1.setViewportView(tabela_Agendamento);

        lb_Titulo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lb_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Titulo.setText("BEM-VINDO USUARIO");

        lb_nome.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nome.setText("PESQUISAR TAREFA POR NOME:");

        bt_Pesquisar.setBackground(new java.awt.Color(153, 255, 255));
        bt_Pesquisar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        bt_Pesquisar.setText("PESQUISAR");
        bt_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PesquisarActionPerformed(evt);
            }
        });

        lb_prioridade.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_prioridade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_prioridade.setText("PEQUISAR TAREFA POR PRIORIDADE:");

        var_Combo_Prioridade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_Combo_PrioridadeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                var_Combo_PrioridadeMousePressed(evt);
            }
        });
        var_Combo_Prioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_Combo_PrioridadeActionPerformed(evt);
            }
        });

        lb_status.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_status.setText("PEQUISAR TAREFA POR STATUS:");

        var_Combo_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_Combo_StatusActionPerformed(evt);
            }
        });

        bt_Alterar_Tabela_Do_Agendamento.setBackground(new java.awt.Color(153, 255, 255));
        bt_Alterar_Tabela_Do_Agendamento.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        bt_Alterar_Tabela_Do_Agendamento.setText("ALTERAR TAREFA DO AGENDAMENTO");
        bt_Alterar_Tabela_Do_Agendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Alterar_Tabela_Do_AgendamentoActionPerformed(evt);
            }
        });

        bt_Excluir_Tarefa_Do_Agendamento.setBackground(new java.awt.Color(153, 255, 255));
        bt_Excluir_Tarefa_Do_Agendamento.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        bt_Excluir_Tarefa_Do_Agendamento.setText("EXCLUIR TAREFA DO AGENDAMENTO");
        bt_Excluir_Tarefa_Do_Agendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Excluir_Tarefa_Do_AgendamentoActionPerformed(evt);
            }
        });

        bt_Cadastrar_Tarefa_No_Agendamento.setBackground(new java.awt.Color(153, 255, 255));
        bt_Cadastrar_Tarefa_No_Agendamento.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        bt_Cadastrar_Tarefa_No_Agendamento.setText("IDICIONAR UMA NOVA TAREFA AO AGENDAMENTO");
        bt_Cadastrar_Tarefa_No_Agendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cadastrar_Tarefa_No_AgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundo2Layout = new javax.swing.GroupLayout(fundo2);
        fundo2.setLayout(fundo2Layout);
        fundo2Layout.setHorizontalGroup(
            fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_Titulo)
                .addGap(297, 297, 297))
            .addGroup(fundo2Layout.createSequentialGroup()
                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_status)
                            .addComponent(lb_nome)
                            .addComponent(lb_prioridade))
                        .addGap(14, 14, 14)
                        .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(var_Combo_Prioridade, 0, 192, Short.MAX_VALUE)
                            .addComponent(var_Combo_Status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(fundo2Layout.createSequentialGroup()
                                .addComponent(var_Pesquisar_Tarefa_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_Pesquisar))
                            .addComponent(bt_Cadastrar_Tarefa_No_Agendamento, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(bt_Alterar_Tabela_Do_Agendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_Excluir_Tarefa_Do_Agendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        fundo2Layout.setVerticalGroup(
            fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Titulo)
                .addGap(38, 38, 38)
                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(var_Pesquisar_Tarefa_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Pesquisar))
                .addGap(18, 18, 18)
                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_prioridade)
                    .addComponent(var_Combo_Prioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_status)
                    .addComponent(var_Combo_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(bt_Cadastrar_Tarefa_No_Agendamento)
                .addGap(18, 18, 18)
                .addComponent(bt_Alterar_Tabela_Do_Agendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Excluir_Tarefa_Do_Agendamento)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(fundo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        Menu.setBackground(new java.awt.Color(102, 204, 255));

        opcoes.setText("Opçoes Nevegação");

        voltar_tela_login.setText("    Voltar para tela de login");
        voltar_tela_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_tela_loginActionPerformed(evt);
            }
        });
        opcoes.add(voltar_tela_login);

        sair_Sistema.setText("    Sair do Sistema");
        sair_Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_SistemaActionPerformed(evt);
            }
        });
        opcoes.add(sair_Sistema);

        Menu.add(opcoes);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PesquisarActionPerformed
        String tarefa = var_Pesquisar_Tarefa_Nome.getText().trim();
        String Login = entrada_Usuario.getLogin_acesso();
        try {
            agendamentos = agendamentoDao.pesquisarTarefaNoAgendamento(tarefa, Login);
            PopularTabela();

        } catch (Exception e) {
            System.out.println("Erro ao tentar Pesquisar Agendamento! " + e.getMessage());
        }
    }//GEN-LAST:event_bt_PesquisarActionPerformed

    private void var_Combo_PrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_Combo_PrioridadeActionPerformed
        if (var_Combo_Prioridade.getSelectedItem().toString().equals("Dificil")) {
            try {
                String prioridade = var_Combo_Prioridade.getSelectedItem().toString();
                String Login = entrada_Usuario.getLogin_acesso();
                agendamentos = agendamentoDao.pesquisarPrioridadeNoAgendamento(prioridade, Login);
                PopularTabela();
            } catch (Exception ex) {
                System.err.println("Erro ao carregar pesquisar tarefa por nivel DIFICIL de prioridade na combobox na tela" + ex.getMessage());
            }

        } else {

        }

        if (var_Combo_Prioridade.getSelectedItem().toString().equals("Medio")) {
            try {
                String prioridade = var_Combo_Prioridade.getSelectedItem().toString();
                String Login = entrada_Usuario.getLogin_acesso();
                agendamentos = agendamentoDao.pesquisarPrioridadeNoAgendamento(prioridade, Login);
                PopularTabela();
            } catch (Exception ex) {
                System.err.println("Erro ao pesquisar tarefa por nivel MEDIO de prioridade na combobox na tela " + ex.getMessage());
            }

        } else {

        }

        if (var_Combo_Prioridade.getSelectedItem().toString().equals("Facil")) {
            try {
                String prioridade = var_Combo_Prioridade.getSelectedItem().toString();
                String Login = entrada_Usuario.getLogin_acesso();
                agendamentos = agendamentoDao.pesquisarPrioridadeNoAgendamento(prioridade, Login);
                PopularTabela();
            } catch (Exception ex) {
                System.err.println("Erro ao pesquisar tarefa por nivel FACIL na combobox na tela" + ex.getMessage());
            }

        } else {

        }


    }//GEN-LAST:event_var_Combo_PrioridadeActionPerformed

    private void var_Combo_PrioridadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_Combo_PrioridadeMousePressed


    }//GEN-LAST:event_var_Combo_PrioridadeMousePressed

    private void var_Combo_PrioridadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_Combo_PrioridadeMouseClicked


    }//GEN-LAST:event_var_Combo_PrioridadeMouseClicked

    private void var_Combo_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_Combo_StatusActionPerformed
        if (var_Combo_Status.getSelectedItem().toString().equals("FINALIZADA")) {
            try {
                String status = var_Combo_Status.getSelectedItem().toString();
                String Login = entrada_Usuario.getLogin_acesso();
                agendamentos = agendamentoDao.pesquisarStatusNoAgendamento(status, Login);
                PopularTabela();
            } catch (Exception ex) {
                System.err.println("Erro ao carregar pesquisar tarefa por status FINALIZADA na combobox na tela " + ex.getMessage());
            }

        } else {

        }

        if (var_Combo_Status.getSelectedItem().toString().equals("EM ANDAMENTO")) {
            try {
                String status = var_Combo_Status.getSelectedItem().toString();
                String Login = entrada_Usuario.getLogin_acesso();
                agendamentos = agendamentoDao.pesquisarStatusNoAgendamento(status, Login);
                PopularTabela();
            } catch (Exception ex) {
                System.err.println("Erro ao pesquisar tarefa por status EM ANDAMENTO na combobox na tela " + ex.getMessage());
            }

        } else {

        }

        if (var_Combo_Status.getSelectedItem().toString().equals("NÃO CONCLUIDA")) {
            try {
                String status = var_Combo_Status.getSelectedItem().toString();
                String Login = entrada_Usuario.getLogin_acesso();
                agendamentos = agendamentoDao.pesquisarStatusNoAgendamento(status, Login);
                PopularTabela();
            } catch (Exception ex) {
                System.err.println("Erro ao pesquisar tarefa por status NÃO CONCLUIDA na combobox na tela " + ex.getMessage());
            }

        } else {

        }

    }//GEN-LAST:event_var_Combo_StatusActionPerformed

    private void bt_Alterar_Tabela_Do_AgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Alterar_Tabela_Do_AgendamentoActionPerformed
        int linhaSelecionada = tabela_Agendamento.getSelectedRow();
        try {
            agendamento = agendamentos.get(linhaSelecionada);
            new CadastrarTarefaNova(agendamento, entrada_Usuario).setVisible(true);
        } catch (Exception e) {
            System.out.println("Erro ao tentar alterar prioridade no agendamento na tela" + e.getMessage());
        }
    }//GEN-LAST:event_bt_Alterar_Tabela_Do_AgendamentoActionPerformed

    private void bt_Excluir_Tarefa_Do_AgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Excluir_Tarefa_Do_AgendamentoActionPerformed
        int linhaSelecionada = tabela_Agendamento.getSelectedRow();
        try {
            agendamento = agendamentos.get(linhaSelecionada);
            tarefaDao.excluir(agendamento.getIdtarefa().getIdtarefa());
            JOptionPane.showMessageDialog(null, "TAREFA EXCLUIDA DO AGENDAMENTO COM SUCESSO!");
        } catch (Exception e) {
            System.out.println("Erro com o botão de exluir tarefa da tela " + e.getMessage());
        }
    }//GEN-LAST:event_bt_Excluir_Tarefa_Do_AgendamentoActionPerformed

    private void bt_Cadastrar_Tarefa_No_AgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cadastrar_Tarefa_No_AgendamentoActionPerformed
        new CadastrarTarefaNova(entrada_Usuario).setVisible(true);
    }//GEN-LAST:event_bt_Cadastrar_Tarefa_No_AgendamentoActionPerformed

    private void voltar_tela_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_tela_loginActionPerformed
      new login().setVisible(true);
      dispose();
    }//GEN-LAST:event_voltar_tela_loginActionPerformed

    private void sair_SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_SistemaActionPerformed
         dispose();
    }//GEN-LAST:event_sair_SistemaActionPerformed

    private void PopularTabela() {
        tabelaModelo = (DefaultTableModel) tabela_Agendamento.getModel();
        tabelaModelo.setNumRows(0);
        for (Agendamento agendamento : agendamentos) {

            tabelaModelo.addRow(new Object[]{agendamento.getIdtarefa().getNome_ta(), agendamento.getIdtarefa().getNivel_prio(), agendamento.getIdtarefa().getStatus_ta(), agendamento.getHorario_ta(), agendamento.getData_ta()});

        }

    }

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
            java.util.logging.Logger.getLogger(GerenciamentodeAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentodeAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentodeAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentodeAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentodeAtividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton bt_Alterar_Tabela_Do_Agendamento;
    private javax.swing.JButton bt_Cadastrar_Tarefa_No_Agendamento;
    private javax.swing.JButton bt_Excluir_Tarefa_Do_Agendamento;
    private javax.swing.JButton bt_Pesquisar;
    private javax.swing.JPanel fundo;
    private javax.swing.JPanel fundo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Titulo;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_prioridade;
    private javax.swing.JLabel lb_status;
    private javax.swing.JMenu opcoes;
    private javax.swing.JMenuItem sair_Sistema;
    private javax.swing.JTable tabela_Agendamento;
    private javax.swing.JComboBox<String> var_Combo_Prioridade;
    private javax.swing.JComboBox<String> var_Combo_Status;
    private javax.swing.JTextField var_Pesquisar_Tarefa_Nome;
    private javax.swing.JMenuItem voltar_tela_login;
    // End of variables declaration//GEN-END:variables
}
