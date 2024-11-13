package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
        
    
    private static final String url = "jdbc:mysql://127.0.0.1:3306/databot";
    private static final String usuario = "root";
    private static final String senha = "Skype129!";

    //conexao
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, usuario, senha);
        }catch(SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao conectar");
        }
    }

    public static void closeStatement(PreparedStatement stmt){
        if(stmt != null){
            try{
                stmt.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void closeResultSet(ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void closeConnection(Connection conn) {
        
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }

    }

    
}


