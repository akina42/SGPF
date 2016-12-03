package Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.TableGenerator;



/**
 *
 * @author leo
 */

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Pessoa {
    
    @TableGenerator(name = "PESSOA_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME")
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator = "PESSOA_GEN")
    @Column(length = 10, name = "ID", nullable = false)    
    private int idPessoa;
    
    @Column(length = 14, name = "CPFCNPJ", nullable = false)
    private String cpfcnpj;
    
    @Column(length = 100, name = "NOMEFANTASIA", nullable = false)
    private String nomeFantasia;
    
    @Column(length = 100, name = "RAZAOSOCIAL", nullable = false)
    private String razaoSocial;
    
    @Column(length = 150, name = "ENDERECO", nullable = false)
    private String enderecoPessoa;
    
    @Column(length = 20, name = "TELEFONE")
    private String telefonePessoa;
    
    @Column(length = 50, name = "EMAIL")
    private String emailPessoa;
    
    @Column(length = 1, name = "STATUSPESSOA")
    private boolean ativoPessoa;

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

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    
}
