/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author leo
 */
public class FornecedorFrm extends javax.swing.JFrame {

    /**
     * Creates new form ClienteFrm
     */
    public FornecedorFrm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SGPFPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("SGPFPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : SGPFPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeFornecedorLbl = new javax.swing.JLabel();
        razaoSocialFornecedorLbl = new javax.swing.JLabel();
        telefoneFornecedorLbl = new javax.swing.JLabel();
        emailFornecedorLbl = new javax.swing.JLabel();
        enderecoFornecedorLbl = new javax.swing.JLabel();
        cpfcnpjFornecedorLbl = new javax.swing.JLabel();
        nomeFornecedorTxt = new javax.swing.JTextField();
        razaosocialFornecedorTxt = new javax.swing.JTextField();
        enderecoFornecedorTxt = new javax.swing.JTextField();
        cpfcnpjFornecedorTxt = new javax.swing.JFormattedTextField();
        telefoneFornecedorTxt = new javax.swing.JFormattedTextField();
        idFornecedorTxt = new javax.swing.JTextField();
        ativoFornecedorLbl = new javax.swing.JLabel();
        ativoFornecedorCbx = new javax.swing.JCheckBox();
        emailFornecedorTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFornecedorTbl = new javax.swing.JTable();
        titulotabelaFornecedorLbl = new javax.swing.JLabel();
        salvalrFornecedorBtn = new javax.swing.JButton();
        excluirFornecedorBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
        setTitle("Clientes");
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Fornecedores");

        nomeFornecedorLbl.setText("Nome");

        razaoSocialFornecedorLbl.setText("Razão Social");

        telefoneFornecedorLbl.setText("Telefone");

        emailFornecedorLbl.setText("E-mail");

        enderecoFornecedorLbl.setText("Endereço");

        cpfcnpjFornecedorLbl.setText("CPF/CNPJ");

        idFornecedorTxt.setEnabled(false);
        idFornecedorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFornecedorTxtActionPerformed(evt);
            }
        });

        ativoFornecedorLbl.setText("Ativo");

        ativoFornecedorCbx.setEnabled(false);

        listaFornecedorTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(listaFornecedorTbl);

        titulotabelaFornecedorLbl.setText("Lista de Fornecedores");

        salvalrFornecedorBtn.setText("Salvar");

        excluirFornecedorBtn.setText("Excluir");
        excluirFornecedorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirFornecedorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(352, 352, 352)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(enderecoFornecedorLbl)))
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(razaoSocialFornecedorLbl)
                            .addComponent(nomeFornecedorLbl)
                            .addComponent(ativoFornecedorLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ativoFornecedorCbx)
                            .addComponent(razaosocialFornecedorTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enderecoFornecedorTxt)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(idFornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeFornecedorTxt)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpfcnpjFornecedorLbl)
                    .addComponent(telefoneFornecedorLbl, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailFornecedorLbl, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpfcnpjFornecedorTxt)
                    .addComponent(telefoneFornecedorTxt)
                    .addComponent(emailFornecedorTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(titulotabelaFornecedorLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(salvalrFornecedorBtn)
                        .addGap(18, 18, 18)
                        .addComponent(excluirFornecedorBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomeFornecedorLbl)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nomeFornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cpfcnpjFornecedorLbl)
                                .addComponent(cpfcnpjFornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idFornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(razaoSocialFornecedorLbl))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(razaosocialFornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefoneFornecedorLbl)
                        .addComponent(telefoneFornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoFornecedorLbl)
                    .addComponent(enderecoFornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailFornecedorLbl)
                    .addComponent(emailFornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ativoFornecedorCbx)
                    .addComponent(ativoFornecedorLbl))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluirFornecedorBtn)
                    .addComponent(salvalrFornecedorBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulotabelaFornecedorLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFornecedorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFornecedorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFornecedorTxtActionPerformed

    private void excluirFornecedorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirFornecedorBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirFornecedorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FornecedorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FornecedorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FornecedorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FornecedorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FornecedorFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager SGPFPUEntityManager;
    private javax.swing.JCheckBox ativoFornecedorCbx;
    private javax.swing.JLabel ativoFornecedorLbl;
    private java.util.List<Model.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    private javax.swing.JLabel cpfcnpjFornecedorLbl;
    private javax.swing.JFormattedTextField cpfcnpjFornecedorTxt;
    private javax.swing.JLabel emailFornecedorLbl;
    private javax.swing.JTextField emailFornecedorTxt;
    private javax.swing.JLabel enderecoFornecedorLbl;
    private javax.swing.JTextField enderecoFornecedorTxt;
    private javax.swing.JButton excluirFornecedorBtn;
    private javax.swing.JTextField idFornecedorTxt;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable listaFornecedorTbl;
    private javax.swing.JLabel nomeFornecedorLbl;
    private javax.swing.JTextField nomeFornecedorTxt;
    private javax.swing.JLabel razaoSocialFornecedorLbl;
    private javax.swing.JTextField razaosocialFornecedorTxt;
    private javax.swing.JButton salvalrFornecedorBtn;
    private javax.swing.JLabel telefoneFornecedorLbl;
    private javax.swing.JFormattedTextField telefoneFornecedorTxt;
    private javax.swing.JLabel titulotabelaFornecedorLbl;
    // End of variables declaration//GEN-END:variables
}
