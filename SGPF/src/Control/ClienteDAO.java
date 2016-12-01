/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cliente;
import javax.persistence.*;
import javax.swing.JOptionPane;

/**
 *
 * @author leo
 */
public class ClienteDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SGPFPU");
    EntityManager em = emf.createEntityManager();
    
    public void salvarCliente(Cliente cliente){
        
        try{
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();            
            em.close();
            emf.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, ("Erro ao salvar: " + e.getMessage()), "ERRO", JOptionPane.ERROR_MESSAGE);
            
            
        }
        
    }
    
}
