package wang.sunce.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sunce on 2017/3/25 0025.
 */
public class DataSourceUtil {

    private static Connection con;
    private static DataSourceUtil instance = new DataSourceUtil();
    public static DataSourceUtil getInstacne(){
        return instance;
    }

    public Connection getConnection(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ledian";
        String user = "root";
        String password = "root";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public List<Field> getTableColumnDetail(String tableName){
        List<Field> list = new ArrayList<Field>();
        Connection connection = null;
        DatabaseMetaData dbmd = null;
        ResultSet columnSet = null;
        try {
            connection = getConnection();
            dbmd = connection.getMetaData();
            columnSet = dbmd.getColumns(null, "%", tableName, "%");
            while(columnSet.next()){
                String columnName = columnSet.getString("COLUMN_NAME");
                String columnType = columnSet.getString("TYPE_NAME");
                String columnComment = columnSet.getString("REMARKS");
                int columnLength = columnSet.getInt("COLUMN_SIZE");
                int dataType = columnSet.getInt("DATA_TYPE");

                Field filed = new Field();
                filed.setColumnDataType(dataType);
                filed.setColumnName(columnName);
                filed.setColumnTypeName(columnType);
                filed.setColumnComment(columnComment);
                filed.setColumnLength(columnLength+"");
                list.add(filed);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(columnSet != null){
                    columnSet.close();
                }
                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    public List<Field> getTableColumnDetail2(String catalog, String tableName){
        List<Field> list = new ArrayList<Field>();
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = getConnection();
            String sql = "select * from " + catalog + "." + tableName;
            pstmt = connection.prepareStatement(sql);
            ResultSet resultSet = pstmt.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            for(int i = 1;i <= resultSetMetaData.getColumnCount();i++){
                String columnName =  resultSetMetaData.getColumnName(i);
                String columnType = resultSetMetaData.getColumnTypeName(i);
                int dataType = resultSetMetaData.getColumnType(i);
                Field filed = new Field();
                filed.setColumnDataType(dataType);
                filed.setColumnName(columnName);
                filed.setColumnTypeName(columnType);
                list.add(filed);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
