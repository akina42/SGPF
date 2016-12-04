/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
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
    
    
    private String nomeProjeto;
    
    private Cliente clienteProjeto;
    
    private String descricaoProjeto;
    
    private Double margemDeLucroProjeto;
    
    private Double precoFinalProjeto;
    
    private EstadoProjeto estadoProjeto;
    
    //private ArrayList<Alocacao> alocacoesProduto;
    
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
    
}
