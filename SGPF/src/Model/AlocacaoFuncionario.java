/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author leo
 */
@Entity
@DiscriminatorValue("FUNCIONARIO")
public class AlocacaoFuncionario extends Alocacao{
    
    @Column(length = 100, name = "FUNCIONARIO", nullable = true)
    private String nomeFuncionarioAlocacao;

    public String getNomeFuncionarioAlocacao() {
        return nomeFuncionarioAlocacao;
    }

    public void setNomeFuncionarioAlocacao(String nomeFuncionarioAlocacao) {
        this.nomeFuncionarioAlocacao = nomeFuncionarioAlocacao;
    }
    
    @OneToOne
    private Funcionario funcionarioAlocacao;    

    public Funcionario getFuncionarioAlocacao() {
        return funcionarioAlocacao;
    }

    public void setFuncionarioAlocacao(Funcionario funcionarioAlocacao) {
        this.funcionarioAlocacao = funcionarioAlocacao;
    }
}
