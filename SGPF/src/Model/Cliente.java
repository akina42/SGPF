
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author leo
 */

@Entity
@Table(name= "CLIENTE")

public class Cliente extends Pessoa implements Serializable{
    
    public Cliente( String cpfcnpj, String nomeFantasia, String razaoSocial, String enderecoPessoa, String telefonePessoa, String emailPessoa, boolean ativoPessoa) {
        super( cpfcnpj, nomeFantasia, razaoSocial, enderecoPessoa, telefonePessoa, emailPessoa, ativoPessoa);
    }
   
    
   
}
