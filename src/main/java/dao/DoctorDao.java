package dao;

import entity.Sex;

import javax.sql.DataSource;
import java.sql.*;

public class DoctorDao {
    private final DataSource dataSource = DbDataSource.createDataSource();
    private PreparedStatement statement;
    private ResultSet resultSet;
    private final String QUERYADD = "INSERT INTO hospital.doctor (name, proficiency, seniority) VALUES(?, ?, ?);";
    private final String QUERYDELTE = "DELETE FROM hospital.doctor WHERE id=?;";
    //private final String QUERYUPDATE = "UPDATE hospital.doctor SET name=?, proficiency=?, seniority=? WHERE id=?;";

    public int add(String name, String proficiency, int seniority) throws SQLException {
        statement = dataSource.getConnection().prepareStatement(QUERYADD, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, name);
        statement.setString(2, proficiency);
        statement.setInt(3, seniority);
        statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        resultSet.next();
        return resultSet.getInt(1);
    }

    public void delete(int id) throws SQLException {
        statement = dataSource.getConnection().prepareStatement(QUERYDELTE);
        statement.setInt(1, id);
        statement.executeUpdate();
    }


}
