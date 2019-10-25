
package imobiliaria.dao;

import com.mysql.jdbc.PreparedStatement;
import imobiliaria.beans.Historico;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import imobiliariaConnection.ConnectionFactory;
import javax.swing.JOptionPane;


public class HistoricoDAO {
    
    public void create(Historico h){
        
        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO corretor (acao,imovel_id,corretor_id) VALUES(?,?,?)");
            stmt.setString(1, h.getAcao());
            stmt.setInt(2, h.getImovel_id());
            stmt.setInt(3, h.getCorretor_id());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        
        }catch (SQLException ex ){                 
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
               
    }
}
