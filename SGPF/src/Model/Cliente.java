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
public class Cliente extends Pessoa{
   
    public Cliente(int idPessoa, String cpfcnpj, String nomeFantasia, String razaoSocial, String enderecoPessoa, String telefonePessoa, String emailPessoa, boolean ativoPessoa) {
        super(idPessoa, cpfcnpj, nomeFantasia, razaoSocial, enderecoPessoa, telefonePessoa, emailPessoa, ativoPessoa);
    }
   
    
   
}
