
package imobiliaria.dao;

import com.mysql.jdbc.PreparedStatement;
import imobiliaria.beans.Foto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import imobiliariaConnection.ConnectionFactory;
import javax.swing.JOptionPane;


public class FotoDAO {
    
    public void create(Foto f){
        
        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO foto (fotoNome,fotoCaminho,imovel_id,dataCadastroFoto) VALUES(?,?,?,?)");
            stmt.setString(1, f.getNomeFoto());
            stmt.setString(2,f.getCaminhoFoto());
            stmt.setInt(3, f.getImovel_id());
            stmt.setDate(4, (Date) f.getDataCadastroFoto());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        
        }catch (SQLException ex ){                 
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
               
    }
}
