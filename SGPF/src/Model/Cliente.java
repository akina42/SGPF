
package Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
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
    
    @OneToMany(orphanRemoval = true)
    @JoinTable(name="PROJETO", joinColumns={@JoinColumn(name="idProjeto", referencedColumnName="ID")})
    private List<Projeto> listaProjetosCliente;

    public Cliente() {
    }

    public List<Projeto> getListaProjetosCliente() {
        return listaProjetosCliente;
    }

    public void setListaProjetosCliente(List<Projeto> listaProjetosCliente) {
        List<Projeto> oldListaProjetosCliente = this.listaProjetosCliente;
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
