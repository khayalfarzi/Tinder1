package back.service;

import back.dao.LoginInterface;
import back.database.DbOperations;
import back.entity.User;

import java.sql.SQLException;
import java.util.List;

public class LoginService implements LoginInterface<User> {

    @Override
    public List<User> getAllUser() throws SQLException {
        List<User> list = DbOperations.selectAllMethod();
        return list;
    }

    @Override
    public boolean getUserByNickname(String nickname) {
        return false;
    }

    public boolean check(String nickname, String password) throws SQLException {
        for (int i = 0; i < getAllUser().size(); i++) {
            if (getAllUser().get(i).getNickname().equals(nickname)
                    && getAllUser().get(i).getPassword().equals(password)) {
                    return true;
            }
        }
        return false;
    }
}
