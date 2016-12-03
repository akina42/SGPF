/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;

/**
 *
 * @author leo
 */

@Entity
@Table(name="COMPRAS")
public class Compra {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(length = 10, name = "ID", nullable = false)
    private int idCompra;
}
