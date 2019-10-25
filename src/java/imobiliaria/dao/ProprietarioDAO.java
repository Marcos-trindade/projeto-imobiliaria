
package imobiliaria.dao;

import com.mysql.jdbc.PreparedStatement;
import imobiliaria.beans.Proprietario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import imobiliariaConnection.ConnectionFactory;
import javax.swing.JOptionPane;


public class ProprietarioDAO {
    
    public void create(Proprietario p){
        
        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO proprietario (nome,email,telefone,aceitaNegociar,dataCadastro) VALUES(?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setString(3, p.getTelefone());
            stmt.setBoolean(4, p.isAceitaNegociar());
            stmt.setDate(5, (Date) p.getDataCadastro());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        
        }catch (SQLException ex ){                 
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
               
    }
}
