/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author leo
 */
public class AlocacaoFuncionario extends Alocacao{
    private Funcionario funcionarioAlocacao;    

    public Funcionario getFuncionarioAlocacao() {
        return funcionarioAlocacao;
    }

    public void setFuncionarioAlocacao(Funcionario funcionarioAlocacao) {
        this.funcionarioAlocacao = funcionarioAlocacao;
    }
}
