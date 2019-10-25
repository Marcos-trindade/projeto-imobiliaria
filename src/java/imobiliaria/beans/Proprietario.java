
package imobiliaria.beans;

import java.util.Date;


public class Proprietario {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private boolean aceitaNegociar;
    private Date dataCadastro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAceitaNegociar() {
        return aceitaNegociar;
    }

    public void setAceitaNegociar(boolean aceitaNegociar) {
        this.aceitaNegociar = aceitaNegociar;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
