
package imobiliaria.beans;

import java.util.Date;

public class Foto {
    private int id;
    private String nomeFoto;
    private String caminhoFoto;
    private Date dataCadastroFoto;
    private int imovel_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFoto() {
        return nomeFoto;
    }

    public void setNomeFoto(String nomeFoto) {
        this.nomeFoto = nomeFoto;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    public Date getDataCadastroFoto() {
        return dataCadastroFoto;
    }

    public void setDataCadastroFoto(Date dataCadastroFoto) {
        this.dataCadastroFoto = dataCadastroFoto;
    }

    public int getImovel_id() {
        return imovel_id;
    }

    public void setImovel_id(int imovel_id) {
        this.imovel_id = imovel_id;
    }
}
