/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Estado;
import Model.Maquina;
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
public class MaquinaDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SGPFPU");
    EntityManager em = emf.createEntityManager();
    
    public List obterMaquinas(){
        Query qry = em.createQuery("SELECT m FROM Maquina m");
        
        List<Maquina> listaDeFornecedores = qry.getResultList();
        
        return listaDeFornecedores;
    }
    
    public Maquina recuperaMaquina(int pk){
        try{
            return  em.find(Maquina.class, pk);  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Máquina não encontrada " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }   
                
    }
    
    public void salvarMaquina(Maquina maquina){
        
        try{
            em.getTransaction().begin();
            em.persist(maquina);
            em.getTransaction().commit();            
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, ("Erro ao salvar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            
            
        }
        
    }
    
        public void removerMaquina(Maquina maquina){
        try{
            em.getTransaction().begin();
            em.remove(maquina);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ("Erro ao remover: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    public void atualizarMaquina(int pk, String nome, Double custo, Estado estado){
    try{
        Maquina maquina = this.recuperaMaquina(pk);
        em.getTransaction().begin();
        maquina.setNomeMaquina(nome);
        maquina.setCustoHora(custo);
        maquina.setEstadoMaquina(estado);
        em.getTransaction().commit();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, ("Erro ao atualizar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
    }
    } 
    
}
