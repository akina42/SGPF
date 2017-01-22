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
public class AlocacaoMaquina extends Alocacao {
    
    private Maquina maquinaAlocacao;    
    

    public Maquina getMaquinaAlocacao() {
        return maquinaAlocacao;
    }

    public void setMaquinaAlocacao(Maquina maquinaAlocacao) {
        this.maquinaAlocacao = maquinaAlocacao;
    }
    
    
}
