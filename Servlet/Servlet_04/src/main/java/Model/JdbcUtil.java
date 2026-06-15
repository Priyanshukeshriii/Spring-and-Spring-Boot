package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil {
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/servlet";
        String user = "root";
        String pass = "password";
        return DriverManager.getConnection(url,user , pass);
    }

    public static void closeResource (Connection connection , PreparedStatement preparedStatement) throws SQLException{
    if (connection != null ){
        connection.close();
    }
    if(preparedStatement != null)
        preparedStatement.close();
    }

}
