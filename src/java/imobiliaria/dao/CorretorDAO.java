
package imobiliaria.dao;

import com.mysql.jdbc.PreparedStatement;
import imobiliaria.beans.Corretor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import imobiliariaConnection.ConnectionFactory;
import javax.swing.JOptionPane;


public class CorretorDAO {
    
    public void create(Corretor cor){
        
        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO corretor (nome,email,login,senha) VALUES(?,?,?,?)");
            stmt.setString(1, cor.getNome());
            stmt.setString(2,cor.getEmail() );
            stmt.setString(3, cor.getLogin());
            stmt.setString(4, cor.getSenha());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        
        }catch (SQLException ex ){                 
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
               
    }
}
