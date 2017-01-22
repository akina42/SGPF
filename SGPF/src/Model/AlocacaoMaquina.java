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

/**
 *
 * @author leo
 */
@Entity
@DiscriminatorValue("MAQUINA")
public class AlocacaoMaquina extends Alocacao {
    
    @Column(length = 100, name = "MAQUINA", nullable = false)
    private String nomeMaquinaAlocacao;

    public String getNomeMaquinaAlocacao() {
        return nomeMaquinaAlocacao;
    }

    public void setNomeMaquinaAlocacao(String nomeMaquinaAlocacao) {
        this.nomeMaquinaAlocacao = nomeMaquinaAlocacao;
    }
    
    @OneToOne
    private Maquina maquinaAlocacao;    
    

    public Maquina getMaquinaAlocacao() {
        return maquinaAlocacao;
    }

    public void setMaquinaAlocacao(Maquina maquinaAlocacao) {
        this.maquinaAlocacao = maquinaAlocacao;
    }
    
    
}
