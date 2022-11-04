package interfaces;

import Utils.StringUtil;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import patronato.Comunicacao;

/**
 *
 * @author Computação
 */
public class MovimentoSessao extends javax.swing.JInternalFrame {

    Comunicacao com = new Comunicacao();

    /**
     * Creates new form NewJInternalFrame
     */
    public MovimentoSessao() {
        initComponents();
        
        com.buscaValoresEPreencheTabela(tableSessao, "SELECT * FROM SESSAO");

        ListSelectionModel model = tableSessao.getSelectionModel();
        model.addListSelectionListener((ListSelectionEvent event) -> {
            if (!model.isSelectionEmpty()) {
                this.txCod.setText(tableSessao.getValueAt(tableSessao.getSelectedRow(), 0).toString());
                this.txDesc.setText(tableSessao.getValueAt(tableSessao.getSelectedRow(), 1).toString());
                this.ftData.setText(tableSessao.getValueAt(tableSessao.getSelectedRow(), 2).toString());
                buscaValoresSessao();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labelRegistro = new javax.swing.JLabel();
        txCod = new javax.swing.JTextField();
        txDesc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ftData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSessao = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFunc = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMat = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablePrat = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableAni = new javax.swing.JTable();
        txCodPrat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txCodMat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txCodAni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txCodFunc = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pesquisar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txCod.setEnabled(false);
        txCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        jLabel1.setText("Código");

        ftData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel3.setText("Data");

        tableSessao.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableSessao);

        tableFunc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableFunc);

        tableMat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableMat);

        tablePrat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablePrat);

        tableAni.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tableAni);

        txCodPrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodPratActionPerformed(evt);
            }
        });

        jLabel4.setText("Código Material");

        jLabel5.setText("Código Praticante");

        txCodMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodMatActionPerformed(evt);
            }
        });

        jLabel6.setText("Código Animal");

        txCodAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodAniActionPerformed(evt);
            }
        });

        jLabel7.setText("Código Func");

        txCodFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodFuncActionPerformed(evt);
            }
        });

        jButton4.setText("Adicionar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Adicionar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Adicionar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Adicionar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txCod, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(ftData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txCodMat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jButton6))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txCodPrat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txCodAni, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addComponent(jLabel7))))
                .addContainerGap(830, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(txCodMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txCodPrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txCodAni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(labelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(335, 335, 335))
        );

        jScrollPane6.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparMsg();
        String sql;
        if(!StringUtil.isNotNullOrEmpty(ftData.getText())){
            labelRegistro.setText("Informe a data");
            return;
        }
        
        if (!StringUtil.isNotNullOrEmpty(txCod.getText())) {
            sql = String.format("INSERT INTO SESSAO (SES_DESCRICAO, SES_DATA) VALUES ('%s', '%s')",
                    txDesc.getText(), ftData.getText());
                        labelRegistro.setText("Registro Incluído com Sucesso");
        }else{
            sql = String.format("UPDATE ATIVIDADE SET SES_DESCRICAO = '%s', SES_DATA = '%s' WHERE SES_ID = %s", txDesc.getText(),ftData.getText(),txCod.getText());
            labelRegistro.setText("Registro Alterado com Sucesso");
        }
        
        com.executarUpdate(sql);
        com.buscaValoresEPreencheTabela(tableSessao, "SELECT * FROM SESSAO");
        limparCampos();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        StringBuilder busca = new StringBuilder();
//        busca.append("SELECT * FROM ATIVIDADE WHERE ATV_ID > 0");
//        if (StringUtil.isNotNullOrEmpty(this.txDesc.getText())) {
//            busca.append(" AND ATV_DESCRICAO = '").append(this.txDesc.getText()).append("'");
//        }
//        if (StringUtil.isNotNullOrEmpty(this.txDura.getText())) {
//            busca.append(" AND ATV_DURACAO = ").append(this.txDura.getText());
//        }
//        com.buscaValoresEPreencheTabela(jTable1, busca.toString());
//        limparMsg();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        limparMsg();
        if (StringUtil.isNotNullOrEmpty(txCod.getText())) {
            com.executarUpdate("DELETE FROM SESSAO WHERE SES_ID = " + txCod.getText());
            com.buscaValoresEPreencheTabela(tableSessao, "SELECT * FROM SESSAO");
            limparCampos();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodActionPerformed

    private void txCodPratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodPratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodPratActionPerformed

    private void txCodMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodMatActionPerformed

    private void txCodAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodAniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodAniActionPerformed

    private void txCodFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodFuncActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(txCod.getText() != null && txCodMat.getText() != null){
            com.executarUpdate(String.format("INSERT INTO SESSAOXMATERIAL (SXM_COD_SESSAO,SXM_COD_MATERIAL) VALUES (%s, %s)",txCod.getText(), txCodMat.getText()));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(txCod.getText() != null && txCodPrat.getText() != null){
            com.executarUpdate(String.format("INSERT INTO SESSAOXPRATICANTE (SXP_COD_SESSAO,SXP_COD_PRATICANTE) VALUES (%s, %s)",txCod.getText(), txCodPrat.getText()));
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(txCod.getText() != null && txCodAni.getText() != null){
            com.executarUpdate(String.format("INSERT INTO SESSAOXPRATICANTE (SXP_COD_SESSAO,SXP_COD_PRATICANTE) VALUES (%s, %s)",txCod.getText(), txCodAni.getText()));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(txCod.getText() != null && txCodFunc.getText() != null){
            com.executarUpdate(String.format("INSERT INTO SESSAOXFUNCIONARIO (SXF_COD_SESSAO,SXF_COD_FUNCIONARIO) VALUES (%s, %s)",txCod.getText(), txCodFunc.getText()));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void limparMsg(){
        this.labelRegistro.setText("");
    }
    
    private void buscaValoresSessao(){
        if(txCod.getText() != null){
            com.buscaValoresEPreencheTabela(tableMat, "SELECT * FROM SESSAOXMATERIAL WHERE SXM_COD_SESSAO = " + txCod.getText());
            com.buscaValoresEPreencheTabela(tableFunc, "SELECT * FROM SESSAOXFUNCIONARIO WHERE SXF_COD_SESSAO = " + txCod.getText());
            com.buscaValoresEPreencheTabela(tableAni, "SELECT * FROM SESSAOXCAVALOXATIVIDADE WHERE SXCA_COD_SESSAO = " + txCod.getText());
            com.buscaValoresEPreencheTabela(tablePrat, "SELECT * FROM SESSAOXPRATICANTE WHERE SXCA_COD_SESSAO = " + txCod.getText());
        }
    }
    
    private void limparCampos() {
//        this.txCod.setText("");
//        this.txDesc.setText("");
//        this.txDura.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftData;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JTable tableAni;
    private javax.swing.JTable tableFunc;
    private javax.swing.JTable tableMat;
    private javax.swing.JTable tablePrat;
    private javax.swing.JTable tableSessao;
    private javax.swing.JTextField txCod;
    private javax.swing.JTextField txCodAni;
    private javax.swing.JTextField txCodFunc;
    private javax.swing.JTextField txCodMat;
    private javax.swing.JTextField txCodPrat;
    private javax.swing.JTextField txDesc;
    // End of variables declaration//GEN-END:variables
}
