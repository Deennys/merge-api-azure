package br.com.merge.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Classe que executa a conexao
 * 
 * @author Henrique Cesar
 * @author Dennys Nascimenro
 * @author Luan Reis
 * @author Gustavo Fonseca
 *
 */
public class ConnetionFactoy {

    public static Connection abrirConexao() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
            final String USER = "RM94898";
            final String PASS = "191195";
            con = DriverManager.getConnection(url, USER, PASS);
            System.out.println("Conexao aberta");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "Erro no envio dos dados");
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "Erro no envio dos dados");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Erro no envio dos dados");
        }
        return con;
    }

    public static void fecharConexao(Connection con) {
        try {
            con.close();
            System.out.println("Conexão fechada");
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " Erro para fechar");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Erro para fechar");
        }
    }
}
