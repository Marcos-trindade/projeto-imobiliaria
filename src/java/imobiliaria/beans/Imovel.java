
package imobiliaria.beans;
import java.util.Date;


public class Imovel {
    
    private int id;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private double preco;
    private boolean imovelFinaciado;
    private boolean imovelNomeProprietario;
    private Date dataCadastro;
    private int proprietario_id;
    private int corretor_id;

   
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    
    public String getRua() {
        return rua;
    }

    
    public void setRua(String rua) {
        this.rua = rua;
    }

    
    public String getBairro() {
        return bairro;
    }

    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    public String getCidade() {
        return cidade;
    }

    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

   
    public String getEstado() {
        return estado;
    }

    
    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public String getPais() {
        return pais;
    }

   
    public void setPais(String pais) {
        this.pais = pais;
    }

   
    public double getPreco() {
        return preco;
    }

  
    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public boolean isImovelFinaciado() {
        return imovelFinaciado;
    }

    
    public void setImovelFinaciado(boolean imovelFinaciado) {
        this.imovelFinaciado = imovelFinaciado;
    }

   
    public boolean isImovelNomeProprietario() {
        return imovelNomeProprietario;
    }

   
    public void setImovelNomeProprietario(boolean imovelNomeProprietario) {
        this.imovelNomeProprietario = imovelNomeProprietario;
    }

  
    public Date getDataCadastro() {
        return dataCadastro;
    }

   
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getProprietario_id() {
        return proprietario_id;
    }

    public void setProprietario_id(int proprietario_id) {
        this.proprietario_id = proprietario_id;
    }

    public int getCorretor_id() {
        return corretor_id;
    }

    public void setCorretor_id(int corretor_id) {
        this.corretor_id = corretor_id;
    }
    
    
}
