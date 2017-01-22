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
public class AlocacaoProduto extends Alocacao{
    
    private Produto produtoAlocacao;

    public Produto getProdutoAlocacao() {
        return produtoAlocacao;
    }

    public void setProdutoAlocacao(Produto produtoAlocacao) {
        this.produtoAlocacao = produtoAlocacao;
    }
    
}
