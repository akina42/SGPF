/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author akina
 */

@Entity
@Table(name="FUNCIONARIO")

public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (length = 20, name = "ID", nullable = false)
    private int idFuncionario;
    
    @Column(length = 20, name = "CPF", nullable = false)
    private int cpfFuncionario;
    
    @Column(length = 100, name = "NOME", nullable = false)
    private String nomeFuncionario;
    
    @Column(length = 12, name = "CUSTOHORA", nullable = false)
    private Double custoHora;
    
    @Column(length = 1, name = "ATIVO", nullable = false)
    private boolean funcionarioAtivo;

    
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(int cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Double getCustoHora() {
        return custoHora;
    }

    public void setCustoHora(Double custoHora) {
        this.custoHora = custoHora;
    }

    public boolean isFuncionarioAtivo() {
        return funcionarioAtivo;
    }

    public void setFuncionarioAtivo(boolean funcionarioAtivo) {
        this.funcionarioAtivo = funcionarioAtivo;
    }
    
}
