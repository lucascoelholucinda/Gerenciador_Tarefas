package tela;

import dao.AgendamentoDao;
import dao.AgendamentoDaoImpl;
import dao.TarefaDao;
import dao.TarefaDaoImpl;
import entidade.Agendamento;
import entidade.Entrada_Usuario;
import entidade.Tarefa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class CadastrarTarefaNova extends javax.swing.JFrame {

    private Agendamento agendamento;
    private AgendamentoDao agendamentoDao = new AgendamentoDaoImpl();
    private TarefaDao tarefaDao = new TarefaDaoImpl();
    private Entrada_Usuario entrada_Usuario;

    public CadastrarTarefaNova() {
        initComponents();
        carregarComboPrioridade();
        carregarComboStatus();
    }

    public CadastrarTarefaNova(Entrada_Usuario entrada_Usuario) {
        initComponents();
        carregarComboPrioridade();
        carregarComboStatus();
        this.entrada_Usuario = entrada_Usuario;
    }

    public CadastrarTarefaNova(Agendamento agendamento, Entrada_Usuario entrada_Usuario) {
        initComponents();
        carregarComboPrioridade();
        carregarComboStatus();
        this.agendamento = agendamento;
        this.entrada_Usuario = entrada_Usuario;
        var_Tarefa_Atual.setText(agendamento.getIdtarefa().getNome_ta());
        var_Horario_Atual.setText(agendamento.getHorario_ta());
        var_Data_Atual.setText(agendamento.getData_ta().toString());

    }

    private void carregarComboPrioridade() {
        var_Combo_Prioridade_Nova.addItem("Selecione o nivel de prioridade...");
        var_Combo_Prioridade_Nova.addItem("Dificil");
        var_Combo_Prioridade_Nova.addItem("Medio");
        var_Combo_Prioridade_Nova.addItem("Facil");

    }

    private void carregarComboStatus() {
        var_Combo_Status_Novo.addItem("Selecione o status da tarefa...");
        var_Combo_Status_Novo.addItem("FINALIZADA");
        var_Combo_Status_Novo.addItem("EM ANDAMENTO");
        var_Combo_Status_Novo.addItem("NÃO CONCLUIDA");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        lb_Tarefa_Atual = new javax.swing.JLabel();
        var_Tarefa_Atual = new javax.swing.JTextField();
        lb_Prioridade_Atual = new javax.swing.JLabel();
        var_Combo_Prioridade_Nova = new javax.swing.JComboBox<>();
        lb_Status_Atual = new javax.swing.JLabel();
        var_Combo_Status_Novo = new javax.swing.JComboBox<>();
        lb_Horario_Atual = new javax.swing.JLabel();
        var_Horario_Atual = new javax.swing.JTextField();
        lb_Data_Atual = new javax.swing.JLabel();
        var_Data_Atual = new javax.swing.JTextField();
        bt_Cadastrar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_titulo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("CADASTRAR TAREFA NOVA:");

        lb_Tarefa_Atual.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Tarefa_Atual.setText("TAREFA:");

        var_Tarefa_Atual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_Tarefa_AtualMouseClicked(evt);
            }
        });

        lb_Prioridade_Atual.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Prioridade_Atual.setText("PRIORIADADE:");

        lb_Status_Atual.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Status_Atual.setText("STATUS:");

        lb_Horario_Atual.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Horario_Atual.setText("HORARIO:");

        var_Horario_Atual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_Horario_AtualMouseClicked(evt);
            }
        });
        var_Horario_Atual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_Horario_AtualActionPerformed(evt);
            }
        });

        lb_Data_Atual.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lb_Data_Atual.setText("DATA:");

        var_Data_Atual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                var_Data_AtualMouseClicked(evt);
            }
        });
        var_Data_Atual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_Data_AtualActionPerformed(evt);
            }
        });

        bt_Cadastrar.setBackground(new java.awt.Color(153, 255, 255));
        bt_Cadastrar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        bt_Cadastrar.setText("CADASTRAR TAREFA");
        bt_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lb_Data_Atual))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lb_Status_Atual)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(var_Combo_Prioridade_Nova, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(var_Tarefa_Atual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(var_Combo_Status_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(var_Horario_Atual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(var_Data_Atual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cadastrar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lb_Horario_Atual))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lb_Prioridade_Atual))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lb_Tarefa_Atual)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_titulo)
                .addGap(35, 35, 35)
                .addComponent(lb_Tarefa_Atual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(var_Tarefa_Atual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Prioridade_Atual)
                .addGap(18, 18, 18)
                .addComponent(var_Combo_Prioridade_Nova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Status_Atual)
                .addGap(13, 13, 13)
                .addComponent(var_Combo_Status_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Horario_Atual, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(var_Horario_Atual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Data_Atual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(var_Data_Atual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(bt_Cadastrar)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CadastrarActionPerformed

        String tarefaescolhida = var_Tarefa_Atual.getText().trim();
        String prioridade = (String) var_Combo_Prioridade_Nova.getSelectedItem();
        String status = (String) var_Combo_Status_Novo.getSelectedItem();
        String hora = var_Horario_Atual.getText().trim();
        String data1 = var_Data_Atual.getText().trim();
        if (agendamento == null) {
            Tarefa tarefa = new Tarefa();
            tarefa.setNome_ta(tarefaescolhida);
            tarefa.setNivel_prio(prioridade);
            tarefa.setStatus_ta(status);
            Agendamento agendamento2 = new Agendamento();
            agendamento2.setIdtarefa(tarefa);
            agendamento2.setIdusuario(entrada_Usuario.getIdusuario());
            agendamento2.setHorario_ta(hora);
            Date datanova;
            try {
                datanova = MostrarDataConvertidade(data1);
                agendamento2.setData_ta(datanova);
            } catch (ParseException ex) {
                System.out.println("Erro ao converter data para cadastrar na tela " + ex.getMessage());
            }

            try {
                tarefaDao.salvar(tarefa);

            } catch (Exception ex) {
                System.out.println("Erro ao tentar cadastrar nome,nivel e status da tarefa na tela  " + ex.getMessage());
            }
            try {
                agendamentoDao.salvarTarefaNoAgendamento(agendamento2);
                JOptionPane.showMessageDialog(null, "TAREFA CADASTRADA COM SUCESSO");
            } catch (Exception ex) {

                System.out.println("Erro ao tentar cadastrar horario e data do agendamento na tela " + ex.getMessage());
            }

        } else {
            try {

                agendamentoDao.alterarTarefaNoAgendamento(tarefaescolhida, agendamento.getIdtarefa().getIdtarefa());
                if (tarefaescolhida.equals(agendamento.getIdtarefa().getNome_ta())) {

                } else {
                    JOptionPane.showMessageDialog(null, "NOME DA TAREFA ALTERADO COM SUCESSO!");
                }

            } catch (Exception ex) {
                System.out.println("Erro ao tentar alterar nome da tarefa na tela:" + ex.getMessage());

            }

            if (var_Combo_Prioridade_Nova.getSelectedItem().equals(agendamento.getIdtarefa().getNivel_prio()) || var_Combo_Prioridade_Nova.getSelectedItem().equals("Selecione o nivel de prioridade...")) {

            } else {

                try {
                    agendamentoDao.alterarPrioridadeNoAgendamento(prioridade, agendamento.getIdtarefa().getIdtarefa());
                    JOptionPane.showMessageDialog(null, "NIVEL DE PRIORIDADE ALTERADO COM SUCESSO!");
                } catch (Exception ex) {
                    System.out.println("Erro ao tentar alterar prioridade na tela" + ex.getMessage());

                }
            }

            if (var_Combo_Status_Novo.getSelectedItem().equals(agendamento.getIdtarefa().getStatus_ta()) || var_Combo_Status_Novo.getSelectedItem().equals("Selecione o status da tarefa...")) {

            } else {
                try {
                    agendamentoDao.alterarStatusNoAgendamento(status, agendamento.getIdtarefa().getIdtarefa());
                    JOptionPane.showMessageDialog(null, "STATUS DA TAREFA ALTERADO COM SUCESSO!");
                } catch (Exception ex) {
                    System.out.println("Erro ao tentar alterar status da tarefa na tela" + ex.getMessage());
                }
            }

            if (var_Horario_Atual.getText().trim().equals(agendamento.getHorario_ta()) || var_Horario_Atual.getText().trim().equals("")) {

            } else {
                try {
                    agendamentoDao.alterarHoraNoAgendamento(hora, agendamento.getIdtarefa().getIdtarefa(), entrada_Usuario.getIdusuario().getIdusuario());
                    JOptionPane.showMessageDialog(null, "HORARIO DA TAREFA ALTERADO COM SUCESSO!");
                } catch (Exception ex) {
                    System.out.println("Erro ao tentar alterar horario da tarefa  na tela" + ex.getMessage());
                }
            }

            if (var_Data_Atual.getText().trim().equals(agendamento.getData_ta().toString()) || var_Data_Atual.getText().trim().equals("")) {

            } else {

                try {
                    Date datanova = MostrarDataConvertidade(data1);

                    agendamentoDao.alterarDataNoAgendamento(datanova, agendamento.getIdtarefa().getIdtarefa(), entrada_Usuario.getIdusuario().getIdusuario());
                    JOptionPane.showMessageDialog(null, "DATA DA TAREFA ALTERADO COM SUCESSO!");
                } catch (Exception ex) {
                    System.out.println("Erro ao tentar alterar data da tarefa na tela" + ex.getMessage());
                }
            }
        }
        dispose();

    }//GEN-LAST:event_bt_CadastrarActionPerformed

    private void var_Data_AtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_Data_AtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_var_Data_AtualActionPerformed

    private void var_Horario_AtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_Horario_AtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_var_Horario_AtualActionPerformed

    private void var_Horario_AtualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_Horario_AtualMouseClicked
        if (var_Horario_Atual.getText().equals("")) {
            var_Horario_Atual.setText("15:00");
        } else {
            if (var_Horario_Atual.getText().equals("15:00")) {
                var_Horario_Atual.setText("");
            }

        }
    }//GEN-LAST:event_var_Horario_AtualMouseClicked

    private void var_Data_AtualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_Data_AtualMouseClicked
        if (var_Data_Atual.getText().equals("")) {
            var_Data_Atual.setText("2001-05-01");
        } else {
            if (var_Data_Atual.getText().equals("2001-05-01")) {
                var_Data_Atual.setText("");
            }

        }
    }//GEN-LAST:event_var_Data_AtualMouseClicked

    private void var_Tarefa_AtualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_var_Tarefa_AtualMouseClicked
        if (var_Tarefa_Atual.getText().equals("")) {
            var_Tarefa_Atual.setText("Estudar");
        } else {
            if (var_Tarefa_Atual.getText().equals("Estudar")) {
                var_Tarefa_Atual.setText("");
            }

        }
    }//GEN-LAST:event_var_Tarefa_AtualMouseClicked

    public java.sql.Date MostrarDataConvertidade(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date datarecebida = formato.parse(data);
        java.sql.Date dataconvertida = new java.sql.Date(datarecebida.getTime());
        return dataconvertida;
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
            java.util.logging.Logger.getLogger(CadastrarTarefaNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarTarefaNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarTarefaNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarTarefaNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarTarefaNova().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Cadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_Data_Atual;
    private javax.swing.JLabel lb_Horario_Atual;
    private javax.swing.JLabel lb_Prioridade_Atual;
    private javax.swing.JLabel lb_Status_Atual;
    private javax.swing.JLabel lb_Tarefa_Atual;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JComboBox<String> var_Combo_Prioridade_Nova;
    private javax.swing.JComboBox<String> var_Combo_Status_Novo;
    private javax.swing.JTextField var_Data_Atual;
    private javax.swing.JTextField var_Horario_Atual;
    private javax.swing.JTextField var_Tarefa_Atual;
    // End of variables declaration//GEN-END:variables
}
