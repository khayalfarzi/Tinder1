package back.dao;

import back.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface LoginInterface<T> {

    List<T> getAllUser() throws SQLException;

    boolean getUserByNickname(String nickname);

}
