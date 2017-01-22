/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author akina
 */
@Entity
@Table(name="PROJETO")

public class Projeto implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(length = 10, name = "IDPROJETO", nullable = false)
    private int idProjeto;
    
    @Column(length = 100, name = "NOME_PROJETO", nullable = false)
    private String nomeProjeto;  
    
 
    @ManyToOne
    private Cliente clienteProjeto;
    
    @Column(length = 100, name = "DESC_PROJETO", nullable = false)
    private String descricaoProjeto;
    
    @Column(length = 100, name = "MG_LUCRO", nullable = false)
    private Double margemDeLucroProjeto;
    
    @Column(length = 100, name = "PRECO", nullable = false)
    private Double precoFinalProjeto;
    
    @Column(length = 100, name = "CUSTO", nullable = false)
    private Double custoProjeto;
    
    @Column(length = 100, name = "ESTADO", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoProjeto estadoProjeto;

    @OneToMany(mappedBy = "projetoAlocacao")
    private List<Alocacao> alocacoesProjeto;
    
    //private ArrayList<Alocacao> alocacoesFuncionario;
    
    //private ArrayList<Alocacao> alocacoesMaquina;

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public Cliente getClienteProjeto() {
        return clienteProjeto;
    }

    public void setClienteProjeto(Cliente clienteProjeto) {
        this.clienteProjeto = clienteProjeto;
    }

    public String getDescricaoProjeto() {
        return descricaoProjeto;
    }

    public void setDescricaoProjeto(String descricaoProjeto) {
        this.descricaoProjeto = descricaoProjeto;
    }

    public Double getMargemDeLucroProjeto() {
        return margemDeLucroProjeto;
    }

    public void setMargemDeLucroProjeto(Double margemDeLucroProjeto) {
        this.margemDeLucroProjeto = margemDeLucroProjeto;
    }

    public Double getPrecoFinalProjeto() {
        return precoFinalProjeto;
    }

    public void setPrecoFinalProjeto(Double precoFinalProjeto) {
        this.precoFinalProjeto = precoFinalProjeto;
    }

    public EstadoProjeto getEstadoProjeto() {
        return estadoProjeto;
    }

    public void setEstadoProjeto(EstadoProjeto estadoProjeto) {
        this.estadoProjeto = estadoProjeto;
    }

    /*
    public ArrayList<Alocacao> getAlocacoesProduto() {
        return alocacoesProduto;
    }

    public void setAlocacoesProduto(ArrayList<Alocacao> alocacoesProduto) {
        this.alocacoesProduto = alocacoesProduto;
    }

    public ArrayList<Alocacao> getAlocacoesFuncionario() {
        return alocacoesFuncionario;
    }

    public void setAlocacoesFuncionario(ArrayList<Alocacao> alocacoesFuncionario) {
        this.alocacoesFuncionario = alocacoesFuncionario;
    }

    public ArrayList<Alocacao> getAlocacoesMaquina() {
        return alocacoesMaquina;
    }

    public void setAlocacoesMaquina(ArrayList<Alocacao> alocacoesMaquina) {
        this.alocacoesMaquina = alocacoesMaquina;
    }
    
    */

    public List<Alocacao> getAlocacoesProjeto() {
        return alocacoesProjeto;
    }

    public void setAlocacoesProjeto(List<Alocacao> alocacoesProjeto) {
        this.alocacoesProjeto = alocacoesProjeto;
    }

    public Double getCustoProjeto() {
        return custoProjeto;
    }

    public void setCustoProjeto(Double custoProjeto) {
        this.custoProjeto = custoProjeto;
    }
    
}
