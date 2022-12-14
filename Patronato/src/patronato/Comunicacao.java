package patronato;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

    public Integer getCodigo(String sql, String campoCod) {
        Connection conn = conectar();
        Integer codigo = 0;
        try {
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                codigo = rs.getInt(campoCod);
            }
        } catch (Exception e) {
        }
        return codigo;
    }

    public Map<List<String>, List<List<String>>> executarSql(String sql) {
        Map<List<String>, List<List<String>>> mapa = new HashMap<>();
        Connection conn = conectar();
        try {
            ResultSet rs = conn.createStatement().executeQuery(sql);

            ResultSetMetaData rsmd = rs.getMetaData();
            int numeroColunas = rsmd.getColumnCount();
            List<String> nomesColunas = new ArrayList<>();
            List<List<String>> campos = new ArrayList<>();
            for (int j = 1; j <= numeroColunas; j++) {
                String colKey = rsmd.getColumnName(j);
                nomesColunas.add(colKey);
            }
            while (rs.next()) {
                List<String> valores = new ArrayList<>();
                for (String e : nomesColunas) {
                    valores.add(rs.getString(e));
                }
                campos.add(valores);
            }
            mapa.put(nomesColunas, campos);
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

    public void executarUpdate(String sql) {
        Connection conn = conectar();
        try {
            conn.createStatement().executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void buscaValoresEPreencheTabela(JTable tabela, String sql) {
        Map<List<String>, List<List<String>>> retorno = executarSql(sql);
        DefaultTableModel tb = new DefaultTableModel();
        for (Map.Entry<List<String>, List<List<String>>> valores : retorno.entrySet()) {
            for (String coluna : valores.getKey()) {
                coluna = coluna.replace("PRAT_", "");
                coluna = coluna.replace("PES_", "");
                tb.addColumn(coluna);
            }
            for (List<String> list : valores.getValue()) {
                String[] linha = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    linha[i] = list.get(i);
                }
                tb.addRow(linha);
            }
        }
        tabela.setModel(tb);
    }
}
