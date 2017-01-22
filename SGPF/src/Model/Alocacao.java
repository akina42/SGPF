/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author akina
 */

@Entity
@Table(name="ALOCACAO")
public abstract class Alocacao {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(length = 10, name = "IDEALOCACAO", nullable = false)
    private int idAlocacao;
    
    @ManyToOne
    private Projeto projetoAlocacao;
    
    private Double custoTotalAlocacoes;
    
    private Unidade unidadeAlocacao;
    
    private Double quantidadeAlocacao;

    public int getIdAlocacao() {
        return idAlocacao;
    }


    public Projeto getProjetoAlocacao() {
        return projetoAlocacao;
    }

    public void setProjetoAlocacao(Projeto projetoAlocacao) {
        this.projetoAlocacao = projetoAlocacao;
    }

    public Double getCustoTotalAlocacoes() {
        return custoTotalAlocacoes;
    }

    public void setCustoTotalAlocacoes(Double custoTotalAlocacoes) {
        this.custoTotalAlocacoes = custoTotalAlocacoes;
    }

    public Unidade getUnidadeAlocacao() {
        return unidadeAlocacao;
    }

    public void setUnidadeAlocacao(Unidade unidadeAlocacao) {
        this.unidadeAlocacao = unidadeAlocacao;
    }

    public Double getQuantidadeAlocacao() {
        return quantidadeAlocacao;
    }

    public void setQuantidadeAlocacao(Double quantidadeAlocacao) {
        this.quantidadeAlocacao = quantidadeAlocacao;
    }
    
    
}
