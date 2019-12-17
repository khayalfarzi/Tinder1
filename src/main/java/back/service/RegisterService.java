package back.service;

import back.dao.RegisterInterface;
import back.database.DbOperations;
import back.entity.User;

import java.sql.SQLException;
import java.util.List;

public class RegisterService implements RegisterInterface {


    @Override
    public void add(User user) throws SQLException {
        DbOperations.insertMethod(user);
    }
}
