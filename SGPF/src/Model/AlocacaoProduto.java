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
@DiscriminatorValue("PRODUTO")
public class AlocacaoProduto extends Alocacao{

    @Column(length = 100, name = "PRODUTO", nullable = false)    
    private String nomeProdutoAlocacao;

    public String getNomeProdutoAlocacao() {
        return nomeProdutoAlocacao;
    }

    public void setNomeProdutoAlocacao(String nomeProdutoAlocacao) {
        this.nomeProdutoAlocacao = nomeProdutoAlocacao;
    }
    
    @OneToOne
    private Produto produtoAlocacao;

    public Produto getProdutoAlocacao() {
        return produtoAlocacao;
    }

    public void setProdutoAlocacao(Produto produtoAlocacao) {
        this.produtoAlocacao = produtoAlocacao;
    }
    
}
