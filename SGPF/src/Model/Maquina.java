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
public class Maquina {
    private int idMaquina;
    private String nomeMaquina;
    private Double custoHora;
    private Estado estadoMaquina;

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getNomeMaquina() {
        return nomeMaquina;
    }

    public void setNomeMaquina(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }

    public Double getCustoHora() {
        return custoHora;
    }

    public void setCustoHora(Double custoHora) {
        this.custoHora = custoHora;
    }

    public Estado getEstadoMaquina() {
        return estadoMaquina;
    }

    public void setEstadoMaquina(Estado estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }
}
