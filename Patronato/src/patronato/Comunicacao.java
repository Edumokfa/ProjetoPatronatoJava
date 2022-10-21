package patronato;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Computação
 */
public class Comunicacao {

    private Connection conectar() {
        String url = "jdbc:mysql://localhost:3306/BDI";
        String username = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public Map<String, List<String>> executarSql(String sql) {
        Map<String, List<String>> mapa = new HashMap<>();
        Connection conn = conectar();
        try {
            ResultSet rs = conn.createStatement().executeQuery(sql);

            ResultSetMetaData rsmd = rs.getMetaData();
            int numeroColunas = rsmd.getColumnCount();
            for (int j = 1; j <= numeroColunas; j++) {
                String Colkey = rsmd.getColumnName(j);
                mapa.put(Colkey, new ArrayList<>());
            }
            while (rs.next()) {
                for (Map.Entry<String, List<String>> e : mapa.entrySet()) {
                    String campo = e.getKey();
                    List<String> valores = e.getValue();
                    valores.add(rs.getString(campo));
                }
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return mapa;
    }
    
    public void executarUpdate(String sql){
        Connection conn = conectar();
        try {
            conn.createStatement().executeUpdate(sql);
            } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
