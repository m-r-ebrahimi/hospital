package dao;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class WardDao {
    private final DataSource dataSource = DbDataSource.createDataSource();
    private PreparedStatement statement;
    private ResultSet resultSet;
    private final String QUERYADD = "INSERT INTO hospital.ward (name, `type`) VALUES(?, ?);";
    private final String QUERYDELTE = "DELETE FROM hospital.ward WHERE id=?;";
}
