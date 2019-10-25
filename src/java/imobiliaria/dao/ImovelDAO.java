
package imobiliaria.dao;

import com.mysql.jdbc.PreparedStatement;
import imobiliaria.beans.Imovel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import imobiliariaConnection.ConnectionFactory;
import javax.swing.JOptionPane;


public class ImovelDAO {
    
    public void create(Imovel c){
        
        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO imovel (rua,bairro,cidade,estado,"
                    + "pais,preco,imovelFinanciado,ImovelNomeProprietario,dataCadastro, proprietario_id,corretor_id"
                    + ") VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, c.getRua());
            stmt.setString(2,c.getBairro() );
            stmt.setString(3, c.getCidade());
            stmt.setString(4, c.getEstado());
            stmt.setString(5, c.getPais());
            stmt.setDouble(6, c.getPreco());
            stmt.setBoolean(7, c.isImovelFinaciado());
            stmt.setBoolean(8, c.isImovelNomeProprietario());
            stmt.setDate(9, (Date) c.getDataCadastro());
            stmt.setInt(10, c.getProprietario_id());
            stmt.setInt(11, c.getCorretor_id());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        
        }catch (SQLException ex ){                 
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
               
    }
}
