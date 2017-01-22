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
public class CalculadoraProjeto {
    public Double calculaPrecoProjeto(Double custo, Double margem){
        if(margem == 0){
            return custo;
        }
        else{
           return ((custo * (margem/100))+ custo);  
        }       
    }
}
