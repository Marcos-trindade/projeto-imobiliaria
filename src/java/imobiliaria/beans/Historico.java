
package imobiliaria.beans;

public class Historico {
    private int id;
    private String acao;
    private int imovel_id;
    private int corretor_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public int getImovel_id() {
        return imovel_id;
    }

    public void setImovel_id(int imovel_id) {
        this.imovel_id = imovel_id;
    }

    public int getCorretor_id() {
        return corretor_id;
    }

    public void setCorretor_id(int corretor_id) {
        this.corretor_id = corretor_id;
    }
    
}
