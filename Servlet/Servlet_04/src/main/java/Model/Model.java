package Model;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
    private String name;
    private String phone;
    private String email;
    private String address;
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private int row =0 ;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int register()  {
        try {
            connection = JdbcUtil.getConnection();
            String sql  = "insert into user_info values(? , ? ,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,phone);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4,address);
            row = preparedStatement.executeUpdate();
            return row;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                JdbcUtil.closeResource(connection,preparedStatement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return row;
    }



}
