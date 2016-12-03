/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ClienteDAO;
import Model.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author leo
 */
public class ClienteFrm extends javax.swing.JFrame {

    ClienteDAO clienteDAO = new ClienteDAO();
    /**
     * Creates new form ClienteFrm
     */
    public ClienteFrm() {
        initComponents();
        this.preencheTabela();
    }
    
    public void tableRefresh(){
        ((AbstractTableModel) this.listaClienteTbl.getModel()).fireTableDataChanged();
    }
    
    public void preencheTabela(){
        
        List<Cliente> listCliente = clienteDAO.obterClientes();
        DefaultTableModel dtm = new DefaultTableModel();
        this.listaClienteTbl.setModel(dtm);
        dtm.addColumn("Id");
        dtm.addColumn("Nome");
        dtm.addColumn("Cpf");
        
        for(Cliente cl : listCliente){
                dtm.addRow(new Object[] {cl.getIdPessoa() , cl.getNomeFantasia(), cl.getCpfcnpj(),});
            }
    }
    
    public void fieldRefresh(){
        this.idClienteTxt.setText("");
        this.nomeClienteTxt.setText("");
        this.cpfcnpjClienteTxt.setText("");
        this.razaosocialClienteTxt.setText("");
        this.telefoneClienteTxt.setText("");
        this.enderecoClienteTxt.setText("");
        this.emailClienteTxt.setText("");
    }
    
    public boolean checaVazio(){
        if(
        this.nomeClienteTxt.getText().equals("") ||
        this.cpfcnpjClienteTxt.getText().equals("") ||
        this.razaosocialClienteTxt.getText().equals("") ||
        this.telefoneClienteTxt.getText().equals("") ||
        this.enderecoClienteTxt.getText().equals("") ||
        this.emailClienteTxt.getText().equals("")){
        return true;
    }
        return false;
    }
    
