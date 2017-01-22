/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Projeto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ProjetoDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SGPFPU");
    EntityManager em = emf.createEntityManager();
    
    public List obterProjetos(){
        Query qry = em.createQuery("SELECT p FROM Projeto p");
        
        List<Projeto> listaDeProjetos = qry.getResultList();
        
        return listaDeProjetos;
    }
    
        public Projeto recuperaProjeto(int pk){
        try{
            return  em.find(Projeto.class, pk);  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Projeto não encontrado " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }   
                
    }
        
        
    public void salvarProjeto(Projeto projeto){
        
        try{
            em.getTransaction().begin();
            em.persist(projeto);
            em.getTransaction().commit();            
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, ("Erro ao salvar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            
            
        }
    }
    
        public void removerProduto(Projeto projeto){
        try{
            em.getTransaction().begin();
            em.remove(projeto);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Erro ao remover: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
        public void atualizarCustoProjeto(int pk,Double novoCusto){
        try{
            Projeto projeto = this.recuperaProjeto(pk);
            em.getTransaction().begin();
            Double custoAntigo = projeto.getCustoProjeto();
            projeto.setCustoProjeto(novoCusto + custoAntigo);            
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Erro ao atualizar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
