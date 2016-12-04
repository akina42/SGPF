/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author akina
 */
public class FuncionarioDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SGPFPU");
    EntityManager em = emf.createEntityManager();
    
    public List obterFuncionarios(){
        Query qry = em.createQuery("SELECT f FROM Funcionario f");
        
        List<Funcionario> listaDeFuncionarios = qry.getResultList();
        
        return listaDeFuncionarios;
    }
    
    public Funcionario recuperaFuncionario(int pk){
        try{
            return  em.find(Funcionario.class, pk);  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Funcionário não encontrado " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }   
                
    }
    
    public void salvarFuncionario(Funcionario funcionario){
        
        try{
            em.getTransaction().begin();
            em.persist(funcionario);
            em.getTransaction().commit();            
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, ("Erro ao salvar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            
            
        }
        
    }
    
        public void removerFuncionario(Funcionario funcionario){
        try{
            em.getTransaction().begin();
            em.remove(funcionario);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Erro ao remover: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    public void atualizarFuncionario(int pk,int cpfFuncionario, String nomeFuncionario, Double custoHora){
    try{
        Funcionario funcionario = this.recuperaFuncionario(pk);
        em.getTransaction().begin();
        funcionario.setNomeFuncionario(nomeFuncionario);
        funcionario.setCpfFuncionario(cpfFuncionario);
        funcionario.setCustoHora(custoHora);
        em.getTransaction().commit();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, ("Erro ao atualizar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
    }
    } 
    
}
