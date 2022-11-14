package interfaces;

import Utils.StringUtil;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import patronato.Comunicacao;

/**
 *
 * @author Computação
 */
public class CadastroPraticante extends javax.swing.JInternalFrame {

    Comunicacao com = new Comunicacao();

    public CadastroPraticante() {
        initComponents();
        com.buscaValoresEPreencheTabela(jTable1, "SELECT PR.PRAT_ID,PR.PRAT_ALTURA,PR.PRAT_PESO,P.* FROM PRATICANTE PR LEFT JOIN PESSOA P ON PES_ID = PRAT_ID_PESSOA ");
        radioMasc.setSelected(true);
        ListSelectionModel model = jTable1.getSelectionModel();
        model.addListSelectionListener((ListSelectionEvent event) -> {
            if (!model.isSelectionEmpty()) {
                txCodigo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                txAltura.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                txPeso.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                txCodigoPessoa.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                txNome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
                txCpf.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
                txEmail.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
                txEmail2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
                txSenha.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString());
                boolean masc = jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString().equals("M");
                if (masc) {
                    radioMasc.setSelected(true);
                } else {
                    radioFem.setSelected(true);
                }
                txData.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txNome = new javax.swing.JTextField();
        txSenha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txEmail2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        radioMasc = new javax.swing.JRadioButton();
        radioFem = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txData = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txAltura = new javax.swing.JFormattedTextField();
        txPeso = new javax.swing.JFormattedTextField();
        txCodigoPessoa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txCpf = new javax.swing.JFormattedTextField();

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
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setText("Nome");

        jLabel5.setText("Senha");

        jButton1.setText("Salvar");
        jButton1.setPreferredSize(new java.awt.Dimension(91, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pesquisar");
        jButton2.setPreferredSize(new java.awt.Dimension(91, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.setMaximumSize(new java.awt.Dimension(91, 23));
        jButton3.setPreferredSize(new java.awt.Dimension(91, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txCodigo.setEditable(false);
        txCodigo.setEnabled(false);
        txCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodigoActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo");

        jLabel7.setText("CPF");

        jLabel8.setText("Email");

        jLabel9.setText("Email Secundário");

        jLabel10.setText("Sexo");

        sexo.add(radioMasc);
        radioMasc.setText("Masculino");

        sexo.add(radioFem);
        radioFem.setText("Feminino");

        jLabel11.setText("Data Nascimento");

        txData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel12.setText("Altura");

        jLabel13.setText("Peso");

        txAltura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txCodigoPessoa.setEditable(false);
        txCodigoPessoa.setEnabled(false);

        jLabel14.setText("Pessoa");

        try {
            txCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(330, 330, 330))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioMasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioFem)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txData, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txCodigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioMasc)
                            .addComponent(radioFem)
                            .addComponent(txData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!StringUtil.isNotNullOrEmpty(txNome.getText())) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório");
            return;
        }
        if (!StringUtil.isNotNullOrEmpty(StringUtil.removeSinais(txCpf.getText()).replace(" ", ""))) {
            JOptionPane.showMessageDialog(null, "O campo CPF é obrigatório");
            return;
        }
        if (!StringUtil.isNotNullOrEmpty(txData.getText())) {
            JOptionPane.showMessageDialog(null, "O campo Data de nascimento é obrigatório");
            return;
        }
        if (!StringUtil.isNotNullOrEmpty(txEmail.getText())) {
            JOptionPane.showMessageDialog(null, "O campo Email é obrigatório");
            return;
        }
        if (!StringUtil.isNotNullOrEmpty(txAltura.getText())) {
            JOptionPane.showMessageDialog(null, "O campo Altura é obrigatório");
            return;
        }
        if (!StringUtil.isNotNullOrEmpty(txPeso.getText())) {
            JOptionPane.showMessageDialog(null, "O campo Peso é obrigatório");
            return;
        }
        String txSexo = radioFem.isSelected() ? "F" : "M";
        if (StringUtil.isNotNullOrEmpty(txCodigo.getText())) {
            String atualizaPrat = String.format("UPDATE PRATICANTE SET PRAT_ALTURA = '%s', PRAT_PESO = '%s' WHERE PRAT_ID = %s",
                    txAltura.getText(), txPeso.getText(), txCodigo.getText());
            com.executarUpdate(atualizaPrat);
            String atualizaPessoa = String.format("UPDATE PESSOA SET PES_NOME = '%s', PES_CPF = '%s', PES_EMAIL1 = '%s', PES_EMAIL2 = '%s',PES_LOGIN_PASSWORD = '%s',PES_SEXO = '%s',PES_DATA_NASC = '%s' WHERE PES_ID = %s",
                    txNome.getText(), StringUtil.removeSinais(txCpf.getText()), txEmail.getText(), txEmail2.getText(), txSenha.getText(), txSexo, txData.getText(), txCodigoPessoa.getText());
            com.executarUpdate(atualizaPessoa);
        } else {
            if (com.getCodigo("SELECT * FROM pessoa  where pes_cpf = '" + StringUtil.removeSinais(txCpf.getText()) + "'", "pes_id") != 0) {
                JOptionPane.showMessageDialog(null, "Já existe uma pessoa com este CPF cadastrado");
                return;
            }
            String insere = String.format("INSERT INTO PESSOA (PES_NOME, PES_CPF, PES_EMAIL1, PES_EMAIL2, PES_LOGIN_PASSWORD,PES_SEXO,PES_DATA_NASC) "
                    + "VALUES ('%s','%s','%s','%s','%s','%s','%s')",
                    txNome.getText(), StringUtil.removeSinais(txCpf.getText()), txEmail.getText(), txEmail2.getText(), txSenha.getText(), txSexo, txData.getText());
            com.executarUpdate(insere);
            Integer cod = com.getCodigo("SELECT PES_ID FROM PESSOA WHERE PES_CPF = " + StringUtil.removeSinais(txCpf.getText()), "PES_ID");
            String inserePrat = String.format("INSERT INTO PRATICANTE (PRAT_ID_PESSOA, PRAT_ALTURA, PRAT_PESO) "
                    + "VALUES (%s,%s,%s)",
                    cod, txAltura.getText(), txPeso.getText());
            com.executarUpdate(inserePrat);
        }
        limparCampos();
        com.buscaValoresEPreencheTabela(jTable1, "SELECT PR.PRAT_ID,PR.PRAT_ALTURA,PR.PRAT_PESO,P.* FROM PRATICANTE PR LEFT JOIN PESSOA P ON PES_ID = PRAT_ID_PESSOA ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String txSexo = radioFem.isSelected() ? "F" : "M";
        StringBuilder busca = new StringBuilder();
        busca.append(" SELECT PR.PRAT_ID,PR.PRAT_ALTURA,PR.PRAT_PESO,P.* FROM PRATICANTE PR");
        busca.append(" LEFT JOIN PESSOA P ON PES_ID = PRAT_ID_PESSOA");
        busca.append(" WHERE P.PES_SEXO = '").append(txSexo).append("'");
        if (StringUtil.isNotNullOrEmpty(txData.getText())) {
            busca.append(" AND P.PES_DATA_NASC = '").append(txData.getText()).append("'");
        }
        if (StringUtil.isNotNullOrEmpty(txSenha.getText())) {
            busca.append(" AND P.PES_LOGIN_PASSWORD LIKE '%").append(txSenha.getText()).append("%'");
        }
        if (StringUtil.isNotNullOrEmpty(txEmail.getText())) {
            busca.append(" AND P.PES_EMAIL1 LIKE '%").append(txEmail.getText()).append("%'");
        }
        if (StringUtil.isNotNullOrEmpty(txEmail2.getText())) {
            busca.append(" AND P.PES_EMAIL2 LIKE '%").append(txEmail2.getText()).append("%'");
        }
        if (StringUtil.isNotNullOrEmpty(StringUtil.removeSinais(txCpf.getText()))) {
            busca.append(" AND P.PES_CPF LIKE '%").append(StringUtil.removeSinais(txCpf.getText())).append("%'");
        }
        if (StringUtil.isNotNullOrEmpty(txNome.getText())) {
            busca.append(" AND P.PES_NOME LIKE '%").append(txNome.getText()).append("%'");
        }
        if (StringUtil.isNotNullOrEmpty(txAltura.getText())) {
            busca.append(" AND PRAT_ALTURA = ").append(txAltura.getText()).append("");
        }
        if (StringUtil.isNotNullOrEmpty(txPeso.getText())) {
            busca.append(" AND PRAT_PESO = ").append(txPeso.getText()).append("");
        }
        com.buscaValoresEPreencheTabela(jTable1, busca.toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void limparCampos() {
        txSenha.setText("");
        txCodigo.setText("");
        txData.setText("");
        txAltura.setText("");
        txNome.setText("");
        txCpf.setText("");
        txEmail.setText("");
        txEmail2.setText("");
        txPeso.setText("");
        txCodigoPessoa.setText("");
        radioMasc.setSelected(true);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (StringUtil.isNotNullOrEmpty(txCodigo.getText())) {
            com.executarUpdate("DELETE FROM PRATICANTE WHERE PRAT_ID = " + txCodigo.getText());
            com.executarUpdate("DELETE FROM PESSOA WHERE PES_ID = " + txCodigoPessoa.getText());
            com.buscaValoresEPreencheTabela(jTable1, "SELECT PR.PRAT_ID,PR.PRAT_ALTURA,PR.PRAT_PESO,P.* FROM PRATICANTE PR LEFT JOIN PESSOA P ON PES_ID = PRAT_ID_PESSOA ");
            limparCampos();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodigoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioFem;
    private javax.swing.JRadioButton radioMasc;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JFormattedTextField txAltura;
    private javax.swing.JTextField txCodigo;
    private javax.swing.JTextField txCodigoPessoa;
    private javax.swing.JFormattedTextField txCpf;
    private javax.swing.JFormattedTextField txData;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEmail2;
    private javax.swing.JTextField txNome;
    private javax.swing.JFormattedTextField txPeso;
    private javax.swing.JTextField txSenha;
    // End of variables declaration//GEN-END:variables
}
