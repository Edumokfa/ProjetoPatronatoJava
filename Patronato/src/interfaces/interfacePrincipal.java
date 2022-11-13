package interfaces;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Pedro
 */
public class interfacePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form interfacePrincipal
     */
    int cod, id;
    String nome, email;
    String Status, StatusIniciada;
    int idRodada, idRodadaIniciada, comprasRodada;

    List lista = new ArrayList();
    List lista2 = new ArrayList();

    public interfacePrincipal() {
        initComponents();
    }

    //Modifica a cor para cinza claro
    void setColor(JPanel panel) {
        panel.setBackground(new Color(186, 207, 196));
    }

    //Retorna a cor para o cinza escuro
    void resetColor(JPanel panel) {
        panel.setBackground(new Color(146, 165, 146));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        slidebotões = new javax.swing.JPanel();
        funcionario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        praticante = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        animal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        atividade = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        material = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sessao = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slidebotões.setBackground(new java.awt.Color(200, 255, 198));
        slidebotões.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        funcionario.setBackground(new java.awt.Color(146, 165, 146));
        funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funcionarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                funcionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                funcionarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                funcionarioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                funcionarioMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Funcionario");

        jLabel2.setMaximumSize(new java.awt.Dimension(550, 512));

        javax.swing.GroupLayout funcionarioLayout = new javax.swing.GroupLayout(funcionario);
        funcionario.setLayout(funcionarioLayout);
        funcionarioLayout.setHorizontalGroup(
            funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, funcionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        funcionarioLayout.setVerticalGroup(
            funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionarioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        slidebotões.add(funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        praticante.setBackground(new java.awt.Color(146, 165, 146));
        praticante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                praticanteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                praticanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                praticanteMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Praticante");

        jLabel4.setMaximumSize(new java.awt.Dimension(550, 512));

        javax.swing.GroupLayout praticanteLayout = new javax.swing.GroupLayout(praticante);
        praticante.setLayout(praticanteLayout);
        praticanteLayout.setHorizontalGroup(
            praticanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, praticanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        praticanteLayout.setVerticalGroup(
            praticanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(praticanteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(praticanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        slidebotões.add(praticante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 110));

        animal.setBackground(new java.awt.Color(146, 165, 146));
        animal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                animalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                animalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                animalMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Animal");

        jLabel6.setMaximumSize(new java.awt.Dimension(550, 512));

        javax.swing.GroupLayout animalLayout = new javax.swing.GroupLayout(animal);
        animal.setLayout(animalLayout);
        animalLayout.setHorizontalGroup(
            animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, animalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        animalLayout.setVerticalGroup(
            animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(animalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        slidebotões.add(animal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 110));

        atividade.setBackground(new java.awt.Color(146, 165, 146));
        atividade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atividadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atividadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atividadeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atividadeMousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Atividade");

        jLabel14.setMaximumSize(new java.awt.Dimension(550, 512));

        javax.swing.GroupLayout atividadeLayout = new javax.swing.GroupLayout(atividade);
        atividade.setLayout(atividadeLayout);
        atividadeLayout.setHorizontalGroup(
            atividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atividadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        atividadeLayout.setVerticalGroup(
            atividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atividadeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(atividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        slidebotões.add(atividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 110));

        material.setBackground(new java.awt.Color(146, 165, 146));
        material.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                materialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                materialMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                materialMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Material");

        jLabel16.setMaximumSize(new java.awt.Dimension(550, 512));

        javax.swing.GroupLayout materialLayout = new javax.swing.GroupLayout(material);
        material.setLayout(materialLayout);
        materialLayout.setHorizontalGroup(
            materialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        materialLayout.setVerticalGroup(
            materialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(materialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        slidebotões.add(material, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 200, 110));

        sessao.setBackground(new java.awt.Color(146, 165, 146));
        sessao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sessaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sessaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sessaoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sessaoMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Sessão");

        jLabel18.setMaximumSize(new java.awt.Dimension(550, 512));

        javax.swing.GroupLayout sessaoLayout = new javax.swing.GroupLayout(sessao);
        sessao.setLayout(sessaoLayout);
        sessaoLayout.setHorizontalGroup(
            sessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sessaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        sessaoLayout.setVerticalGroup(
            sessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sessaoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(sessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        slidebotões.add(sessao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 200, 110));

        Bg.add(slidebotões, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 660));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1010, 510));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        Bg.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1160, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionarioMouseClicked
        // TODO add your handling code here:
        setColor(funcionario);
        resetColor(praticante);
        resetColor(animal);
        resetColor(atividade);
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        jDesktopPane1.add(cadastroFuncionario);
        cadastroFuncionario.setVisible(true);
        resetColor(material);
    }//GEN-LAST:event_funcionarioMouseClicked

    private void funcionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionarioMouseEntered
        // TODO add your handling code here:
        //setColor(mercado);

    }//GEN-LAST:event_funcionarioMouseEntered

    private void funcionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionarioMouseExited
        // TODO add your handling code here:
        //resetColor(mercado);

    }//GEN-LAST:event_funcionarioMouseExited

    private void funcionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionarioMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_funcionarioMousePressed

    private void funcionarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionarioMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_funcionarioMouseReleased

    private void praticanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_praticanteMouseClicked
        // TODO add your handling code here:
        setColor(praticante);
        resetColor(funcionario);
        resetColor(animal);
        resetColor(atividade);
        CadastroPraticante cadastroPraticante = new CadastroPraticante();
        jDesktopPane1.add(cadastroPraticante);
        cadastroPraticante.setVisible(true);
        resetColor(material);
    }//GEN-LAST:event_praticanteMouseClicked

    private void praticanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_praticanteMouseEntered
        // TODO add your handling code here:
        //setColor(estoque);
    }//GEN-LAST:event_praticanteMouseEntered

    private void praticanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_praticanteMouseExited
        // TODO add your handling code here:
        //resetColor(estoque);
    }//GEN-LAST:event_praticanteMouseExited

    private void animalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalMouseClicked
        // TODO add your handling code here:
        setColor(animal);
        resetColor(funcionario);
        resetColor(praticante);
        resetColor(atividade);
        resetColor(material);
        resetColor(sessao);
        CadastroAnimal cadastroAnimal = new CadastroAnimal();
        jDesktopPane1.add(cadastroAnimal);
        cadastroAnimal.setVisible(true);

    }//GEN-LAST:event_animalMouseClicked

    private void animalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalMouseEntered
        // TODO add your handling code here:
        //setColor(empresa);
    }//GEN-LAST:event_animalMouseEntered

    private void animalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalMouseExited
        // TODO add your handling code here:
        //resetColor(empresa);
    }//GEN-LAST:event_animalMouseExited

    private void animalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_animalMousePressed

    private void atividadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atividadeMouseClicked
        // TODO add your handling code here:
        setColor(atividade);
        resetColor(funcionario);
        resetColor(animal);
        resetColor(praticante);
        resetColor(material);
        resetColor(sessao);
        CadastroAtividade cadastroAtividade = new CadastroAtividade();
        jDesktopPane1.add(cadastroAtividade);
        cadastroAtividade.setVisible(true);
    }//GEN-LAST:event_atividadeMouseClicked

    private void atividadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atividadeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_atividadeMouseEntered

    private void atividadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atividadeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_atividadeMouseExited

    private void atividadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atividadeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_atividadeMousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        jDesktopPane1.removeAll();
    }//GEN-LAST:event_jPanel1MouseClicked
    private void materialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialMouseClicked

        // TODO add your handling code here:]
        setColor(material);
        resetColor(funcionario);
        resetColor(animal);
        resetColor(praticante);
        resetColor(atividade);
        resetColor(sessao);
        CadastroMaterial cadastroMaterial = new CadastroMaterial();
        jDesktopPane1.add(cadastroMaterial);
        cadastroMaterial.setVisible(true);
    }//GEN-LAST:event_materialMouseClicked

    private void materialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_materialMouseEntered

    private void materialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_materialMouseExited

    private void materialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialMousePressed

    private void sessaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sessaoMouseClicked
        // TODO add your handling code here:
        setColor(sessao);
        resetColor(funcionario);
        resetColor(animal);
        resetColor(praticante);
        resetColor(atividade);
        resetColor(material);

        MovimentoSessao movimentoSessao = new MovimentoSessao();
        jDesktopPane1.add(movimentoSessao);
        movimentoSessao.setVisible(true);
    }//GEN-LAST:event_sessaoMouseClicked

    private void sessaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sessaoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_sessaoMouseEntered

    private void sessaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sessaoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_sessaoMouseExited

    private void sessaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sessaoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sessaoMousePressed

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
            java.util.logging.Logger.getLogger(interfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfacePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel animal;
    private javax.swing.JPanel atividade;
    private javax.swing.JPanel funcionario;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel material;
    private javax.swing.JPanel praticante;
    private javax.swing.JPanel sessao;
    private javax.swing.JPanel slidebotões;
    // End of variables declaration//GEN-END:variables
}
