/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Akina
 */
@Entity
@Table(name="PROJETO")

public class Projeto implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(length = 10, name = "ID", nullable = false)
    private int idProjeto;
}
