package back.dao;

import back.entity.User;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.sql.SQLException;
import java.util.List;

public interface RegisterInterface<T> {

    void add(User user) throws SQLException;
}
