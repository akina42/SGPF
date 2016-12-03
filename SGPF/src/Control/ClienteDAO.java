/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cliente;
import java.util.List;
import javax.persistence.*;
import javax.swing.JOptionPane;

/**
 *
 * @author leo
 */
public class ClienteDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SGPFPU");
    EntityManager em = emf.createEntityManager();
    
    public List obterClientes(){
        Query qry = em.createQuery("SELECT c FROM Cliente c");
        
        List<Cliente> listaDeClientes = qry.getResultList();
        
        return listaDeClientes;
    }
    
    public Cliente recuperaCliente(int pk){
        try{
            return  em.find(Cliente.class, pk);  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Cliente não encontrado " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }   
                
    }
        
    
    public void salvarCliente(Cliente cliente){
        
        try{
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();            
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, ("Erro ao salvar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            
            
        }
        
    }
    
    public void removerCliente(Cliente cliente){
        try{
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Erro ao remover: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void atualizarCliente(int pk, String nome, String razao, String endereco, String cpfcnpj, String telefone, String email){
        try{
            Cliente cliente = this.recuperaCliente(pk);
            em.getTransaction().begin();
            cliente.setNomeFantasia(nome);
            cliente.setRazaoSocial(razao);
            cliente.setEnderecoPessoa(endereco);
            cliente.setCpfcnpj(cpfcnpj);
            cliente.setTelefonePessoa(telefone);
            cliente.setEmailPessoa(email);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Erro ao atualizar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