    public void preencheField(){
        this.fieldRefresh();
        Cliente cliente = clienteDAO.recuperaCliente((int) this.listaClienteTbl.getValueAt(this.listaClienteTbl.getSelectedRow(), 0));
        this.idClienteTxt.setText(String.valueOf(cliente.getIdPessoa()));
        this.nomeClienteTxt.setText(cliente.getNomeFantasia());
        this.razaosocialClienteTxt.setText(cliente.getRazaoSocial());
        this.emailClienteTxt.setText(cliente.getEmailPessoa());
        this.enderecoClienteTxt.setText(cliente.getEnderecoPessoa());
        this.telefoneClienteTxt.setText(cliente.getTelefonePessoa());
        this.cpfcnpjClienteTxt.setText(cliente.getCpfcnpj());
        
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
        clienteQuery1 = java.beans.Beans.isDesignTime() ? null : SGPFPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery1.getResultList();
        clienteQuery2 = java.beans.Beans.isDesignTime() ? null : SGPFPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery2.getResultList();
        clienteQuery3 = java.beans.Beans.isDesignTime() ? null : SGPFPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery3.getResultList();
        clienteQuery4 = java.beans.Beans.isDesignTime() ? null : SGPFPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery4.getResultList();
        clienteQuery5 = java.beans.Beans.isDesignTime() ? null : SGPFPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery5.getResultList();
        clienteQuery6 = java.beans.Beans.isDesignTime() ? null : SGPFPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery6.getResultList();
        maquinaQuery = java.beans.Beans.isDesignTime() ? null : SGPFPUEntityManager.createQuery("SELECT m FROM Maquina m");
        maquinaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : maquinaQuery.getResultList();
        clienteQuery7 = java.beans.Beans.isDesignTime() ? null : SGPFPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList7 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery7.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeClienteLbl = new javax.swing.JLabel();
        razaoSocialClienteLbl = new javax.swing.JLabel();
        telefoneClienteLbl = new javax.swing.JLabel();
        emailClienteLbl = new javax.swing.JLabel();
        enderecoClienteLbl = new javax.swing.JLabel();
        cpfcnpjClienteLbl = new javax.swing.JLabel();
        nomeClienteTxt = new javax.swing.JTextField();
        razaosocialClienteTxt = new javax.swing.JTextField();
        enderecoClienteTxt = new javax.swing.JTextField();
        cpfcnpjClienteTxt = new javax.swing.JFormattedTextField();
        telefoneClienteTxt = new javax.swing.JFormattedTextField();
        idClienteTxt = new javax.swing.JTextField();
        ativoClienteLbl = new javax.swing.JLabel();
        ativoClienteCbx = new javax.swing.JCheckBox();
        emailClienteTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        titulotabelaClienteLbl = new javax.swing.JLabel();
        salvarClienteBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        limparClienteBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaClienteTbl = new javax.swing.JTable();

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
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Clientes");

        nomeClienteLbl.setText("Nome");

        razaoSocialClienteLbl.setText("Razão Social");

        telefoneClienteLbl.setText("Telefone");

        emailClienteLbl.setText("E-mail");

        enderecoClienteLbl.setText("Endereço");

        cpfcnpjClienteLbl.setText("CPF/CNPJ");

        try {
            cpfcnpjClienteTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefoneClienteTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        idClienteTxt.setEnabled(false);
        idClienteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClienteTxtActionPerformed(evt);
            }
        });

        ativoClienteLbl.setText("Ativo");

        ativoClienteCbx.setEnabled(false);

        titulotabelaClienteLbl.setText("Lista de Clientes");

        salvarClienteBtn.setText("Salvar");
        salvarClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarClienteBtnActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        limparClienteBtn.setText("Limpar");
        limparClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparClienteBtnActionPerformed(evt);
            }
        });

        listaClienteTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listaClienteTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClienteTblMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaClienteTblMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(listaClienteTbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(352, 352, 352)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(enderecoClienteLbl)))
                        .addGap(0, 165, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(razaoSocialClienteLbl)
                            .addComponent(nomeClienteLbl)
                            .addComponent(ativoClienteLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ativoClienteCbx)
                            .addComponent(razaosocialClienteTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enderecoClienteTxt)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(idClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeClienteTxt)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpfcnpjClienteLbl)
                    .addComponent(telefoneClienteLbl, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailClienteLbl, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpfcnpjClienteTxt)
                    .addComponent(telefoneClienteTxt)
                    .addComponent(emailClienteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(titulotabelaClienteLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(salvarClienteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(limparClienteBtn)))
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jSeparator1))
                .addContainerGap())
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
                            .addComponent(nomeClienteLbl)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nomeClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cpfcnpjClienteLbl)
                                .addComponent(cpfcnpjClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(razaoSocialClienteLbl))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(razaosocialClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefoneClienteLbl)
                        .addComponent(telefoneClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoClienteLbl)
                    .addComponent(enderecoClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailClienteLbl)
                    .addComponent(emailClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ativoClienteCbx)
                    .addComponent(ativoClienteLbl))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(salvarClienteBtn)
                    .addComponent(limparClienteBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulotabelaClienteLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void idClienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClienteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClienteTxtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{       
            clienteDAO.removerCliente(clienteDAO.recuperaCliente(Integer.parseInt(this.idClienteTxt.getText())));
            this.fieldRefresh();
            this.preencheTabela();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Selecione um cliente da tabela " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void limparClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparClienteBtnActionPerformed
        // TODO add your handling code here:
        fieldRefresh();
    }//GEN-LAST:event_limparClienteBtnActionPerformed

    private void salvarClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarClienteBtnActionPerformed
        // TODO add your handling code here:
        if(this.checaVazio()){
            JOptionPane.showMessageDialog(null, "Erro, confira o preenchimento", "ERRO", JOptionPane.WARNING_MESSAGE);
        }else{
        try{
            Cliente cliente = new Cliente();
            
            cliente.setCpfcnpj(this.cpfcnpjClienteTxt.getText());
            cliente.setNomeFantasia(this.nomeClienteTxt.getText());
            cliente.setRazaoSocial(this.razaosocialClienteTxt.getText());
            cliente.setEnderecoPessoa(this.enderecoClienteTxt.getText());
            cliente.setTelefonePessoa( this.telefoneClienteTxt.getText());                               
            cliente.setEmailPessoa( this.emailClienteTxt.getText());                               
            cliente.setAtivoPessoa(true);
            
            clienteDAO.salvarCliente(cliente);
            
            this.fieldRefresh();
            this.preencheTabela();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO"  , JOptionPane.ERROR_MESSAGE);
        }}
    }//GEN-LAST:event_salvarClienteBtnActionPerformed

    private void listaClienteTblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClienteTblMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaClienteTblMousePressed

    private void listaClienteTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClienteTblMouseClicked
        // TODO add your handling code here:
        this.preencheField();
    }//GEN-LAST:event_listaClienteTblMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager SGPFPUEntityManager;
    private javax.swing.JCheckBox ativoClienteCbx;
    private javax.swing.JLabel ativoClienteLbl;
    private java.util.List<Model.Cliente> clienteList;
    private java.util.List<Model.Cliente> clienteList1;
    private java.util.List<Model.Cliente> clienteList2;
    private java.util.List<Model.Cliente> clienteList3;
    private java.util.List<Model.Cliente> clienteList4;
    private java.util.List<Model.Cliente> clienteList5;
    private java.util.List<Model.Cliente> clienteList6;
    private java.util.List<Model.Cliente> clienteList7;
    private javax.persistence.Query clienteQuery;
    private javax.persistence.Query clienteQuery1;
    private javax.persistence.Query clienteQuery2;
    private javax.persistence.Query clienteQuery3;
    private javax.persistence.Query clienteQuery4;
    private javax.persistence.Query clienteQuery5;
    private javax.persistence.Query clienteQuery6;
    private javax.persistence.Query clienteQuery7;
    private javax.swing.JLabel cpfcnpjClienteLbl;
    private javax.swing.JFormattedTextField cpfcnpjClienteTxt;
    private javax.swing.JLabel emailClienteLbl;
    private javax.swing.JTextField emailClienteTxt;
    private javax.swing.JLabel enderecoClienteLbl;
    private javax.swing.JTextField enderecoClienteTxt;
    private javax.swing.JTextField idClienteTxt;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limparClienteBtn;
    private javax.swing.JTable listaClienteTbl;
    private java.util.List<Model.Maquina> maquinaList;
    private javax.persistence.Query maquinaQuery;
    private javax.swing.JLabel nomeClienteLbl;
    private javax.swing.JTextField nomeClienteTxt;
    private javax.swing.JLabel razaoSocialClienteLbl;
    private javax.swing.JTextField razaosocialClienteTxt;
    private javax.swing.JButton salvarClienteBtn;
    private javax.swing.JLabel telefoneClienteLbl;
    private javax.swing.JFormattedTextField telefoneClienteTxt;
    private javax.swing.JLabel titulotabelaClienteLbl;
    // End of variables declaration//GEN-END:variables
}
