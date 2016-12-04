/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author leo
 */

@Entity
@Table(name="FORNECEDOR")

public class Fornecedor extends Pessoa{
    
    @OneToMany(orphanRemoval = true)
    @JoinTable(name="COMPRAS", joinColumns={@JoinColumn(name="idCompra", referencedColumnName="ID")})
    private List<Compra> listaComprasFornecedor;

    public List<Compra> getListaComprasFornecedor() {
        return listaComprasFornecedor;
    }

    public void setListaComprasFornecedor(List<Compra> listaComprasFornecedor) {
        this.listaComprasFornecedor = listaComprasFornecedor;
    }


    
}
