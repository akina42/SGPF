
package Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author leo
 */

@Entity
@Table(name= "CLIENTE")

public class Cliente extends Pessoa implements Serializable{

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    
    private ArrayList<Projeto> listaProjetosCliente;

    public Cliente(String cpfcnpj, String nomeFantasia, String razaoSocial, String enderecoPessoa, String telefonePessoa, String emailPessoa, boolean ativoPessoa) {
        super(cpfcnpj, nomeFantasia, razaoSocial, enderecoPessoa, telefonePessoa, emailPessoa, ativoPessoa);
    }

    public ArrayList<Projeto> getListaProjetosCliente() {
        return listaProjetosCliente;
    }

    public void setListaProjetosCliente(ArrayList<Projeto> listaProjetosCliente) {
        ArrayList<Projeto> oldListaProjetosCliente = this.listaProjetosCliente;
        this.listaProjetosCliente = listaProjetosCliente;
        changeSupport.firePropertyChange("listaProjetosCliente", oldListaProjetosCliente, listaProjetosCliente);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
  
   
    
   
}
