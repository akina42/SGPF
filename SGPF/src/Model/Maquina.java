/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author leo
 */

@Entity
@Table(name = "MAQUINA")
public class Maquina implements Serializable {
    
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

    public Maquina(String nomeMaquina, Double custoHora, Estado estadoMaquina) {
    this.nomeMaquina = nomeMaquina;
    this.custoHora = custoHora;
    this.estadoMaquina = estadoMaquina;
    }
    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getNomeMaquina() {
        return nomeMaquina;
    }

    public void setNomeMaquina(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }

    public Double getCustoHora() {
        return custoHora;
    }

    public void setCustoHora(Double custoHora) {
        this.custoHora = custoHora;
    }

    public Estado getEstadoMaquina() {
        return estadoMaquina;
    }

    public void setEstadoMaquina(Estado estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }
}
