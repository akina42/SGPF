/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.ClienteFrm;
import View.FornecedorFrm;
import View.MainFrm;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author leo
 */
public class main {
    
    public static void main(String [] args)
	{
            //TESTE DA INSTANCIA DA TABELA APENAS 1 VEZ
            
            //ENTITY FACTORY
            
            new MainFrm().setVisible(true);
            
            /*
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("SGPFPU");
            EntityManager em = emf.createEntityManager();
                                  
            em.getTransaction().begin();
            Cliente cli = new Cliente("12345678991231","CLIENTE DE SOUZA","RAZAO SOCIAL", "RUA DO ENDERECO", "55999998888","EMAIL@EMAIL.EMAIL", true);
            em.persist(cli);
            em.getTransaction().commit();
            
            em.close();
            emf.close();
            */
        }
}
