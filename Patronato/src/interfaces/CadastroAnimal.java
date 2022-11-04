package interfaces;

import Utils.StringUtil;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import patronato.Comunicacao;

/**
 *
 * @author Computação
 */
public class CadastroAnimal extends javax.swing.JInternalFrame {

    Comunicacao com = new Comunicacao();

    public CadastroAnimal() {
        initComponents();
        com.buscaValoresEPreencheTabela(jTable1, "SELECT * FROM ANIMAL");

        ListSelectionModel model = jTable1.getSelectionModel();
        model.addListSelectionListener((ListSelectionEvent event) -> {
            if (!model.isSelectionEmpty()) {
                txCodigo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                txIdade.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                txNome.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                cbPorte.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                txComportamento.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
                txAndadura.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txIdade = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        txComportamento = new javax.swing.JTextField();
        txAndadura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cbPorte = new javax.swing.JComboBox<>();
        txCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

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

        jLabel1.setText("Idade");

        jLabel2.setText("Nome");

        jLabel3.setText("Porte");

        jLabel4.setText("Comportamento");

        jLabel5.setText("Andadura");

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

        cbPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "M", "G" }));

        txCodigo.setEditable(false);
        txCodigo.setEnabled(false);

        jLabel6.setText("Codigo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txAndadura, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbPorte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(17, 17, 17)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGap(14, 14, 14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(txNome)))
                                .addComponent(txComportamento, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txComportamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txAndadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (StringUtil.isNotNullOrEmpty(txCodigo.getText())) {
            String insere = String.format("UPDATE ANIMAL SET ANI_IDADE = %s, ANI_NOME = '%s', ANI_PORTE = '%s', ANI_COMPORTAMENTO = '%s', ANI_ANDADURA = '%s' WHERE ANI_ID = %s",
                    txIdade.getText(), txNome.getText(), cbPorte.getSelectedItem().toString(), txComportamento.getText(), txAndadura.getText(), txCodigo.getText());
            com.executarUpdate(insere);
        } else {
            String insere = String.format("INSERT INTO ANIMAL (ANI_IDADE, ANI_NOME, ANI_PORTE, ANI_COMPORTAMENTO, ANI_ANDADURA) VALUES (%s,'%s','%s','%s','%s')",
                    txIdade.getText(), txNome.getText(), cbPorte.getSelectedItem().toString(), txComportamento.getText(), txAndadura.getText());
            com.executarUpdate(insere);
        }
        limparCampos();
        com.buscaValoresEPreencheTabela(jTable1, "SELECT * FROM ANIMAL");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StringBuilder busca = new StringBuilder();
        busca.append("SELECT * FROM ANIMAL");
        busca.append(" WHERE ANI_PORTE = '").append(cbPorte.getSelectedItem().toString()).append("'");
        if (StringUtil.isNotNullOrEmpty(txIdade.getText())) {
            busca.append(" AND ANI_IDADE = ").append(txIdade.getText());
        }
        if (StringUtil.isNotNullOrEmpty(txNome.getText())) {
            busca.append(" AND ANI_NOME LIKE '%").append(txNome.getText()).append("%'");
        }
        if (StringUtil.isNotNullOrEmpty(txNome.getText())) {
            busca.append(" AND ANI_COMPORTAMENTO LIKE '%").append(txComportamento.getText()).append("%'");
        }
        if (StringUtil.isNotNullOrEmpty(txAndadura.getText())) {
            busca.append(" AND ANI_ANDADURA LIKE '%").append(txAndadura.getText()).append("%'");
        }
        com.buscaValoresEPreencheTabela(jTable1, busca.toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void limparCampos() {
        txAndadura.setText("");
        txCodigo.setText("");
        txComportamento.setText("");
        txIdade.setText("");
        txNome.setText("");
        cbPorte.setSelectedIndex(0);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (StringUtil.isNotNullOrEmpty(txCodigo.getText())) {
            com.executarUpdate("DELETE FROM ANIMAL WHERE ANI_ID = " + txCodigo.getText());
            com.buscaValoresEPreencheTabela(jTable1, "SELECT * FROM ANIMAL");
            limparCampos();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPorte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txAndadura;
    private javax.swing.JTextField txCodigo;
    private javax.swing.JTextField txComportamento;
    private javax.swing.JTextField txIdade;
    private javax.swing.JTextField txNome;
    // End of variables declaration//GEN-END:variables
}
