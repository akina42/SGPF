/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Produto;
import Model.Unidade;
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
public class ProdutoDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SGPFPU");
    EntityManager em = emf.createEntityManager();
    
    
    
    public List obterProdutos(){
        Query qry = em.createQuery("SELECT c FROM Produto c");
        
        List<Produto> listaDeProdutos = qry.getResultList();
        
        return listaDeProdutos;
    }
    
    
    
    public Produto recuperaProduto(int pk){
        try{
            return  em.find(Produto.class, pk);  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Produto não encontrado " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }   
                
    }
        
    
    
    public void salvarProduto(Produto produto){
        
        try{
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();            
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, ("Erro ao salvar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            
            
        }
        
    }
    
    
    public void removerProduto(Produto produto){
        try{
            em.getTransaction().begin();
            em.remove(produto);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Erro ao remover: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void atualizarProduto(int pk, String nomeProduto, Double quantidade, Unidade unidade){
        try{
            Produto produto = this.recuperaProduto(pk);
            em.getTransaction().begin();
            produto.setNomeProduto(nomeProduto);
            produto.setQuantidade(quantidade);
            produto.setUnidadeProduto(unidade);
            
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Erro ao atualizar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

}
