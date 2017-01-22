/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Alocacao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author leo
 */
public class AlocacoesDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SGPFPU");
    EntityManager em = emf.createEntityManager();
    
        public List obterAlocacoesProjeto(int idProjeto){
        Query qry = em.createQuery("SELECT c FROM Alocacao c WHERE PROJETOALOCACAO_IDPROJETO ="+ String.valueOf(idProjeto));
        
        List<Alocacao> listaDeAlocacoes = qry.getResultList();
        
        return listaDeAlocacoes;
    }
        
        public Alocacao recuperaAlocacao(int pk){
        try{
            return  em.find(Alocacao.class, pk);  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Cliente não encontrado " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }   
                
    }
        
    public void salvarAlocacao(Alocacao alocacao){
        
        try{
            em.getTransaction().begin();
            em.persist(alocacao);
            em.getTransaction().commit();            
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, ("Erro ao salvar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            
            
        }
        
    }
    
    public void removerAlocacao(Alocacao alocacao){
        try{
            em.getTransaction().begin();
            em.remove(alocacao);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Erro ao remover: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    
}
