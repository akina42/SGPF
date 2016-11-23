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
public class Pessoa {
    private int idPessoa;
    private String cpfcnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String enderecoPessoa;
    private String telefonePessoa;
    private String emailPessoa;
    private boolean ativoPessoa;

    public Pessoa( String cpfcnpj, String nomeFantasia, String razaoSocial, String enderecoPessoa, String telefonePessoa, String emailPessoa, boolean ativoPessoa) {
        
        this.cpfcnpj = cpfcnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.enderecoPessoa = enderecoPessoa;
        this.telefonePessoa = telefonePessoa;
        this.emailPessoa = emailPessoa;
        this.ativoPessoa = ativoPessoa;
    }

    
    
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public boolean isAtivoPessoa() {
        return ativoPessoa;
    }

    public void setAtivoPessoa(boolean ativoPessoa) {
        this.ativoPessoa = ativoPessoa;
    }

    
}
