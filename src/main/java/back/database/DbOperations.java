package back.database;

import back.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbOperations {

    public static void insertMethod(User user) throws SQLException {
        String SQL_Insert = "Insert into tinder.tinder.register(user_name,user_surname,user_age," +
                "user_nickname,user_password,user_email) values (?,?,?,?,?,?)";
        Connection connection = DbConnection.connection();
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_Insert);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getSurname());
        preparedStatement.setInt(3, user.getAge());
        preparedStatement.setString(4, user.getNickname());
        preparedStatement.setString(5, user.getPassword());
        preparedStatement.setString(6, user.getEmail());
        preparedStatement.execute();
        System.out.println("Insert process successfully ");
    }

    public static List<User> selectMethod(String nickname, String pass) throws SQLException {
        String SQL_Select = "Select * from tinder.tinder.register where user_nickname=? and user_password=?";
        Connection connection = DbConnection.connection();
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_Select);
        preparedStatement.setString(1, nickname);
        preparedStatement.setString(2, pass);

        List<User> list = new ArrayList<User>();
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String name = resultSet.getString("user_name");
            String surname = resultSet.getString("user_surname");
            int age = resultSet.getInt("user_age");
            String nickname1 = resultSet.getString("user_nickname");
            String password = resultSet.getString("user_password");
            String email = resultSet.getString("user_email");

            list.add(new User(name, surname, age, nickname1, password, email));
        }
        return list;
    }
}