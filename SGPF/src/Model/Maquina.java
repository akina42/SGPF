/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author leo
 */

@Entity
@Table(name = "MAQUINA")
public class Maquina implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 100, name = "ID", nullable = false)
    private int idMaquina;

    @Column(length = 100, name = "NOME", nullable = false)
    private String nomeMaquina;
    
    @Column(length = 12, name = "CUSTOHORA", nullable = false)
    private Double custoHora;
    
    @Column(length = 20, name = "ESTADO", nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estadoMaquina;

    public Maquina(){
    }
    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        int oldIdMaquina = this.idMaquina;
        this.idMaquina = idMaquina;
        changeSupport.firePropertyChange("idMaquina", oldIdMaquina, idMaquina);
    }

    public String getNomeMaquina() {
        return nomeMaquina;
    }

    public void setNomeMaquina(String nomeMaquina) {
        String oldNomeMaquina = this.nomeMaquina;
        this.nomeMaquina = nomeMaquina;
        changeSupport.firePropertyChange("nomeMaquina", oldNomeMaquina, nomeMaquina);
    }

    public Double getCustoHora() {
        return custoHora;
    }

    public void setCustoHora(Double custoHora) {
        Double oldCustoHora = this.custoHora;
        this.custoHora = custoHora;
        changeSupport.firePropertyChange("custoHora", oldCustoHora, custoHora);
    }

    public Estado getEstadoMaquina() {
        return estadoMaquina;
    }

    public void setEstadoMaquina(Estado estadoMaquina) {
        Estado oldEstadoMaquina = this.estadoMaquina;
        this.estadoMaquina = estadoMaquina;
        changeSupport.firePropertyChange("estadoMaquina", oldEstadoMaquina, estadoMaquina);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
